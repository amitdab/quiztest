package com.example.fragtest;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GameWonDirections {
  private GameWonDirections() {
  }

  @NonNull
  public static NavDirections actionGameWonToGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameWon_to_gameFragment);
  }
}
