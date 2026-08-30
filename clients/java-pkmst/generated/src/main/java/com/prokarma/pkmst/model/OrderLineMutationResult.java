package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OrderLine;
import com.prokarma.pkmst.model.OrderLineMutationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrderLineMutationResult
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrderLineMutationResult   {
  @JsonProperty("errors")
  
  private List<OrderLineMutationError> errors = null;

  @JsonProperty("order_line")
  
  private List<OrderLine> orderLine = null;

  public OrderLineMutationResult errors(List<OrderLineMutationError> errors) {
    this.errors = errors;
    return this;
  }

  public OrderLineMutationResult addErrorsItem(OrderLineMutationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Error list if update(s) fail.
   * @return errors
   */
  @ApiModelProperty(value = "Error list if update(s) fail.")
  public List<OrderLineMutationError> getErrors() {
    return errors;
  }

  public void setErrors(List<OrderLineMutationError> errors) {
    this.errors = errors;
  }

  public OrderLineMutationResult orderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  public OrderLineMutationResult addOrderLineItem(OrderLine orderLineItem) {
    if (this.orderLine == null) {
      this.orderLine = new ArrayList<>();
    }
    this.orderLine.add(orderLineItem);
    return this;
  }

  /**
   * Order Line object array.
   * @return orderLine
   */
  @ApiModelProperty(value = "Order Line object array.")
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

