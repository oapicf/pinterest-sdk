package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.OrderLineResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderLineSingleResponse   {
  
  private OrderLineResponse data;

  public OrderLineSingleResponse () {

  }

  public OrderLineSingleResponse (OrderLineResponse data) {
    this.data = data;
  }

    
  @JsonProperty("data")
  public OrderLineResponse getData() {
    return data;
  }
  public void setData(OrderLineResponse data) {
    this.data = data;
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
    return Objects.equals(data, orderLineSingleResponse.data);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
