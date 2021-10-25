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
import io.swagger.client.model.Link;
import io.swagger.client.model.UserResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UsersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-25T09:14:56.929Z")
public class UsersResponse {
  @SerializedName("data")
  private List<UserResponse> data = null;

  @SerializedName("links")
  private List<Link> links = null;

  public UsersResponse data(List<UserResponse> data) {
    this.data = data;
    return this;
  }

  public UsersResponse addDataItem(UserResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<UserResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<UserResponse> getData() {
    return data;
  }

  public void setData(List<UserResponse> data) {
    this.data = data;
  }

  public UsersResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public UsersResponse addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersResponse usersResponse = (UsersResponse) o;
    return Objects.equals(this.data, usersResponse.data) &&
        Objects.equals(this.links, usersResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

