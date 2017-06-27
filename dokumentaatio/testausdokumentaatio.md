## Testausdokumentaatio  
Käsittelee puutteita testauksessa historia-luokan kahdessa metodissa: writeHistory() ja readHistory(). 
WriteHistory()-metodissa on jäänyt testaamatta IOExceptionin heitto, joka aiheutuu jos jokin menee vikaan FileUtils.writeStringToFile()-metodia kutsuttaessa.
Mielestäni tämän testaaminen on mieletöntä (ja mahdotonta?), sillä virhetilanteet aiheutuvat, kun FileUtils.writeStringToFile()-metodi saa parametreikseen ei sopivia syötteitä.
Esimerkiksi jos metodi saisi (teksti)tiedoston sijaan kansion, johon pitäisi kirjoittaa jotain String-muotoista. 
Virhetilanteet eivät kuitenkaan ole mahdollisia, sillä FileUtils.writeStringToFile()-metodille ei ole mahdollista antaa epäsopivia parametreja writeHistory()-metodissa.  

ReadHistory()-metodissa rivien 47-53 tehtävänä on luoda uusi .txt-tiedosto, jos sellaista ei vielä ole (Tämä osa on lisätty sitä varten, että kun projektista luodaan .jar-tiedosto, 
niin ei tule virhekoodia, jos historiaa yritetään lukea ilman että tekstitiedostoa on olemassa). Vastaavasti kuin edellisessä kohdassa FileUtils.writeStringToFile()-metodin ei ole mahdollista saada
epäsopivia parametreja. Riveillä 59-61 catch-lause ei ole saavutettavissa, sillä metodi FileUtils.readFileToString() saa aina not-null tiedoston käsiteltäväkseen. Catch-lauseessa oleva return null ei ole saavutettavissa, 
mutta java vaatii sen olemassa olon.  

Näillä perustein kyseisten IOExceptioneiden testaus on mielestäni tarpeetonta.