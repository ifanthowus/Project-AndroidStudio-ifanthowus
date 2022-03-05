package com.udinn.syntaxin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Loker_page extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ItemClass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loker_page);


        //--> Creating a list
        list = new ArrayList<>();
        list.add(new ItemClass(R.drawable.loker1, "WE ARE HIRING", "The Legal and Finance teams are pivotal in ensuring that the company is kept compliant, accountable, and primed for success with the right checks and balances. Browse our Legal and Finance team openings to see how you can make an impact with us.\n" +
                "\n" +
                "Deskripsi Pekerjaan:\n \n" +
                "#Assist tax specialists in preparing accurate withholding calculation\n \n" +
                "#Do research updates related to laws and fiscal that may directly or indirectly affect the company\n \n" +
                "#Do the research and portray liabilities and requirements for tax payment\n \n" +
                "#Maintaining tax-related documents of the company\n \n" +
                "Persyaratan:\n \n" +
                "#Currently pursuing final semester (7 or 8) or freshly graduated in Accounting or Fiscal\n \n" +
                "#Energetic and fast learner\n \n" +
                "#Able to communicate both verbally and written in English and Indonesian to communicate with our internal and regional stakeholders\n \n"+
                "#Able to work Monday to Friday at working hours"));
        list.add(new ItemClass(R.drawable.loker2, "KAMPUS MERDEKA", "aasdasd"));
        list.add(new ItemClass(R.drawable.loker3, "Company", "sadasdasd"));


        recyclerView = findViewById(R.id.id_RecyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        MyAdapter1 adapter = new MyAdapter1(list);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        adapter.OnRecyclerViewClickListener(new MyAdapter1.OnRecyclerViewClickListener() {
            @Override
            public void OnItemClick(int position) {

                Intent intent = new Intent(Loker_page.this, Detail_loker.class);
                intent.putExtra("imagINTENT", list.get(position).getImg() );
                intent.putExtra("nameINTENT", list.get(position).getName());
                intent.putExtra("emailINTENT", list.get(position).getEmail());
                startActivity(intent);
            }
        });

    }
}