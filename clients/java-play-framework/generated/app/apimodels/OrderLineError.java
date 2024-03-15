package apimodels;

import apimodels.OrderLine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrderLineError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderLineError   {
  @JsonProperty("data")
  @Valid

  private OrderLine data;

  @JsonProperty("error_messages")
  
  private List<String> errorMessages = null;

  public OrderLineError data(OrderLine data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public OrderLine getData() {
    return data;
  }

  public void setData(OrderLine data) {
    this.data = data;
  }

  public OrderLineError errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public OrderLineError addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * Get errorMessages
   * @return errorMessages
  **/
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
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
    return Objects.equals(data, orderLineError.data) &&
        Objects.equals(errorMessages, orderLineError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorMessages);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

