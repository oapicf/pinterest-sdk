package org.openapitools.model;

import org.openapitools.model.OrderLineResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLineSingleResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OrderLineResponse data;
 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  public OrderLineResponse getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(OrderLineResponse data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
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

