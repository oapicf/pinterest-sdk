package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Exception;
import org.openapitools.model.LeadFormResponse;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadFormArrayResponseItemsInner  {
  
  @ApiModelProperty(value = "")
  private LeadFormResponse data;

  @ApiModelProperty(value = "")
  private List<Exception> exceptions = new ArrayList<>();
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public LeadFormResponse getData() {
    return data;
  }

  public void setData(LeadFormResponse data) {
    this.data = data;
  }

  public LeadFormArrayResponseItemsInner data(LeadFormResponse data) {
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

  public LeadFormArrayResponseItemsInner exceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public LeadFormArrayResponseItemsInner addExceptionsItem(Exception exceptionsItem) {
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
    LeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner = (LeadFormArrayResponseItemsInner) o;
    return Objects.equals(this.data, leadFormArrayResponseItemsInner.data) &&
        Objects.equals(this.exceptions, leadFormArrayResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormArrayResponseItemsInner {\n");
    
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

