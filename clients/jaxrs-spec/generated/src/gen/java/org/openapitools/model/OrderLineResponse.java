package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrderLineResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderLineResponse   {
  private @Valid List<OrderLineError> errors;
  private @Valid List<OrderLine> orderLine;

  /**
   * Error list if update(s) fail.
   **/
  public OrderLineResponse errors(List<OrderLineError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Error list if update(s) fail.")
  @JsonProperty("errors")
  public List<OrderLineError> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<OrderLineError> errors) {
    this.errors = errors;
  }

  public OrderLineResponse addErrorsItem(OrderLineError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public OrderLineResponse removeErrorsItem(OrderLineError errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * Order Line object array.
   **/
  public OrderLineResponse orderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  
  @ApiModelProperty(value = "Order Line object array.")
  @JsonProperty("order_line")
  public List<OrderLine> getOrderLine() {
    return orderLine;
  }

  @JsonProperty("order_line")
  public void setOrderLine(List<OrderLine> orderLine) {
    this.orderLine = orderLine;
  }

  public OrderLineResponse addOrderLineItem(OrderLine orderLineItem) {
    if (this.orderLine == null) {
      this.orderLine = new ArrayList<>();
    }

    this.orderLine.add(orderLineItem);
    return this;
  }

  public OrderLineResponse removeOrderLineItem(OrderLine orderLineItem) {
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

