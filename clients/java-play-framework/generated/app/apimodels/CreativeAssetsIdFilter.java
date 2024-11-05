package apimodels;

import apimodels.CatalogsProductGroupMultipleStringCriteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreativeAssetsIdFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreativeAssetsIdFilter   {
  @JsonProperty("CREATIVE_ASSETS_ID")
  @NotNull
@Valid

  private CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;

  public CreativeAssetsIdFilter CREATIVE_ASSETS_ID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
    return this;
  }

   /**
   * Get CREATIVE_ASSETS_ID
   * @return CREATIVE_ASSETS_ID
  **/
  public CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID() {
    return CREATIVE_ASSETS_ID;
  }

  public void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAssetsIdFilter creativeAssetsIdFilter = (CreativeAssetsIdFilter) o;
    return Objects.equals(CREATIVE_ASSETS_ID, creativeAssetsIdFilter.CREATIVE_ASSETS_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CREATIVE_ASSETS_ID);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeAssetsIdFilter {\n");
    
    sb.append("    CREATIVE_ASSETS_ID: ").append(toIndentedString(CREATIVE_ASSETS_ID)).append("\n");
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

