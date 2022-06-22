package com.code.obspring;

import com.code.obspring.entity.Laptop;
import com.code.obspring.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(ObSpringApplication.class, args);
        LaptopRepository repository = context.getBean(LaptopRepository.class);

        //test
        Laptop tmp1 = new Laptop("motherboard-1", "cpu-1", "gpu-1", "ram-1", "storage-1");
        Laptop tmp2 = new Laptop("motherboard-2", "cpu-2", "gpu-2", "ram-2", "storage-2");

        //add laptops
        repository.save(tmp1);
        repository.save(tmp2);


    }
    
}
