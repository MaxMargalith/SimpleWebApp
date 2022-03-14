package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        // This is where the magic happens
        if (query.toLowerCase().contains("shakespearee")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        return "";
    }
}
