package br.com.havensteinsolutions.agenda.Agenda;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import br.com.havensteinsolutions.agenda.Agenda.modelo.Prova;
import br.com.havensteinsolutions.agenda.R;

public class DetalhesProvasFragment extends Fragment {
    private TextView campoMateria;
    private TextView campoData;
    private ListView listaTopicos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalhes_provas, container, false);

        campoMateria = (TextView) view.findViewById(R.id.detalhes_prova_materia);
        campoData = (TextView) view.findViewById(R.id.detalhes_prova_data);
        listaTopicos = (ListView) view.findViewById(R.id.detalhes_prova_topicos);

        Bundle parametros = getArguments();
        if (parametros != null) {
            Prova prova = (Prova) parametros.getSerializable("PROVA");
            populaCamposCon(prova);
        }

        return view;
    }

    public void populaCamposCon(Prova prova) {
        campoMateria.setText(prova.getMateria());
        campoData.setText(prova.getData());

        ArrayAdapter<String> adapterTopicos = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, prova.getTopico());
        listaTopicos.setAdapter(adapterTopicos);
    }

}
