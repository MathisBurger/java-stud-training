# Übung 1 - Prüfungssystem

Die Hochschule möchte ein neues Prüfungssystem entwickeln. Ein externer Dienstleister hat bereits etwas programmiert.

Er hat folgende Anforderungen an sie, damit sein Code funktioniert.

- Erstellen sie eine Klasse `Student`, die **keinen** Default-Konstruktor hat und einen Konstruktor hat, der die Parameter `name` und `age` jeweils als `String` und `int` in privaten Attributen speichert
- Erstellen sie eine weitere Klasse `Studiengruppe`, die eine Funktion `addStudent` hat, welche einen Student zu der Studiengruppe hinzufügt

Zudem soll folgende Aufruf-Semantik funktionieren:

```java
import uebung01.Student;
import uebung01.Studiengruppe;

Studiengruppe gruppe = new Studiengruppe();
gruppe.addStudent(new Student("Mathis Burger", 19));

for(Student student :gruppe){
    System.out.println(student); // Ausgabe: Mathis Burger (19)
}
```


