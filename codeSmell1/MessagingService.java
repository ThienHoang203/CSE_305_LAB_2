package codeSmell1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(message.getRecipient(), k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, new ArrayList<>());
    }

    public void printAllMessages() {
        for (Map.Entry<String, List<Message>> entry : inbox.entrySet()) {
            for (Message message : entry.getValue()) {
                System.out.println("Recipient: " + message.getRecipient());
                System.out.println("Sender: " + message.getSender());
                System.out.println("Content: " + message.getContent());
            }
        }
    }
}
