package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;

/**
 * TitleKeywordsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TitleKeywordsFilter   {
  @JsonProperty("TITLE_KEYWORDS")
  private CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

  public TitleKeywordsFilter TITLE_KEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    return this;
  }

   /**
   * Get TITLE_KEYWORDS
   * @return TITLE_KEYWORDS
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
    return TITLE_KEYWORDS;
  }

  public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitleKeywordsFilter titleKeywordsFilter = (TitleKeywordsFilter) o;
    return Objects.equals(this.TITLE_KEYWORDS, titleKeywordsFilter.TITLE_KEYWORDS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TITLE_KEYWORDS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitleKeywordsFilter {\n");
    
    sb.append("    TITLE_KEYWORDS: ").append(toIndentedString(TITLE_KEYWORDS)).append("\n");
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

