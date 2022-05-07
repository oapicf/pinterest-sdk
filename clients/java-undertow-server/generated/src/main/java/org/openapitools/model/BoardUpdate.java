/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Board fields for updates
 */

@ApiModel(description = "Board fields for updates")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-07T06:40:09.212272Z[Etc/UTC]")
public class BoardUpdate   {
  
  private String name;
  private String description;


  public enum PrivacyEnum {
    PUBLIC("PUBLIC"),
    SECRET("SECRET");

    private String value;

    PrivacyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PrivacyEnum privacy;

  /**
   */
  public BoardUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Summer Recipes", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public BoardUpdate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   */
  public BoardUpdate privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("privacy")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }
  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardUpdate boardUpdate = (BoardUpdate) o;
    return Objects.equals(name, boardUpdate.name) &&
        Objects.equals(description, boardUpdate.description) &&
        Objects.equals(privacy, boardUpdate.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

