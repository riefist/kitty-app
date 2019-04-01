package osg3.kel6.kittyapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import osg3.kel6.kittyapp.R;
import osg3.kel6.kittyapp.model.Kitty;

/**
 * Created by firdaus1453 on 4/2/2019.
 */
public class KittyAdapter extends RecyclerView.Adapter<KittyAdapter.KittyHolder> {

    private List<Kitty> listKitty;

    public KittyAdapter(List<Kitty> listKitty) {
        this.listKitty = listKitty;
    }

    @NonNull
    @Override
    public KittyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()
        ).inflate(R.layout.item_row_kitty, parent, false);
        return new KittyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull KittyHolder holder, int position) {
        Kitty data = listKitty.get(position);
        holder.kittyName.setText(data.getName());
    }

    @Override
    public int getItemCount() {
        return listKitty.size();
    }

    public class KittyHolder extends RecyclerView.ViewHolder {

        TextView kittyName;

        public KittyHolder(@NonNull View itemView) {
            super(itemView);
            kittyName = itemView.findViewById(R.id.txt_item_kitty_name);
        }
    }
}
