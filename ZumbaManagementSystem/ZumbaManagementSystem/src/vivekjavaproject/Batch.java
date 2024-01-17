package vivekjavaproject;
import java.util.*;

public class Batch {
    private String name;
    private List<Participant> participants;

    public Batch(String name) {
        this.name = name;
        this.participants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    // Method to start the batch and send a message to participants
    public void startBatch() {
        System.out.println("Batch " + name + " is starting!");
        for (Participant participant : participants) {
            participant.onBatchStartMessage("Your " + name + " batch has started!");
        }
    }
}
