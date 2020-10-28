package exp1;

public @interface Author
{
    String first();
    String last();
}


/*
Use the annotation like below
@Author(first="Bikram", last="Paude")
Book book = new Book();
 */