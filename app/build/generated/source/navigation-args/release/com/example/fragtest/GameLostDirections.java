package com.example.fragtest;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GameLostDirections {
  private GameLostDirections() {
  }

  @NonNull
  public static NavDirections actionGameLostToGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameLost_to_gameFragment);
  }
}
