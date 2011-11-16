/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Books;

import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author lucian
 */
public abstract  class Handbook implements Book
{
    private String ISBN;
    private String publisher;
    private Date year;
    private String title;
    private String author;

    public Handbook(String ISBN, String publisher, Date year, String title, String author)
    {
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }




    public String getISBN()
    {
        return ISBN;
    }

    public String getPublisher()
    {
        return  publisher;
    }

    public String getTitle()
    {
        return title;
    }

    public Date getYear()
    {
        return year;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setYear(Date year)
    {
        this.year = year;
    }
}
