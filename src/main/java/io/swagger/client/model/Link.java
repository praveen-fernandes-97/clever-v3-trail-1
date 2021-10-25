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
import java.io.IOException;

/**
 * Link
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-25T09:14:56.929Z")
public class Link {
  /**
   * Gets or Sets rel
   */
  @JsonAdapter(RelEnum.Adapter.class)
  public enum RelEnum {
    NEXT("next"),
    
    PREV("prev"),
    
    SELF("self");

    private String value;

    RelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelEnum fromValue(String text) {
      for (RelEnum b : RelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("rel")
  private RelEnum rel = null;

  @SerializedName("uri")
  private String uri = null;

  public Link rel(RelEnum rel) {
    this.rel = rel;
    return this;
  }

   /**
   * Get rel
   * @return rel
  **/
  @ApiModelProperty(value = "")
  public RelEnum getRel() {
    return rel;
  }

  public void setRel(RelEnum rel) {
    this.rel = rel;
  }

  public Link uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.uri, link.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

