package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardUpdatePrivacy;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create or update operation model.
 */
@ApiModel(description="Resource create or update operation model.")

public class BoardWithUpdatePrivacyUpdate  {
  
  @ApiModelProperty(example = "My favorite summer recipes", value = "")

  private String description;

 /**
  *      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  */
  @ApiModelProperty(example = "Summer recipes", value = "     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private BoardUpdatePrivacy privacy;
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

  public BoardWithUpdatePrivacyUpdate description(String description) {
    this.description = description;
    return this;
  }

 /**
   *      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardWithUpdatePrivacyUpdate name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get privacy
   * @return privacy
  **/
  @JsonProperty("privacy")
  public BoardUpdatePrivacy getPrivacy() {
    return privacy;
  }

  public void setPrivacy(BoardUpdatePrivacy privacy) {
    this.privacy = privacy;
  }

  public BoardWithUpdatePrivacyUpdate privacy(BoardUpdatePrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate = (BoardWithUpdatePrivacyUpdate) o;
    return Objects.equals(this.description, boardWithUpdatePrivacyUpdate.description) &&
        Objects.equals(this.name, boardWithUpdatePrivacyUpdate.name) &&
        Objects.equals(this.privacy, boardWithUpdatePrivacyUpdate.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardWithUpdatePrivacyUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

