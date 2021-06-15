package com.example.auraia.SETTINGS;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import com.example.myapplication.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.text.format.DateFormat;
import java.util.Calendar;

public class timePickerFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);


         TimePickerDialog t = new TimePickerDialog(getActivity(), R.style.TimePickerTheme, (TimePickerDialog.OnTimeSetListener)
                getActivity(), hour, minute, DateFormat.is24HourFormat(getActivity()) );
         return t;
    }
}