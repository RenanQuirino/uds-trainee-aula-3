package br.com.uds.personagem;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class PersonagemRepositoryImpl implements PersonagemRepository {

    private Set<Personagem> personagens = new HashSet();

    @Override
    public Personagem save(Personagem personagem) {
        personagens.add(personagem);
        return personagem;
    }

    public Set<Personagem> findAll() {
        return personagens;
    }

}