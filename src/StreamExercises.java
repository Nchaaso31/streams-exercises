import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {
    private int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //  Versión funcional
//    A seria Integer que entra
//    B seria la otra interfaz
    private int sum10(List<Integer> numbers) {
        List<Integer> numberplus10 = new LinkedList<>();
        int sum = 0;
        for (int number : numbers) {
            numberplus10.add(number + 10);
        }
        return sum;
    }

    private int res10(List<Integer> numbers) {
        List<Integer> numberplus10 = new LinkedList<>();
        int sum = 0;
        for (int number : numbers) {
            numberplus10.add(number - 10);
        }
        return sum;
    }

    private List<Integer> sum10Fun(List<Integer> numbers) {
        return numbers
//     Es necesario convertir la List<Integer> para poder usar
//     Los métodos funcionales
                .stream()
//                Lambda
//                Map es un método funcional que convierte Stream <A> -> Stream<B>, f: A -> B
                .map(number -> number + 10)
                .collect(Collectors.toList());
    }

    private List<Integer> minus10Fun(List<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> number - 10)
                .collect(Collectors.toList());
    }

//       Esto sería igual a >  .map(number -> number - 10)
//       Y eso seria igual a
//       private int sum10(int numeber){
//       return + 10;
//       }


    private List<String> getSurnames(List<Person> people) {
        return people
                .stream().
                map(person -> person.getSurname())
                .collect(Collectors.toList());
    }

    //    Queremos sacar Garcia pero tambien estan
//    Pepa pig, Pepe García, Ana García
    private List<Person> findGarcía(List<Person> people) {
        List<Person> garcias = new LinkedList<>();
        for (Person person : people) {
            if (person.getName().equals("García")) {
                garcias.add(person);
            }
        }
        return garcias;
    }

    private List<Person> findBob(List<Person> people) {
        List<Person> garcias = new LinkedList<>();
        for (Person person : people) {
            if (person.getName().equals("Bob")) {
                garcias.add(person);
            }
        }
        return garcias;

    }

    private List<String> findGarciasSurname(List<Person> people) {
        return people
                .stream().
                filter(person -> person.getSurname().equals("García"))
                .map(person -> person.getSurname())
                .collect(Collectors.toList());
    }


    // Estamos convirtiendo una lista dentro de otra lista
    private List<String> getEmails(List<Person> people) {
        return people
                .stream()
                .flatMap(person -> person.getEmails().stream())
                .collect(Collectors.toList());
    }


    //      PRIMERA FORMA DE HACERLO
    private int multiply(List<Integer> numbers) {
        List<Integer> numberplus10 = new LinkedList<>();
        int sum = 1;
        for (int number : numbers) {
            numberplus10.add(number * 10);
        }
        return sum;
    }


    //    SEGUNDA FORMA DE HACERLO CON LANDAS
    private int sumlandas(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, (a, b) -> a + b);
    }

    private int nmultiply(List<Integer> numbers) {
        return numbers
                .stream()
//    EL REDUCE ES PARA SUMAS Y MULTIPLICACIONES
                .reduce(0, (a, b) -> a * b);
    }

    private int getNumber(List<Person> people){
        return people
                .stream()
                .map(person -> person.getEmails().size())
                .reduce()
    }
}