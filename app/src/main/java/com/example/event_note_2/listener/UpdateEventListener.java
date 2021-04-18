package com.example.event_note_2.listener;

import com.example.event_note_2.model.Event;

import java.io.Serializable;

public interface UpdateEventListener extends Serializable {
    void onUpdated(Event event);
    void onAdded(Event event);
}
