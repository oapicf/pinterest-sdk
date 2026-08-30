package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Ad;
import org.openapitools.vertxweb.server.model.PinterestLibError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdBatchItem   {
  
  private Ad data;
  private PinterestLibError exceptions;

  public AdBatchItem () {

  }

  public AdBatchItem (Ad data, PinterestLibError exceptions) {
    this.data = data;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("data")
  public Ad getData() {
    return data;
  }
  public void setData(Ad data) {
    this.data = data;
  }

    
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }
  public void setExceptions(PinterestLibError exceptions) {
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
    AdBatchItem adBatchItem = (AdBatchItem) o;
    return Objects.equals(data, adBatchItem.data) &&
        Objects.equals(exceptions, adBatchItem.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdBatchItem {\n");
    
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
