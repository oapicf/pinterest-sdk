package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoogleProductCategory3Filter   {
  
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;

  public GoogleProductCategory3Filter () {

  }

  public GoogleProductCategory3Filter (CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }

    
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }
  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProductCategory3Filter googleProductCategory3Filter = (GoogleProductCategory3Filter) o;
    return Objects.equals(GOOGLE_PRODUCT_CATEGORY_3, googleProductCategory3Filter.GOOGLE_PRODUCT_CATEGORY_3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory3Filter {\n");
    
    sb.append("    GOOGLE_PRODUCT_CATEGORY_3: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_3)).append("\n");
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
