package com.example.demo.service.impl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.controller.RespuestaFibonacciDTO;
import com.example.demo.service.FibonacciService;
@Service
public class FibonacciServiceImpl implements FibonacciService {
    @Override
    public RespuestaFibonacciDTO entregarSerie() {
        //TODO Auto-generated method stub
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();

        //System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
        String hora = hours  + ":"+ minutes +":"+seconds;

        //ejemplo de hora 07:43:12
        
        int semilla1 = minutes / 10;
        //semilla1=43/10=4

        int semilla2 = minutes % 10;
        //semilla2 = 43 % 10=3
        //(4,3,7,10,17,27,44,71,115,186,301,487,788,1275)

        List<Integer> serieFibonacci = new ArrayList<>();
        //así se debe ver la lista al ppio [] y solo permite enteros
 
        serieFibonacci.add(semilla1);
        serieFibonacci.add(semilla2);
        //[4,3] -> posiciones (4 en posición 0 y 3 en posición 1 - de la lista)
        // seconds es igual a 12
 
        int temporal = 0;
        int suma = 0;
        while (temporal < seconds) {
            //serieFibonacci.add
            suma = serieFibonacci.get(serieFibonacci.size()-1) + serieFibonacci.get(serieFibonacci.size()-2);
            // La primera vez suma = 3+4
            serieFibonacci.add(suma);
            temporal++;
        }
 
        //String hora,List<Integer> serieFibonacci
        RespuestaFibonacciDTO respuestaSerie = new RespuestaFibonacciDTO(hora, serieFibonacci);
        return respuestaSerie;
    }
}
