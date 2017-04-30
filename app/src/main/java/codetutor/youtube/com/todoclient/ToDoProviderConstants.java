package codetutor.youtube.com.todoclient;

import android.net.Uri;

/**
 * Created by anildeshpande on 4/30/17.
 */

public interface ToDoProviderConstants {

    Uri CONTENT_URI_1 = Uri.parse("content://todolist.youtube.com.codetutor/TODO_TABLE");
    Uri CONTENT_URI_2 =Uri.parse("content://todolist.youtube.com.codetutor/TODO_TABLE_FROM_PLACE");
    Uri CONTENT_URI_3 =Uri.parse("content://todolist.youtube.com.codetutor/TOTAL_TODOS");

    String COLUMN_TODO_ID="task_id";
    String COLUMN_TODO="todo";
    String COLUMN_PLACE="place";
}
