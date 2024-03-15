package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrderLineError")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderLineError   {
  private @Valid OrderLine data;
  private @Valid List<String> errorMessages;

  /**
   **/
  public OrderLineError data(OrderLine data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public OrderLine getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(OrderLine data) {
    this.data = data;
  }

  /**
   **/
  public OrderLineError errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("error_messages")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  @JsonProperty("error_messages")
  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public OrderLineError addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }

    this.errorMessages.add(errorMessagesItem);
    return this;
  }

  public OrderLineError removeErrorMessagesItem(String errorMessagesItem) {
    if (errorMessagesItem != null && this.errorMessages != null) {
      this.errorMessages.remove(errorMessagesItem);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

