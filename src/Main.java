
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, User> users = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //MENU PRINCIPAL

        int option = 0;

        do {
            System.out.println("Seleccione la opción deseada");
            System.out.println("1. USUARIO");
            System.out.println("2. CATEGORIA");
            System.out.println("3. SUBCATEGORÍA");
            System.out.println("4. OPERACIONES");
            System.out.println("5. SALIR");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    showOptionsForUser();
                    break;
                case 2:
                    showOptionsForCategory();
                    break;
                case 3:
                    showOptionsforSubcategory();
                    break;
                case 4:
                    showOptionsforOperations();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida");

            }
        } while (option != 5);


    }


    //MÉTODOS PARA NAVEGAR EL MENÚ

    public static void showOptionsForUser() {
        int option = 0;
        do {
            System.out.println("Seleccione la opción deseada");
            System.out.println("1. CREAR USUARIO");
            System.out.println("2. MODIFICAR USUARIO");
            System.out.println("3. ELIMINAR USUARIO");
            System.out.println("4. LISTAR USUARIOS");
            System.out.println("5. VOLVER AL MENU PRINCIPAL");

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
                    listUsers();
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida");
            }
        } while (option != 5);

    }

    public static void showOptionsForCategory() {
        int option = 0;
        do {

            System.out.println("Seleccione la opción deseada");
            System.out.println("1. CREAR CATEGORÍA");
            System.out.println("2. MODIFICAR CATEGORÍA");
            System.out.println("3. ELIMINAR CATEGORÍA");
            System.out.println("4. LISTAR CATEGORÍAS");
            System.out.println("5. VOLVER AL MENU PRINCIPAL");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    createCategory();
                    break;
                case 2:
                    setCategory();
                    break;
                case 3:
                    deleteCategory();
                    break;
                case 4:
                    listCategories();
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida");
            }
        } while (option != 5);

    }

    public static void showOptionsforSubcategory() {
        int option = 0;
        do {

            System.out.println("Seleccione la opción deseada");
            System.out.println("1. CREAR SUBCATEGORÍA");
            System.out.println("2. MODIFICAR SUBCATEGORÍA");
            System.out.println("3. ELIMINAR SUBCATEGORÍA");
            System.out.println("4. LISTAR SUBCATEGORÍAS");
            System.out.println("5. VOLVER AL MENU PRINCIPAL");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    createSubcategory();
                    break;
                case 2:
                    setSubcategory();
                    break;
                case 3:
                    deleteSubcategory();
                    break;
                case 4:
                    listSubcategories();
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida");
            }
        } while (option != 5);


    }

    public static void showOptionsforOperations() {
        int option = 0;
        do {

            System.out.println("Seleccione la opción deseada");
            System.out.println("1. REGISTRAR GASTO");
            System.out.println("2. REGISTRAR INGRESO");
            System.out.println("3. MOSTRAR SALDO");
            System.out.println("4. VOLVER AL MENU PRINCIPAL");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    recordOutlay();
                    break;
                case 2:
                    recordIncome();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida");
            }
        } while (option != 4);
    }

    //MÉTODOS PARA CADA OPERACIÓN

    public static void createUser() {
        System.out.println("Proporcione el nombre del nuevo usuario");
        String name = scanner.next();
        System.out.println("Proporcione el e-mail del nuevo usuario");
        String email = scanner.next();
        users.put(email, new User(name, email));
        System.out.println("Usuario " + name + " ha sido creado con éxito");


    }


    public static void setUser() {
        System.out.println("Proporcione el e-mail del usuario que desea modificar");
        String userEmail = scanner.next();
        System.out.println("Proporcione el nuevo nombre que desea asignar al usuario cuyo e-mail es: " + userEmail);
        String newName = scanner.next();

        User user = users.get(userEmail);

        if (user == null) {
            System.out.println("Por favor ingrese un e-mail válido");
            return;
        }

        user.setName(newName);
        //users.put(userEmail, user);
        System.out.println("Usuario modificado con éxito");
    }

    public static void deleteUser() {
        System.out.println("Proporcione el e-mail del usuario que desea eliminar");
        String userEmail = scanner.next();

        User user = users.get(userEmail);

        if (user == null) {
            System.out.println("Por favor ingrese un e-mail válido");
            return;
        }
        users.remove(userEmail);
        System.out.println("El usuario con email " + userEmail + " ha sido eliminado");

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

    public static void listUsers() {

        for (String userEmail : users.keySet()) {
            User user = users.get(userEmail);
            System.out.println("Nombre: " + user.getName() + "---> Email: " + user.getEmail());
        }
    }

    public static void listCategories() {
        System.out.println("Hi!");
    }

    public static void listSubcategories() {
        System.out.println("Hi!");
    }


}

