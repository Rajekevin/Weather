package fr.supdevinci.meteo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import fr.supdevinci.meteo.utils.FastDialog;
import fr.supdevinci.meteo.utils.Network;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCity;
    private TextView textViewCity;
    private TextView textViewTemperature;
    private ImageView imageViewIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCity = findViewById(R.id.editTextCity);
        textViewCity = findViewById(R.id.textViewCity);
        textViewTemperature = findViewById(R.id.textViewTemperature);
        imageViewIcon = findViewById(R.id.imageViewIcon);
    }

    public void submit(View view) {

        // TODO : vérifier la saisie d'une ville ?
        if(editTextCity.getText().toString().length()>0) {

            // TODO : vérifier la connexion Internet ?
            if(Network.isNetworkAvailable(MainActivity.this)){

            }else{
                FastDialog.showDialog(MainActivity.this, FastDialog.SIMPLE_DIALOG,
                       getString(R.string.dialog_networks_required));

            }

        }else{
            FastDialog.showDialog(MainActivity.this, FastDialog.SIMPLE_DIALOG,
                    getString(R.string.dialog));
        }

        // TODO : appel web service
        // TODO : parsing json
        // TODO : affichage des données
        // TODO : afficher des messages d'erreurs si nécessaire



    }
}
