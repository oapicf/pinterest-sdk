package org.openapitools.model;

import org.openapitools.model.AdResponse;
import org.openapitools.model.Exception;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdArrayResponseElement  {
  
  @ApiModelProperty(value = "")
  private AdResponse data;

  @ApiModelProperty(value = "")
  private Exception exceptions;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public AdResponse getData() {
    return data;
  }

  public void setData(AdResponse data) {
    this.data = data;
  }

  public AdArrayResponseElement data(AdResponse data) {
    this.data = data;
    return this;
  }

 /**
   * Get exceptions
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public Exception getExceptions() {
    return exceptions;
  }

  public void setExceptions(Exception exceptions) {
    this.exceptions = exceptions;
  }

  public AdArrayResponseElement exceptions(Exception exceptions) {
    this.exceptions = exceptions;
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
    AdArrayResponseElement adArrayResponseElement = (AdArrayResponseElement) o;
    return Objects.equals(this.data, adArrayResponseElement.data) &&
        Objects.equals(this.exceptions, adArrayResponseElement.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdArrayResponseElement {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

