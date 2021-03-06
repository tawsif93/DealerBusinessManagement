package jubair.dealerbusinessmanagement;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class CompanyOptionActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_option);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_company_option, menu);
        return true;
    }


    public void activate(View v)
    {
        Intent intent = new Intent(CompanyOptionActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void remove(View view)
    {
        CompanyHandler ch=new CompanyHandler(this);
        //Toast.makeText(getApplicationContext(), SelectCompanyActivity.deleted.toString(),Toast.LENGTH_SHORT).show();
        Company company = SelectCompanyActivity.deleted;
        ch.delete(company);

        Intent intent = new Intent(CompanyOptionActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
