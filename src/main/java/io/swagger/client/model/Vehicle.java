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
import io.swagger.client.model.VehicleBrand;
import io.swagger.client.model.VehicleCategory;
import io.swagger.client.model.VehicleCategoryType;
import io.swagger.client.model.VehicleCountry;
import io.swagger.client.model.VehicleDriver;
import io.swagger.client.model.VehicleModel;
import io.swagger.client.model.VehicleNavSystem;
import io.swagger.client.model.VehicleOwner;
import io.swagger.client.model.VehicleSensor;
import io.swagger.client.model.VehicleTankPosition;
import io.swagger.client.model.VehicleTanks;
import io.swagger.client.model.VehicleTechnical;
import io.swagger.client.model.VehicleVersion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Vehicle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-20T07:00:05.887Z[GMT]")
public class Vehicle {
  @SerializedName("photo_path")
  private String photoPath = null;

  @SerializedName("total_day_off")
  private Integer totalDayOff = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("brand")
  private VehicleBrand brand = null;

  @SerializedName("model")
  private VehicleModel model = null;

  @SerializedName("version")
  private VehicleVersion version = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("country")
  private VehicleCountry country = null;

  @SerializedName("owner")
  private VehicleOwner owner = null;

  @SerializedName("driver")
  private VehicleDriver driver = null;

  @SerializedName("groups")
  private List<Object> groups = null;

  @SerializedName("initial_consumption")
  private BigDecimal initialConsumption = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nav_system_object_uid")
  private String navSystemObjectUid = null;

  @SerializedName("photo")
  private String photo = null;

  @SerializedName("registration")
  private String registration = null;

  @SerializedName("release_year")
  private Integer releaseYear = null;

  @SerializedName("type")
  private VehicleCategoryType type = null;

  @SerializedName("technical")
  private VehicleTechnical technical = null;

  @SerializedName("nav_system")
  private VehicleNavSystem navSystem = null;

  @SerializedName("sensor")
  private VehicleSensor sensor = null;

  @SerializedName("tanks")
  private List<VehicleTanks> tanks = null;

  @SerializedName("tank_position")
  private VehicleTankPosition tankPosition = null;

  @SerializedName("is_maintenance_enabled")
  private Boolean isMaintenanceEnabled = null;

  @SerializedName("category")
  private VehicleCategory category = null;

  @SerializedName("ptac")
  private String ptac = null;

  @SerializedName("eligible_for_ticpe")
  private String eligibleForTicpe = null;

  @SerializedName("eligible_for_tsvr")
  private String eligibleForTsvr = null;

  @SerializedName("national_type")
  private String nationalType = null;

  @SerializedName("fuel_type")
  private String fuelType = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("box_id")
  private String boxId = null;

  public Vehicle photoPath(String photoPath) {
    this.photoPath = photoPath;
    return this;
  }

   /**
   * Get photoPath
   * @return photoPath
  **/
  @Schema(example = "vehicle/414ab4b0e3a5d5ece0be959c6e74fbf532c1bf3e.jpg", description = "")
  public String getPhotoPath() {
    return photoPath;
  }

  public void setPhotoPath(String photoPath) {
    this.photoPath = photoPath;
  }

  public Vehicle totalDayOff(Integer totalDayOff) {
    this.totalDayOff = totalDayOff;
    return this;
  }

   /**
   * Get totalDayOff
   * @return totalDayOff
  **/
  @Schema(example = "1", description = "")
  public Integer getTotalDayOff() {
    return totalDayOff;
  }

  public void setTotalDayOff(Integer totalDayOff) {
    this.totalDayOff = totalDayOff;
  }

