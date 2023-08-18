public class Main {
    public static void main(String[] args) {

        Contact.contacts.add(new Contact("tinashe@gmail.com", "12345667"));
        Contact.contacts.add(new Contact("chipo@gmail.com", "12345667"));
        Contact.contacts.add(new Contact("tendai@gmail.com", "12345667"));
        Contact.contacts.add(new Contact("sekai@gmail.com", "12345667"));
        Contact.contacts.add(new Contact("tanaka@gmail.com", "12345667"));
        Contact.contacts.add(new Contact("Eve@gmail.com", "12345667"));
        System.out.println("...Welcome to my Contact Manager:....");
        System.out.println("You have " + Contact.contacts.size() + " contacts is your list..");

    }
}