package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Get message and date
 *  @author sheilaschoepp
 *  @version 1.5
 *  @see NormalTweet
 *  @see ImportantTweet
 *  @see Tweet
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
