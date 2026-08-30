package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationLog;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("IntegrationLogsRequestCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationLogsRequestCreate   {
  private @Valid List<@Valid IntegrationLog> logs = new ArrayList<>();

  public IntegrationLogsRequestCreate() {
  }

  @JsonCreator
  public IntegrationLogsRequestCreate(
    @JsonProperty(required = true, value = "logs") List<@Valid IntegrationLog> logs
  ) {
    this.logs = logs;
  }

  /**
   **/
  public IntegrationLogsRequestCreate logs(List<@Valid IntegrationLog> logs) {
    this.logs = logs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "logs")
  @NotNull @Valid  @Size(min=1,max=250)public List<@Valid IntegrationLog> getLogs() {
    return logs;
  }

  @JsonProperty(required = true, value = "logs")
  public void setLogs(List<@Valid IntegrationLog> logs) {
    this.logs = logs;
  }

  public IntegrationLogsRequestCreate addLogsItem(IntegrationLog logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }

    this.logs.add(logsItem);
    return this;
  }

  public IntegrationLogsRequestCreate removeLogsItem(IntegrationLog logsItem) {
    if (logsItem != null && this.logs != null) {
      this.logs.remove(logsItem);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
