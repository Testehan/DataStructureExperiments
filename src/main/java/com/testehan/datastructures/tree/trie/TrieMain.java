package com.testehan.datastructures.tree.trie;

public class TrieMain {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");

        System.out.println(trie.search("AP"));
        System.out.println(trie.search("xx"));
    }
}
