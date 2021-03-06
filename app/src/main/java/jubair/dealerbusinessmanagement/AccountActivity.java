package jubair.dealerbusinessmanagement;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class AccountActivity extends ActionBarActivity {

    public static double credit = 0;
    public static double debit = 0;
    public static double profit = 0;
    public static double balance = credit-debit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        TextView debitV = (TextView) findViewById(R.id.debit);
        debitV.setText(String.valueOf(debit));

        TextView creditV = (TextView) findViewById(R.id.credit);
        creditV.setText(String.valueOf(credit));

        TextView balanceV = (TextView) findViewById(R.id.balance);
        balanceV.setText(String.valueOf(balance));

        TextView profitV = (TextView) findViewById(R.id.profit);
        profitV.setText(String.valueOf(profit));

    }


    public void back(View v)
    {
        Intent i = new Intent(this,MainActivity.class);
        setIntent(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_account, menu);
        return true;
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
