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
 **/

@ApiModel(description = "Processing record for an advertiser defined event operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEventProcessingRecord   {
  @JsonProperty("exceptions")
  private List<String> exceptions = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private String status;

  /**
   * List of exception messages if the operation failed
   **/
  public AdvertiserDefinedEventProcessingRecord exceptions(List<String> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "List of exception messages if the operation failed")
  @JsonProperty("exceptions")
  public List<String> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<String> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Name of the advertiser defined event
   **/
  public AdvertiserDefinedEventProcessingRecord name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "newsletter_signup", required = true, value = "Name of the advertiser defined event")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Processing status (success or failure)
   **/
  public AdvertiserDefinedEventProcessingRecord status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "success", required = true, value = "Processing status (success or failure)")
  @JsonProperty("status")
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

