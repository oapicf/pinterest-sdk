package org.openapitools.model;

import org.openapitools.model.Ad;
import org.openapitools.model.PinterestLibError;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdBatchItem  {
  
  @ApiModelProperty(value = "")

  private Ad data;

  @ApiModelProperty(value = "")

  private PinterestLibError exceptions;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public Ad getData() {
    return data;
  }

  public void setData(Ad data) {
    this.data = data;
  }

  public AdBatchItem data(Ad data) {
    this.data = data;
    return this;
  }

 /**
   * Get exceptions
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  public AdBatchItem exceptions(PinterestLibError exceptions) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

