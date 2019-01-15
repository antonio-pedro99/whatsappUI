package aula.solu.angoware.sliderbarexemple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pedro on 11/01/2019.
 */

public class FragmentConversas extends Fragment {
    List<Mensagens> mensagensList = new ArrayList<>();
    AdaptadorMensagem adaptadorMensagem;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_conversas, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        adaptadorMensagem = new AdaptadorMensagem(mensagensList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adaptadorMensagem);
        int img = R.drawable.ic_person_black_24dp;

        Mensagens mensagens = new Mensagens(img, "Dom B", "Aquele mambo wy?", "15:45");
        mensagensList.add(mensagens);

        mensagens = new Mensagens(img, "Dovale dos Dibo", "Cassule... manda vir", "10:38");
        mensagensList.add(mensagens);

        mensagens = new Mensagens(img, "Marcos Xondra", "Tudo calmo mano", "09:40");
        mensagensList.add(mensagens);

        mensagens = new Mensagens(img, "Isa Bela ", "yh", "09:31");
        mensagensList.add(mensagens);

        adaptadorMensagem.notifyDataSetChanged();
        return view;
    }

    private void addDados (){

    }
}
