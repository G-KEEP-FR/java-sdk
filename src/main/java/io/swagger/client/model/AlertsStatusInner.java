/*
 * Gkeep API
 * Gkeep API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * AlertsStatusInner
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-20T13:49:13.196Z[GMT]")
public class AlertsStatusInner {
  @SerializedName("frame_id")
  private String frameId = null;

  @SerializedName("sensor")
  private Object sensor = null;

  @SerializedName("imei")
  private String imei = null;

  @SerializedName("msg_time")
  private Integer msgTime = null;

  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  @SerializedName("fuel_level")
  private BigDecimal fuelLevel = null;

  @SerializedName("vehicle_id")
  private Integer vehicleId = null;

  @SerializedName("driver_id")
  private Integer driverId = null;

  @SerializedName("is_maintenance_enabled")
  private Boolean isMaintenanceEnabled = null;

  public AlertsStatusInner frameId(String frameId) {
    this.frameId = frameId;
    return this;
  }

   /**
   * Get frameId
   * @return frameId
  **/
  @Schema(example = "c8d7ab4e-30d7-11e8-9d16-5e1dcc8fc5041-5e1dcc8fc5043", description = "")
  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public AlertsStatusInner sensor(Object sensor) {
    this.sensor = sensor;
    return this;
  }

   /**
   * Get sensor
   * @return sensor
  **/
  @Schema(description = "")
  public Object getSensor() {
    return sensor;
  }

  public void setSensor(Object sensor) {
    this.sensor = sensor;
  }

  public AlertsStatusInner imei(String imei) {
    this.imei = imei;
    return this;
  }

   /**
   * Get imei
   * @return imei
  **/
  @Schema(example = "5e1dcbf75c9758.75754550", description = "")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public AlertsStatusInner msgTime(Integer msgTime) {
    this.msgTime = msgTime;
    return this;
  }

   /**
   * Get msgTime
   * @return msgTime
  **/
  @Schema(example = "1579011215", description = "")
  public Integer getMsgTime() {
    return msgTime;
  }

  public void setMsgTime(Integer msgTime) {
    this.msgTime = msgTime;
  }

  public AlertsStatusInner latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(example = "56.8715508", description = "")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public AlertsStatusInner longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(example = "53.942966", description = "")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public AlertsStatusInner fuelLevel(BigDecimal fuelLevel) {
    this.fuelLevel = fuelLevel;
    return this;
  }

   /**
   * Get fuelLevel
   * @return fuelLevel
  **/
  @Schema(example = "29.17", description = "")
  public BigDecimal getFuelLevel() {
    return fuelLevel;
  }

  public void setFuelLevel(BigDecimal fuelLevel) {
    this.fuelLevel = fuelLevel;
  }

  public AlertsStatusInner vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @Schema(example = "1", description = "")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }

  public AlertsStatusInner driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * Get driverId
   * @return driverId
  **/
  @Schema(example = "31", description = "")
  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public AlertsStatusInner isMaintenanceEnabled(Boolean isMaintenanceEnabled) {
    this.isMaintenanceEnabled = isMaintenanceEnabled;
    return this;
  }

   /**
   * Get isMaintenanceEnabled
   * @return isMaintenanceEnabled
  **/
  @Schema(description = "")
  public Boolean isIsMaintenanceEnabled() {
    return isMaintenanceEnabled;
  }

  public void setIsMaintenanceEnabled(Boolean isMaintenanceEnabled) {
    this.isMaintenanceEnabled = isMaintenanceEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertsStatusInner alertsStatusInner = (AlertsStatusInner) o;
    return Objects.equals(this.frameId, alertsStatusInner.frameId) &&
        Objects.equals(this.sensor, alertsStatusInner.sensor) &&
        Objects.equals(this.imei, alertsStatusInner.imei) &&
        Objects.equals(this.msgTime, alertsStatusInner.msgTime) &&
        Objects.equals(this.latitude, alertsStatusInner.latitude) &&
        Objects.equals(this.longitude, alertsStatusInner.longitude) &&
        Objects.equals(this.fuelLevel, alertsStatusInner.fuelLevel) &&
        Objects.equals(this.vehicleId, alertsStatusInner.vehicleId) &&
        Objects.equals(this.driverId, alertsStatusInner.driverId) &&
        Objects.equals(this.isMaintenanceEnabled, alertsStatusInner.isMaintenanceEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameId, sensor, imei, msgTime, latitude, longitude, fuelLevel, vehicleId, driverId, isMaintenanceEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertsStatusInner {\n");
    
    sb.append("    frameId: ").append(toIndentedString(frameId)).append("\n");
    sb.append("    sensor: ").append(toIndentedString(sensor)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    msgTime: ").append(toIndentedString(msgTime)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    fuelLevel: ").append(toIndentedString(fuelLevel)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    isMaintenanceEnabled: ").append(toIndentedString(isMaintenanceEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
