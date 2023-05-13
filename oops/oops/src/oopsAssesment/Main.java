package oopsAssesment;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        RecruitmentTeam recruitmentTeam = new RecruitmentTeam();
        HRTeam hrTeam = new HRTeam();
        Map<String, Integer> hscMarks = new HashMap<>();
        hscMarks.put("Maths", 90);
        hscMarks.put("Physics", 90);
        hscMarks.put("Chemistry", 90);

        // Add candidates
        recruitmentTeam.addCandidate(new Candidate("Brajesh", "29/07/1999", hscMarks, 8.9, 9.1, 5, 86, "Indian"));
        recruitmentTeam.addCandidate(new Candidate("Raaghav", "31/04/2001", hscMarks, 8.9, 9.1, 5, 86, "Indian"));
        recruitmentTeam
                .addCandidate(new Candidate("Brajesh Raaghav", "4/02/2002", hscMarks, 8.9, 9.1, 5, 86, "Indian"));

        // Calculate final marks
        List<Candidate> candidates = recruitmentTeam.getCandidates();
        for (Candidate candidate : candidates) {
            double finalMarks = recruitmentTeam.calculateFinalMarks(candidate);
            candidate.setInterviewScore(finalMarks);
        }

        // Inform candidates
        hrTeam.informCandidates(recruitmentTeam.getCandidates());
    }
}