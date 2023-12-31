package com.victor.helpdesk.services;

import com.victor.helpdesk.domain.Chamado;
import com.victor.helpdesk.domain.Cliente;
import com.victor.helpdesk.domain.Tecnico;
import com.victor.helpdesk.domain.enums.Perfil;
import com.victor.helpdesk.domain.enums.Prioridade;
import com.victor.helpdesk.domain.enums.Status;
import com.victor.helpdesk.repositories.ChamadoRepository;
import com.victor.helpdesk.repositories.ClienteRepository;
import com.victor.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDB() {
        Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "76045777093",
                "valdir@gmail.com", "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Linus Torvalds", "70511744013",
                "torvalds@gmail.com", "123");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO,
                "chamado1", "Primeiro Chamado", cli1, tec1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
