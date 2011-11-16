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
public abstract class Ecyclopedia implements Book
{
    private String ISBN;
    private String publisher;
    private Date year;
    private String title;

    public Ecyclopedia(String ISBN, String publisher, Date year, String title)
    {
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.year = year;
        this.title = title;
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
