package usa.sesion1.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

/**
 * Clase principal
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Estado inicial app
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("JJnancy Restaurante");
        getSupportActionBar().setSubtitle("Pantalla de Bienvenida");


        getSupportActionBar().setLogo(R.mipmap.logotienda);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


    }

    /**
     *
     * @param menu valores iniciales
     * @return los valores de menú
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return super.onCreateOptionsMenu(menu);
    }
}