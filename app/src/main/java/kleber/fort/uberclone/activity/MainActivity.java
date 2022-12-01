package kleber.fort.uberclone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kleber.fort.uberclone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().hide();
    }

    public void abrirTelaLogin(View view){
        startActivity(new Intent(this, LoginActivity.class));

    }

    public void abrirTelaCadastro(View view){
        startActivity(new Intent(this, CadastroActivity.class));

    }


}