package com.spirovski.triviagame.data;

import com.spirovski.triviagame.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
