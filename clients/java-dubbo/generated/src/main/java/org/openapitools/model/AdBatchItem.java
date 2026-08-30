package org.openapitools.model;

import org.openapitools.model.Ad;
import org.openapitools.model.PinterestLibError;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdBatchItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private Ad data;

  @JsonProperty("exceptions")
  private PinterestLibError exceptions;

  /**
   * 
   * @return data
   */
  public Ad getData() {
    return data;
  }

  public void setData(Ad data) {
    this.data = data;
  }

  /**
   * 
   * @return exceptions
   */
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
    return Objects.equals(this.data, adBatchItem.data) &&
        Objects.equals(this.exceptions, adBatchItem.exceptions);
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
