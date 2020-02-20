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
import io.swagger.client.model.CreateProfileUserNavSystemAccessData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CreateProfileUser
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-20T13:49:13.196Z[GMT]")
public class CreateProfileUser {
  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("groups")
  private List<Integer> groups = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("company_short_name")
  private String companyShortName = null;

  @SerializedName("notify_timezone")
  private Integer notifyTimezone = null;

  @SerializedName("lang")
  private Integer lang = null;

  @SerializedName("parent")
  private Integer parent = null;

  @SerializedName("nav_system_access_data")
  private CreateProfileUserNavSystemAccessData navSystemAccessData = null;

  public CreateProfileUser firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @Schema(example = "Name", description = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public CreateProfileUser lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @Schema(example = "Lastname", description = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public CreateProfileUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(example = "example@example.com", description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateProfileUser phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(example = "+330905678933", description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CreateProfileUser comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(example = "Fake Comment For A Client", description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public CreateProfileUser groups(List<Integer> groups) {
    this.groups = groups;
    return this;
  }

  public CreateProfileUser addGroupsItem(Integer groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<Integer>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<Integer> getGroups() {
    return groups;
  }

  public void setGroups(List<Integer> groups) {
    this.groups = groups;
  }

  public CreateProfileUser company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @Schema(description = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public CreateProfileUser companyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
    return this;
  }

   /**
   * Get companyShortName
   * @return companyShortName
  **/
  @Schema(description = "")
  public String getCompanyShortName() {
    return companyShortName;
  }

  public void setCompanyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
  }

  public CreateProfileUser notifyTimezone(Integer notifyTimezone) {
    this.notifyTimezone = notifyTimezone;
    return this;
  }

   /**
   * Get notifyTimezone
   * @return notifyTimezone
  **/
  @Schema(example = "1", description = "")
  public Integer getNotifyTimezone() {
    return notifyTimezone;
  }

  public void setNotifyTimezone(Integer notifyTimezone) {
    this.notifyTimezone = notifyTimezone;
  }

  public CreateProfileUser lang(Integer lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(example = "1", description = "")
  public Integer getLang() {
    return lang;
  }

  public void setLang(Integer lang) {
    this.lang = lang;
  }

  public CreateProfileUser parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(example = "2", description = "")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public CreateProfileUser navSystemAccessData(CreateProfileUserNavSystemAccessData navSystemAccessData) {
    this.navSystemAccessData = navSystemAccessData;
    return this;
  }

   /**
   * Get navSystemAccessData
   * @return navSystemAccessData
  **/
  @Schema(description = "")
  public CreateProfileUserNavSystemAccessData getNavSystemAccessData() {
    return navSystemAccessData;
  }

  public void setNavSystemAccessData(CreateProfileUserNavSystemAccessData navSystemAccessData) {
    this.navSystemAccessData = navSystemAccessData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProfileUser createProfileUser = (CreateProfileUser) o;
    return Objects.equals(this.firstname, createProfileUser.firstname) &&
        Objects.equals(this.lastname, createProfileUser.lastname) &&
        Objects.equals(this.email, createProfileUser.email) &&
        Objects.equals(this.phone, createProfileUser.phone) &&
        Objects.equals(this.comment, createProfileUser.comment) &&
        Objects.equals(this.groups, createProfileUser.groups) &&
        Objects.equals(this.company, createProfileUser.company) &&
        Objects.equals(this.companyShortName, createProfileUser.companyShortName) &&
        Objects.equals(this.notifyTimezone, createProfileUser.notifyTimezone) &&
        Objects.equals(this.lang, createProfileUser.lang) &&
        Objects.equals(this.parent, createProfileUser.parent) &&
        Objects.equals(this.navSystemAccessData, createProfileUser.navSystemAccessData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, email, phone, comment, groups, company, companyShortName, notifyTimezone, lang, parent, navSystemAccessData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProfileUser {\n");
    
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyShortName: ").append(toIndentedString(companyShortName)).append("\n");
    sb.append("    notifyTimezone: ").append(toIndentedString(notifyTimezone)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    navSystemAccessData: ").append(toIndentedString(navSystemAccessData)).append("\n");
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
