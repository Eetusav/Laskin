## Testausdokumentaatio  
K�sittelee puutteita testauksessa historia-luokan kahdessa metodissa: writeHistory() ja readHistory(). 
WriteHistory()-metodissa on j��nyt testaamatta IOExceptionin heitto, joka aiheutuu jos jokin menee vikaan FileUtils.writeStringToFile()-metodia kutsuttaessa.
Mielest�ni t�m�n testaaminen on mielet�nt� (ja mahdotonta?), sill� virhetilanteet aiheutuvat, kun FileUtils.writeStringToFile()-metodi saa parametreikseen ei sopivia sy�tteit�.
Esimerkiksi jos metodi saisi (teksti)tiedoston sijaan kansion, johon pit�isi kirjoittaa jotain String-muotoista. 
Virhetilanteet eiv�t kuitenkaan ole mahdollisia, sill� FileUtils.writeStringToFile()-metodille ei ole mahdollista antaa ep�sopivia parametreja writeHistory()-metodissa.  

ReadHistory()-metodissa rivien 47-53 teht�v�n� on luoda uusi .txt-tiedosto, jos sellaista ei viel� ole (T�m� osa on lis�tty sit� varten, ett� kun projektista luodaan .jar-tiedosto, 
niin ei tule virhekoodia, jos historiaa yritet��n lukea ilman ett� tekstitiedostoa on olemassa). Vastaavasti kuin edellisess� kohdassa FileUtils.writeStringToFile()-metodin ei ole mahdollista saada
ep�sopivia parametreja. Riveill� 59-61 catch-lause ei ole saavutettavissa, sill� metodi FileUtils.readFileToString() saa aina not-null tiedoston k�sitelt�v�kseen. Catch-lauseessa oleva return null ei ole saavutettavissa, 
mutta java vaatii sen olemassa olon.  

N�ill� perustein kyseisten IOExceptioneiden testaus on mielest�ni tarpeetonta.