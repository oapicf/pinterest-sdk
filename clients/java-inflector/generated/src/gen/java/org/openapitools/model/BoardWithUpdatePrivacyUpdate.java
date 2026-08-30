package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardUpdatePrivacy;



/**
 * Resource create or update operation model.
 **/

@ApiModel(description = "Resource create or update operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BoardWithUpdatePrivacyUpdate   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("privacy")
  private BoardUpdatePrivacy privacy;

  /**
   **/
  public BoardWithUpdatePrivacyUpdate description(String description) {
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
   *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   **/
  public BoardWithUpdatePrivacyUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Summer recipes", value = "    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BoardWithUpdatePrivacyUpdate privacy(BoardUpdatePrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("privacy")
  public BoardUpdatePrivacy getPrivacy() {
    return privacy;
  }
  public void setPrivacy(BoardUpdatePrivacy privacy) {
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
    BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate = (BoardWithUpdatePrivacyUpdate) o;
    return Objects.equals(description, boardWithUpdatePrivacyUpdate.description) &&
        Objects.equals(name, boardWithUpdatePrivacyUpdate.name) &&
        Objects.equals(privacy, boardWithUpdatePrivacyUpdate.privacy);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

