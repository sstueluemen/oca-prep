# OCA Vorbereitung
## ``package`` und ``import``

- Wenn eine Klasse eine package-Anweisung definiert, sollte dies die erste Anweisung in der Klassendefinition sein.
- Die package-Anweisung darf nicht innerhalb einer Klassendeklaration oder nach der Klassendeklaration erscheinen.
- Falls vorhanden, sollte die package-Anweisung genau einmal in einer Klasse erscheinen.
- Die import-Anweisung ermöglicht die Verwendung von einfachen Namen, nicht qualifizierten Namen von Klassen und
Schnittstellen.
- Die import-Anweisung kann nicht verwendet werden, um mehrere Klassen oder Schnittstellen mit demselben Namen zu
importieren.
- Eine Klasse kann mehrere import-Anweisungen enthalten.
- Wenn eine Klasse eine package-Anweisung enthält, sollten alle import-Anweisungen nach der package-Anweisung folgen.
- Falls vorhanden, muss eine import-Anweisung vor jeder Klassendefinition oder Schnittstellendefinition platziert werden.
## Kommentare
- Kommentare sind ein weiterer Bestandteil einer Klasse. Kommentare werden verwendet, um Java-Code zu annotieren und können an mehreren Stellen innerhalb einer Klasse erscheinen.
- Ein Kommentar kann vor oder nach einer package-Anweisung, vor oder nach der Klassendefinition und vor, innerhalb oder nach einer Methodendefinition erscheinen.
- Kommentare gibt es in zwei Varianten: Mehrzeilige und End-of-Line-Kommentare.
- Kommentare können beliebige Sonderzeichen enthalten (einschließlich Zeichen aus dem Unicode-Zeichensatz).
- Mehrzeilige Kommentare erstrecken sich über mehrere Codezeilen. Sie beginnen mit /* und enden mit */.
- End-of-Line-Kommentare beginnen mit // und werden, wie der Name schon sagt, am Ende einer Codezeile oder einer leeren Zeile platziert. Der Text zwischen // und dem Ende der Zeile wird als Kommentar behandelt.
## Klasse
Klassendeklarationen und Klassendefinitionen sind Bestandteile einer Java-Klasse.
Eine Java-Klasse kann null oder mehr Instanzvariablen, Methoden und Konstruktoren definieren.
Die Reihenfolge der Definition von Instanzvariablen, Konstruktoren und Methoden spielt in einer Klasse keine Rolle.
Eine Klasse kann eine Instanzvariable vor oder nach der Definition einer Methode definieren und sie trotzdem verwenden.
Eine Java-Quelldatei (.java-Datei) kann mehrere Klassen und Schnittstellen definieren.
Eine öffentliche Klasse kann nur in einer Quelldatei mit demselben Namen definiert werden.
package- und import-Anweisungen gelten für alle Klassen und Schnittstellen, die in derselben Quelldatei (.java-Datei) definiert sind.
## Ausführbare Java-Anwendungen
Eine ausführbare Java-Klasse ist eine Klasse, die bei Übergabe an die Java Virtual Machine (JVM) an einem bestimmten Punkt in der Klasse mit der Ausführung beginnt. Dieser Ausführungspunkt ist die main-Methode.
Damit eine Klasse ausführbar ist, sollte die Klasse eine main-Methode mit der Signatur public static void main(String args[]) oder public static void main(String... args) definieren. Die Positionen von static und public können vertauscht werden, und der Methodenparameter kann einen beliebigen gültigen Namen verwenden.
Eine Klasse kann mehrere Methoden mit dem Namen main definieren, vorausgesetzt, dass die Signatur dieser Methoden nicht mit der Signatur der main-Methode übereinstimmt, die im vorherigen Punkt definiert wurde. Diese überladenen Versionen werden nicht als main-Methode betrachtet.
Die main-Methode akzeptiert ein Array vom Typ String, das die von der JVM übergebenen Methodenparameter enthält.
Das Schlüsselwort java und der Name der Klasse werden nicht als Befehlsparameter an die main-Methode übergeben.
## Pakete
Pakete werden verwendet, um eine verwandte Gruppe von Klassen und Schnittstellen zusammenzufassen.
Standardmäßig sind alle Klassen und Schnittstellen in separaten Paketen und Unterpaketen nicht füreinander sichtbar.
Die Paket- und Unterpaketnamen werden durch einen Punkt getrennt.
Alle Klassen und Schnittstellen im selben Paket sind füreinander sichtbar.
Eine import-Anweisung ermöglicht die Verwendung von einfachen Namen für gepackte Klassen und Schnittstellen, die in anderen Paketen definiert sind.
Sie können die import-Anweisung nicht verwenden, um mehrere Klassen oder Schnittstellen mit denselben Namen aus verschiedenen Paketen zu importieren.
Sie können entweder ein einzelnes Mitglied oder alle Mitglieder (Klassen und Schnittstellen) eines Pakets mithilfe der import-Anweisung importieren.
Sie können keine Klassen aus einem Unterpaket mithilfe des Platzhalterzeichens, eines Sternchens (*), in der import-Anweisung importieren.
Eine Klasse aus einem Standardpaket kann in keiner benannten Paketenklasse verwendet werden, unabhängig davon, ob sie im selben Verzeichnis definiert ist oder nicht.
Sie können ein einzelnes static-Mitglied einer Klasse oder alle static-Mitglieder mithilfe einer static import-Anweisung importieren.
Eine import-Anweisung darf in einer Klasse nicht vor einer package-Anweisung platziert werden. Jeder Versuch, dies zu tun, führt zum Fehler bei der Kompilierung der Klasse.
Die Mitglieder von Standardpaketen sind nur für Klassen oder Schnittstellen zugänglich, die im selben Verzeichnis auf Ihrem System definiert sind.
## Zugriffmodifikatoren
Die Zugriffmodifikatoren steuern die Zugänglichkeit Ihrer Klasse und ihrer Mitglieder außerhalb der Klasse und des Pakets.
Java (8) definiert vier Zugriffsebenen: public, protected, default und private.
Java definiert drei Zugriffmodifikatoren: public, protected und private.
Der öffentliche Zugriffmodifikator (public) ist der am wenigsten restriktive Zugriffmodifikator.
Klassen und Schnittstellen, die mit dem Zugriffmodifikator public definiert sind, sind für verwandte und nicht verwandte Klassen außerhalb des Pakets zugänglich, in dem sie definiert sind.
Die Mitglieder einer Klasse, die mit dem Zugriffmodifikator protected definiert sind, sind für Klassen und Schnittstellen im selben Paket und für alle abgeleiteten Klassen zugänglich, auch wenn sie in separaten Paketen definiert sind.
Die Mitglieder einer Klasse, die ohne einen expliziten Zugriffmodifikator definiert sind, haben Paketzugänglichkeit (auch als Standardzugänglichkeit bezeichnet).
Die Mitglieder mit Paketzugriff sind nur für Klassen und Schnittstellen zugänglich, die im selben Paket definiert sind.
Eine Klasse, die mit Standardzugang (default) definiert ist, kann außerhalb ihres Pakets nicht zugegriffen werden.
Die Mitglieder einer Klasse, die mit einem privaten Zugriffmodifikator (private) definiert sind, sind nur für die Klasse zugänglich, in der sie definiert sind. Es spielt keine Rolle, ob die betreffende Klasse oder Schnittstelle aus einem anderen Paket stammt oder die Klasse erweitert hat. Private Mitglieder sind außerhalb der Klasse, in der sie definiert sind, nicht zugänglich.
Der private Zugriffmodifikator ist der restriktivste Zugriffmodifikator.
## Nicht-Zugriffmodifikatoren
Die Nicht-Zugriffmodifikatoren ändern die Standard-Eigenschaften einer Java-Klasse und ihrer Mitglieder.
Die Nicht-Zugriffmodifikatoren, die in dieser Prüfung behandelt werden, sind abstract, final und static.
Das Schlüsselwort abstract, wenn es der Definition einer konkreten Klasse vorangestellt wird, kann sie in eine abstrakte Klasse ändern, auch wenn sie keine abstrakten Methoden definiert.
Eine abstrakte Klasse kann nicht instanziiert werden.
Eine Schnittstelle ist implizit abstrakt. Der Java-Compiler fügt automatisch das Schlüsselwort abstract zur Definition einer Schnittstelle hinzu (was bedeutet, dass das Hinzufügen des Schlüsselworts abstract zur Definition einer Schnittstelle redundant ist).
Eine abstrakte Methode hat keinen Körper. Wenn eine nicht-abstrakte Klasse eine Klasse mit einer abstrakten Methode erweitert, muss sie die Methode implementieren.
Eine Variable kann nicht als abstrakte Variable definiert werden.
Der Modifikator static kann auf innere Klassen, innere Schnittstellen, Variablen und Methoden angewendet werden. Innere Klassen und Schnittstellen werden in dieser Prüfung nicht behandelt.
Eine Methode kann nicht gleichzeitig als abstract und static definiert werden.
Statische Attribute (Felder und Methoden) sind für alle Instanzen einer Klasse gemeinsam und sind nicht einzigartig für eine Instanz einer Klasse.
Statische Attribute existieren unabhängig von Instanzen einer Klasse und können auch dann aufgerufen werden, wenn keine Instanzen der Klasse erstellt wurden.
Statische Attribute sind auch als Klassenfelder oder Klassenmethoden bekannt, da sie ihrer Klasse zugeschrieben werden, nicht einer Instanz dieser Klasse.
Eine statische Variable oder Methode kann mithilfe des Namens einer Referenzobjektvariablen oder des Namens einer Klasse aufgerufen werden.
Eine statische Methode oder Variable kann nicht auf nicht-statische Variablen oder Methoden einer Klasse zugreifen. Aber das Gegenteil ist wahr: Nicht-statische Variablen und Methoden können auf statische Variablen und Methoden zugreifen.
Statische Klassen und Schnittstellen sind eine Art verschachtelter Klassen und Schnittstellen, aber sie werden in dieser Prüfung nicht behandelt.
Sie können die Definition einer Top-Level-Klasse oder einer Schnittstelle nicht mit dem Schlüsselwort static voranstellen. Eine Top-Level-Klasse oder -Schnittstelle ist eine, die nicht innerhalb einer anderen Klasse oder Schnittstelle definiert ist.
## Merkmale und Komponenten von Java:
Objektorientierung—Java emuliert die Definition und das Verhalten realer Objekte. Es verwendet Klassen, Schnittstellen oder Enums, um seinen gesamten Code zu definieren.
Abstraktion—Java ermöglicht es Ihnen, Objekte zu abstrahieren und nur die erforderlichen Eigenschaften und Verhaltensweisen in Ihren Code aufzunehmen.
Kapselung—Der Zustand oder die Felder einer Klasse sind vor unerwünschtem Zugriff und Manipulation geschützt.
Vererbung—Java ermöglicht es seinen Klassen, andere Klassen zu erben und Schnittstellen zu implementieren. Die Schnittstellen können andere Schnittstellen erben.
Polymorphismus—Java ermöglicht es Instanzen seiner Klassen, für dieselben Methodenaufrufe mehrere Verhaltensweisen zu zeigen.
Typsicherheit—In Java müssen Sie eine Variable mit ihrem Datentyp deklarieren, bevor Sie sie verwenden können.
Automatische Speicherverwaltung—Java verwendet Garbage Collector zur automatischen Speicherverwaltung. Diese sammeln Speicher von Objekten zurück, die nicht mehr verwendet werden.
Multithreading und Parallelität—Java definiert Klassen und Schnittstellen, um Entwicklern die Entwicklung von Multithreading-Code zu ermöglichen.
Java ist keine Ein-Thread-Sprache.