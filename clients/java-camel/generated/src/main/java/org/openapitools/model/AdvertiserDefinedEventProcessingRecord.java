package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Processing record for an advertiser defined event operation
 */

@Schema(name = "AdvertiserDefinedEventProcessingRecord", description = "Processing record for an advertiser defined event operation")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEventProcessingRecord {

  @Valid
  private List<String> exceptions = new ArrayList<>();

  private String name;

  private String status;

  public AdvertiserDefinedEventProcessingRecord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvertiserDefinedEventProcessingRecord(String name, String status) {
    this.name = name;
    this.status = status;
  }

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
   */
  
  @Schema(name = "exceptions", description = "List of exception messages if the operation failed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
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
   */
  @NotNull 
  @Schema(name = "name", example = "newsletter_signup", description = "Name of the advertiser defined event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  @NotNull 
  @Schema(name = "status", example = "success", description = "Processing status (success or failure)", requiredMode = Schema.RequiredMode.REQUIRED)
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

