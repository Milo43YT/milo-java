/*
	Powershell öffnen, in das Verzeichnis wechseln, in welchem diese Datei
	abgelegt ist:
	cd <Pfad zu JavaAscii.java>
	
	Und folgendes eingeben:
	
	1. Compilieren:    javac  JavaAscii.java
	2. Ausführen:      java  JavaAscii
	
	Ausgabe:
	b
	B
	
	A
*/

public class JavaAscii{
    public static void main(String[] args){
        int asciiCodeForB = 98;
        char asciiCharA = 65;

        System.out.printf("%c%n", asciiCodeForB);
        System.out.printf("%C%n", asciiCodeForB);

        System.out.println();

        System.out.println(asciiCharA);
    }
}