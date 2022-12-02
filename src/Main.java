public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("0646828692");

        myPhone.addNewContact(new Contact("Jim", "0646828692"));
        myPhone.addNewContact(new Contact("Ying", "0612345678"));
        System.out.println(myPhone.addNewContact(new Contact("Mom", "0646828692")));

        myPhone.printContacts();
        Contact jim = myPhone.queryContact("Jim");
        myPhone.updateContact(jim, new Contact("Henk", "0646828692"));

        myPhone.printContacts();
    }
}
