package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineMutationError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrderLineMutationResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrderLineMutationResult   {
  private @Valid List<@Valid OrderLineMutationError> errors = new ArrayList<>();
  private @Valid List<@Valid OrderLine> orderLine = new ArrayList<>();

  public OrderLineMutationResult() {
  }

  /**
   * Error list if update(s) fail.
   **/
  public OrderLineMutationResult errors(List<@Valid OrderLineMutationError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Error list if update(s) fail.")
  @JsonProperty("errors")
  @Valid public List<@Valid OrderLineMutationError> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid OrderLineMutationError> errors) {
    this.errors = errors;
  }

  public OrderLineMutationResult addErrorsItem(OrderLineMutationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public OrderLineMutationResult removeErrorsItem(OrderLineMutationError errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * Order Line object array.
   **/
  public OrderLineMutationResult orderLine(List<@Valid OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  
  @ApiModelProperty(value = "Order Line object array.")
  @JsonProperty("order_line")
  @Valid public List<@Valid OrderLine> getOrderLine() {
    return orderLine;
  }

  @JsonProperty("order_line")
  public void setOrderLine(List<@Valid OrderLine> orderLine) {
    this.orderLine = orderLine;
  }

  public OrderLineMutationResult addOrderLineItem(OrderLine orderLineItem) {
    if (this.orderLine == null) {
      this.orderLine = new ArrayList<>();
    }

    this.orderLine.add(orderLineItem);
    return this;
  }

  public OrderLineMutationResult removeOrderLineItem(OrderLine orderLineItem) {
    if (orderLineItem != null && this.orderLine != null) {
      this.orderLine.remove(orderLineItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
