package main;

import player.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creo l'array di 5 elementi multimediali
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        // Fase di inserimento dei dati per i 5 elementi multimediali
        for (int i = 0; i < elementi.length; i++) {
            System.out.println("\nInserisci l'elemento multimediale " + (i + 1) + " di 5."); // Nota per capire quanti elementi sono stati creati

            boolean elementoCreato = false; // Settaggio iniziale

            // Ciclo per continuare a fare la domanda qua sotto finchè non si raggiunge il numero di elementi richiesto
            while (!elementoCreato) {
                System.out.println("Crea un elemento multimediale (1: Immagine, 2: Audio, 3: Video): ");
                int scelta = scanner.nextInt();
                scanner.nextLine(); // Leggo gli input

                System.out.println("Inserisci il titolo dell'elemento: ");
                String titolo = scanner.nextLine();

                // Ciclo per la creazione delle opzioni multimediali
                switch (scelta) {
                    case 1:
                        System.out.println("Inserisci la luminosità dell'immagine: ");
                        int luminosita = scanner.nextInt();
                        elementi[i] = new Immagine(titolo, luminosita);
                        elementoCreato = true;
                        break;
                    case 2:
                        System.out.println("Inserisci il volume dell'audio: ");
                        int volumeAudio = scanner.nextInt();
                        System.out.println("Inserisci la durata dell'audio: ");
                        int durataAudio = scanner.nextInt();
                        elementi[i] = new Audio(titolo, volumeAudio, durataAudio);
                        elementoCreato = true;
                        break;
                    case 3:
                        System.out.println("Inserisci il volume del video: ");
                        int volumeVideo = scanner.nextInt();
                        System.out.println("Inserisci la durata del video: ");
                        int durataVideo = scanner.nextInt();
                        System.out.println("Inserisci la luminosità del video: ");
                        int luminositaVideo = scanner.nextInt();
                        elementi[i] = new Video(titolo, volumeVideo, durataVideo, luminositaVideo);
                        elementoCreato = true;
                        break;
                    default:
                        System.out.println("Scelta non valida, riprova.");
                        break;
                }
            }
        }

        // Fase di esecuzione degli elementi multimediali
        int sceltaEsecuzione = -1;

        // Ciclo per creare gli elementi multimediali finchè non sono 5
        while (sceltaEsecuzione != 0) {
            System.out.println("Quale elemento vuoi eseguire? (1-5 per eseguire, 0 per uscire): ");
            sceltaEsecuzione = scanner.nextInt(); // Grazie agli input da 1 a 5 posso ottenere l'output degli elementi nell'array

            if (sceltaEsecuzione > 0 && sceltaEsecuzione <= 5) {
                ElementoMultimediale elemento = elementi[sceltaEsecuzione - 1];
                elemento.esegui();

            } else if (sceltaEsecuzione != 0) {
                System.out.println("Scelta non valida.");

            }
        }

        scanner.close();
        System.out.println("Uscita dal programma.");
    }
}

