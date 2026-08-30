package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.BoardPrivacy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BoardCreate   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("is_ads_only")
  private Boolean isAdsOnly = false;

  @JsonProperty("name")
  private String name;

  @JsonProperty("privacy")
  private BoardPrivacy privacy;

  public BoardCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BoardCreate isAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
    return this;
  }

  /**
   * If set to `true`, the board will be ad-only and can store ad-only Pins.
   * @return isAdsOnly
   */
  @ApiModelProperty(example = "true", value = "If set to `true`, the board will be ad-only and can store ad-only Pins.")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }

  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  public BoardCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   * @return name
   */
  @ApiModelProperty(example = "Summer recipes", required = true, value = "    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardCreate privacy(BoardPrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
   * @return privacy
   */
  @ApiModelProperty(value = "    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. ")
  public BoardPrivacy getPrivacy() {
    return privacy;
  }

  public void setPrivacy(BoardPrivacy privacy) {
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
    BoardCreate boardCreate = (BoardCreate) o;
    return Objects.equals(this.description, boardCreate.description) &&
        Objects.equals(this.isAdsOnly, boardCreate.isAdsOnly) &&
        Objects.equals(this.name, boardCreate.name) &&
        Objects.equals(this.privacy, boardCreate.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isAdsOnly, name, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardCreate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isAdsOnly: ").append(toIndentedString(isAdsOnly)).append("\n");
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

