package me.aravi.ip.example;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import me.aravi.ip.example.adapter.ListAdapter;
import me.aravi.ip.example.databinding.ActivityMainBinding;
import me.aravi.libraries.iplib.IPLib;
import me.aravi.libraries.iplib.listeners.OnIPResponse;
import me.aravi.libraries.iplib.model.IPInfo;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private IPLib ipLib;
    private ListAdapter adapter;
    private List<ListItem> listItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ipLib = IPLib.getInstance();
        setSupportActionBar(binding.toolbar);
        binding.progressCircular.setVisibility(View.VISIBLE);
        lookup();
    }

    private void lookup() {
        ipLib.ipLookupAsync(new OnIPResponse() {
            @Override
            public void onSuccess(IPInfo ipInfo) {
                listItems.add(new ListItem("IPv4:", ipInfo.getIPv4()));
                listItems.add(new ListItem("Country Code:", ipInfo.getCountry_code()));
                listItems.add(new ListItem("Country:", ipInfo.getCountry_name()));
                listItems.add(new ListItem("City:", ipInfo.getCity()));
                listItems.add(new ListItem("State:", ipInfo.getState()));
                listItems.add(new ListItem("Lat/Lon:", ipInfo.getLatitude() + "/" + ipInfo.getLongitude()));

                adapter = new ListAdapter(MainActivity.this, listItems);
                binding.recyclerView.setAdapter(adapter);
                binding.progressCircular.setVisibility(View.GONE);

            }

            @Override
            public void onError(String message, int errorCode) {
                Toast.makeText(MainActivity.this, "E:" + message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}