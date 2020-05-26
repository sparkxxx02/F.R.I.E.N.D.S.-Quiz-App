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

public class WinnerFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private WinnerFragmentArgs() {
  }

  private WinnerFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static WinnerFragmentArgs fromBundle(@NonNull Bundle bundle) {
    WinnerFragmentArgs __result = new WinnerFragmentArgs();
    bundle.setClassLoader(WinnerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("NumOfquestions")) {
      int NumOfquestions;
      NumOfquestions = bundle.getInt("NumOfquestions");
      __result.arguments.put("NumOfquestions", NumOfquestions);
    } else {
      throw new IllegalArgumentException("Required argument \"NumOfquestions\" is missing and does not have an android:defaultValue");
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
  public int getNumOfquestions() {
    return (int) arguments.get("NumOfquestions");
  }

  @SuppressWarnings("unchecked")
  public int getCorrectAnswers() {
    return (int) arguments.get("correctAnswers");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    WinnerFragmentArgs that = (WinnerFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getNumOfquestions();
    result = 31 * result + getCorrectAnswers();
    return result;
  }

  @Override
  public String toString() {
    return "WinnerFragmentArgs{"
        + "NumOfquestions=" + getNumOfquestions()
        + ", correctAnswers=" + getCorrectAnswers()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(WinnerFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int NumOfquestions, int correctAnswers) {
      this.arguments.put("NumOfquestions", NumOfquestions);
      this.arguments.put("correctAnswers", correctAnswers);
    }

    @NonNull
    public WinnerFragmentArgs build() {
      WinnerFragmentArgs result = new WinnerFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setNumOfquestions(int NumOfquestions) {
      this.arguments.put("NumOfquestions", NumOfquestions);
      return this;
    }

    @NonNull
    public Builder setCorrectAnswers(int correctAnswers) {
      this.arguments.put("correctAnswers", correctAnswers);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getNumOfquestions() {
      return (int) arguments.get("NumOfquestions");
    }

    @SuppressWarnings("unchecked")
    public int getCorrectAnswers() {
      return (int) arguments.get("correctAnswers");
    }
  }
}
