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

public class GameLostArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GameLostArgs() {
  }

  private GameLostArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GameLostArgs fromBundle(@NonNull Bundle bundle) {
    GameLostArgs __result = new GameLostArgs();
    bundle.setClassLoader(GameLostArgs.class.getClassLoader());
    if (bundle.containsKey("correct")) {
      int correct;
      correct = bundle.getInt("correct");
      __result.arguments.put("correct", correct);
    } else {
      throw new IllegalArgumentException("Required argument \"correct\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("nOfquestion")) {
      int nOfquestion;
      nOfquestion = bundle.getInt("nOfquestion");
      __result.arguments.put("nOfquestion", nOfquestion);
    } else {
      throw new IllegalArgumentException("Required argument \"nOfquestion\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getCorrect() {
    return (int) arguments.get("correct");
  }

  @SuppressWarnings("unchecked")
  public int getNOfquestion() {
    return (int) arguments.get("nOfquestion");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    GameLostArgs that = (GameLostArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getCorrect();
    result = 31 * result + getNOfquestion();
    return result;
  }

  @Override
  public String toString() {
    return "GameLostArgs{"
        + "correct=" + getCorrect()
        + ", nOfquestion=" + getNOfquestion()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(GameLostArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int correct, int nOfquestion) {
      this.arguments.put("correct", correct);
      this.arguments.put("nOfquestion", nOfquestion);
    }

    @NonNull
    public GameLostArgs build() {
      GameLostArgs result = new GameLostArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCorrect(int correct) {
      this.arguments.put("correct", correct);
      return this;
    }

    @NonNull
    public Builder setNOfquestion(int nOfquestion) {
      this.arguments.put("nOfquestion", nOfquestion);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getCorrect() {
      return (int) arguments.get("correct");
    }

    @SuppressWarnings("unchecked")
    public int getNOfquestion() {
      return (int) arguments.get("nOfquestion");
    }
  }
}
