package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineMutationError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLineMutationResult  {
  
 /**
  * Error list if update(s) fail.
  */
  @ApiModelProperty(value = "Error list if update(s) fail.")

  @Valid

  private List<@Valid OrderLineMutationError> errors = new ArrayList<>();

 /**
  * Order Line object array.
  */
  @ApiModelProperty(value = "Order Line object array.")

  @Valid

  private List<@Valid OrderLine> orderLine = new ArrayList<>();
 /**
   * Error list if update(s) fail.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<@Valid OrderLineMutationError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid OrderLineMutationError> errors) {
    this.errors = errors;
  }

  public OrderLineMutationResult errors(List<@Valid OrderLineMutationError> errors) {
    this.errors = errors;
    return this;
  }

  public OrderLineMutationResult addErrorsItem(OrderLineMutationError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Order Line object array.
   * @return orderLine
  **/
  @JsonProperty("order_line")
  public List<@Valid OrderLine> getOrderLine() {
    return orderLine;
  }

  public void setOrderLine(List<@Valid OrderLine> orderLine) {
    this.orderLine = orderLine;
  }

  public OrderLineMutationResult orderLine(List<@Valid OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  public OrderLineMutationResult addOrderLineItem(OrderLine orderLineItem) {
    this.orderLine.add(orderLineItem);
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

