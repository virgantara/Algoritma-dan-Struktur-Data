public class StringConcat {
    public static void main(String[] args) {
        String firstName = "Bejo";
        String lastName = "Sugiantoro";

        String fullName = firstName + " " + lastName;
        System.out.println("Nama Lengkap: " + fullName);

        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Nama Lengkap hasil concat: " + fullName2);
    }
}