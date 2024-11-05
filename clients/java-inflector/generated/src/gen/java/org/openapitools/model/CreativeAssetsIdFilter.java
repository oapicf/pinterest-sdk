package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreativeAssetsIdFilter   {
  @JsonProperty("CREATIVE_ASSETS_ID")
  private CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;

  /**
   **/
  public CreativeAssetsIdFilter CREATIVE_ASSETS_ID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
    this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CREATIVE_ASSETS_ID")
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

