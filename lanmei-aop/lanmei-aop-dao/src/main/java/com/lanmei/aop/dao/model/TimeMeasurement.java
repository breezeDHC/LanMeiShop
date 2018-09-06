package com.lanmei.aop.dao.model;

public class TimeMeasurement {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_measurement.measurement_id
     *
     * @mbggenerated
     */
    private Integer measurementId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_measurement.method
     *
     * @mbggenerated
     */
    private String method;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_measurement.method_desc
     *
     * @mbggenerated
     */
    private String methodDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_measurement.layer
     *
     * @mbggenerated
     */
    private String layer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_measurement.avr_time
     *
     * @mbggenerated
     */
    private Long avrTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_measurement.run_count
     *
     * @mbggenerated
     */
    private Long runCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_measurement.last_time
     *
     * @mbggenerated
     */
    private Long lastTime;

    public TimeMeasurement(String method, String methodDesc, String layer, Long avrTime, Long runCount, Long lastTime) {
        super();
        this.method = method;
        this.methodDesc = methodDesc;
        this.layer = layer;
        this.avrTime = avrTime;
        this.runCount = runCount;
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_measurement.measurement_id
     *
     * @return the value of time_measurement.measurement_id
     *
     * @mbggenerated
     */
    public Integer getMeasurementId() {
        return measurementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_measurement.measurement_id
     *
     * @param measurementId the value for time_measurement.measurement_id
     *
     * @mbggenerated
     */
    public void setMeasurementId(Integer measurementId) {
        this.measurementId = measurementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_measurement.method
     *
     * @return the value of time_measurement.method
     *
     * @mbggenerated
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_measurement.method
     *
     * @param method the value for time_measurement.method
     *
     * @mbggenerated
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_measurement.method_desc
     *
     * @return the value of time_measurement.method_desc
     *
     * @mbggenerated
     */
    public String getMethodDesc() {
        return methodDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_measurement.method_desc
     *
     * @param methodDesc the value for time_measurement.method_desc
     *
     * @mbggenerated
     */
    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_measurement.layer
     *
     * @return the value of time_measurement.layer
     *
     * @mbggenerated
     */
    public String getLayer() {
        return layer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_measurement.layer
     *
     * @param layer the value for time_measurement.layer
     *
     * @mbggenerated
     */
    public void setLayer(String layer) {
        this.layer = layer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_measurement.avr_time
     *
     * @return the value of time_measurement.avr_time
     *
     * @mbggenerated
     */
    public Long getAvrTime() {
        return avrTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_measurement.avr_time
     *
     * @param avrTime the value for time_measurement.avr_time
     *
     * @mbggenerated
     */
    public void setAvrTime(Long avrTime) {
        this.avrTime = avrTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_measurement.run_count
     *
     * @return the value of time_measurement.run_count
     *
     * @mbggenerated
     */
    public Long getRunCount() {
        return runCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_measurement.run_count
     *
     * @param runCount the value for time_measurement.run_count
     *
     * @mbggenerated
     */
    public void setRunCount(Long runCount) {
        this.runCount = runCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_measurement.last_time
     *
     * @return the value of time_measurement.last_time
     *
     * @mbggenerated
     */
    public Long getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_measurement.last_time
     *
     * @param lastTime the value for time_measurement.last_time
     *
     * @mbggenerated
     */
    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }
}