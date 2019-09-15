package com.example.fragtest;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameWonArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GameWonArgs() {
  }

  private GameWonArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GameWonArgs fromBundle(@NonNull Bundle bundle) {
    GameWonArgs __result = new GameWonArgs();
    bundle.setClassLoader(GameWonArgs.class.getClassLoader());
    if (bundle.containsKey("correct")) {
      int correct;
      correct = bundle.getInt("correct");
      __result.arguments.put("correct", correct);
    } else {
      throw new IllegalArgumentException("Required argument \"correct\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("noOfquestion")) {
      int noOfquestion;
      noOfquestion = bundle.getInt("noOfquestion");
      __result.arguments.put("noOfquestion", noOfquestion);
    } else {
      throw new IllegalArgumentException("Required argument \"noOfquestion\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getCorrect() {
    return (int) arguments.get("correct");
  }

  @SuppressWarnings("unchecked")
  public int getNoOfquestion() {
    return (int) arguments.get("noOfquestion");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    GameWonArgs that = (GameWonArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getCorrect();
    result = 31 * result + getNoOfquestion();
    return result;
  }

  @Override
  public String toString() {
    return "GameWonArgs{"
        + "correct=" + getCorrect()
        + ", noOfquestion=" + getNoOfquestion()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(GameWonArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int correct, int noOfquestion) {
      this.arguments.put("correct", correct);
      this.arguments.put("noOfquestion", noOfquestion);
    }

    @NonNull
    public GameWonArgs build() {
      GameWonArgs result = new GameWonArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCorrect(int correct) {
      this.arguments.put("correct", correct);
      return this;
    }

    @NonNull
    public Builder setNoOfquestion(int noOfquestion) {
      this.arguments.put("noOfquestion", noOfquestion);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getCorrect() {
      return (int) arguments.get("correct");
    }

    @SuppressWarnings("unchecked")
    public int getNoOfquestion() {
      return (int) arguments.get("noOfquestion");
    }
  }
}
