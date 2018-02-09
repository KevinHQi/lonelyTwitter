/*
 * Copyright (c) 2018 Team X. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and condition of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact ???@???.ca
 */

package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


}
