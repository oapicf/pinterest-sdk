package org.openapitools.model;

import org.openapitools.model.OrderLineMutationResult;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLineMutationResponse  {
  
  @ApiModelProperty(value = "")

  private OrderLineMutationResult data;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public OrderLineMutationResult getData() {
    return data;
  }

  public void setData(OrderLineMutationResult data) {
    this.data = data;
  }

  public OrderLineMutationResponse data(OrderLineMutationResult data) {
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
    OrderLineMutationResponse orderLineMutationResponse = (OrderLineMutationResponse) o;
    return Objects.equals(this.data, orderLineMutationResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineMutationResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

