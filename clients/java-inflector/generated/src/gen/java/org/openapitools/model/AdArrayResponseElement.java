package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdResponse;
import org.openapitools.model.Exception;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdArrayResponseElement   {
  @JsonProperty("data")
  private AdResponse data;

  @JsonProperty("exceptions")
  private Exception exceptions;

  /**
   **/
  public AdArrayResponseElement data(AdResponse data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public AdResponse getData() {
    return data;
  }
  public void setData(AdResponse data) {
    this.data = data;
  }

  /**
   **/
  public AdArrayResponseElement exceptions(Exception exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

