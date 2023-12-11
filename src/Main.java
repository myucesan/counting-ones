

/**
 * WARNING: The spec tests are not necessarily equal to your grade! You can use them help you test
 * for the correctness of your algorithm, but the final grade is determined by a manual inspection
 * of your implementation.
 */
class Main {

    /**
     * You should implement this method.
     *
     * @param n the number of elements in skills.
     * @param skills the sorted array of `Skill`s (see Library for their implementation) to look
     *     through. Note that you should use entries skills[1] to skills[n]!
     * @return the number of completed skills in the sorted array.
     */
    public static int numberOfCompletedSkills(int n, Skill[] skills) {
        int start = 1;
        int end = n;
        int mid = 0;
        while (start < end) {
            mid = (start + end) / 2;

            if(skills[mid].isCompleted() == false) {
                start = mid + 1;
            } else if (skills[mid].isCompleted() == true) {
                end = mid;
            }
        }
        if (!skills[start].isCompleted()) { // edge case where there are no completed tasks
            return 0; // No skills are completed.
        } else {
            // Skills are completed from 'start' to the end of the array.
            return n - start + 1; // Return the count of completed skills, + 1 cause of one-indexing
        }
    }
}

class Skill {

    private String name;

    private boolean completed;

    public Skill(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
