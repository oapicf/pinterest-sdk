package apimodels;

import apimodels.CatalogsProductGroupFilterOperatorTypeCriteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LinkFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LinkFilter   {
  @JsonProperty("LINK")
  @NotNull
@Valid

  private CatalogsProductGroupFilterOperatorTypeCriteria LINK;

  public LinkFilter LINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
    this.LINK = LINK;
    return this;
  }

   /**
   * Get LINK
   * @return LINK
  **/
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
    return Objects.equals(LINK, linkFilter.LINK);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LINK);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

