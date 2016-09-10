package com.example.hadi.calculator;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.QuickContactBadge;

/**
 * Created by hadi on 09/10/2016.
 */
public class Quickcontact extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quickcontactbadge1);
        QuickContactBadge badgeSmall = (QuickContactBadge) findViewById(R.id.qcbadge);
        badgeSmall.assignContactFromEmail("any@gmail.com", true);
        badgeSmall.setMode(ContactsContract.QuickContact.MODE_SMALL);
        QuickContactBadge badgeMedium = (QuickContactBadge) findViewById(R.id.qcbadge);
        badgeMedium.assignContactFromPhone("831-555-1212", true);
        badgeMedium.setImageResource(R.drawable.hadi);
    }
}
