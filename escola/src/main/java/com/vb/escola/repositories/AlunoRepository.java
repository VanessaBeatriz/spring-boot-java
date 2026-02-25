package com.vb.escola.repositories;

import com.vb.escola.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {


}
