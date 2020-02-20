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
import io.swagger.client.model.UpdateVehicleCategoryVehicleCategoryForm;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UpdateVehicleCategory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-20T07:00:05.887Z[GMT]")
public class UpdateVehicleCategory {
  @SerializedName("vehicle_category_form")
  private UpdateVehicleCategoryVehicleCategoryForm vehicleCategoryForm = null;

  public UpdateVehicleCategory vehicleCategoryForm(UpdateVehicleCategoryVehicleCategoryForm vehicleCategoryForm) {
    this.vehicleCategoryForm = vehicleCategoryForm;
    return this;
  }

   /**
   * Get vehicleCategoryForm
   * @return vehicleCategoryForm
  **/
  @Schema(description = "")
  public UpdateVehicleCategoryVehicleCategoryForm getVehicleCategoryForm() {
    return vehicleCategoryForm;
  }

  public void setVehicleCategoryForm(UpdateVehicleCategoryVehicleCategoryForm vehicleCategoryForm) {
    this.vehicleCategoryForm = vehicleCategoryForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVehicleCategory updateVehicleCategory = (UpdateVehicleCategory) o;
    return Objects.equals(this.vehicleCategoryForm, updateVehicleCategory.vehicleCategoryForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleCategoryForm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVehicleCategory {\n");
    
    sb.append("    vehicleCategoryForm: ").append(toIndentedString(vehicleCategoryForm)).append("\n");
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