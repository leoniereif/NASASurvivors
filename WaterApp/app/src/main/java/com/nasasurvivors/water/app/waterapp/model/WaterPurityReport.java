package com.nasasurvivors.water.app.waterapp.model;

import java.text.DateFormat;
import java.util.Date;

/**
 * model class for a water purity report
 */
public class WaterPurityReport {

    private Date date;
    private int id;
    private String reporter;
    private LatLng location;
    private WaterSafetyCondition overallCondition;
    private int virusPPM;
    private int contaminantPPM;

    public static int currPurityReportID = 0;

    /**
     * Constructor with no arguments
     */
    public WaterPurityReport() {
    }

    /**
     * constructor for waterPurityReport
     * @param date input date
     * @param reporter report author
     * @param location report location
     * @param overallCondition input condition
     * @param virusPPM input virus PPM
     * @param contaminantPPM input contaminant PPM
     * @param id report id
     */
    public WaterPurityReport(Date date, String reporter,
                             LatLng location, WaterSafetyCondition overallCondition,
                             int virusPPM, int contaminantPPM, int id) {
        this.date = date;
        this.reporter = reporter;
        this.location = location;
        this.overallCondition = overallCondition;
        this.virusPPM = virusPPM;
        this.contaminantPPM = contaminantPPM;
        this.id = id;
    }

    /**
     * getter for date
     * @return date object
     */
    public Date getDate() {
        return date;
    }

    /**
     * getter for time
     * @return time string
     */
    public String getTime() {
        return DateFormat.getTimeInstance().format(date);
    }

    /**
     * getter for date string
     * @return date string
     */
    public String getMonthDayYear() {
        return DateFormat.getDateInstance().format(date);
    }

    /**
     * getter for location
     * @return location
     */
    public LatLng getLocation() {
        return location;
    }

    /**
     * getter for id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * getter for reporter
     * @return reporter
     */
    public String getReporter() {
        return reporter;
    }

    /**
     * getter for safety condition
     * @return safety condition
     */
    public WaterSafetyCondition getOverallCondition() {
        return overallCondition;
    }

    /**
     * getter for virus PPM
     * @return virus PPM
     */
    public int getVirusPPM() {
        return virusPPM;
    }

    /**
     * getter for contaminant PPM
     * @return contaminant PPM
     */
    public int getContaminantPPM() {
        return contaminantPPM;
    }

    /**
     * setter for report id
     * @param id report id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * overrides toString method
     * @return string representation of purity report
     */
    public String toString() {
        return id + ", " + reporter + ", " + date.toString() + ", " + location.toString() +
                ", contaminant: " + contaminantPPM + ", virus: " + virusPPM;
    }
}
