package org.openapitools.model;

import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineMutationError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrderLineMutationResult implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Error list if update(s) fail.
   */
  @JsonProperty("errors")
  private List<OrderLineMutationError> errors = new ArrayList<>();

  /**
   * Order Line object array.
   */
  @JsonProperty("order_line")
  private List<OrderLine> orderLine = new ArrayList<>();

  /**
   * Error list if update(s) fail.
   * @return errors
   */
  public List<OrderLineMutationError> getErrors() {
    return errors;
  }

  public void setErrors(List<OrderLineMutationError> errors) {
    this.errors = errors;
  }

  /**
   * Order Line object array.
   * @return orderLine
   */
  public List<OrderLine> getOrderLine() {
    return orderLine;
  }

  public void setOrderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineMutationResult orderLineMutationResult = (OrderLineMutationResult) o;
    return Objects.equals(this.errors, orderLineMutationResult.errors) &&
        Objects.equals(this.orderLine, orderLineMutationResult.orderLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, orderLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineMutationResult {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
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
