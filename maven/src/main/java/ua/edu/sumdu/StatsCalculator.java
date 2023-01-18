/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.sumdu;

/**
 *
 * @author serega
 */
public class StatsCalculator {

    private static StatsCalculator instance;

    private static double meanAge;
    private static int maxAge;
    private static int minAge;
    private static String popularMail;
    private static int sumduMails;

    private StatsCalculator() {
    }

    public static StatsCalculator getInstance() {
        if (instance == null) {
            instance = new StatsCalculator();
        }
        return instance;
    }

    public double getMeanAge() {
        return meanAge;
    }

    public void setMeanAge(double meanAge) {
        this.meanAge = meanAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getPopularMailDomain() {
        return popularMail;
    }

    public void setPopularMailDomain(String popularMail) {
        this.popularMail = popularMail;
    }

    public int getSumduMails() {
        return sumduMails;
    }

    public void setSumduMails(int sumduMails) {
        this.sumduMails = sumduMails;
    }

}
