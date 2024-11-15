package CS5800_SDLC;

import java.util.ArrayList;
import java.lang.Cloneable;

public class BookClasses{

    public static class BookShallowCopy implements Cloneable{
        private String title;
        private String author;
        private ArrayList<String> chapters;

        BookShallowCopy(String title, String author, ArrayList<String> chapters) {
            this.title = title;
            this.author = author;
            this.chapters = chapters;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public ArrayList<String> getChapters() {
            return chapters;
        }

        public void setChapters(ArrayList<String> chapters) {
            this.chapters = chapters;
        }

        @Override
        public Object clone()
                throws CloneNotSupportedException
        {
            return super.clone();
        }

        @Override
        public String toString() {
            return title + " " + author + " " + chapters;
        }
    }

    public static class BookDeepCopy implements Cloneable{

        private String title;
        private String author;
        private ArrayList<String> chapters;

        BookDeepCopy(String title, String author, ArrayList<String> chapters) {
            this.chapters = chapters;
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public ArrayList<String> getChapters() {
            return chapters;
        }

        public void setChapters(ArrayList<String> chapters) {
            this.chapters = chapters;
        }

        @Override
        public Object clone()
                throws CloneNotSupportedException
        {
            BookDeepCopy copy = (BookDeepCopy)super.clone();
            copy.chapters = new ArrayList<String>(chapters);
            return copy;
        }

        @Override
        public String toString() {
            return title + " " + author + " " + chapters;
        }
    }
}
