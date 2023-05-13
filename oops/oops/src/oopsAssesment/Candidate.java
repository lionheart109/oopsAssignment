package oopsAssesment;

import java.util.Map;

public class Candidate {
    private String name;
    private String dob;
    private Map<String, Integer> hscMarks;
    private double undergraduateScore;
    private double postgraduateScore;
    private int projectsDone;
    private double interviewScore;
    private String isCitizen;

    public Candidate(String name, String dob, Map<String, Integer> hscMarks, double undergraduateScore,
            double postgraduateScore, int projectsDone, double interviewScore, String isCitizen) {
        this.name = name;
        this.interviewScore = interviewScore;
        this.dob = dob;
        this.hscMarks = hscMarks;
        this.undergraduateScore = undergraduateScore;
        this.postgraduateScore = postgraduateScore;
        this.projectsDone = projectsDone;
        this.isCitizen = isCitizen;
    }

    public boolean meetsEligibilityCriteria() {
        return Eligibility.isDateOfBirthEligible(this) &&
                Eligibility.isPcmPcbAverageEligible(this) &&
                Eligibility.isUgCgpaEligible(this) &&
                Eligibility.isPgCgpaEligible(this) &&
                Eligibility.isCitizenEligible(this) &&
                Eligibility.isFullTimeEligible(this);
    }

    public String getName() {
        return name;
    }

    public double getInterviewScore() {
        return interviewScore;
    }

    public double getUndergraduateScore() {
        return undergraduateScore;
    }

    public double getPostgraduateScore() {
        return postgraduateScore;
    }

    public double setInterviewScore(double marks) {
        interviewScore = marks;
        return interviewScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return dob;
    }

    public void setDateOfBirth(String dob) {
        this.dob = dob;
    }

    public Map<String, Integer> getHscMarks() {
        return hscMarks;
    }

    public void setHscMarks(Map<String, Integer> hscMarks) {
        this.hscMarks = hscMarks;
    }

    public int getProjectsDone() {
        return projectsDone;
    }

    public void setProjectsDone(int projectsDone) {
        this.projectsDone = projectsDone;
    }

    public String isCitizen() {
        return isCitizen;
    }

    public void setCitizen(String isCitizen) {
        this.isCitizen = isCitizen;
    }
}
