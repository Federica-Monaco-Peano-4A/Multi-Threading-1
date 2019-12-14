# Multi-Threading:

Thread: parte del processo indipendente dalle altre
Il processore permette l'esecuzione simultanea di più processi, questo comporta una riduzione del tempo di esecuzione. Nella prima versione(in cui erano contenute le classi Hi e Hello) abbiamo esteso alle classi due Thread abbiamo in seguito creato un metodo "run" per ogni classe e infine abbiamo istanziato un oggetto per la classe Hi e uno per la classe Hello. Dopo aver eseguito i due Thread tramite il metodo "start" abbiamo notato che quest'ultimi mandavano in output messaggi in ordine casuale.

Es: Hi Hello Hi Hi Hi Hello Hi Hello Hello .........

Nella seconda versione abbiamo aggiunto la classe di tipo Say(estesa in Thread) che riceveva come attributo una stringa che sarebbe stata l'output. Abbiamo in seguito creato anche in essa il metodo "run" e nel main l'abbiamo eseguita con il metodo "start".