  public Vehicle id(Integer id) {
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

  public Vehicle brand(VehicleBrand brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @Schema(description = "")
  public VehicleBrand getBrand() {
    return brand;
  }

  public void setBrand(VehicleBrand brand) {
    this.brand = brand;
  }

  public Vehicle model(VehicleModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Schema(description = "")
  public VehicleModel getModel() {
    return model;
  }

  public void setModel(VehicleModel model) {
    this.model = model;
  }

  public Vehicle version(VehicleVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public VehicleVersion getVersion() {
    return version;
  }

  public void setVersion(VehicleVersion version) {
    this.version = version;
  }

  public Vehicle comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Vehicle country(VehicleCountry country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public VehicleCountry getCountry() {
    return country;
  }

  public void setCountry(VehicleCountry country) {
    this.country = country;
  }

  public Vehicle owner(VehicleOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public VehicleOwner getOwner() {
    return owner;
  }

  public void setOwner(VehicleOwner owner) {
    this.owner = owner;
  }

  public Vehicle driver(VehicleDriver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @Schema(description = "")
  public VehicleDriver getDriver() {
    return driver;
  }

  public void setDriver(VehicleDriver driver) {
    this.driver = driver;
  }

  public Vehicle groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public Vehicle addGroupsItem(Object groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<Object>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<Object> getGroups() {
    return groups;
  }

  public void setGroups(List<Object> groups) {
    this.groups = groups;
  }

  public Vehicle initialConsumption(BigDecimal initialConsumption) {
    this.initialConsumption = initialConsumption;
    return this;
  }

   /**
   * Get initialConsumption
   * @return initialConsumption
  **/
  @Schema(example = "1.222", description = "")
  public BigDecimal getInitialConsumption() {
    return initialConsumption;
  }

  public void setInitialConsumption(BigDecimal initialConsumption) {
    this.initialConsumption = initialConsumption;
  }

  public Vehicle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Update By Master", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vehicle navSystemObjectUid(String navSystemObjectUid) {
    this.navSystemObjectUid = navSystemObjectUid;
    return this;
  }

   /**
   * Get navSystemObjectUid
   * @return navSystemObjectUid
  **/
  @Schema(example = "updated-vehicle", description = "")
  public String getNavSystemObjectUid() {
    return navSystemObjectUid;
  }

  public void setNavSystemObjectUid(String navSystemObjectUid) {
    this.navSystemObjectUid = navSystemObjectUid;
  }

  public Vehicle photo(String photo) {
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/
  @Schema(example = "414ab4b0e3a5d5ece0be959c6e74fbf532c1bf3e.jpg", description = "")
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public Vehicle registration(String registration) {
    this.registration = registration;
    return this;
  }

   /**
   * Get registration
   * @return registration
  **/
  @Schema(example = "reg info", description = "")
  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public Vehicle releaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
    return this;
  }

   /**
   * Get releaseYear
   * @return releaseYear
  **/
  @Schema(example = "1999", description = "")
  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
  }

  public Vehicle type(VehicleCategoryType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public VehicleCategoryType getType() {
    return type;
  }

  public void setType(VehicleCategoryType type) {
    this.type = type;
  }

  public Vehicle technical(VehicleTechnical technical) {
    this.technical = technical;
    return this;
  }

   /**
   * Get technical
   * @return technical
  **/
  @Schema(description = "")
  public VehicleTechnical getTechnical() {
    return technical;
  }

  public void setTechnical(VehicleTechnical technical) {
    this.technical = technical;
  }

  public Vehicle navSystem(VehicleNavSystem navSystem) {
    this.navSystem = navSystem;
    return this;
  }

   /**
   * Get navSystem
   * @return navSystem
  **/
  @Schema(description = "")
  public VehicleNavSystem getNavSystem() {
    return navSystem;
  }

  public void setNavSystem(VehicleNavSystem navSystem) {
    this.navSystem = navSystem;
  }

  public Vehicle sensor(VehicleSensor sensor) {
    this.sensor = sensor;
    return this;
  }

   /**
   * Get sensor
   * @return sensor
  **/
  @Schema(description = "")
  public VehicleSensor getSensor() {
    return sensor;
  }

  public void setSensor(VehicleSensor sensor) {
    this.sensor = sensor;
  }

  public Vehicle tanks(List<VehicleTanks> tanks) {
    this.tanks = tanks;
    return this;
  }

  public Vehicle addTanksItem(VehicleTanks tanksItem) {
    if (this.tanks == null) {
      this.tanks = new ArrayList<VehicleTanks>();
    }
    this.tanks.add(tanksItem);
    return this;
  }

   /**
   * Get tanks
   * @return tanks
  **/
  @Schema(description = "")
  public List<VehicleTanks> getTanks() {
    return tanks;
  }

  public void setTanks(List<VehicleTanks> tanks) {
    this.tanks = tanks;
  }

  public Vehicle tankPosition(VehicleTankPosition tankPosition) {
    this.tankPosition = tankPosition;
    return this;
  }

   /**
   * Get tankPosition
   * @return tankPosition
  **/
  @Schema(description = "")
  public VehicleTankPosition getTankPosition() {
    return tankPosition;
  }

  public void setTankPosition(VehicleTankPosition tankPosition) {
    this.tankPosition = tankPosition;
  }

  public Vehicle isMaintenanceEnabled(Boolean isMaintenanceEnabled) {
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

  public Vehicle category(VehicleCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public VehicleCategory getCategory() {
    return category;
  }

  public void setCategory(VehicleCategory category) {
    this.category = category;
  }

  public Vehicle ptac(String ptac) {
    this.ptac = ptac;
    return this;
  }

   /**
   * Get ptac
   * @return ptac
  **/
  @Schema(description = "")
  public String getPtac() {
    return ptac;
  }

  public void setPtac(String ptac) {
    this.ptac = ptac;
  }

  public Vehicle eligibleForTicpe(String eligibleForTicpe) {
    this.eligibleForTicpe = eligibleForTicpe;
    return this;
  }

   /**
   * Get eligibleForTicpe
   * @return eligibleForTicpe
  **/
  @Schema(description = "")
  public String getEligibleForTicpe() {
    return eligibleForTicpe;
  }

  public void setEligibleForTicpe(String eligibleForTicpe) {
    this.eligibleForTicpe = eligibleForTicpe;
  }

  public Vehicle eligibleForTsvr(String eligibleForTsvr) {
    this.eligibleForTsvr = eligibleForTsvr;
    return this;
  }

   /**
   * Get eligibleForTsvr
   * @return eligibleForTsvr
  **/
  @Schema(description = "")
  public String getEligibleForTsvr() {
    return eligibleForTsvr;
  }

  public void setEligibleForTsvr(String eligibleForTsvr) {
    this.eligibleForTsvr = eligibleForTsvr;
  }

  public Vehicle nationalType(String nationalType) {
    this.nationalType = nationalType;
    return this;
  }

   /**
   * Get nationalType
   * @return nationalType
  **/
  @Schema(description = "")
  public String getNationalType() {
    return nationalType;
  }

  public void setNationalType(String nationalType) {
    this.nationalType = nationalType;
  }

  public Vehicle fuelType(String fuelType) {
    this.fuelType = fuelType;
    return this;
  }

   /**
   * Get fuelType
   * @return fuelType
  **/
  @Schema(description = "")
  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public Vehicle property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @Schema(description = "")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public Vehicle boxId(String boxId) {
    this.boxId = boxId;
    return this;
  }

   /**
   * Get boxId
   * @return boxId
  **/
  @Schema(description = "")
  public String getBoxId() {
    return boxId;
  }

  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.photoPath, vehicle.photoPath) &&
        Objects.equals(this.totalDayOff, vehicle.totalDayOff) &&
        Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.brand, vehicle.brand) &&
        Objects.equals(this.model, vehicle.model) &&
        Objects.equals(this.version, vehicle.version) &&
        Objects.equals(this.comment, vehicle.comment) &&
        Objects.equals(this.country, vehicle.country) &&
        Objects.equals(this.owner, vehicle.owner) &&
        Objects.equals(this.driver, vehicle.driver) &&
        Objects.equals(this.groups, vehicle.groups) &&
        Objects.equals(this.initialConsumption, vehicle.initialConsumption) &&
        Objects.equals(this.name, vehicle.name) &&
        Objects.equals(this.navSystemObjectUid, vehicle.navSystemObjectUid) &&
        Objects.equals(this.photo, vehicle.photo) &&
        Objects.equals(this.registration, vehicle.registration) &&
        Objects.equals(this.releaseYear, vehicle.releaseYear) &&
        Objects.equals(this.type, vehicle.type) &&
        Objects.equals(this.technical, vehicle.technical) &&
        Objects.equals(this.navSystem, vehicle.navSystem) &&
        Objects.equals(this.sensor, vehicle.sensor) &&
        Objects.equals(this.tanks, vehicle.tanks) &&
        Objects.equals(this.tankPosition, vehicle.tankPosition) &&
        Objects.equals(this.isMaintenanceEnabled, vehicle.isMaintenanceEnabled) &&
        Objects.equals(this.category, vehicle.category) &&
        Objects.equals(this.ptac, vehicle.ptac) &&
        Objects.equals(this.eligibleForTicpe, vehicle.eligibleForTicpe) &&
        Objects.equals(this.eligibleForTsvr, vehicle.eligibleForTsvr) &&
        Objects.equals(this.nationalType, vehicle.nationalType) &&
        Objects.equals(this.fuelType, vehicle.fuelType) &&
        Objects.equals(this.property, vehicle.property) &&
        Objects.equals(this.boxId, vehicle.boxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photoPath, totalDayOff, id, brand, model, version, comment, country, owner, driver, groups, initialConsumption, name, navSystemObjectUid, photo, registration, releaseYear, type, technical, navSystem, sensor, tanks, tankPosition, isMaintenanceEnabled, category, ptac, eligibleForTicpe, eligibleForTsvr, nationalType, fuelType, property, boxId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    photoPath: ").append(toIndentedString(photoPath)).append("\n");
    sb.append("    totalDayOff: ").append(toIndentedString(totalDayOff)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    initialConsumption: ").append(toIndentedString(initialConsumption)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    navSystemObjectUid: ").append(toIndentedString(navSystemObjectUid)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    releaseYear: ").append(toIndentedString(releaseYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    technical: ").append(toIndentedString(technical)).append("\n");
    sb.append("    navSystem: ").append(toIndentedString(navSystem)).append("\n");
    sb.append("    sensor: ").append(toIndentedString(sensor)).append("\n");
    sb.append("    tanks: ").append(toIndentedString(tanks)).append("\n");
    sb.append("    tankPosition: ").append(toIndentedString(tankPosition)).append("\n");
    sb.append("    isMaintenanceEnabled: ").append(toIndentedString(isMaintenanceEnabled)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    ptac: ").append(toIndentedString(ptac)).append("\n");
    sb.append("    eligibleForTicpe: ").append(toIndentedString(eligibleForTicpe)).append("\n");
    sb.append("    eligibleForTsvr: ").append(toIndentedString(eligibleForTsvr)).append("\n");
    sb.append("    nationalType: ").append(toIndentedString(nationalType)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
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
