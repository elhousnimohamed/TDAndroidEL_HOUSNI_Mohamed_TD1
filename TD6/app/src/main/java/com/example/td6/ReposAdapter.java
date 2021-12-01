package com.example.td6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;


public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.ViewHolder>  {

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        public TextView idView;
        public TextView nameView;
        public TextView full_nameView;
        public TextView html_urlView;
        public Context myActivity;

        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);

            this.idView = (TextView) itemView.findViewById(R.id.idView);
            this.nameView = (TextView) itemView.findViewById(R.id.nameView);
            this.full_nameView = (TextView) itemView.findViewById(R.id.full_nameView);
            this.html_urlView = (TextView) itemView.findViewById(R.id.html_urlView);
            this.myActivity = context;
        }
    }
    private final List<Repo> mRepos;

    public ReposAdapter(List<Repo> mRepos) {
        this.mRepos = mRepos;
    }

    @NonNull
        @Override
        public ReposAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            Context context= parent.getContext();
            LayoutInflater inflater=LayoutInflater.from(context);
            View repoView=inflater.inflate(R.layout.activity_itemrepo,parent,false);
            return new ViewHolder(repoView,context);
        }

        @Override
        public void onBindViewHolder(@NonNull ReposAdapter.ViewHolder holder, int position) {
            Repo repo =mRepos.get(position);

            TextView idView=holder.idView;
            idView.setText(Integer.toString(repo.getId()));

            TextView nameView=holder.nameView;
            nameView.setText(repo.getName());

            TextView full_nameView=holder.full_nameView;
            full_nameView.setText(repo.getFull_name());

            TextView html_urlView=holder.html_urlView;
            html_urlView.setText(repo.getHtml_url());
        }

        @Override
        public int getItemCount() {
            return mRepos.size();
        }
}
