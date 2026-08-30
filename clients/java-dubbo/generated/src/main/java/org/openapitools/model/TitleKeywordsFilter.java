package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TitleKeywordsFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("TITLE_KEYWORDS")
  private CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

  /**
   * 
   * @return TITLE_KEYWORDS
   */
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
