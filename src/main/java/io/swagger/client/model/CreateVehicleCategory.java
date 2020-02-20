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
import io.swagger.client.model.CreateVehicleCategoryVehicleCategoryForm;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CreateVehicleCategory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-20T13:49:13.196Z[GMT]")
public class CreateVehicleCategory {
  @SerializedName("vehicle_category_form")
  private CreateVehicleCategoryVehicleCategoryForm vehicleCategoryForm = null;

  public CreateVehicleCategory vehicleCategoryForm(CreateVehicleCategoryVehicleCategoryForm vehicleCategoryForm) {
    this.vehicleCategoryForm = vehicleCategoryForm;
    return this;
  }

   /**
   * Get vehicleCategoryForm
   * @return vehicleCategoryForm
  **/
  @Schema(description = "")
  public CreateVehicleCategoryVehicleCategoryForm getVehicleCategoryForm() {
    return vehicleCategoryForm;
  }

  public void setVehicleCategoryForm(CreateVehicleCategoryVehicleCategoryForm vehicleCategoryForm) {
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
    CreateVehicleCategory createVehicleCategory = (CreateVehicleCategory) o;
    return Objects.equals(this.vehicleCategoryForm, createVehicleCategory.vehicleCategoryForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleCategoryForm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVehicleCategory {\n");
    
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
