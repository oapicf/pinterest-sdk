package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationLogsInvalidLogResponseRejectedLogsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Schema describing the response when a log has invalid fields.
 */

@Schema(name = "IntegrationLogsInvalidLogResponse", description = "Schema describing the response when a log has invalid fields.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IntegrationLogsInvalidLogResponse {

  @Valid
  private List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs = new ArrayList<>();

  public IntegrationLogsInvalidLogResponse rejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
    return this;
  }

  public IntegrationLogsInvalidLogResponse addRejectedLogsItem(IntegrationLogsInvalidLogResponseRejectedLogsInner rejectedLogsItem) {
    if (this.rejectedLogs == null) {
      this.rejectedLogs = new ArrayList<>();
    }
    this.rejectedLogs.add(rejectedLogsItem);
    return this;
  }

  /**
   * Get rejectedLogs
   * @return rejectedLogs
   */
  @Valid 
  @Schema(name = "rejected_logs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejected_logs")
  public List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> getRejectedLogs() {
    return rejectedLogs;
  }

  public void setRejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
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

