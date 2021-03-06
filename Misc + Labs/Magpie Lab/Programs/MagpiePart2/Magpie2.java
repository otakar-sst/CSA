/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 *       Uses indexOf to find strings
 *       Handles responding to simple words and phrases 
 * This version uses a nested if to handle default responses.
 * 
 * *ORIGINAL*
 * @author Laurie White
 * @version April 2012
 * 
 * *UPDATED*
 * @author Otakar Andrysek
 * @version 2.2
 * @date 10/2/16
 */

public class Magpie2
{
    // Greet the user
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    // Gives a response to a user statement
    // @param statement - the user statement      
    // @return a response based on the rules given
    public String getResponse(String statement)
    {
        // Store the response
        String response = "";
        
        // Pick something based on keywords
        if (statement.indexOf("no") >= 0)
        {
            response = "Why not?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("sister") >= 0) 
        {
            response = "Sisters are always like that.";
        }
        else if (statement.indexOf("cat") >= 0
                || statement.indexOf("dog") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr.") >= 0)
        {
            response = "He sounds like a good teacher.";
        }
        
        else if (statement.indexOf("Mrs.") >= 0
                || statement.indexOf("Ms.") >= 0)
        {
            response = "She sounds like a good teacher.";
        }
        else if (statement.trim().length() == 0)
        {
            response = "Say something, please";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    // Pick a default response to use if nothing else fits.
    // @return a non-committal string
    private String getRandomResponse()
    {
        // Initialize local variables
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        // Pick something from here based on the random number
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Meh, boring.";
        }
        else if (whichResponse == 5)
        {
            response = "Let's move on.";
        }
        return response;
    }
}