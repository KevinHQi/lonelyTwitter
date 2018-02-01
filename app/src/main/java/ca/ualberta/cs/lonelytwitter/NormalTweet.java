package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *  Represent a NormalTweet
 *
 *  @author sheilaschoepp
 *  @version 1.5
 *  @see NormalTweet
 *  @see ImportantTweet
 *  @see Tweet
 */



public class NormalTweet extends Tweet {
    /**
     * Construct a NormalTweet object
     *
     * @param message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Construct a NormalTweet object with more parameter
     *
     * @param message
     * @param date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * Return false
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
