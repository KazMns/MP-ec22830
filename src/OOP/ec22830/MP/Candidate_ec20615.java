package OOP.ec22830.MP;// File Candidate_ec20615.java
//
// Machine generated stub for Assignment 2
// Lmao

class Candidate_ec20615 extends Candidate {
    
    public String getName() {
        return "Random text No name (ec20615)";
    }
    
    public String getSlogan() {
        return "No slogan (ec20615)";
    }
    
    public Candidate vote(Candidate[] candidates) {
        Candidate r = new Candidate_ec20615();
        
        if (candidates.length != 0) r = candidates[0];
 
        // Add code that inspects the array candidates
        // calling the various methods of the Candidate objects
        // and finds a Candidate object to vote for.
        
        return r;
    }
    
    public Candidate selectWinner(Candidate[] votes) {
        Candidate r = new Candidate_ec20615();
        
        if (votes.length != 0) r = votes[0];
 
        // Add code that either counts the votes
        // or uses some other way to return an element 
        // of the array vote as the winner of an election.
        
        return r;
    }
    
}
