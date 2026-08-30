package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLineMutationError  {
  
  @ApiModelProperty(value = "")

  private OrderLine data;

 /**
  * Error messages.
  */
  @ApiModelProperty(value = "Error messages.")

  private List<String> errorMessages = new ArrayList<>();
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

  public OrderLineMutationError data(OrderLine data) {
    this.data = data;
    return this;
  }

 /**
   * Error messages.
   * @return errorMessages
  **/
  @JsonProperty("error_messages")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public OrderLineMutationError errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public OrderLineMutationError addErrorMessagesItem(String errorMessagesItem) {
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
    OrderLineMutationError orderLineMutationError = (OrderLineMutationError) o;
    return Objects.equals(this.data, orderLineMutationError.data) &&
        Objects.equals(this.errorMessages, orderLineMutationError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineMutationError {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

