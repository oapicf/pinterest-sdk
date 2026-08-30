package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationLogsInvalidLogResponseRejectedLogsItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema describing the response when a log has invalid fields.
 */
@ApiModel(description="Schema describing the response when a log has invalid fields.")

public class IntegrationLogsInvalidLogResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs = new ArrayList<>();
 /**
   * Get rejectedLogs
   * @return rejectedLogs
  **/
  @JsonProperty("rejected_logs")
  public List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> getRejectedLogs() {
    return rejectedLogs;
  }

  public void setRejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
  }

  public IntegrationLogsInvalidLogResponse rejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
    return this;
  }

  public IntegrationLogsInvalidLogResponse addRejectedLogsItem(IntegrationLogsInvalidLogResponseRejectedLogsItems rejectedLogsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

