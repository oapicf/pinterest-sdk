package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationLog;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Batch of logs sent from an integration application.
 */

@Schema(name = "IntegrationLogsRequest", description = "Batch of logs sent from an integration application.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogsRequest {

  @Valid
  private List<@Valid IntegrationLog> logs = new ArrayList<>();

  public IntegrationLogsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntegrationLogsRequest(List<@Valid IntegrationLog> logs) {
    this.logs = logs;
  }

  public IntegrationLogsRequest logs(List<@Valid IntegrationLog> logs) {
    this.logs = logs;
    return this;
  }

  public IntegrationLogsRequest addLogsItem(IntegrationLog logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

  /**
   * Get logs
   * @return logs
  */
  @NotNull @Valid 
  @Schema(name = "logs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("logs")
  public List<@Valid IntegrationLog> getLogs() {
    return logs;
  }

  public void setLogs(List<@Valid IntegrationLog> logs) {
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
    IntegrationLogsRequest integrationLogsRequest = (IntegrationLogsRequest) o;
    return Objects.equals(this.logs, integrationLogsRequest.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsRequest {\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

