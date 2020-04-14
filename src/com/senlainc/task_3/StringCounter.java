package com.senlainc.task_3;

import java.util.*;

public class StringCounter {

    private StringBuilder sb;
    private List<String> strings;

    public static void main(String[] args) {
        StringCounter stringCounter = new StringCounter();
        stringCounter.FirstCharsToUpperCase(stringCounter.inputLine());
        stringCounter.toArrayWithoutNumeric(stringCounter.sb);
        stringCounter.sortToAlphabet();
        System.out.println("Count: " + stringCounter.strings.size());
        System.out.println(stringCounter.arrayToString(stringCounter.strings));

    }

    public String arrayToString(List <String> list) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String str: list) {
            stringBuilder.append(str + ", ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-2).toString();
    }

    public StringBuilder inputLine() {
        try (Scanner scan = new Scanner(System.in)) {
            return sb = new StringBuilder(scan.nextLine().replaceAll("\\p{P}", ""));
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

    public void FirstCharsToUpperCase(StringBuilder sb) {
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        for (int i = 1; i < sb.length(); i++) {
            if (Character.isSpaceChar(sb.charAt(i - 1))) {
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }
    }

    public void sortToAlphabet() {
        Collections.sort(strings);
        sb.delete(0,sb.length());
        for (String str: strings) {
            sb.append(str + " ");
        }
    }
}
