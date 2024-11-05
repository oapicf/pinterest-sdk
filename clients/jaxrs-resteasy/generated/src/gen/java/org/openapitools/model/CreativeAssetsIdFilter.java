package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreativeAssetsIdFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CREATIVE_ASSETS_ID")
  @NotNull
  @Valid
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
    return Objects.equals(this.CREATIVE_ASSETS_ID, creativeAssetsIdFilter.CREATIVE_ASSETS_ID);
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

