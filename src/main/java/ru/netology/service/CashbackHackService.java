package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;
    private int bonus;

    public int remain(int amount) {
        return boundary - amount%boundary;
    }

    public int calculateCashbackHack(int i) {
        return bonus;
    }
}