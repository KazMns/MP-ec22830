package OOP.ec22830.MP;

interface Citizen extends Person {
    Candidate vote(Candidate[] candidates);
    Candidate selectWinner(Candidate[] votes);
}
