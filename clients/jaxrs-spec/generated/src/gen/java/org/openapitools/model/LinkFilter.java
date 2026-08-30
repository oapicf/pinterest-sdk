package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LinkFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LinkFilter   {
  private CatalogsProductGroupFilterOperatorTypeCriteria LINK;

  public LinkFilter() {
  }

  @JsonCreator
  public LinkFilter(
    @JsonProperty(required = true, value = "LINK") CatalogsProductGroupFilterOperatorTypeCriteria LINK
  ) {
    this.LINK = LINK;
  }

  /**
   **/
  public LinkFilter LINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "LINK")
  @NotNull @Valid public CatalogsProductGroupFilterOperatorTypeCriteria getLINK() {
    return LINK;
  }

  @JsonProperty(required = true, value = "LINK")
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
