package br.com.havensteinsolutions.agenda.Agenda.Infra.Dao;

import androidx.room.Dao;
import androidx.room.Query;

import br.com.havensteinsolutions.agenda.Agenda.modelo.Telefone;

@Dao
public interface TelefoneDAO {
    @Query("SELECT * FROM Telefone "+
            "WHERE alunoId = :alunoId LIMIT 1")
    Telefone buscaPrimeiroTelefoneDoAluno(int alunoId);
}