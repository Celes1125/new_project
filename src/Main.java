
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, User> users = new HashMap<>();

    private static HashMap<Integer, Category> categories = new HashMap<>();






    public static void main(String[] args) {


        addDefaultCategories();

        //MENU PRINCIPAL

        int option = 0;

        do {
            System.out.println("Seleccione la opción deseada");
            System.out.println("1. USUARIOS");
            System.out.println("2. CATEGORIAS");
            System.out.println("3. OPERACIONES");
            System.out.println("4. SALIR");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    showOptionsForUser();
                    break;
                case 2:
                    showOptionsForCategory();
                    break;
                case 3:
                    showOptionsforOperations();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida");

            }
        } while (option != 4);


    }


    //MÉTODOS PARA NAVEGAR EL MENÚ////////////////////////////////////////////////////////////

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

    //MÉTODOS QUE DEBEN EJECUTARSE AL INICIO////////////////////////////////////////////////////////////
    public static void addDefaultCategories() {
        categories.put(1, new Category("INGRESOS", "sueldos, ganancias, renta, etc", 1,1));
        categories.put(2, new Category("PRESTAMOS", "solicitudes/adjudicaciones de préstamos", 2, 1));
        categories.put(3, new Category("BASICOS", "gastos ineludibles", 3, 1));
        categories.put(4, new Category("NIFUNIFA", "gastos que no son básicos pero tampoco extras", 4, 1));
        categories.put(5, new Category("EXTRAS", "gastos extra", 5, 1));
        categories.put(6, new Category("AJUSTES", "montos con función de ajuste de balance", 6,1));
        categories.put(7, new Category("AHORROS", "montos bajo concepto de ahorro", 7, 1));
        categories.put(8, new Category("agua", "", 8, 2));
        categories.put(9, new Category("alquiler", "", 9, 2));
        categories.put(10, new Category("banca", "", 10, 2));
        categories.put(11, new Category("carnicería", "", 11, 2));
        categories.put(12, new Category("cuidado personal", "", 12, 2));
        categories.put(13, new Category("delivery", "", 13, 2));
        categories.put(14, new Category("dietética", "", 14, 2));
        categories.put(15, new Category("educación", "", 15, 2));
        categories.put(16, new Category("gas", "", 16, 2));
        categories.put(17, new Category("guille autos", "", 17, 2));
        categories.put(18, new Category("higiene personal", "", 18, 2));
        categories.put(19, new Category("hogar/deco/muebles", "", 19, 2));
        categories.put(20, new Category("impuestos", "", 20, 2));
        categories.put(21, new Category("internet/streaming/telefonía", "", 21, 2));
        categories.put(22, new Category("juguetes", "", 22, 2));
        categories.put(23, new Category("librería", "", 23, 2));
        categories.put(24, new Category("limpieza", "", 24, 2));
        categories.put(25, new Category("luz", "", 25, 2));
        categories.put(26, new Category("mercado", "", 26, 2));
        categories.put(27, new Category("nafta/gas/gasoil", "", 27, 2));
        categories.put(28, new Category("ocio", "", 28, 2));
        categories.put(29, new Category("panadería", "", 29, 2));
        categories.put(30, new Category("pollería", "", 30, 2));
        categories.put(31, new Category("servicios de salud", "", 31, 2));
        categories.put(32, new Category("sueldos", "", 32, 2));
        categories.put(33, new Category("tarjetas de crédito", "", 33, 2));
        categories.put(34, new Category("trámites", "", 34, 2));
        categories.put(35, new Category("transporte público", "", 35, 2));
        categories.put(36, new Category("verdulería", "", 36, 2));
        categories.put(37, new Category("otros", "", 37, 2));


    }

    //MÉTODOS PARA CADA OPERACIÓN/////////////////////////////////////////////////////////////

    public static void createUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el nombre del nuevo usuario");
        String name = scan.nextLine();
        System.out.println("Proporcione el e-mail del nuevo usuario");
        String email = scan.nextLine();
        users.put(email, new User(name, email));
        System.out.println("Usuario " + name + " ha sido creado con éxito");


    }

    public static void setUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el e-mail del usuario que desea modificar");
        String userEmail = scan.nextLine();
        System.out.println("Proporcione el nuevo nombre que desea asignar al usuario cuyo e-mail es: " + userEmail);
        String newName = scan.nextLine();

        User user = users.get(userEmail);

        if (user == null) {
            System.out.println("Por favor ingrese un e-mail válido");
            return;
        }

        user.setName(newName);
        users.put(userEmail, user);
        System.out.println("Usuario modificado con éxito");
    }

    public static void deleteUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el e-mail del usuario que desea eliminar");
        String userEmail = scan.nextLine();
        User user = users.get(userEmail);
        if (user == null) {
            System.out.println("Por favor ingrese un e-mail válido");
            return;
        }
        users.remove(userEmail);
        System.out.println("El usuario con email " + userEmail + " ha sido eliminado");

    }

    public static void createCategory() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el nombre de su nueva categoría");
        String name = scan.nextLine();
        System.out.println("Describa a qué hace referencia esta nueva categoría");
        String scope = scan.nextLine();
        Integer id = categories.size()+1;
        System.out.println("Indique el nivel de su nueva categoría");
        System.out.println("1. Primer nivel");
        System.out.println("2. Segundo nivel");
        Integer level = scan.nextInt();
        categories.put(id, new Category(name, scope, id, level));
        System.out.println("Categoría " + name + " ha sido creada con éxito");    }

    public static void setCategory() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el id de la categoría que desea modificar");
        Integer categoryId = scan.nextInt();
        Category category = categories.get(categoryId);
        if (category == null) {
            System.out.println("Por favor ingrese una categoría válida");
            return;
        }
        System.out.println("el nombre actual de la categoría que desea modificar es: " + category.getName());
        System.out.println("Está seguro de modificar la categoría " + category.getName() + "(id: " + category.getId() + ") ?????");
        System.out.println("Proporcione el nuevo nombre que desea asignar a " + category.getName() + ": ");
        String newName = scan.nextLine();
        System.out.println("Proporcione el alcance que desea asignar a " + newName + ": ");
        String newScope = scan.nextLine();
        System.out.println("Proporcione el nivel que desea asignar a " + newName + ": ");
        Integer newLevel = scan.nextInt();
        category.setName(newName);
        category.setScope(newScope);
        category.setLevel(newLevel);
        //categories.put(category.getId(), category);
        System.out.println("Categoría modificada con éxito");

    }

    public static void deleteCategory() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el id de la categoría que desea ELIMINAR");
        Integer categoryId = scan.nextInt();
        Category category = categories.get(categoryId);
        if (category == null) {
            System.out.println("Por favor ingrese una categoría válida");
            return;
        }
        System.out.println("el nombre actual de la categoría que desea modificar es: " + category.getName());
        System.out.println("Está seguro de ELIMINAR la categoría " + category.getName() + "(id: " + category.getId() + ") ?????");

        categories.remove(categoryId, category);
        System.out.println("Categoría eliminada con éxito");

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
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("LISTA DE CATEGORÍAS:");
        System.out.println("");

        for (Integer categoryId : categories.keySet()) {
            Category category = categories.get(categoryId);
            System.out.println("(id: " + category.getId()+") - Nombre: " + category.getName()+ " -  NIVEL " + category.getLevel() + " -- Alcance: " + category.getScope()+ " -");
        }
        System.out.println("");
        System.out.println("---------------------------------------------------");

    }



}

