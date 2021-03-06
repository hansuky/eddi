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
import io.swagger.client.model.ConversationStepSnapshot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConversationMemorySnapshot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class ConversationMemorySnapshot {
  @SerializedName("id")
  private String id = null;

  @SerializedName("botId")
  private String botId = null;

  @SerializedName("botVersion")
  private Integer botVersion = null;

  /**
   * Gets or Sets environment
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    RESTRICTED("restricted"),
    
    UNRESTRICTED("unrestricted"),
    
    TEST("test");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String text) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnvironmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("environment")
  private EnvironmentEnum environment = null;

  /**
   * Gets or Sets conversationState
   */
  @JsonAdapter(ConversationStateEnum.Adapter.class)
  public enum ConversationStateEnum {
    READY("READY"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    ENDED("ENDED"),
    
    EXECUTION_INTERRUPTED("EXECUTION_INTERRUPTED"),
    
    ERROR("ERROR");

    private String value;

    ConversationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConversationStateEnum fromValue(String text) {
      for (ConversationStateEnum b : ConversationStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConversationStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConversationStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConversationStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConversationStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("conversationState")
  private ConversationStateEnum conversationState = null;

  @SerializedName("conversationSteps")
  private List<ConversationStepSnapshot> conversationSteps = null;

  @SerializedName("redoCache")
  private List<ConversationStepSnapshot> redoCache = null;

  public ConversationMemorySnapshot id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversationMemorySnapshot botId(String botId) {
    this.botId = botId;
    return this;
  }

   /**
   * Get botId
   * @return botId
  **/
  @ApiModelProperty(value = "")
  public String getBotId() {
    return botId;
  }

  public void setBotId(String botId) {
    this.botId = botId;
  }

  public ConversationMemorySnapshot botVersion(Integer botVersion) {
    this.botVersion = botVersion;
    return this;
  }

   /**
   * Get botVersion
   * @return botVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getBotVersion() {
    return botVersion;
  }

  public void setBotVersion(Integer botVersion) {
    this.botVersion = botVersion;
  }

  public ConversationMemorySnapshot environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public ConversationMemorySnapshot conversationState(ConversationStateEnum conversationState) {
    this.conversationState = conversationState;
    return this;
  }

   /**
   * Get conversationState
   * @return conversationState
  **/
  @ApiModelProperty(value = "")
  public ConversationStateEnum getConversationState() {
    return conversationState;
  }

  public void setConversationState(ConversationStateEnum conversationState) {
    this.conversationState = conversationState;
  }

  public ConversationMemorySnapshot conversationSteps(List<ConversationStepSnapshot> conversationSteps) {
    this.conversationSteps = conversationSteps;
    return this;
  }

  public ConversationMemorySnapshot addConversationStepsItem(ConversationStepSnapshot conversationStepsItem) {
    if (this.conversationSteps == null) {
      this.conversationSteps = new ArrayList<ConversationStepSnapshot>();
    }
    this.conversationSteps.add(conversationStepsItem);
    return this;
  }

   /**
   * Get conversationSteps
   * @return conversationSteps
  **/
  @ApiModelProperty(value = "")
  public List<ConversationStepSnapshot> getConversationSteps() {
    return conversationSteps;
  }

  public void setConversationSteps(List<ConversationStepSnapshot> conversationSteps) {
    this.conversationSteps = conversationSteps;
  }

  public ConversationMemorySnapshot redoCache(List<ConversationStepSnapshot> redoCache) {
    this.redoCache = redoCache;
    return this;
  }

  public ConversationMemorySnapshot addRedoCacheItem(ConversationStepSnapshot redoCacheItem) {
    if (this.redoCache == null) {
      this.redoCache = new ArrayList<ConversationStepSnapshot>();
    }
    this.redoCache.add(redoCacheItem);
    return this;
  }

   /**
   * Get redoCache
   * @return redoCache
  **/
  @ApiModelProperty(value = "")
  public List<ConversationStepSnapshot> getRedoCache() {
    return redoCache;
  }

  public void setRedoCache(List<ConversationStepSnapshot> redoCache) {
    this.redoCache = redoCache;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMemorySnapshot conversationMemorySnapshot = (ConversationMemorySnapshot) o;
    return Objects.equals(this.id, conversationMemorySnapshot.id) &&
        Objects.equals(this.botId, conversationMemorySnapshot.botId) &&
        Objects.equals(this.botVersion, conversationMemorySnapshot.botVersion) &&
        Objects.equals(this.environment, conversationMemorySnapshot.environment) &&
        Objects.equals(this.conversationState, conversationMemorySnapshot.conversationState) &&
        Objects.equals(this.conversationSteps, conversationMemorySnapshot.conversationSteps) &&
        Objects.equals(this.redoCache, conversationMemorySnapshot.redoCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, botId, botVersion, environment, conversationState, conversationSteps, redoCache);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMemorySnapshot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    botVersion: ").append(toIndentedString(botVersion)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    conversationState: ").append(toIndentedString(conversationState)).append("\n");
    sb.append("    conversationSteps: ").append(toIndentedString(conversationSteps)).append("\n");
    sb.append("    redoCache: ").append(toIndentedString(redoCache)).append("\n");
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

