package OOP.ec22830.MP;

import java.util.ArrayList;
import java.util.List;

public class CandidateList{
    public List<Candidate> candidates = new ArrayList<>();

    public List<Candidate> getList() {
        return candidates;
    }

    public void addElement(Candidate c) {
        candidates.add(c);
    }
}
