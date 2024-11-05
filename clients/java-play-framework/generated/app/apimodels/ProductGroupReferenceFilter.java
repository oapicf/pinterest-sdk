package apimodels;

import apimodels.CatalogsProductGroupMultipleStringCriteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProductGroupReferenceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductGroupReferenceFilter   {
  @JsonProperty("PRODUCT_GROUP")
  @NotNull
@Valid

  private CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP;

  public ProductGroupReferenceFilter PRODUCT_GROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
    return this;
  }

   /**
   * Get PRODUCT_GROUP
   * @return PRODUCT_GROUP
  **/
  public CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP() {
    return PRODUCT_GROUP;
  }

  public void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupReferenceFilter productGroupReferenceFilter = (ProductGroupReferenceFilter) o;
    return Objects.equals(PRODUCT_GROUP, productGroupReferenceFilter.PRODUCT_GROUP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_GROUP);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupReferenceFilter {\n");
    
    sb.append("    PRODUCT_GROUP: ").append(toIndentedString(PRODUCT_GROUP)).append("\n");
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

