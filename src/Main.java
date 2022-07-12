
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static HashSet<User> users = new HashSet<User>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int option=0;

        do {
            System.out.println("OPCIONES");
            System.out.println("1. CREAR USUARIO");
            System.out.println("2. MODIFICAR USUARIO");
            System.out.println("3. ELIMINAR USUARIO");
            System.out.println("4. CREAR CATEGORÍA");
            System.out.println("5. MODIFICAR CATEGORÍA");
            System.out.println("6. ELIMINAR CATEGORÍA");
            System.out.println("7. CREAR SUBCATEGORÍA");
            System.out.println("8. MODIFICAR SUBCATEGORÍA");
            System.out.println("9. ELIMINAR SUBCATEGORÍA");
            System.out.println("10. REGISTRAR GASTO");
            System.out.println("11. REGISTRAR INGRESO");
            System.out.println("12. MOSTRAR SALDO");
            System.out.println("13. LISTAR USUARIOS");
            System.out.println("14. LISTAR CATEGORÍAS");
            System.out.println("15. LISTAR SUBCATEGORÍAS");


            option = scanner.nextInt();

            switch (option) {
                case 1:
                    createUser();
                    break;
                case 2:
                    setUser();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    createCategory();
                    break;
                case 5:
                    setCategory();
                    break;
                case 6:
                    deleteCategory();
                    break;
                case 7:
                    createSubcategory();
                    break;
                case 8:
                    setSubcategory();
                    break;
                case 9:
                    deleteSubcategory();
                    break;
                case 10:
                    recordOutlay();
                    break;
                case 11:
                    recordIncome();
                    break;
                case 12:
                    checkBalance();
                    break;
                case 13:
                    listUsers();
                    break;
                case 14:
                    listCategories();
                    break;
                case 15:
                    listSubcategories();
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida");

            }
        }while (option != 16);
        System.out.println("Gracias por utilizar nuestros servicios jajaaj");

    }

    public static void createUser() {
        System.out.println("Escriba el nombre del nuevo usuario");
        String name = scanner.next();
        System.out.println("Escriba el e-mail del nuevo usuario");
        String email = scanner.next();
        User user1 = new User(name, email);
        users.add(user1);
        System.out.println("Usuario " + name + " ha sido creado con éxito");


    }

    public static void setUser() {
        System.out.println("Hi!");

    }

    public static void deleteUser() {
        System.out.println("Hi!");

    }

    public static void createCategory() {
        System.out.println("Hi!");

    }

    public static void setCategory() {
        System.out.println("Hi!");

    }

    public static void deleteCategory() {
        System.out.println("Hi!");

    }

    public static void createSubcategory() {
        System.out.println("Hi!");

    }

    public static void setSubcategory() {
        System.out.println("Hi!");

    }

    public static void deleteSubcategory() {
        System.out.println("Hi!");

    }

    public static void recordOutlay() {
        System.out.println("Hi!");

    }

    public static void recordIncome() {
        System.out.println("Hi!");

    }

    public static void checkBalance() {
        System.out.println("Hi!");

    }

    public static void listUsers (){
        for (User user: users) {
            System.out.println("Nombre: "+ user.getName() + " E-mail: " + user.getEmail());
        }
    }
    public static void listCategories (){
        System.out.println("Hi!");
    }
    public static void listSubcategories (){
        System.out.println("Hi!");
    }


}

