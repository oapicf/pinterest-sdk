/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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
import org.openapitools.model.OrderLineError;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OrderLineResponse
 */
@JsonPropertyOrder({
  OrderLineResponse.JSON_PROPERTY_ERRORS,
  OrderLineResponse.JSON_PROPERTY_ORDER_LINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderLineResponse   {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  @JsonProperty(JSON_PROPERTY_ERRORS)
  private List<OrderLineError> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_ORDER_LINE = "order_line";
  @JsonProperty(JSON_PROPERTY_ORDER_LINE)
  private List<OrderLine> orderLine = new ArrayList<>();

  public OrderLineResponse errors(List<OrderLineError> errors) {
    this.errors = errors;
    return this;
  }

  public OrderLineResponse addErrorsItem(OrderLineError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Error list if update(s) fail.
   * @return errors
   **/
  @JsonProperty(value = "errors")
  @ApiModelProperty(value = "Error list if update(s) fail.")
  @Valid 
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
      this.orderLine = new ArrayList<>();
    }
    this.orderLine.add(orderLineItem);
    return this;
  }

  /**
   * Order Line object array.
   * @return orderLine
   **/
  @JsonProperty(value = "order_line")
  @ApiModelProperty(value = "Order Line object array.")
  @Valid 
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

