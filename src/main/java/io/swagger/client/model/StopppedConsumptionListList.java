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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * StopppedConsumptionListList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-20T07:00:05.887Z[GMT]")
public class StopppedConsumptionListList {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created_at")
  private Integer createdAt = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("finished_at")
  private Integer finishedAt = null;

  public StopppedConsumptionListList id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "376", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StopppedConsumptionListList createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(example = "1580997276", description = "")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public StopppedConsumptionListList longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(example = "53.942966", description = "")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public StopppedConsumptionListList latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(example = "56.8715508", description = "")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public StopppedConsumptionListList finishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @Schema(example = "1580997297", description = "")
  public Integer getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopppedConsumptionListList stopppedConsumptionListList = (StopppedConsumptionListList) o;
    return Objects.equals(this.id, stopppedConsumptionListList.id) &&
        Objects.equals(this.createdAt, stopppedConsumptionListList.createdAt) &&
        Objects.equals(this.longitude, stopppedConsumptionListList.longitude) &&
        Objects.equals(this.latitude, stopppedConsumptionListList.latitude) &&
        Objects.equals(this.finishedAt, stopppedConsumptionListList.finishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, longitude, latitude, finishedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopppedConsumptionListList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
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
