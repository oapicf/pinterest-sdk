package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationLogsInvalidLogResponseRejectedLogsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Schema describing the response when a log has invalid fields.
 **/
@ApiModel(description = "Schema describing the response when a log has invalid fields.")
@JsonTypeName("IntegrationLogsInvalidLogResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogsInvalidLogResponse   {
  private @Valid List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs;

  /**
   **/
  public IntegrationLogsInvalidLogResponse rejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rejected_logs")
  public List<IntegrationLogsInvalidLogResponseRejectedLogsInner> getRejectedLogs() {
    return rejectedLogs;
  }

  @JsonProperty("rejected_logs")
  public void setRejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
  }

  public IntegrationLogsInvalidLogResponse addRejectedLogsItem(IntegrationLogsInvalidLogResponseRejectedLogsInner rejectedLogsItem) {
    if (this.rejectedLogs == null) {
      this.rejectedLogs = new ArrayList<>();
    }

    this.rejectedLogs.add(rejectedLogsItem);
    return this;
  }

  public IntegrationLogsInvalidLogResponse removeRejectedLogsItem(IntegrationLogsInvalidLogResponseRejectedLogsInner rejectedLogsItem) {
    if (rejectedLogsItem != null && this.rejectedLogs != null) {
      this.rejectedLogs.remove(rejectedLogsItem);
    }

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
    IntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponse = (IntegrationLogsInvalidLogResponse) o;
    return Objects.equals(this.rejectedLogs, integrationLogsInvalidLogResponse.rejectedLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsInvalidLogResponse {\n");
    
    sb.append("    rejectedLogs: ").append(toIndentedString(rejectedLogs)).append("\n");
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

