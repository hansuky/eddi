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
import org.threeten.bp.OffsetDateTime;

/**
 * ResultSnapshot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class ResultSnapshot {
  @SerializedName("key")
  private String key = null;

  @SerializedName("result")
  private Object result = null;

  @SerializedName("possibleResults")
  private List<Object> possibleResults = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("public")
  private Boolean _public = null;

  public ResultSnapshot key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ResultSnapshot result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public ResultSnapshot possibleResults(List<Object> possibleResults) {
    this.possibleResults = possibleResults;
    return this;
  }

  public ResultSnapshot addPossibleResultsItem(Object possibleResultsItem) {
    if (this.possibleResults == null) {
      this.possibleResults = new ArrayList<Object>();
    }
    this.possibleResults.add(possibleResultsItem);
    return this;
  }

   /**
   * Get possibleResults
   * @return possibleResults
  **/
  @ApiModelProperty(value = "")
  public List<Object> getPossibleResults() {
    return possibleResults;
  }

  public void setPossibleResults(List<Object> possibleResults) {
    this.possibleResults = possibleResults;
  }

  public ResultSnapshot timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ResultSnapshot _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultSnapshot resultSnapshot = (ResultSnapshot) o;
    return Objects.equals(this.key, resultSnapshot.key) &&
        Objects.equals(this.result, resultSnapshot.result) &&
        Objects.equals(this.possibleResults, resultSnapshot.possibleResults) &&
        Objects.equals(this.timestamp, resultSnapshot.timestamp) &&
        Objects.equals(this._public, resultSnapshot._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, result, possibleResults, timestamp, _public);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSnapshot {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    possibleResults: ").append(toIndentedString(possibleResults)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
