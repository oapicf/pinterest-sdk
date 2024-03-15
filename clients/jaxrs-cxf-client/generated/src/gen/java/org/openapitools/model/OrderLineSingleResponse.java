package org.openapitools.model;

import org.openapitools.model.OrderLineResponse;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLineSingleResponse  {
  
  @ApiModelProperty(value = "")
  private OrderLineResponse data;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public OrderLineResponse getData() {
    return data;
  }

  public void setData(OrderLineResponse data) {
    this.data = data;
  }

  public OrderLineSingleResponse data(OrderLineResponse data) {
    this.data = data;
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
    OrderLineSingleResponse orderLineSingleResponse = (OrderLineSingleResponse) o;
    return Objects.equals(this.data, orderLineSingleResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineSingleResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

