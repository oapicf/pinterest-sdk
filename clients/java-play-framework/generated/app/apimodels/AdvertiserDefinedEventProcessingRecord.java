package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Processing record for an advertiser defined event operation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvertiserDefinedEventProcessingRecord   {
  @JsonProperty("exceptions")
  
  private List<String> exceptions = null;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("status")
  @NotNull

  private String status;

  public AdvertiserDefinedEventProcessingRecord exceptions(List<String> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public AdvertiserDefinedEventProcessingRecord addExceptionsItem(String exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * List of exception messages if the operation failed
   * @return exceptions
  **/
  public List<String> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<String> exceptions) {
    this.exceptions = exceptions;
  }

  public AdvertiserDefinedEventProcessingRecord name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the advertiser defined event
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdvertiserDefinedEventProcessingRecord status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Processing status (success or failure)
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDefinedEventProcessingRecord advertiserDefinedEventProcessingRecord = (AdvertiserDefinedEventProcessingRecord) o;
    return Objects.equals(exceptions, advertiserDefinedEventProcessingRecord.exceptions) &&
        Objects.equals(name, advertiserDefinedEventProcessingRecord.name) &&
        Objects.equals(status, advertiserDefinedEventProcessingRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, name, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEventProcessingRecord {\n");
    
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

