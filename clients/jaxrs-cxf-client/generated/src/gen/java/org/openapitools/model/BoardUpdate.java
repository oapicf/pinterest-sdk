package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Board fields for updates
 **/
@ApiModel(description="Board fields for updates")
public class BoardUpdate  {
  
  @ApiModelProperty(example = "Summer Recipes", value = "")
  private String name;

  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  private String description;

public enum PrivacyEnum {

PUBLIC(String.valueOf("PUBLIC")), SECRET(String.valueOf("SECRET"));


    private String value;

    PrivacyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PrivacyEnum fromValue(String value) {
        for (PrivacyEnum b : PrivacyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private PrivacyEnum privacy;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardUpdate name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BoardUpdate description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get privacy
   * @return privacy
  **/
  @JsonProperty("privacy")
  public String getPrivacy() {
    if (privacy == null) {
      return null;
    }
    return privacy.value();
  }

  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  public BoardUpdate privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

