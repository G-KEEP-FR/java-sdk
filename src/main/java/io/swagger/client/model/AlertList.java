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
import io.swagger.client.model.AlertListList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AlertList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-22T09:48:50.100Z[GMT]")
public class AlertList {
  @SerializedName("list")
  private List<AlertListList> list = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("count_per_page")
  private Integer countPerPage = null;

  @SerializedName("page_count")
  private Integer pageCount = null;

  @SerializedName("name_page_parameter")
  private String namePageParameter = null;

  public AlertList list(List<AlertListList> list) {
    this.list = list;
    return this;
  }

  public AlertList addListItem(AlertListList listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AlertListList>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(description = "")
  public List<AlertListList> getList() {
    return list;
  }

  public void setList(List<AlertListList> list) {
    this.list = list;
  }

  public AlertList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(example = "48", description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public AlertList countPerPage(Integer countPerPage) {
    this.countPerPage = countPerPage;
    return this;
  }

   /**
   * Get countPerPage
   * @return countPerPage
  **/
  @Schema(example = "50", description = "")
  public Integer getCountPerPage() {
    return countPerPage;
  }

  public void setCountPerPage(Integer countPerPage) {
    this.countPerPage = countPerPage;
  }

  public AlertList pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @Schema(example = "0", description = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public AlertList namePageParameter(String namePageParameter) {
    this.namePageParameter = namePageParameter;
    return this;
  }

   /**
   * Get namePageParameter
   * @return namePageParameter
  **/
  @Schema(example = "page", description = "")
  public String getNamePageParameter() {
    return namePageParameter;
  }

  public void setNamePageParameter(String namePageParameter) {
    this.namePageParameter = namePageParameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertList alertList = (AlertList) o;
    return Objects.equals(this.list, alertList.list) &&
        Objects.equals(this.count, alertList.count) &&
        Objects.equals(this.countPerPage, alertList.countPerPage) &&
        Objects.equals(this.pageCount, alertList.pageCount) &&
        Objects.equals(this.namePageParameter, alertList.namePageParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, count, countPerPage, pageCount, namePageParameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertList {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    countPerPage: ").append(toIndentedString(countPerPage)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    namePageParameter: ").append(toIndentedString(namePageParameter)).append("\n");
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