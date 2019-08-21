import java.util.*;
import java.util.stream.Collectors;

public class FunctionRealisation {
    static void order(List<Person> persons, int[] ids) {
        process(persons, ids);
    }

    static private List<Person> process(List<Person> persons, int[] ids) {
        if (persons == null || ids == null) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Person> mapOfPersons = persons.stream().collect(Collectors.toMap(Person::getId, person -> person, (x, y) -> y, LinkedHashMap::new));
        List<Person> result = new ArrayList<>();

        for (int i = 0; i < ids.length; i++) {
            int needPersonId = ids[i];
            if (mapOfPersons.containsKey(needPersonId)) {
                Person person = mapOfPersons.remove(needPersonId);
                result.add(person);
            }
        }

        result.addAll(mapOfPersons.values().stream().collect(Collectors.toList()));
        return result;
    }

//    static private List<Person> process(List<Person> persons, int[] ids) {
//        if(persons == null || ids == null){
//            throw new IllegalArgumentException();
//        }
//
//        persons = new ArrayList<>(persons);
//        int currentPersonsIndex = 0;
//
//        for (int i = 0; i < ids.length; i++) {
//            int needPersonId = ids[i];
//            for (int personsIndex = currentPersonsIndex; personsIndex < persons.size(); personsIndex++) {
//                Person personForChecking = persons.get(personsIndex);
//                if (needPersonId == personForChecking.getId()) {
//                    persons.remove(personsIndex);
//                    persons.add(currentPersonsIndex, personForChecking);
//                    currentPersonsIndex++;
//                    break;
//                }
//            }
//        }
//        return persons;
//    }
}
