package apimodels;

import apimodels.CreativeAssetsVisibilityType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Creative assets product metadata entity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsCreativeAssetsProductMetadata   {
  @JsonProperty("creative_assets_id")
  @NotNull

  private String creativeAssetsId;

  @JsonProperty("visibility")
  @NotNull
@Valid

  private CreativeAssetsVisibilityType visibility;

  public CatalogsCreativeAssetsProductMetadata creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

   /**
   * The user-created unique ID that represents the creative assets item.
   * @return creativeAssetsId
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

