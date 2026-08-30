package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.IntegrationLog;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationLogsRequestCreate   {
  
  private List<IntegrationLog> logs = new ArrayList<>();

  public IntegrationLogsRequestCreate () {

  }

  public IntegrationLogsRequestCreate (List<IntegrationLog> logs) {
    this.logs = logs;
  }

    
  @JsonProperty("logs")
  public List<IntegrationLog> getLogs() {
    return logs;
  }
  public void setLogs(List<IntegrationLog> logs) {
    this.logs = logs;
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
    return Objects.equals(logs, integrationLogsRequestCreate.logs);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
