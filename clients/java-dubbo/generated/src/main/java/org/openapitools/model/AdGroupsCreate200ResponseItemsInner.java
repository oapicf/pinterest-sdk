package org.openapitools.model;

import org.openapitools.model.AdGroup;
import org.openapitools.model.PinterestLibBatchItemException;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdGroupsCreate200ResponseItemsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private AdGroup data;

  @JsonProperty("exceptions")
  private List<PinterestLibBatchItemException> exceptions = new ArrayList<>();

  /**
   * 
   * @return data
   */
  public AdGroup getData() {
    return data;
  }

  public void setData(AdGroup data) {
    this.data = data;
  }

  /**
   * 
   * @return exceptions
   */
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
    AdGroupsCreate200ResponseItemsInner adGroupsCreate200ResponseItemsInner = (AdGroupsCreate200ResponseItemsInner) o;
    return Objects.equals(this.data, adGroupsCreate200ResponseItemsInner.data) &&
        Objects.equals(this.exceptions, adGroupsCreate200ResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsCreate200ResponseItemsInner {\n");
    
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
