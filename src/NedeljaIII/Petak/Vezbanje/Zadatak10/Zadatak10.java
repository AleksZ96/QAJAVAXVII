package NedeljaIII.Petak.Vezbanje.Zadatak10;

public class Zadatak10 {
    /*
    10.
#####
Ovaj zadatak je dosta dugacak!
Procitajte zadatak u celosti i razmislite tacno sta se trazi od Vas pre nego sto krenete da kucate kod!
Klasa korpa je verovatno najteza klasa od svih ovih. Tu morate bas dobro da razmislite sta se desava!
#####

Napisati klasu Film koja sadrzi atribute:
	- String ime
	- int godinaPremijere (godina kada je film prvi put prikazan; 1888 - 2021) (default = 2021)
	- double ocena (ocena filma, [1.0, 10.0]) (default = 1.0)
	- String sadrzaj (kratak sadrzaj filma)
	- int sati, minuti, sekunde (koliko sati, minuti i sekundi traje film| [0, 10), [0, 59], [0, 59] ) (default = 1, 30, 0)

Napisati konstruktor(e) i proveriti da li su unosi validni. Ako uslovi nisu validni, postaviti ih na default vrednosti.
Napisati toString() metod:
	"{ime} {godinaPremijere} {ocena}
	 Duzina trajanja: {sati} : {minuti} : {sekunde}
	 {sadrzaj}"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu FilmNaStanju koja sadrzi atribute:
	- Film film
	- int kolicina (koliko kopija datog filma ima u nekom video klubu)
	- double cena (koliko kosta dati film da se iznajmi u nekom video klubu)

Napisati konstruktor(e).
Napisati toString() metod:
	"{imeFilma} - {cena} | Na stanju: {kolicina}"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu VideoKlub koja sadrzi polja:
	- String naziv (naziv video kluba)
	- ArrayList katalog (katalog svig filmova na stanju)

Napisati konstruktor(e).
Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce. Ako nije, ispisati na konzolu poruku:
	"Film {nazivFilma} trenutno nema na stanju".
Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce. Ako nije moguce iznajmiti sve,
	iznajmiti sto vise kopija datog filma i ispisati poruku:
	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
	"Film {nazivFilma} trenutno nema na stanju".
Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.
Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.
Napisati metod pregledajFilm(Film f) - ispisuje na konozulu:
	"{imeFilma} - {cena} | Na stanju: {kolicina}"
	"{sadrzajFilma}"
	(ili "{imeFilma} | Nema na stanju")
Napisati metod pregledajKatalog() - ispisuje ceo katalog na konzolu:
	"{imeFilma1} - {cena1} | Na stanju: {kolicina1}"
	.
	.
	.
	"{imeFilmaN} - {cenaN} | Na stanju: {kolicinaN}"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Korpa koja sadrzi polja:
	- VideoKlub vk (neki video klub)
	- ArrayList korpa (korpa u koju mogu da se stavljaju filmovi koje neki kupac hoce da kupi)
	- double ukupnaCena (ukupna cena filmova u korpi)

Napisati odogarajuc(e) konstruktor(e) i metode za ovu klasu.
Napisati metodu dodajFilmUKorpu(Film f) - dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
	AKo zadatog filma nema na stanju ispisati poruku:
	"Film {f} nema na stanju."
Napisati metodu dodajFilmaUKorpu(Film f, int n) - dodaje n kopija filma f u kopru ako ga ima na stanju u zadatom video klubu.
	Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
	"Nije moguce kupiti {n} filmova {nazivFilma}.
	 U korpu je dodato {brojKopija} kopija filma {nazivFilma}."
Napisati metod izbaciIzKorpe(Film f) - izbacuje jednu kopiju filma f iz korpe (pretpostaviti da takav film uvek postoji u korpi).
	Ispisati poruku:
	"Izbacili ste kopiju filma {nazivFilma} iz korpe".
Napisati metod izbaciIzKorpe(Film f, int n) - izbacuje n kopija filma f iz korpe i ispisati poruku:
	"Izbacili ste {n} kopija filma {nazivFilma} iz korpe.".
	Ako je prosledjen broj n veci ili jednak broju kopija filma f u korpi ispisati poruku:
	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
Napisati metod izbaciIzKopreSveKopije(Film f) - izbacuje sve kopije filma f iz korpe i ispisuje poruku:
	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
	"Korpa je sada prazna."
Napisati metod ispisiInventarKorpe() koja ispisuje inventar korpe:
	"{nazivFilma1} {brojKopijaFilma1UKorpi} {ukupnaCenaSvihKopijaFilma1UKopri}
	 .
	 .
	 .
	 {nazivFilmaN} {brojKopijaFilmaNUKorpi} {ukupnaCenaSvihKopijaFilmaNUKopri}"
	 Ukupna cena: {ukupnaCena} svih filmova u korpi"


---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Kupac koja sadrzi polja:
	- Osoba kupac
	- double racun (novac sa kojim kupac raspolaze)
	- Korpa kopra (korpa nekog kupca)
	- ArrayList filmovi (filmovi koje je kupac kupio)

Napraviti konstruktor koji pravi novog kupca i postavlja da su korpa i filmovi koje vec poseduje prazni.
Omoguciti da kupac moze da ubacuje i izbacuje filmove iz korpe, kao i da pregleda njen sadrzaj.
Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova, ako kupac ima dovoljno novca za to i ispisuje:
	"Uspesno kupljeno {brojStavki} filmova".
	U suprotnom ispisuje poruku:
	"Nemate dovoljno novca!
	 Potrebno: {ukupnaCenaKorpe}
	 Na raspolaganju: {racun}"
Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
	"{nazivFilma1} {brojKopijaFilma1}"
	.
	.
	.
	"{nazivFilmaN} {brojKopijaFilmaN}"
	"Ukupno filmova: {brojFilmova}"
	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"
     */
}
