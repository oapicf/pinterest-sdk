package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AdResponse;
import org.openapitools.vertxweb.server.model.Exception;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdArrayResponseElement   {
  
  private AdResponse data;
  private Exception exceptions;

  public AdArrayResponseElement () {

  }

  public AdArrayResponseElement (AdResponse data, Exception exceptions) {
    this.data = data;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("data")
  public AdResponse getData() {
    return data;
  }
  public void setData(AdResponse data) {
    this.data = data;
  }

    
  @JsonProperty("exceptions")
  public Exception getExceptions() {
    return exceptions;
  }
  public void setExceptions(Exception exceptions) {
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
    AdArrayResponseElement adArrayResponseElement = (AdArrayResponseElement) o;
    return Objects.equals(data, adArrayResponseElement.data) &&
        Objects.equals(exceptions, adArrayResponseElement.exceptions);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
