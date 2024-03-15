package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.Exception;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupArrayResponseElement  {
  
  @ApiModelProperty(value = "")
  private AdGroupResponse data;

  @ApiModelProperty(value = "")
  private List<Exception> exceptions;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public AdGroupResponse getData() {
    return data;
  }

  public void setData(AdGroupResponse data) {
    this.data = data;
  }

  public AdGroupArrayResponseElement data(AdGroupResponse data) {
    this.data = data;
    return this;
  }

 /**
   * Get exceptions
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<Exception> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public AdGroupArrayResponseElement exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public AdGroupArrayResponseElement addExceptionsItem(Exception exceptionsItem) {
    this.exceptions.add(exceptionsItem);
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
    AdGroupArrayResponseElement adGroupArrayResponseElement = (AdGroupArrayResponseElement) o;
    return Objects.equals(this.data, adGroupArrayResponseElement.data) &&
        Objects.equals(this.exceptions, adGroupArrayResponseElement.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupArrayResponseElement {\n");
    
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

