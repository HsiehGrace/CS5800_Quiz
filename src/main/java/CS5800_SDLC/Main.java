package CS5800_SDLC;

import java.util.ArrayList;
import CS5800_SDLC.BookClasses.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> chapters = new ArrayList<String>();
        ArrayList<String> chapters2 = new ArrayList<String>();

        chapters.add("One");
        chapters.add("Two");
        chapters.add("Three");

        chapters2.add("Four");
        chapters2.add("Five");
        chapters2.add("Six");

        BookShallowCopy originalShallow = new BookShallowCopy("Title", "Author", chapters);
        BookShallowCopy copyShallow = (BookShallowCopy) originalShallow.clone();

        System.out.println("Shallow Copy");
        System.out.println(originalShallow);
        System.out.println(copyShallow);

        chapters.add("NewChapter");

        System.out.println("Modified Shallow");
        System.out.println(originalShallow);
        System.out.println(copyShallow);
        System.out.println();

        BookDeepCopy originalDeep = new BookDeepCopy("Title", "Author", chapters2);
        BookDeepCopy copyDeep = (BookDeepCopy) originalDeep.clone();

        System.out.println("Deep Copy");
        System.out.println(originalDeep);
        System.out.println(copyDeep);

        chapters2.add("NewChapter");

        System.out.println("Modified Deep");
        System.out.println(originalDeep);
        System.out.println(copyDeep);
        System.out.println();
    }
}