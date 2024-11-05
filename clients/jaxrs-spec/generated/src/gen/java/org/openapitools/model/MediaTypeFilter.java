package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("MediaTypeFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MediaTypeFilter   {
  private CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;

  /**
   **/
  public MediaTypeFilter MEDIA_TYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MEDIA_TYPE")
  @NotNull @Valid public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }

  @JsonProperty("MEDIA_TYPE")
  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaTypeFilter mediaTypeFilter = (MediaTypeFilter) o;
    return Objects.equals(this.MEDIA_TYPE, mediaTypeFilter.MEDIA_TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MEDIA_TYPE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaTypeFilter {\n");
    
    sb.append("    MEDIA_TYPE: ").append(toIndentedString(MEDIA_TYPE)).append("\n");
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

