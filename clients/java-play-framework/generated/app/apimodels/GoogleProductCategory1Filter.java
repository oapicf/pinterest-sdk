package apimodels;

import apimodels.CatalogsProductGroupMultipleStringListCriteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GoogleProductCategory1Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoogleProductCategory1Filter   {
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  @NotNull
@Valid

  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;

  public GoogleProductCategory1Filter GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

   /**
   * Get GOOGLE_PRODUCT_CATEGORY_1
   * @return GOOGLE_PRODUCT_CATEGORY_1
  **/
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }

  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProductCategory1Filter googleProductCategory1Filter = (GoogleProductCategory1Filter) o;
    return Objects.equals(GOOGLE_PRODUCT_CATEGORY_1, googleProductCategory1Filter.GOOGLE_PRODUCT_CATEGORY_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_1);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory1Filter {\n");
    
    sb.append("    GOOGLE_PRODUCT_CATEGORY_1: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_1)).append("\n");
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

