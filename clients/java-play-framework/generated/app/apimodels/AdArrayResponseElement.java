package apimodels;

import apimodels.AdResponse;
import apimodels.Exception;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdArrayResponseElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdArrayResponseElement   {
  @JsonProperty("data")
  @Valid

  private AdResponse data;

  @JsonProperty("exceptions")
  @Valid

  private Exception exceptions;

  public AdArrayResponseElement data(AdResponse data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public AdResponse getData() {
    return data;
  }

  public void setData(AdResponse data) {
    this.data = data;
  }

  public AdArrayResponseElement exceptions(Exception exceptions) {
    this.exceptions = exceptions;
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

