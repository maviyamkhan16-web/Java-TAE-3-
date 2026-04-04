class Book {
    String title, author;
    double price;

    Book(String t,String a,double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title+" "+author+" "+price);
    }

    public static void main(String args[]) {
        Book b[] = new Book[3];

        b[0] = new Book("Java","James",500);
        b[1] = new Book("C","Dennis",400);
        b[2] = new Book("Python","Guido",600);

        for(int i=0;i<3;i++)
            b[i].display();
    }
}
