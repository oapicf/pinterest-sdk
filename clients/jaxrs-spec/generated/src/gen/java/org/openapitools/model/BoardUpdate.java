package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Board fields for updates
 **/
@ApiModel(description = "Board fields for updates")
@JsonTypeName("BoardUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BoardUpdate   {
  private @Valid String name;
  private @Valid String description;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static PrivacyEnum fromString(String s) {
        for (PrivacyEnum b : PrivacyEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static PrivacyEnum fromValue(String value) {
        for (PrivacyEnum b : PrivacyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid PrivacyEnum privacy;

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

  @JsonProperty("name")
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

  @JsonProperty("description")
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

  @JsonProperty("privacy")
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

