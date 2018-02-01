/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018 Team X. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and condition of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact ???@???.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 *  Represent a tweet.
 *
 *  @author sheilaschoepp
 *  @version 1.5
 *  @see NormalTweet
 *  @see ImportantTweet
 */


public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Return the message.
     *
     * @return tweet message
     */

    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Return the date
     *
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Constructs a date object
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Convert to string
     *
     * @return Format of string
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}
