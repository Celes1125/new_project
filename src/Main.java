
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, User> users = new HashMap<>();

    private static HashMap<String, Category> categories = new HashMap<>();

    //private static HashSet<Category> subCategories = new HashSet<>();

    //public static HashMap<String, ArrayList<Category>> subcategories = new HashMap<>();

    public static void addDefaultCategories() {
        categories.put("INGRESOS", new Category("INGRESOS", "sueldos, ganancias, renta, etc", 1));
        categories.put("PRESTAMOS", new Category("PRESTAMOS", "solicitudes/adjudicaciones de préstamos", 2));
        categories.put("BASICOS", new Category("BASICOS", "gastos ineludibles", 3));
        categories.put("NIFUNIFA", new Category("NIFUNIFA", "gastos que no son básicos pero tampoco extras", 4));
        categories.put("EXTRAS", new Category("EXTRAS", "gastos extra", 5));
        categories.put("AJUSTES", new Category("AJUSTES", "montos con función de ajuste de balance", 6));
        categories.put("AHORROS", new Category("AHORROS", "montos bajo concepto de ahorro", 7));
    }

        /*subcategories.add("Null");
        subcategories.add("Alimento balanceado");
        subcategories.add("Alimentos");
        subcategories.add("Almacén/Kiosco");
        subcategories.add("Alquiler");
        subcategories.add("Artículos de cocina");
        subcategories.add("Carne");
        subcategories.add("Cigarrillos");
        subcategories.add("Consultas médicas");
        subcategories.add("Delivery");
        subcategories.add("Dietética");
        subcategories.add("Eventos");
        subcategories.add("Farmacia");
        subcategories.add("Fotocopias");
        subcategories.add("Guardería");
        subcategories.add("Guille autos");
        subcategories.add("ICBC");
        subcategories.add("Internet/Streaming");
        subcategories.add("Juguetes");
        subcategories.add("Luz");
        subcategories.add("Nafta");
        subcategories.add("Otros");
        subcategories.add("Panadería");
        subcategories.add("Pañales/Toallitas");
        subcategories.add("Pollo");
        subcategories.add("Productos de higiene");
        subcategories.add("Productos de limpieza");
        subcategories.add("Servicio de urgencia");
        subcategories.add("Servicio de limpieza");
        subcategories.add("Sueldos");
        subcategories.add("Supermercado");
        subcategories.add("Tarjetas");
        subcategories.add("Taxi");
        subcategories.add("Telefonía celular");
        subcategories.add("Transporte");
        subcategories.add("Verduras");
        subcategories.add("Ahorros");
        subcategories.add("Ropa/Zapatos");
        subcategories.add("Bebidas");
        subcategories.add("Peluquería canina/Veterinaria");
*/




    public static void main(String[] args) {

        //MÉTODOS QUE DEBEN EJECUTARSE AL INICIO

        addDefaultCategories();

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
        int id = categories.size()+1;
        categories.put(name, new Category(name, scope, id));
        System.out.println("Categoría " + name + " ha sido creada con éxito");


    }

    public static void setCategory() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el nombre de la categoría que desea modificar");
        String name = scan.nextLine();
        System.out.println("Proporcione el nuevo nombre que desea asignar a " + name + ": ");
        String newName = scan.nextLine();
        System.out.println("Proporcione el alcance que desea asignar a " + newName + ": ");
        String newScope = scan.nextLine();

        Category categoryName = categories.get(name);

        if (categoryName == null) {
            System.out.println("Por favor ingrese una categoría válida");
            return;
        }

        categoryName.setName(newName);
        categoryName.setScope(newScope);

        categories.put(categoryName.getName(), categoryName);
        System.out.println("Categoría modificada con éxito");

    }

    public static void deleteCategory() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proporcione el nombre de la categoría que desea ELIMINAR");
        String name = scan.nextLine();
        Category categoryName = categories.get(name);
        if (categoryName == null) {
            System.out.println("Por favor ingrese una categoría válida");
            return;
        }

        categories.remove(categoryName);
        categories.remove(categoryName.getName(), categoryName);
        System.out.println("Categoría eliminada con éxito");

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
        System.out.println("LISTA DE CATEGORÍAS:");
        for (String categoryName : categories.keySet()) {
            Category category = categories.get(categoryName);
            System.out.println(category.getName()+ "(id: " + category.getId()+") - alcance: "+ category.getScope()+ " -");
        }
    }

    public static void listSubcategories() {
        System.out.println("Hi!");
    }


}

