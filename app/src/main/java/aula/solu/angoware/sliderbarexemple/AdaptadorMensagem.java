package aula.solu.angoware.sliderbarexemple;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pedro on 13/01/2019.
 */

public class AdaptadorMensagem extends RecyclerView.Adapter<AdaptadorMensagem.MyViewHolder> {

    private List<Mensagens> mensagensList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView cover;
        public TextView nome, mensagem, hora;

        public MyViewHolder(View itemView) {
            super(itemView);

            cover = (ImageView) itemView.findViewById(R.id.imgCover);
            nome = (TextView) itemView.findViewById(R.id.txtNome);
            mensagem = (TextView) itemView.findViewById(R.id.txtMensagem);
            hora = (TextView) itemView.findViewById(R.id.txtData);

        }
    }

    public AdaptadorMensagem (List<Mensagens> mensagensList){
        this.mensagensList = mensagensList;
    }

    @Override
    public AdaptadorMensagem.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.conversas, parent, false);
        return new MyViewHolder(view);
    }




    @Override
    public void onBindViewHolder(AdaptadorMensagem.MyViewHolder holder, int position) {

        Mensagens mensagens = mensagensList.get(position);

        holder.cover.setImageResource(mensagens.getCover());
        holder.nome.setText(mensagens.getNome());
        holder.mensagem.setText(mensagens.getMensagem());
        holder.hora.setText(mensagens.getHora());



    }

    @Override
    public int getItemCount() {
        return mensagensList.size();
    }
}
