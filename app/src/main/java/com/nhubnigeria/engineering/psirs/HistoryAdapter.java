package com.nhubnigeria.engineering.psirs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 11/9/17.
 */


//the getter and setter class
 class History {
    private String prn, brn, date;

    public History(){
    }

    public History(String prn, String brn, String date) {
        this.prn = prn;
        this.brn = brn;
        this.date = date;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public String getBrn() {
        return brn;
    }

    public void setBrn(String brn) {
        this.brn = brn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

//history adapter class
public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

     private List<History> historyList;

     public class MyViewHolder extends RecyclerView.ViewHolder{
         public TextView prn, brn, date;

         public MyViewHolder(View view) {
             super(view);

             prn = (TextView) view.findViewById(R.id.prn);
             brn = (TextView) view.findViewById(R.id.brn);
             date = (TextView) view.findViewById(R.id.date);
         }
     }

     public HistoryAdapter (List<History> historyList) {
         this.historyList = historyList;
     }

     @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext())
                 .inflate(R.layout.history_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
         History history = historyList.get(position);
         holder.brn.setText(history.getBrn());
         holder.prn.setText(history.getPrn());
         holder.date.setText(history.getDate());

    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }
}
