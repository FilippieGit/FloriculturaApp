package br.com.etecia.floricultura;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private Context context;
    private List<Flores> lstFlores;

    public Adaptador(Context context, List<Flores> lstFlores) {
        this.context = context;
        this.lstFlores = lstFlores;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_flores,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.modeloTitulo.setText(lstFlores.get(position).getNome());
        holder.modeloImagem.setImageResource(lstFlores.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return lstFlores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView modeloTitulo;

        ImageView modeloImagem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modeloTitulo = itemView.findViewById(R.id.idModeloTextoFlores);
            modeloImagem = itemView.findViewById(R.id.idModeloImagemFlores);
        }
    }

}
