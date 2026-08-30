package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class LinkFilter   {
  
  private CatalogsProductGroupFilterOperatorTypeCriteria LINK;

  /**
   **/
  public LinkFilter LINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("LINK")
  @NotNull
  public CatalogsProductGroupFilterOperatorTypeCriteria getLINK() {
    return LINK;
  }
  public void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkFilter linkFilter = (LinkFilter) o;
    return Objects.equals(this.LINK, linkFilter.LINK);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LINK);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkFilter {\n");
    
    sb.append("    LINK: ").append(toIndentedString(LINK)).append("\n");
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

