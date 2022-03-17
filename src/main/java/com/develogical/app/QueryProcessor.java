package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        // This is where the magic happens
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("putin")) {
            return "That guy's a massive dickhead.";
        }
        else if (query.toLowerCase().contains("marie curie")) {
            return "Marie  Skłodowska Curie (/ˈkjʊəri/ KURE-ee,[3] pronounced [ˈmarja skwɔˈdɔfska kʲiˈri] (audio speaker iconlisten); born Maria  Skłodowska, Polish: [ˈmarja salɔˈmɛa skwɔˈdɔfska]; 7 November 1867 – 4 July 1934) was a Polish and naturalized-French physicist and chemist who conducted pioneering research on radioactivity.";
        }
        else if (query.toLowerCase().contains("pierre curie")) {
            return "Pierre Curie (/ˈkjʊəri/ KURE-ee,[1] French: [pjɛʁ kyʁi]; 15 May 1859 – 19 April 1906) was a French physicist, a pioneer in crystallography, magnetism, piezoelectricity, and radioactivity. In 1903, he received the Nobel Prize in Physics with his wife, Marie Curie, and Henri Becquerel, in recognition of the extraordinary services they have rendered by their joint researches on the radiation phenomena discovered by Professor Henri Becquerel.";
        }
        return "";
    }
}
