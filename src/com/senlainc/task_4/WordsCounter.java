package com.senlainc.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsCounter {

    private StringBuilder [] words;
    private List <String> strings;

    public static void main(String[] args) {
        WordsCounter wordsCounter = new WordsCounter();
        wordsCounter.words = wordsCounter.inputLine();
        wordsCounter.toArrayWithoutNumeric(wordsCounter.words[0]);
        System.out.println(wordsCounter.wordsCounter(wordsCounter.strings,wordsCounter.words));

    }

    public StringBuilder [] inputLine() {
        StringBuilder [] sb = new StringBuilder[2];
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the sentence: ");
            sb[0] = new StringBuilder(scan.nextLine().replaceAll("\\p{P}", "").toLowerCase());
            System.out.print("Enter the word: ");
            sb[1] = new StringBuilder(scan.nextLine().replaceAll("\\p{P}", "").toLowerCase());
            return sb;
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return null;
    }

    public void toArrayWithoutNumeric(StringBuilder sb) {
        strings = new ArrayList<>();
        boolean numeric = false;
        for (String str: sb.toString().split(" ")) {
            for (Character ch: str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    numeric = true;
                }
            }
            if (numeric == false && !str.equals("")) {
                strings.add(str);
            } else {
                numeric = false;
            }
        }
    }

    public int wordsCounter(List <String> strings, StringBuilder [] words) {
        int count = 0;
        for (String str: strings) {
            if (str.equals(words[1].toString())) {
                count++;
            }
        }
        return count;
    }
}
