# oblig3
Oblig 3 - git og continuous integration 

Her har jeg laget en actions som kjører hver gang noe pushes til master.
Workflowen vil kjøres på den siste ubuntu-containeren.
Det første steget sjekker ut main-branchen fra github.
Dette gjøres av github actions.
I andre steg setter jeg opp jdk 17, noe som også gjøres via github actions.
Det siste jeg gjør er å bygge maven med github actions. Jeg velger også å kjøre testene en gang til slutt slik at jeg kan lettere finne frem til testene.
