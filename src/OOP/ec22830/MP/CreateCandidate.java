package OOP.ec22830.MP;

public class CreateCandidate extends Candidate{
    String name;
    String slogan;

    CreateCandidate(String name, String slogan){
        this.name = name;
        this.slogan = slogan;
    }
    @Override
    public Candidate vote(Candidate[] candidates) {
        return this;
    }

    @Override
    public Candidate selectWinner(Candidate[] votes) {
        return this;
    }

    @Override
    public String getSlogan() {
        return slogan;
    }

    @Override
    public String getName() {
        return name;
    }
}
