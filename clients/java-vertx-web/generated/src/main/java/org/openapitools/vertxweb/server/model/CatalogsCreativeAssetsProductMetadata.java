package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CreativeAssetsVisibilityType;

/**
 * Creative assets product metadata entity
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsProductMetadata   {
  
  private String creativeAssetsId;
  private CreativeAssetsVisibilityType visibility;

  public CatalogsCreativeAssetsProductMetadata () {

  }

  public CatalogsCreativeAssetsProductMetadata (String creativeAssetsId, CreativeAssetsVisibilityType visibility) {
    this.creativeAssetsId = creativeAssetsId;
    this.visibility = visibility;
  }

    
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

    
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
    return Objects.equals(creativeAssetsId, catalogsCreativeAssetsProductMetadata.creativeAssetsId) &&
        Objects.equals(visibility, catalogsCreativeAssetsProductMetadata.visibility);
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
