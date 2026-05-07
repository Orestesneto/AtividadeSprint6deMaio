package acc.br.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import acc.br.aluno.model.Aluno;

@Repository 
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}