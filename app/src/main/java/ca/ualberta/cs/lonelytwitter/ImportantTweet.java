/*
 * ImportantTweet
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
 * Represent important tweet
 *
 *  @author sheilaschoepp
 *  @version 1.5
 *  @see NormalTweet
 *  @see Tweet
 */
public class ImportantTweet extends Tweet {
    /**
     * Constructs a important tweet message
     *
     * @param message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Construct a important tweet message with more parameter
     *
     * @param message
     * @param date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * Return true
     *
     * @return true
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
