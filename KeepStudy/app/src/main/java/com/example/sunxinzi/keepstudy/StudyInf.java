package com.example.sunxinzi.keepstudy;

import java.sql.Timestamp;

import android.location.Location;

/**
 * Created by luzhaoqian on 11/9/2014.
 */
public class StudyInf {

    private long id;

    private long courseId;

    private String courseName;

    private int startTimeHour;

    private int startTimeMinute;

    private Timestamp endTime;

    private float studyTimeLength;

    private float plannedTimeLength;

    private double longitude;

    private double latitude;

    private String remark;

    public StudyInf() {
    }

    public StudyInf(long courseId, String courseName, int startTimeHour, int startTimeMinute, double longitude, double latitude, String remark) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.startTimeHour = startTimeHour;
        this.startTimeMinute = startTimeMinute;
        this.longitude = longitude;
        this.latitude = latitude;
        this.remark = remark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStartTimeHour() {
        return startTimeHour;
    }

    public int getStartTimeMinute() {
        return startTimeMinute;
    }

    public void setStartTimeHour(int startTimeHour) {
        this.startTimeHour = startTimeHour;
    }

    public void setStartTimeMinute(int startTimeMinute) {
        this.startTimeMinute = startTimeMinute;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public float getStudyTimeLength() {
        return studyTimeLength;
    }

    public void setStudyTimeLength(float studyTimeLength) {
        this.studyTimeLength = studyTimeLength;
    }

    public float getPlannedTimeLength() {
        return plannedTimeLength;
    }

    public void setPlannedTimeLength(float plannedTimeLength) {
        this.plannedTimeLength = plannedTimeLength;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
