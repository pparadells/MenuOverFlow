package edd.ecosdedestruccion.menuoverflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * METODOS
     */
    /*
    Aparición y desparición de menú overflow
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuaccioones, menu);
        return true;
    }

    /*
    Acciones de lo "botones"
     */
    public boolean onOptionsItemSelected(MenuItem item){
        //Recuperar los id de los componentes
        int id = item.getItemId();
        //Condiones para cada componente
        if(id == R.id.compartir){
          Toast.makeText(this, "Compartor", Toast.LENGTH_SHORT).show();
          return true;
        }
        if (id == R.id.buscar){
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.item1){
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.item2){
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.item3){
            Toast.makeText(this, "Opción 3", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
