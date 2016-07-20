package in.rishirajpurohit.android.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class myPortfolioApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_portfolio_app);
    }

    public void btn_popularMovies_clicked(View view){
        Toast.makeText(myPortfolioApp.this, "This will open POPULAR MOVIES App ", Toast.LENGTH_SHORT).show();
    }
    public void btn_stockHawk_clicked(View view){
        Toast.makeText(myPortfolioApp.this, "This will open STOCK HAWK App ", Toast.LENGTH_SHORT).show();
    }
    public void btn_buildItBigger_clicked(View view){
        Toast.makeText(myPortfolioApp.this, "This will open BUILD IT BIGGER App ", Toast.LENGTH_SHORT).show();
    }
    public void btn_makeAppMaterial_clicked(View view){
        Toast.makeText(myPortfolioApp.this, "This will open MAKE YOUR APP MATERIAL App ", Toast.LENGTH_SHORT).show();
    }
    public void btn_goUbiquitous_clicked(View view){
        Toast.makeText(myPortfolioApp.this, "This will open GO UBIQUITOUS App ", Toast.LENGTH_SHORT).show();
    }
    public void btn_capstone_clicked(View view){
        Toast.makeText(myPortfolioApp.this, "This will open CAPSTONE App ", Toast.LENGTH_SHORT).show();
    }

}
