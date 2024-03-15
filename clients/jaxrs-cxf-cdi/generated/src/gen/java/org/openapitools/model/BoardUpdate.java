package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Board fields for updates
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Board fields for updates")
public class BoardUpdate   {
  
  private String name;

  private String description;


public enum PrivacyEnum {

    @JsonProperty("PUBLIC") PUBLIC(String.valueOf("PUBLIC")), @JsonProperty("SECRET") SECRET(String.valueOf("SECRET"));


    private String value;

    PrivacyEnum(String v) {
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

  private PrivacyEnum privacy;

  /**
   **/
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
   **/
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
   **/
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
    return Objects.equals(this.name, boardUpdate.name) &&
        Objects.equals(this.description, boardUpdate.description) &&
        Objects.equals(this.privacy, boardUpdate.privacy);
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

