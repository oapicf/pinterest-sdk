package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.OrderLine;
import org.openapitools.server.api.model.OrderLineError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderLineResponse   {
  
  private List<OrderLineError> errors = new ArrayList<>();
  private List<OrderLine> orderLine = new ArrayList<>();

  public OrderLineResponse () {

  }

  public OrderLineResponse (List<OrderLineError> errors, List<OrderLine> orderLine) {
    this.errors = errors;
    this.orderLine = orderLine;
  }

    
  @JsonProperty("errors")
  public List<OrderLineError> getErrors() {
    return errors;
  }
  public void setErrors(List<OrderLineError> errors) {
    this.errors = errors;
  }

    
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
    OrderLineResponse orderLineResponse = (OrderLineResponse) o;
    return Objects.equals(errors, orderLineResponse.errors) &&
        Objects.equals(orderLine, orderLineResponse.orderLine);
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
