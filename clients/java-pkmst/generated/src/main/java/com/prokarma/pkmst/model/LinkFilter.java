package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LinkFilter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LinkFilter   {
  @JsonProperty("LINK")
  private CatalogsProductGroupFilterOperatorTypeCriteria LINK;

  public LinkFilter LINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
    return this;
  }

  /**
   * Get LINK
   * @return LINK
   */
  @ApiModelProperty(required = true, value = "")
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

