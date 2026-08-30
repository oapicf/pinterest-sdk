package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LeadForm;
import org.openapitools.vertxweb.server.model.PinterestLibBatchItemException;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadFormsCreate200ResponseItemsInner   {
  
  private LeadForm data;
  private List<PinterestLibBatchItemException> exceptions = new ArrayList<>();

  public LeadFormsCreate200ResponseItemsInner () {

  }

  public LeadFormsCreate200ResponseItemsInner (LeadForm data, List<PinterestLibBatchItemException> exceptions) {
    this.data = data;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("data")
  public LeadForm getData() {
    return data;
  }
  public void setData(LeadForm data) {
    this.data = data;
  }

    
  @JsonProperty("exceptions")
  public List<PinterestLibBatchItemException> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<PinterestLibBatchItemException> exceptions) {
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
    LeadFormsCreate200ResponseItemsInner leadFormsCreate200ResponseItemsInner = (LeadFormsCreate200ResponseItemsInner) o;
    return Objects.equals(data, leadFormsCreate200ResponseItemsInner.data) &&
        Objects.equals(exceptions, leadFormsCreate200ResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormsCreate200ResponseItemsInner {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
