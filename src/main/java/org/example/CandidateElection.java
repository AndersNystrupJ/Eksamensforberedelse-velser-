package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CandidateElection {

    ArrayList<Candidate> candidateList = new ArrayList<>();


    public int getTotalNumberOfVotes(){
        int totalNumberOfVotes = 0;
        for (Candidate candidate : candidateList) {
            totalNumberOfVotes += candidate.getNumberOfVotes();
        }
        return totalNumberOfVotes;
    }



    public ArrayList<Candidate> getCandidatesFromParty(String partySearch){
        ArrayList<Candidate> candidatesPartyList = new ArrayList<>();
        candidatesPartyList.clear();
        for (Candidate candidate : candidateList) {
            if (candidate.getParty().equalsIgnoreCase(partySearch)) {
                candidatesPartyList.add(candidate);
            }
        }
        return candidatesPartyList;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CandidateElection instansCandidateElection = new CandidateElection();

        System.out.println("Search for members based on party: ");
        String partySearch = scan.nextLine();
        System.out.println(instansCandidateElection.getCandidatesFromParty(partySearch));
    }
}
