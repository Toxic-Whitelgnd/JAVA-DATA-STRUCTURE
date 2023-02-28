package Trie;

public class Triejava {

    // creating trie structure
    static class Node{
        Node[] children; // 26
        boolean eow; // end of word

        Node(){
            // intialize here
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }

            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a'; // this is like 'a' - 'a' = 0 , 'b'-'a' = 1

            // intially we intialized the array to null
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            // when it reaches the last elemnt in the string it will mark as eow as true
            if(i == word.length()-1){
                curr.children[idx].eow = true;
            }

            // this is for updating the curr 
            curr = curr.children[idx];
        }
    }

    // seraching in trie
    public static boolean search(String word){
         Node curr = root;
         for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            if(i == word.length()-1 && curr.children[idx].eow == false) return false;

            curr = curr.children[idx];

        
         }
        return true;
    }

    // word break problem
    public static boolean WordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1;i<=key.length();i++){
            String firstpart = key.substring(0,i);
            String secondpart = key.substring(i);

            if(search(firstpart) && WordBreak(secondpart)){
                return true;
            }
        }
        return false;
        
    }

    // STARTSWITH PROBLEM
    public static boolean Startswith(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null) return false;

            curr = curr.children[idx];
        }
        return true;
    }

    // counting the no of nodes in the trie ds for unique substrings
    public static int CountNodes(Node root){
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += CountNodes(root.children[i]);
            }
        }
        return count+1;
    }

    // for longest prefix strings
    public static String ans = "";

    public static void LongestPrefix(Node root,StringBuilder temp){
        for(int i=0;i<26;i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }

                LongestPrefix(root.children[i], temp);

                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        // String words[] = {"the","a","there","their","any"};

        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        
        // System.out.println(search("the"));
        // System.out.println(search("an"));

        // for word break promblem
        // String dict[] = {"i","like","sam","samsung","ice"};
        // String key = "ilikesamsung";

        // for(int i=0;i<dict.length;i++){
        //     insert(dict[i]);
        // }
        // System.out.println(WordBreak(key));

        // for startswith problem
        // String dict1[] = {"man","woman","app","apple","ice"};
       /*  String prefix = "app";

        for(int i=0;i<dict1.length;i++){
            insert(dict1[i]);
        }
        System.out.println(Startswith(prefix)); */

        // for unique substrings
        /*String word = "apple";

        for(int i=0;i<word.length();i++){
            String suffix = word.substring(i);
            System.out.println(suffix);
            insert(suffix);
           
        }
        System.out.println(CountNodes(root));
         */

        //  for Longest prefix string
        String words[] = {"t","ta","s","sa","tar","taru","tre","tarun"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        LongestPrefix(root, new StringBuilder(""));

        System.out.println(ans);

    }
}