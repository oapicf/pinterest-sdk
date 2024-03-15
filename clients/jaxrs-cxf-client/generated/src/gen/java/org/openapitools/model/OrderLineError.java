package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLineError  {
  
  @ApiModelProperty(value = "")
  private OrderLine data;

  @ApiModelProperty(value = "")
  private List<String> errorMessages;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public OrderLine getData() {
    return data;
  }

  public void setData(OrderLine data) {
    this.data = data;
  }

  public OrderLineError data(OrderLine data) {
    this.data = data;
    return this;
  }

 /**
   * Get errorMessages
   * @return errorMessages
  **/
  @JsonProperty("error_messages")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public OrderLineError errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public OrderLineError addErrorMessagesItem(String errorMessagesItem) {
    this.errorMessages.add(errorMessagesItem);
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
    OrderLineError orderLineError = (OrderLineError) o;
    return Objects.equals(this.data, orderLineError.data) &&
        Objects.equals(this.errorMessages, orderLineError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineError {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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

