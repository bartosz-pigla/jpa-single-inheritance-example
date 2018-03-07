package com.example.demo2;

import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DELETE_FREQUENCY")
public class DeleteFrequency extends SettingsEntry {
    @Column
    private int value;

    @Column
    private DateTime startTime;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }
}
