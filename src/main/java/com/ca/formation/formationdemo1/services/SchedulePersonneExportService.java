package com.ca.formation.formationdemo1.services;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class SchedulePersonneExportService {

    //@Async
    //@Scheduled(fixedDelay = 10000)
    public void envoyerListePersonnes(){

        System.out.println(" Envoyer la liste des personne - "+System.currentTimeMillis()/1000);
    }
}
