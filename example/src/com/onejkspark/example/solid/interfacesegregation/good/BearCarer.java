package com.onejkspark.example.solid.interfacesegregation.good;

public class BearCarer implements BearCleaner, BearPetter {

  @Override
  public void washTheBear() {}

  @Override
  public void petTheBear() {}
}
