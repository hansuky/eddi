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
import io.swagger.client.model.ResultSnapshot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PackageRunSnapshot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class PackageRunSnapshot {
  @SerializedName("context")
  private String context = null;

  @SerializedName("lifecycleTasks")
  private List<ResultSnapshot> lifecycleTasks = null;

  public PackageRunSnapshot context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public PackageRunSnapshot lifecycleTasks(List<ResultSnapshot> lifecycleTasks) {
    this.lifecycleTasks = lifecycleTasks;
    return this;
  }

  public PackageRunSnapshot addLifecycleTasksItem(ResultSnapshot lifecycleTasksItem) {
    if (this.lifecycleTasks == null) {
      this.lifecycleTasks = new ArrayList<ResultSnapshot>();
    }
    this.lifecycleTasks.add(lifecycleTasksItem);
    return this;
  }

   /**
   * Get lifecycleTasks
   * @return lifecycleTasks
  **/
  @ApiModelProperty(value = "")
  public List<ResultSnapshot> getLifecycleTasks() {
    return lifecycleTasks;
  }

  public void setLifecycleTasks(List<ResultSnapshot> lifecycleTasks) {
    this.lifecycleTasks = lifecycleTasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageRunSnapshot packageRunSnapshot = (PackageRunSnapshot) o;
    return Objects.equals(this.context, packageRunSnapshot.context) &&
        Objects.equals(this.lifecycleTasks, packageRunSnapshot.lifecycleTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, lifecycleTasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageRunSnapshot {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    lifecycleTasks: ").append(toIndentedString(lifecycleTasks)).append("\n");
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

