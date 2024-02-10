package br.com.gabrielmirandadasilva.certification.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.gabrielmirandadasilva.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute( VerifyHasCertificationDTO dto ){
        if(dto.getEmail().equals("gabrielmiranda61637@gmail.com") && dto.getTechnology().equals("JAVA")){
            return true;
        }
        return false;
    }
}
