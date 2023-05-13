package oopsAssesment;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentTeam {
    private List<Candidate> candidates = new ArrayList<Candidate>();

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
        System.out.println("Candidate added successfully!");
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public double calculateFinalMarks(Candidate candidate) {

        if (candidate.getPostgraduateScore() < 8 && candidate.getUndergraduateScore() < 8) {
            return 0;
        }
        double totalMarks = candidate.getInterviewScore() + candidate.getUndergraduateScore()
                + candidate.getPostgraduateScore();
        return totalMarks / 3;
    }
}
