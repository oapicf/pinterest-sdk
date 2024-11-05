package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.Exception;
import org.openapitools.vertxweb.server.model.LeadFormResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadFormArrayResponseItemsInner   {
  
  private LeadFormResponse data;
  private List<Exception> exceptions = new ArrayList<>();

  public LeadFormArrayResponseItemsInner () {

  }

  public LeadFormArrayResponseItemsInner (LeadFormResponse data, List<Exception> exceptions) {
    this.data = data;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("data")
  public LeadFormResponse getData() {
    return data;
  }
  public void setData(LeadFormResponse data) {
    this.data = data;
  }

    
  @JsonProperty("exceptions")
  public List<Exception> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<Exception> exceptions) {
    this.exceptions = exceptions;
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
    return Objects.equals(data, leadFormArrayResponseItemsInner.data) &&
        Objects.equals(exceptions, leadFormArrayResponseItemsInner.exceptions);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
