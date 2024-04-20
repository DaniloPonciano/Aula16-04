package com.convidados.repository;

import com.convidados.model.Convidados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadosRepository  extends JpaRepository <Convidados, Long> {

}
