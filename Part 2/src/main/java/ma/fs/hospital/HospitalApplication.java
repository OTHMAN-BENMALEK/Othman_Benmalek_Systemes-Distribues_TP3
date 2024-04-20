package ma.fs.hospital;

import ma.fs.hospital.entities.Patient;
import ma.fs.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Othman",new Date(),false,536));
            patientRepository.save(new Patient(null,"Jubil",new Date(),false,5130));
            patientRepository.save(new Patient(null,"Moha",new Date(),true,147));
        };
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
