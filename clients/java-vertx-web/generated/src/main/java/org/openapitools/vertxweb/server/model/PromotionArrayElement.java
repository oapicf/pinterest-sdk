package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Exception;
import org.openapitools.vertxweb.server.model.PromotionResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionArrayElement   {
  
  private PromotionResponse data;
  private Exception exception;

  public PromotionArrayElement () {

  }

  public PromotionArrayElement (PromotionResponse data, Exception exception) {
    this.data = data;
    this.exception = exception;
  }

    
  @JsonProperty("data")
  public PromotionResponse getData() {
    return data;
  }
  public void setData(PromotionResponse data) {
    this.data = data;
  }

    
  @JsonProperty("exception")
  public Exception getException() {
    return exception;
  }
  public void setException(Exception exception) {
    this.exception = exception;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionArrayElement promotionArrayElement = (PromotionArrayElement) o;
    return Objects.equals(data, promotionArrayElement.data) &&
        Objects.equals(exception, promotionArrayElement.exception);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exception);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionArrayElement {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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
