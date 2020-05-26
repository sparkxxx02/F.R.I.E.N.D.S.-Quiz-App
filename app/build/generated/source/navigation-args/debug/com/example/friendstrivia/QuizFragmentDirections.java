package com.example.friendstrivia;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class QuizFragmentDirections {
  private QuizFragmentDirections() {
  }

  @NonNull
  public static ActionQuizFragmentToWinnerFragment actionQuizFragmentToWinnerFragment(
      int NumOfquestions, int correctAnswers) {
    return new ActionQuizFragmentToWinnerFragment(NumOfquestions, correctAnswers);
  }

  @NonNull
  public static ActionQuizFragmentToLostFragment2 actionQuizFragmentToLostFragment2(
      int NumOfQuestions, int correctAnswers) {
    return new ActionQuizFragmentToLostFragment2(NumOfQuestions, correctAnswers);
  }

  public static class ActionQuizFragmentToWinnerFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionQuizFragmentToWinnerFragment(int NumOfquestions, int correctAnswers) {
      this.arguments.put("NumOfquestions", NumOfquestions);
      this.arguments.put("correctAnswers", correctAnswers);
    }

    @NonNull
    public ActionQuizFragmentToWinnerFragment setNumOfquestions(int NumOfquestions) {
      this.arguments.put("NumOfquestions", NumOfquestions);
      return this;
    }

    @NonNull
    public ActionQuizFragmentToWinnerFragment setCorrectAnswers(int correctAnswers) {
      this.arguments.put("correctAnswers", correctAnswers);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("NumOfquestions")) {
        int NumOfquestions = (int) arguments.get("NumOfquestions");
        __result.putInt("NumOfquestions", NumOfquestions);
      }
      if (arguments.containsKey("correctAnswers")) {
        int correctAnswers = (int) arguments.get("correctAnswers");
        __result.putInt("correctAnswers", correctAnswers);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_quizFragment_to_winnerFragment;
    }

    @SuppressWarnings("unchecked")
    public int getNumOfquestions() {
      return (int) arguments.get("NumOfquestions");
    }

    @SuppressWarnings("unchecked")
    public int getCorrectAnswers() {
      return (int) arguments.get("correctAnswers");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionQuizFragmentToWinnerFragment that = (ActionQuizFragmentToWinnerFragment) object;
      if (arguments.containsKey("NumOfquestions") != that.arguments.containsKey("NumOfquestions")) {
        return false;
      }
      if (getNumOfquestions() != that.getNumOfquestions()) {
        return false;
      }
      if (arguments.containsKey("correctAnswers") != that.arguments.containsKey("correctAnswers")) {
        return false;
      }
      if (getCorrectAnswers() != that.getCorrectAnswers()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getNumOfquestions();
      result = 31 * result + getCorrectAnswers();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionQuizFragmentToWinnerFragment(actionId=" + getActionId() + "){"
          + "NumOfquestions=" + getNumOfquestions()
          + ", correctAnswers=" + getCorrectAnswers()
          + "}";
    }
  }

  public static class ActionQuizFragmentToLostFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionQuizFragmentToLostFragment2(int NumOfQuestions, int correctAnswers) {
      this.arguments.put("NumOfQuestions", NumOfQuestions);
      this.arguments.put("correctAnswers", correctAnswers);
    }

    @NonNull
    public ActionQuizFragmentToLostFragment2 setNumOfQuestions(int NumOfQuestions) {
      this.arguments.put("NumOfQuestions", NumOfQuestions);
      return this;
    }

    @NonNull
    public ActionQuizFragmentToLostFragment2 setCorrectAnswers(int correctAnswers) {
      this.arguments.put("correctAnswers", correctAnswers);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("NumOfQuestions")) {
        int NumOfQuestions = (int) arguments.get("NumOfQuestions");
        __result.putInt("NumOfQuestions", NumOfQuestions);
      }
      if (arguments.containsKey("correctAnswers")) {
        int correctAnswers = (int) arguments.get("correctAnswers");
        __result.putInt("correctAnswers", correctAnswers);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_quizFragment_to_lostFragment2;
    }

    @SuppressWarnings("unchecked")
    public int getNumOfQuestions() {
      return (int) arguments.get("NumOfQuestions");
    }

    @SuppressWarnings("unchecked")
    public int getCorrectAnswers() {
      return (int) arguments.get("correctAnswers");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionQuizFragmentToLostFragment2 that = (ActionQuizFragmentToLostFragment2) object;
      if (arguments.containsKey("NumOfQuestions") != that.arguments.containsKey("NumOfQuestions")) {
        return false;
      }
      if (getNumOfQuestions() != that.getNumOfQuestions()) {
        return false;
      }
      if (arguments.containsKey("correctAnswers") != that.arguments.containsKey("correctAnswers")) {
        return false;
      }
      if (getCorrectAnswers() != that.getCorrectAnswers()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getNumOfQuestions();
      result = 31 * result + getCorrectAnswers();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionQuizFragmentToLostFragment2(actionId=" + getActionId() + "){"
          + "NumOfQuestions=" + getNumOfQuestions()
          + ", correctAnswers=" + getCorrectAnswers()
          + "}";
    }
  }
}
