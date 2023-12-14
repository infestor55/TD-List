public class Main {
    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant(1, "Dupont", "Jean");
        Etudiant etudiant2 = new Etudiant(2, "Martin", "Marie");
        Etudiant etudiant3 = new Etudiant(1, "Dupont", "Jean"); // Même ID que etudiant1


        System.out.println("ID de l'étudiant 1 : " + etudiant1.getId());
        System.out.println("Nom de l'étudiant 2 : " + etudiant2.getNom());
        System.out.println("Prénom de l'étudiant 3 : " + etudiant3.getPrenom());


        etudiant1.setNom("Dubois");
        etudiant2.setPrenom("Paul");


        System.out.println("etudiant1 equals etudiant2 : " + etudiant1.equals(etudiant2));
        System.out.println("etudiant1 equals etudiant3 : " + etudiant1.equals(etudiant3));


        System.out.println("Représentation de l'étudiant 1 : " + etudiant1);
        System.out.println("Représentation de l'étudiant 2 : " + etudiant2);
    }
    }
