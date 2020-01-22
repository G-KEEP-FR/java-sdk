/*
 * Gkeep API
 * Gkeep API
 *
 * OpenAPI spec version: 0.0.1
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
import io.swagger.client.model.AlertListDriver;
import io.swagger.client.model.AlertListVehicleOwner;
import io.swagger.client.model.VehicleListGroups;
import io.swagger.client.model.VehicleListSensor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VehicleListList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-22T09:48:50.100Z[GMT]")
public class VehicleListList {
  @SerializedName("gkeep_id")
  private String gkeepId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("owner")
  private AlertListVehicleOwner owner = null;

  @SerializedName("driver")
  private AlertListDriver driver = null;

  @SerializedName("groups")
  private List<VehicleListGroups> groups = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("photo")
  private String photo = null;

  @SerializedName("sensor")
  private VehicleListSensor sensor = null;

  @SerializedName("last_alert_at")
  private Integer lastAlertAt = null;

  @SerializedName("first_frame_at")
  private Integer firstFrameAt = null;

  @SerializedName("is_maintenance_enabled")
  private Boolean isMaintenanceEnabled = null;

  public VehicleListList gkeepId(String gkeepId) {
    this.gkeepId = gkeepId;
    return this;
  }

   /**
   * Get gkeepId
   * @return gkeepId
  **/
  @Schema(example = "cl#0#Registration", description = "")
  public String getGkeepId() {
    return gkeepId;
  }

  public void setGkeepId(String gkeepId) {
    this.gkeepId = gkeepId;
  }

  public VehicleListList id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VehicleListList owner(AlertListVehicleOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public AlertListVehicleOwner getOwner() {
    return owner;
  }

  public void setOwner(AlertListVehicleOwner owner) {
    this.owner = owner;
  }

  public VehicleListList driver(AlertListDriver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @Schema(description = "")
  public AlertListDriver getDriver() {
    return driver;
  }

  public void setDriver(AlertListDriver driver) {
    this.driver = driver;
  }

  public VehicleListList groups(List<VehicleListGroups> groups) {
    this.groups = groups;
    return this;
  }

  public VehicleListList addGroupsItem(VehicleListGroups groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<VehicleListGroups>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<VehicleListGroups> getGroups() {
    return groups;
  }

  public void setGroups(List<VehicleListGroups> groups) {
    this.groups = groups;
  }

  public VehicleListList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Vehicle", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleListList photo(String photo) {
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/
  @Schema(example = "a9d38163b1b008e331c510ede908b58d58992930.jpg", description = "")
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public VehicleListList sensor(VehicleListSensor sensor) {
    this.sensor = sensor;
    return this;
  }

   /**
   * Get sensor
   * @return sensor
  **/
  @Schema(description = "")
  public VehicleListSensor getSensor() {
    return sensor;
  }

  public void setSensor(VehicleListSensor sensor) {
    this.sensor = sensor;
  }

  public VehicleListList lastAlertAt(Integer lastAlertAt) {
    this.lastAlertAt = lastAlertAt;
    return this;
  }

   /**
   * Get lastAlertAt
   * @return lastAlertAt
  **/
  @Schema(example = "1578310901", description = "")
  public Integer getLastAlertAt() {
    return lastAlertAt;
  }

  public void setLastAlertAt(Integer lastAlertAt) {
    this.lastAlertAt = lastAlertAt;
  }

  public VehicleListList firstFrameAt(Integer firstFrameAt) {
    this.firstFrameAt = firstFrameAt;
    return this;
  }

   /**
   * Get firstFrameAt
   * @return firstFrameAt
  **/
  @Schema(example = "1578310901", description = "")
  public Integer getFirstFrameAt() {
    return firstFrameAt;
  }

  public void setFirstFrameAt(Integer firstFrameAt) {
    this.firstFrameAt = firstFrameAt;
  }

  public VehicleListList isMaintenanceEnabled(Boolean isMaintenanceEnabled) {
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
    VehicleListList vehicleListList = (VehicleListList) o;
    return Objects.equals(this.gkeepId, vehicleListList.gkeepId) &&
        Objects.equals(this.id, vehicleListList.id) &&
        Objects.equals(this.owner, vehicleListList.owner) &&
        Objects.equals(this.driver, vehicleListList.driver) &&
        Objects.equals(this.groups, vehicleListList.groups) &&
        Objects.equals(this.name, vehicleListList.name) &&
        Objects.equals(this.photo, vehicleListList.photo) &&
        Objects.equals(this.sensor, vehicleListList.sensor) &&
        Objects.equals(this.lastAlertAt, vehicleListList.lastAlertAt) &&
        Objects.equals(this.firstFrameAt, vehicleListList.firstFrameAt) &&
        Objects.equals(this.isMaintenanceEnabled, vehicleListList.isMaintenanceEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gkeepId, id, owner, driver, groups, name, photo, sensor, lastAlertAt, firstFrameAt, isMaintenanceEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleListList {\n");
    
    sb.append("    gkeepId: ").append(toIndentedString(gkeepId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    sensor: ").append(toIndentedString(sensor)).append("\n");
    sb.append("    lastAlertAt: ").append(toIndentedString(lastAlertAt)).append("\n");
    sb.append("    firstFrameAt: ").append(toIndentedString(firstFrameAt)).append("\n");
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