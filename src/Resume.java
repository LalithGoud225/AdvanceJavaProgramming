import java.util.ArrayList;
import java.util.Objects;

class Resume {
    private String candidateName;
    private int yearsOfExperience;
    private ArrayList<String> skills;
    private Address address;

    public Resume(String candidateName, int yearsOfExperience, ArrayList<String> skills, Address address) {
        this.candidateName = candidateName;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = new ArrayList<>(skills);
        this.address = address;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName + "\nExperience: " + yearsOfExperience + " years\nSkills: " + skills + "\nAddress: " + address + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Resume resume = (Resume) obj;
        return yearsOfExperience == resume.yearsOfExperience &&
                skills.equals(resume.skills) && address.equals(resume.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearsOfExperience, skills, address);
    }
}