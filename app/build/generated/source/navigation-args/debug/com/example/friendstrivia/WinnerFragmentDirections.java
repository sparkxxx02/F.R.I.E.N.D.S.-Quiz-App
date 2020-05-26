package com.example.friendstrivia;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class WinnerFragmentDirections {
  private WinnerFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionWinnerFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_winnerFragment_to_homeFragment);
  }
}
