package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationLogsInvalidLogResponseRejectedLogsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Schema describing the response when a log has invalid fields.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Schema describing the response when a log has invalid fields.")
public class IntegrationLogsInvalidLogResponse   {
  
  private List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs;

  /**
   **/
  public IntegrationLogsInvalidLogResponse rejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rejected_logs")
  public List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> getRejectedLogs() {
    return rejectedLogs;
  }
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

