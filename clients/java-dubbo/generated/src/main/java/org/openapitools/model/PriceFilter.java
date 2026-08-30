package org.openapitools.model;

import org.openapitools.model.PriceFilterPrice;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PriceFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("PRICE")
  private PriceFilterPrice PRICE;

  /**
   * 
   * @return PRICE
   */
  public PriceFilterPrice getPRICE() {
    return PRICE;
  }

  public void setPRICE(PriceFilterPrice PRICE) {
    this.PRICE = PRICE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceFilter priceFilter = (PriceFilter) o;
    return Objects.equals(this.PRICE, priceFilter.PRICE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRICE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceFilter {\n");
    
    sb.append("    PRICE: ").append(toIndentedString(PRICE)).append("\n");
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
