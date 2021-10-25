/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 3.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Credentials;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Staff
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-25T09:14:56.929Z")
public class Staff {
  @SerializedName("credentials")
  private Credentials credentials = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("ext")
  private Object ext = null;

  @SerializedName("legacy_id")
  private String legacyId = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("schools")
  private List<String> schools = null;

  @SerializedName("staff_id")
  private String staffId = null;

  @SerializedName("title")
  private String title = null;

  public Staff credentials(Credentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public Credentials getCredentials() {
    return credentials;
  }

  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  public Staff department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Staff ext(Object ext) {
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @ApiModelProperty(value = "")
  public Object getExt() {
    return ext;
  }

  public void setExt(Object ext) {
    this.ext = ext;
  }

  public Staff legacyId(String legacyId) {
    this.legacyId = legacyId;
    return this;
  }

   /**
   * Get legacyId
   * @return legacyId
  **/
  @ApiModelProperty(value = "")
  public String getLegacyId() {
    return legacyId;
  }

  public void setLegacyId(String legacyId) {
    this.legacyId = legacyId;
  }

  public Staff roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Staff addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public Staff schools(List<String> schools) {
    this.schools = schools;
    return this;
  }

  public Staff addSchoolsItem(String schoolsItem) {
    if (this.schools == null) {
      this.schools = new ArrayList<String>();
    }
    this.schools.add(schoolsItem);
    return this;
  }

   /**
   * Get schools
   * @return schools
  **/
  @ApiModelProperty(value = "")
  public List<String> getSchools() {
    return schools;
  }

  public void setSchools(List<String> schools) {
    this.schools = schools;
  }

  public Staff staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

   /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(value = "")
  public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public Staff title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Staff staff = (Staff) o;
    return Objects.equals(this.credentials, staff.credentials) &&
        Objects.equals(this.department, staff.department) &&
        Objects.equals(this.ext, staff.ext) &&
        Objects.equals(this.legacyId, staff.legacyId) &&
        Objects.equals(this.roles, staff.roles) &&
        Objects.equals(this.schools, staff.schools) &&
        Objects.equals(this.staffId, staff.staffId) &&
        Objects.equals(this.title, staff.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, department, ext, legacyId, roles, schools, staffId, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Staff {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    schools: ").append(toIndentedString(schools)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

