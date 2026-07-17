package com.sealdClasses;

public sealed abstract class Paymants permits Upi,Bank{
      abstract void payments(double amount);
}

