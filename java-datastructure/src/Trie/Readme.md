# TRIE DS

## called as prefix, digital search , retriveal tree

## it is basically a tree namely k-ary tree i.e it has n number of children's

## In orderd to overcome the binary tree and avl tree's search time complexity 

## trie's time complexity will be O(L) L is lenght of the word

# fuctioning

`it will search fast`
`root node will be empty`
`prefix is not repeated`
`it is stored in the form of tree like structure with one letter by letter`
`and if the word is get overd it will mark as eow `

## QUETIONS

# 1. WORD BREAK PROBLEM
`Given an input string and a dictionary of words, find out if the input string`
`can be broken into a space-separated sequence of dictionary words.`
`words[] = {i, like, sam, samsung, mobile, ice}`
`key = "ilikesamsung"`
`output: true`

# 2. StartsWith PROBLEM
`Create a function boolean startsWith(String prefix) for a trie.`
`Returns true if there is a previously inserted string word that has the prefix prefix, and false`
`otherwise.`
`words[] = { "apple", "app", "mango", "man", "woman" }`
`prefix = "app" output: true`
`prefix= "moon" output: false`

# 3. COUNT UNIQUE STRINGS
`Given a string of length n of lowercase alphabet characters, we need to count total number of`
`distinct substrings of this string.`
`str = "ababa"`
`ans = 10`
`concept of solving: all prefix of all suffix`
`1. find all suffix string`
`2. create trie data structure for the suffix`
` total nodes of trie = count of unique prefix`
`3. count the nodes of trie`

# 4. LONGEST WORD WITH ALL PREFIX
`Find the longest string in words such that every prefix of it is also in words.`
`words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]`
`ans = "apple"`
