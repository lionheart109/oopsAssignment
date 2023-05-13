package oopsAssesment;

import java.util.List;

public class HRTeam {
    RecruitmentTeam req = new RecruitmentTeam();

    public void informCandidates(List<Candidate> candidates) {

        for (Candidate candidate : candidates) // initialising class object candidates.

        {
            System.out.println("Candidate: " + candidate.getName());
            if (candidate.meetsEligibilityCriteria()) {
                System.out.println("Name: " + candidate.getName());
                System.out.println("Date of birth: " + candidate.getDOB());
                System.out.println("HSC marks: " + candidate.getHscMarks());
                System.out.println("UG CGPA: " + candidate.getUndergraduateScore());
                System.out.println("PG CGPA: " + candidate.getPostgraduateScore());
                System.out.println("Number of projects done: " + candidate.getProjectsDone());
                System.out.println("Interview marks: " + candidate.getInterviewScore());
                System.out.println("Final Interview Marks: " + req.calculateFinalMarks(candidate));
            }

        }
    }
}
