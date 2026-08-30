package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LeadsExports
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadsExports {

  private String leadsExportId;

  public LeadsExports leadsExportId(String leadsExportId) {
    this.leadsExportId = leadsExportId;
    return this;
  }

  /**
   * ID for the leads export job.
   * @return leadsExportId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "leads_export_id", accessMode = Schema.AccessMode.READ_ONLY, example = "123456789012", description = "ID for the leads export job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leads_export_id")
  public String getLeadsExportId() {
    return leadsExportId;
  }

  public void setLeadsExportId(String leadsExportId) {
    this.leadsExportId = leadsExportId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExports leadsExports = (LeadsExports) o;
    return Objects.equals(this.leadsExportId, leadsExports.leadsExportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadsExportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExports {\n");
    sb.append("    leadsExportId: ").append(toIndentedString(leadsExportId)).append("\n");
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

