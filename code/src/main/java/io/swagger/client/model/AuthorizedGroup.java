/*
 * EDDI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthorizedGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class AuthorizedGroup {
  @SerializedName("group")
  private String group = null;

  @SerializedName("versions")
  private List<Integer> versions = null;

  public AuthorizedGroup group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public AuthorizedGroup versions(List<Integer> versions) {
    this.versions = versions;
    return this;
  }

  public AuthorizedGroup addVersionsItem(Integer versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<Integer>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getVersions() {
    return versions;
  }

  public void setVersions(List<Integer> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedGroup authorizedGroup = (AuthorizedGroup) o;
    return Objects.equals(this.group, authorizedGroup.group) &&
        Objects.equals(this.versions, authorizedGroup.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, versions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedGroup {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

