package ru.tweakup.androidlesson9.observe;

import ru.tweakup.androidlesson9.Note;

public interface Observer {
    void updateNote(Note note);
}