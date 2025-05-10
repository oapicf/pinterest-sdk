package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreativeAssetsVisibilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Creative assets product metadata entity
 **/
@ApiModel(description = "Creative assets product metadata entity")
@JsonTypeName("CatalogsCreativeAssetsProductMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T05:40:54.952063144Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CatalogsCreativeAssetsProductMetadata   {
  private String creativeAssetsId;
  private CreativeAssetsVisibilityType visibility;

  public CatalogsCreativeAssetsProductMetadata() {
  }

  @JsonCreator
  public CatalogsCreativeAssetsProductMetadata(
    @JsonProperty(required = true, value = "creative_assets_id") String creativeAssetsId,
    @JsonProperty(required = true, value = "visibility") CreativeAssetsVisibilityType visibility
  ) {
    this.creativeAssetsId = creativeAssetsId;
    this.visibility = visibility;
  }

  /**
   * The user-created unique ID that represents the creative assets item.
   **/
  public CatalogsCreativeAssetsProductMetadata creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  
  @ApiModelProperty(example = "123abc", required = true, value = "The user-created unique ID that represents the creative assets item.")
  @JsonProperty(required = true, value = "creative_assets_id")
  @NotNull public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  @JsonProperty(required = true, value = "creative_assets_id")
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductMetadata visibility(CreativeAssetsVisibilityType visibility) {
    this.visibility = visibility;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "visibility")
  @NotNull public CreativeAssetsVisibilityType getVisibility() {
    return visibility;
  }

  @JsonProperty(required = true, value = "visibility")
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

