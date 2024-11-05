package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CreativeAssetsVisibilityType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Creative assets product metadata entity
 */

@Schema(name = "CatalogsCreativeAssetsProductMetadata", description = "Creative assets product metadata entity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsProductMetadata {

  private String creativeAssetsId;

  private CreativeAssetsVisibilityType visibility;

  public CatalogsCreativeAssetsProductMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsProductMetadata(String creativeAssetsId, CreativeAssetsVisibilityType visibility) {
    this.creativeAssetsId = creativeAssetsId;
    this.visibility = visibility;
  }

  public CatalogsCreativeAssetsProductMetadata creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  /**
   * The user-created unique ID that represents the creative assets item.
   * @return creativeAssetsId
   */
  @NotNull 
  @Schema(name = "creative_assets_id", example = "123abc", description = "The user-created unique ID that represents the creative assets item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsCreativeAssetsProductMetadata visibility(CreativeAssetsVisibilityType visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  @NotNull @Valid 
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("visibility")
  public CreativeAssetsVisibilityType getVisibility() {
    return visibility;
  }

  public void setVisibility(CreativeAssetsVisibilityType visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsProductMetadata catalogsCreativeAssetsProductMetadata = (CatalogsCreativeAssetsProductMetadata) o;
    return Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsProductMetadata.creativeAssetsId) &&
        Objects.equals(this.visibility, catalogsCreativeAssetsProductMetadata.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductMetadata {\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

