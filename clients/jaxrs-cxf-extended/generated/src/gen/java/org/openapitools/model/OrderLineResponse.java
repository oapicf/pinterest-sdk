package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLineResponse  {
  
 /**
  * Error list if update(s) fail.
  */
  @ApiModelProperty(value = "Error list if update(s) fail.")
  @Valid
  private List<OrderLineError> errors = new ArrayList<>();

 /**
  * Order Line object array.
  */
  @ApiModelProperty(value = "Order Line object array.")
  @Valid
  private List<OrderLine> orderLine = new ArrayList<>();
 /**
  * Error list if update(s) fail.
  * @return errors
  */
  @JsonProperty("errors")
  public List<OrderLineError> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<OrderLineError> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public OrderLineResponse errors(List<OrderLineError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public OrderLineResponse addErrorsItem(OrderLineError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Order Line object array.
  * @return orderLine
  */
  @JsonProperty("order_line")
  public List<OrderLine> getOrderLine() {
    return orderLine;
  }

  /**
   * Sets the <code>orderLine</code> property.
   */
 public void setOrderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
  }

  /**
   * Sets the <code>orderLine</code> property.
   */
  public OrderLineResponse orderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  /**
   * Adds a new item to the <code>orderLine</code> list.
   */
  public OrderLineResponse addOrderLineItem(OrderLine orderLineItem) {
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
    OrderLineResponse orderLineResponse = (OrderLineResponse) o;
    return Objects.equals(this.errors, orderLineResponse.errors) &&
        Objects.equals(this.orderLine, orderLineResponse.orderLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, orderLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

