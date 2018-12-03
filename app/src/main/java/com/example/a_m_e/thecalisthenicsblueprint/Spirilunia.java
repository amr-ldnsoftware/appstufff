package com.example.a_m_e.thecalisthenicsblueprint;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Spirilunia extends AppCompatActivity {

    Dialog dialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spirullina);

       dialog = new Dialog(this);






        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //This sets the back button on the toolbar of the tabbed page
        toolbar.setNavigationIcon(R.drawable.ic_backspace);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }



    public void ShowPopup_spirulina (View v) {
        TextView closetext;
        dialog.setContentView(R.layout.popup_spirulina_powder_macros);
        closetext = dialog.findViewById(R.id.exit_popup_spirulinapowder);

        closetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    public void ShowPopupNutrition_spirulina (View v) {
        TextView closetext;
        dialog.setContentView(R.layout.popup_spirulina_powder_nutrition);
        closetext = dialog.findViewById(R.id.exit_popup_spirulinapowder_nutrition);

        closetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


}