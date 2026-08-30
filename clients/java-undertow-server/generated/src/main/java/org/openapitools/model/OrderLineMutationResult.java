/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineMutationError;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrderLineMutationResult   {
  
  private List<OrderLineMutationError> errors = new ArrayList<>();
  private List<OrderLine> orderLine = new ArrayList<>();

  /**
   * Error list if update(s) fail.
   */
  public OrderLineMutationResult errors(List<OrderLineMutationError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Error list if update(s) fail.")
  @JsonProperty("errors")
  public List<OrderLineMutationError> getErrors() {
    return errors;
  }
  public void setErrors(List<OrderLineMutationError> errors) {
    this.errors = errors;
  }

  /**
   * Order Line object array.
   */
  public OrderLineMutationResult orderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  
  @ApiModelProperty(value = "Order Line object array.")
  @JsonProperty("order_line")
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
    return Objects.equals(errors, orderLineMutationResult.errors) &&
        Objects.equals(orderLine, orderLineMutationResult.orderLine);
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

