package acc.br.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Adicione este import que faltava
import acc.br.pessoa.entity.Pessoa; // Mude de 'com.accenture' para 'acc.br.pessoa'

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}