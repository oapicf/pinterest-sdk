package org.openapitools.model;

import org.openapitools.model.Exception;
import org.openapitools.model.Promotion;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PromotionArrayElement  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Promotion data;

  @ApiModelProperty(value = "")
  @Valid
  private Exception exception;
 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  public Promotion getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(Promotion data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public PromotionArrayElement data(Promotion data) {
    this.data = data;
    return this;
  }

 /**
  * Get exception
  * @return exception
  */
  @JsonProperty("exception")
  public Exception getException() {
    return exception;
  }

  /**
   * Sets the <code>exception</code> property.
   */
 public void setException(Exception exception) {
    this.exception = exception;
  }

  /**
   * Sets the <code>exception</code> property.
   */
  public PromotionArrayElement exception(Exception exception) {
    this.exception = exception;
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
    PromotionArrayElement promotionArrayElement = (PromotionArrayElement) o;
    return Objects.equals(this.data, promotionArrayElement.data) &&
        Objects.equals(this.exception, promotionArrayElement.exception);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

