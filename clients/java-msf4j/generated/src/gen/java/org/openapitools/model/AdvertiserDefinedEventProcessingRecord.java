package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Processing record for an advertiser defined event operation
 */
@ApiModel(description = "Processing record for an advertiser defined event operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEventProcessingRecord   {
  @JsonProperty("exceptions")
  private List<String> exceptions = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
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
  @ApiModelProperty(value = "List of exception messages if the operation failed")
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
  @ApiModelProperty(example = "newsletter_signup", required = true, value = "Name of the advertiser defined event")
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
  @ApiModelProperty(example = "success", required = true, value = "Processing status (success or failure)")
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
    return Objects.equals(this.exceptions, advertiserDefinedEventProcessingRecord.exceptions) &&
        Objects.equals(this.name, advertiserDefinedEventProcessingRecord.name) &&
        Objects.equals(this.status, advertiserDefinedEventProcessingRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, name, status);
  }

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

