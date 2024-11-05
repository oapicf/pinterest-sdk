package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CreativeAssetsVisibilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Creative assets product metadata entity
 **/
@ApiModel(description="Creative assets product metadata entity")

public class CatalogsCreativeAssetsProductMetadata  {
  
  @ApiModelProperty(example = "123abc", required = true, value = "The user-created unique ID that represents the creative assets item.")
 /**
   * The user-created unique ID that represents the creative assets item.
  **/
  private String creativeAssetsId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreativeAssetsVisibilityType visibility;
 /**
   * The user-created unique ID that represents the creative assets item.
   * @return creativeAssetsId
  **/
  @JsonProperty("creative_assets_id")
  @NotNull
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsCreativeAssetsProductMetadata creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  @NotNull
  public CreativeAssetsVisibilityType getVisibility() {
    return visibility;
  }

  public void setVisibility(CreativeAssetsVisibilityType visibility) {
    this.visibility = visibility;
  }

  public CatalogsCreativeAssetsProductMetadata visibility(CreativeAssetsVisibilityType visibility) {
    this.visibility = visibility;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

