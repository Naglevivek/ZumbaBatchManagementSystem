package vivekjavaproject;

import java.util.Scanner;

public class ZumbaManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a batch
        System.out.print("Enter the batch name: ");
        String batchName = scanner.nextLine();
        Batch zumbaBatch = new Batch(batchName);

        // Add participants to the batch
        System.out.print("Enter the number of participants: ");
        int numberOfParticipants = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numberOfParticipants; i++) {
            System.out.print("Enter participant name: ");
            String participantName = scanner.nextLine();

            System.out.print("Enter participant age: ");
            int participantAge = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter participant batch name: ");
            String participantBatchName = scanner.nextLine();

            Participant participant = new Participant(participantName, participantAge, participantBatchName);
            zumbaBatch.addParticipant(participant);
        }

        // Start the batch
        zumbaBatch.startBatch();

        scanner.close();
    }
}
