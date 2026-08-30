package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationLog;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class IntegrationLogsRequestCreate  {
  
  @ApiModelProperty(required = true, value = "")

  private List<IntegrationLog> logs = new ArrayList<>();
 /**
   * Get logs
   * @return logs
  **/
  @JsonProperty("logs")
  public List<IntegrationLog> getLogs() {
    return logs;
  }

  public void setLogs(List<IntegrationLog> logs) {
    this.logs = logs;
  }

  public IntegrationLogsRequestCreate logs(List<IntegrationLog> logs) {
    this.logs = logs;
    return this;
  }

  public IntegrationLogsRequestCreate addLogsItem(IntegrationLog logsItem) {
    this.logs.add(logsItem);
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
    IntegrationLogsRequestCreate integrationLogsRequestCreate = (IntegrationLogsRequestCreate) o;
    return Objects.equals(this.logs, integrationLogsRequestCreate.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsRequestCreate {\n");
    
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

