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
import org.openapitools.model.OrderLineError;

/**
 * OrderLineResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderLineResponse   {
  @JsonProperty("errors")
  private List<OrderLineError> errors = null;

  @JsonProperty("order_line")
  private List<OrderLine> orderLine = null;

  public OrderLineResponse errors(List<OrderLineError> errors) {
    this.errors = errors;
    return this;
  }

  public OrderLineResponse addErrorsItem(OrderLineError errorsItem) {
    if (this.errors == null) {
      this.errors = ;
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error list if update(s) fail.
   * @return errors
  **/
  @ApiModelProperty(value = "Error list if update(s) fail.")
  public List<OrderLineError> getErrors() {
    return errors;
  }

  public void setErrors(List<OrderLineError> errors) {
    this.errors = errors;
  }

  public OrderLineResponse orderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  public OrderLineResponse addOrderLineItem(OrderLine orderLineItem) {
    if (this.orderLine == null) {
      this.orderLine = ;
    }
    this.orderLine.add(orderLineItem);
    return this;
  }

   /**
   * Order Line object array.
   * @return orderLine
  **/
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

