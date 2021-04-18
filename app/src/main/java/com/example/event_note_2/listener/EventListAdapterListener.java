package com.example.event_note_2.listener;

import com.example.event_note_2.model.Event;

public interface EventListAdapterListener {
    void onUpdateClicked(Event event, int position);
    void onDeleteClicked(Event event, int position);
}