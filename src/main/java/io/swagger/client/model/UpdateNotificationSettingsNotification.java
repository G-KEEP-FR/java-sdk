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
import io.swagger.client.model.UpdateNotificationSettingsNotificationAlert1;
import io.swagger.client.model.UpdateNotificationSettingsNotificationAlert2;
import io.swagger.client.model.UpdateNotificationSettingsNotificationAlert3;
import io.swagger.client.model.UpdateNotificationSettingsNotificationAlert4;
import io.swagger.client.model.UpdateNotificationSettingsNotificationAlert9;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UpdateNotificationSettingsNotification
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-20T13:49:13.196Z[GMT]")
public class UpdateNotificationSettingsNotification {
  @SerializedName("alert_1")
  private UpdateNotificationSettingsNotificationAlert1 alert1 = null;

  @SerializedName("alert_2")
  private UpdateNotificationSettingsNotificationAlert2 alert2 = null;

  @SerializedName("alert_3")
  private UpdateNotificationSettingsNotificationAlert3 alert3 = null;

  @SerializedName("alert_4")
  private UpdateNotificationSettingsNotificationAlert4 alert4 = null;

  @SerializedName("alert_5")
  private UpdateNotificationSettingsNotificationAlert4 alert5 = null;

  @SerializedName("alert_6")
  private UpdateNotificationSettingsNotificationAlert4 alert6 = null;

  @SerializedName("alert_8")
  private UpdateNotificationSettingsNotificationAlert4 alert8 = null;

  @SerializedName("alert_9")
  private UpdateNotificationSettingsNotificationAlert9 alert9 = null;

  public UpdateNotificationSettingsNotification alert1(UpdateNotificationSettingsNotificationAlert1 alert1) {
    this.alert1 = alert1;
    return this;
  }

   /**
   * Get alert1
   * @return alert1
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert1 getAlert1() {
    return alert1;
  }

  public void setAlert1(UpdateNotificationSettingsNotificationAlert1 alert1) {
    this.alert1 = alert1;
  }

  public UpdateNotificationSettingsNotification alert2(UpdateNotificationSettingsNotificationAlert2 alert2) {
    this.alert2 = alert2;
    return this;
  }

   /**
   * Get alert2
   * @return alert2
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert2 getAlert2() {
    return alert2;
  }

  public void setAlert2(UpdateNotificationSettingsNotificationAlert2 alert2) {
    this.alert2 = alert2;
  }

  public UpdateNotificationSettingsNotification alert3(UpdateNotificationSettingsNotificationAlert3 alert3) {
    this.alert3 = alert3;
    return this;
  }

   /**
   * Get alert3
   * @return alert3
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert3 getAlert3() {
    return alert3;
  }

  public void setAlert3(UpdateNotificationSettingsNotificationAlert3 alert3) {
    this.alert3 = alert3;
  }

  public UpdateNotificationSettingsNotification alert4(UpdateNotificationSettingsNotificationAlert4 alert4) {
    this.alert4 = alert4;
    return this;
  }

   /**
   * Get alert4
   * @return alert4
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert4 getAlert4() {
    return alert4;
  }

  public void setAlert4(UpdateNotificationSettingsNotificationAlert4 alert4) {
    this.alert4 = alert4;
  }

  public UpdateNotificationSettingsNotification alert5(UpdateNotificationSettingsNotificationAlert4 alert5) {
    this.alert5 = alert5;
    return this;
  }

   /**
   * Get alert5
   * @return alert5
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert4 getAlert5() {
    return alert5;
  }

  public void setAlert5(UpdateNotificationSettingsNotificationAlert4 alert5) {
    this.alert5 = alert5;
  }

  public UpdateNotificationSettingsNotification alert6(UpdateNotificationSettingsNotificationAlert4 alert6) {
    this.alert6 = alert6;
    return this;
  }

   /**
   * Get alert6
   * @return alert6
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert4 getAlert6() {
    return alert6;
  }

  public void setAlert6(UpdateNotificationSettingsNotificationAlert4 alert6) {
    this.alert6 = alert6;
  }

  public UpdateNotificationSettingsNotification alert8(UpdateNotificationSettingsNotificationAlert4 alert8) {
    this.alert8 = alert8;
    return this;
  }

   /**
   * Get alert8
   * @return alert8
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert4 getAlert8() {
    return alert8;
  }

  public void setAlert8(UpdateNotificationSettingsNotificationAlert4 alert8) {
    this.alert8 = alert8;
  }

  public UpdateNotificationSettingsNotification alert9(UpdateNotificationSettingsNotificationAlert9 alert9) {
    this.alert9 = alert9;
    return this;
  }

   /**
   * Get alert9
   * @return alert9
  **/
  @Schema(description = "")
  public UpdateNotificationSettingsNotificationAlert9 getAlert9() {
    return alert9;
  }

  public void setAlert9(UpdateNotificationSettingsNotificationAlert9 alert9) {
    this.alert9 = alert9;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNotificationSettingsNotification updateNotificationSettingsNotification = (UpdateNotificationSettingsNotification) o;
    return Objects.equals(this.alert1, updateNotificationSettingsNotification.alert1) &&
        Objects.equals(this.alert2, updateNotificationSettingsNotification.alert2) &&
        Objects.equals(this.alert3, updateNotificationSettingsNotification.alert3) &&
        Objects.equals(this.alert4, updateNotificationSettingsNotification.alert4) &&
        Objects.equals(this.alert5, updateNotificationSettingsNotification.alert5) &&
        Objects.equals(this.alert6, updateNotificationSettingsNotification.alert6) &&
        Objects.equals(this.alert8, updateNotificationSettingsNotification.alert8) &&
        Objects.equals(this.alert9, updateNotificationSettingsNotification.alert9);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert1, alert2, alert3, alert4, alert5, alert6, alert8, alert9);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNotificationSettingsNotification {\n");
    
    sb.append("    alert1: ").append(toIndentedString(alert1)).append("\n");
    sb.append("    alert2: ").append(toIndentedString(alert2)).append("\n");
    sb.append("    alert3: ").append(toIndentedString(alert3)).append("\n");
    sb.append("    alert4: ").append(toIndentedString(alert4)).append("\n");
    sb.append("    alert5: ").append(toIndentedString(alert5)).append("\n");
    sb.append("    alert6: ").append(toIndentedString(alert6)).append("\n");
    sb.append("    alert8: ").append(toIndentedString(alert8)).append("\n");
    sb.append("    alert9: ").append(toIndentedString(alert9)).append("\n");
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
