package com.example.friendstrivia;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class LostFragmentDirections {
  private LostFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLostFragment2ToQuizFragment() {
    return new ActionOnlyNavDirections(R.id.action_lostFragment2_to_quizFragment);
  }
}
