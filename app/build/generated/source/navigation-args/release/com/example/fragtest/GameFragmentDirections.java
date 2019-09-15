package com.example.fragtest;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static ActionGameFragmentToGameWon actionGameFragmentToGameWon(int correct,
      int noOfquestion) {
    return new ActionGameFragmentToGameWon(correct, noOfquestion);
  }

  @NonNull
  public static ActionGameFragmentToGameLost actionGameFragmentToGameLost(int correct,
      int nOfquestion) {
    return new ActionGameFragmentToGameLost(correct, nOfquestion);
  }

  public static class ActionGameFragmentToGameWon implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGameFragmentToGameWon(int correct, int noOfquestion) {
      this.arguments.put("correct", correct);
      this.arguments.put("noOfquestion", noOfquestion);
    }

    @NonNull
    public ActionGameFragmentToGameWon setCorrect(int correct) {
      this.arguments.put("correct", correct);
      return this;
    }

    @NonNull
    public ActionGameFragmentToGameWon setNoOfquestion(int noOfquestion) {
      this.arguments.put("noOfquestion", noOfquestion);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("correct")) {
        int correct = (int) arguments.get("correct");
        __result.putInt("correct", correct);
      }
      if (arguments.containsKey("noOfquestion")) {
        int noOfquestion = (int) arguments.get("noOfquestion");
        __result.putInt("noOfquestion", noOfquestion);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_gameFragment_to_gameWon;
    }

    @SuppressWarnings("unchecked")
    public int getCorrect() {
      return (int) arguments.get("correct");
    }

    @SuppressWarnings("unchecked")
    public int getNoOfquestion() {
      return (int) arguments.get("noOfquestion");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGameFragmentToGameWon that = (ActionGameFragmentToGameWon) object;
      if (arguments.containsKey("correct") != that.arguments.containsKey("correct")) {
        return false;
      }
      if (getCorrect() != that.getCorrect()) {
        return false;
      }
      if (arguments.containsKey("noOfquestion") != that.arguments.containsKey("noOfquestion")) {
        return false;
      }
      if (getNoOfquestion() != that.getNoOfquestion()) {
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
      result = 31 * result + getCorrect();
      result = 31 * result + getNoOfquestion();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGameFragmentToGameWon(actionId=" + getActionId() + "){"
          + "correct=" + getCorrect()
          + ", noOfquestion=" + getNoOfquestion()
          + "}";
    }
  }

  public static class ActionGameFragmentToGameLost implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGameFragmentToGameLost(int correct, int nOfquestion) {
      this.arguments.put("correct", correct);
      this.arguments.put("nOfquestion", nOfquestion);
    }

    @NonNull
    public ActionGameFragmentToGameLost setCorrect(int correct) {
      this.arguments.put("correct", correct);
      return this;
    }

    @NonNull
    public ActionGameFragmentToGameLost setNOfquestion(int nOfquestion) {
      this.arguments.put("nOfquestion", nOfquestion);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("correct")) {
        int correct = (int) arguments.get("correct");
        __result.putInt("correct", correct);
      }
      if (arguments.containsKey("nOfquestion")) {
        int nOfquestion = (int) arguments.get("nOfquestion");
        __result.putInt("nOfquestion", nOfquestion);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_gameFragment_to_gameLost;
    }

    @SuppressWarnings("unchecked")
    public int getCorrect() {
      return (int) arguments.get("correct");
    }

    @SuppressWarnings("unchecked")
    public int getNOfquestion() {
      return (int) arguments.get("nOfquestion");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGameFragmentToGameLost that = (ActionGameFragmentToGameLost) object;
      if (arguments.containsKey("correct") != that.arguments.containsKey("correct")) {
        return false;
      }
      if (getCorrect() != that.getCorrect()) {
        return false;
      }
      if (arguments.containsKey("nOfquestion") != that.arguments.containsKey("nOfquestion")) {
        return false;
      }
      if (getNOfquestion() != that.getNOfquestion()) {
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
      result = 31 * result + getCorrect();
      result = 31 * result + getNOfquestion();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGameFragmentToGameLost(actionId=" + getActionId() + "){"
          + "correct=" + getCorrect()
          + ", nOfquestion=" + getNOfquestion()
          + "}";
    }
  }
}
