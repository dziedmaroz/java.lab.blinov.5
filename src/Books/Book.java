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
public interface  Book
{

    /***
     *
     * @return ISBN book number
     */
    public String getISBN();
    /***
     *
     * @return book author's name
     */
    public String getAuthor();
    /***
     *
     * @return publisher info
     */
    public String getPublisher();
    /***
     *
     * @return book title
     */
    public String getTitle();
    /***
     *
     * @return
     */
    public Date getYear();


    /***
     *
     * @param ISBN
     */
    public void setISBN(String ISBN);
    /***
     *
     * @param author
     */
    public void setAuthor(String author);
    /***
     *
     * @param publisher
     */
    public void setPublisher(String publisher);
    /***
     *
     * @param title
     */
    public void setTitle(String title);
    /***
     *
     * @param year
     */
    public void setYear(Date year);    
}
