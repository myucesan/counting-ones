

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
        return -1;
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
