DROP TABLE kontrahent CASCADE;
DROP TABLE firma CASCADE;
DROP TABLE stawkavat CASCADE;
DROP TABLE jednostka CASCADE;
DROP TABLE formaplatnosci CASCADE;
DROP TABLE rabat CASCADE;
DROP TABLE towar CASCADE;
DROP TABLE faktura CASCADE;

CREATE TABLE kontrahent (
	id SERIAL PRIMARY KEY,
	skrot VARCHAR(20) NOT NULL,
	nazwa VARCHAR(50) NOT NULL,
	ulica VARCHAR(20) NOT NULL,
	kod VARCHAR(6) NOT NULL,
	miasto VARCHAR(20) NOT NULL,
	nip VARCHAR(10) NOT NULL,
	konto VARCHAR(26),
	osoba VARCHAR(20),
	tel VARCHAR(20),
	email VARCHAR(20)
);

CREATE TABLE firma (
	id SERIAL PRIMARY KEY,
	skrot VARCHAR(20) NOT NULL,
	nazwa VARCHAR(50) NOT NULL,
	ulica VARCHAR(20) NOT NULL,
	kod VARCHAR(6) NOT NULL,
	miasto VARCHAR(20) NOT NULL,
	nip VARCHAR(10) NOT NULL,
	konto VARCHAR(26),
	osoba VARCHAR(20),
	tel VARCHAR(20),
	email VARCHAR(20)
);

CREATE TABLE stawkavat (
	id SERIAL PRIMARY KEY,
	stawkavat  VARCHAR(10) NOT NULL,
	wartoscvat INTEGER
)

CREATE TABLE jednostka (
	id SERIAL PRIMARY KEY,
	jednostkam  VARCHAR(10) NOT NULL
);

CREATE TABLE formaplatnosci (
	id SERIAL PRIMARY KEY,
	opis  VARCHAR(10) NOT NULL,
	iloscdni INTEGER
);

CREATE TABLE rabat (
	id SERIAL PRIMARY KEY,
	wartosczakupow  INTEGER NOT NULL,
	wusokoscrabatu INTEGER NOT NULL
);

CREATE TABLE towar (
	id SERIAL PRIMARY KEY,
	skrot VARCHAR(20) NOT NULL,
	nawzwa VARCHAR(50) NOT NULL,
	pkwiu VARCHAR(20),
	jednm INTEGER REFERENCES jednostka(id),
	cena_netto NUMERIC NOT NULL CHECK (cena_netto>0),
	vat INTEGER REFERENCES stawkavat(id),
	cena_brutto NUMERIC NOT NULL
);

CREATE TABLE faktura (
	id SERIAL PRIMARY KEY,
	nr VARCHAR(10) NOT NULL,
	data_wystawienie DATE NOT NULL,
	data_sprzedazy DATE NOT NULL,
	kontrahent INTEGER REFERENCES kontrahent(id),
	formaplatnosci INTEGER REFERENCES formaplatnosci(id),
	terminplatnosci DATE NOT NULL,
	pozycja INTEGER REFERENCES towar(id),
	ilosc NUMERIC NOT NULL CHECK (ilosc>0),
	rabat INTEGER REFERENCES rabat(id)
);