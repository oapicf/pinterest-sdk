package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;

/**
 * ProductType0Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-07T06:39:19.282212Z[Etc/UTC]")
public class ProductType0Filter   {
  @JsonProperty("PRODUCT_TYPE_0")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0;

  public ProductType0Filter PRODUCT_TYPE_0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    return this;
  }

   /**
   * Get PRODUCT_TYPE_0
   * @return PRODUCT_TYPE_0
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }

  public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType0Filter productType0Filter = (ProductType0Filter) o;
    return Objects.equals(this.PRODUCT_TYPE_0, productType0Filter.PRODUCT_TYPE_0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_TYPE_0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType0Filter {\n");
    
    sb.append("    PRODUCT_TYPE_0: ").append(toIndentedString(PRODUCT_TYPE_0)).append("\n");
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

