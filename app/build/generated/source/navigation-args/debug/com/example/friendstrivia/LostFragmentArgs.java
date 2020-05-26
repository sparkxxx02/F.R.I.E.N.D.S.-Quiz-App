package com.example.friendstrivia;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LostFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private LostFragmentArgs() {
  }

  private LostFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LostFragmentArgs fromBundle(@NonNull Bundle bundle) {
    LostFragmentArgs __result = new LostFragmentArgs();
    bundle.setClassLoader(LostFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("NumOfQuestions")) {
      int NumOfQuestions;
      NumOfQuestions = bundle.getInt("NumOfQuestions");
      __result.arguments.put("NumOfQuestions", NumOfQuestions);
    } else {
      throw new IllegalArgumentException("Required argument \"NumOfQuestions\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("correctAnswers")) {
      int correctAnswers;
      correctAnswers = bundle.getInt("correctAnswers");
      __result.arguments.put("correctAnswers", correctAnswers);
    } else {
      throw new IllegalArgumentException("Required argument \"correctAnswers\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getNumOfQuestions() {
    return (int) arguments.get("NumOfQuestions");
  }

  @SuppressWarnings("unchecked")
  public int getCorrectAnswers() {
    return (int) arguments.get("correctAnswers");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    LostFragmentArgs that = (LostFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getNumOfQuestions();
    result = 31 * result + getCorrectAnswers();
    return result;
  }

  @Override
  public String toString() {
    return "LostFragmentArgs{"
        + "NumOfQuestions=" + getNumOfQuestions()
        + ", correctAnswers=" + getCorrectAnswers()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(LostFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int NumOfQuestions, int correctAnswers) {
      this.arguments.put("NumOfQuestions", NumOfQuestions);
      this.arguments.put("correctAnswers", correctAnswers);
    }

    @NonNull
    public LostFragmentArgs build() {
      LostFragmentArgs result = new LostFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setNumOfQuestions(int NumOfQuestions) {
      this.arguments.put("NumOfQuestions", NumOfQuestions);
      return this;
    }

    @NonNull
    public Builder setCorrectAnswers(int correctAnswers) {
      this.arguments.put("correctAnswers", correctAnswers);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getNumOfQuestions() {
      return (int) arguments.get("NumOfQuestions");
    }

    @SuppressWarnings("unchecked")
    public int getCorrectAnswers() {
      return (int) arguments.get("correctAnswers");
    }
  }
}
