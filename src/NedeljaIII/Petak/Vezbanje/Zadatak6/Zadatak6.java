package NedeljaIII.Petak.Vezbanje.Zadatak6;

public class Zadatak6 {
    public static void main(String[] args) {
        /*
        6. Napisati klasu Knjiga koja ima sledeca polja/atribute:
nazivKnjige (string),
autor (Osoba),
vlasnik (Osoba)
brojStrana (int),
godinaIzdanja (int).
Broj strana i godina izadanje ne mogu biti negativni. Ispisati poruku o gresci ako korisnik pokusa da napravi knjigu sa negativnim brojem strana ili godinom izdanja
(u konstruktoru, jer se tamo 'pravi' knjiga).
Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti na negativno.
Napisati sledece metode
	2 konstruktora. Knjiga ne mora imati vlasnika -> dakle jedan konstruktor gde se salje i ko je vlasnik, drugi konstruktor gde se ne salje ko je vlasnik
	getter i setter metode za sva polja
	toString koristeci stringBuilder
	format
		Naziv knjige je: <naziv knjige>
		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
		Broj strana: <broj strana>
		Godina izdanja: <godina izdanja>
	napisati i metodu "velicinaKnjige" koja vraca string
		- "mala knjiga" - ako je broj strana od 0 do 100
		- "srednje velika knjiga" - ako je broj strana od 101 do 300
		- "velika knjiga" - ako je broj strana od 301-600
		- "bas velika knjiga" - ako je broj strana 601 i vise
         */
        Osoba autor1 = new Osoba("Stefani", "Majer", 35);
        Knjiga knjiga1 = new Knjiga("Sumrak", autor1, 354, 2007);

        System.out.println(knjiga1);
        System.out.println(knjiga1.velicinaKnjige());

    }
}
