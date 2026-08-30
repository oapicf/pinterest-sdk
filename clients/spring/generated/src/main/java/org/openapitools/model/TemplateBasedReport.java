package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BulkReportingJobStatus;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TemplateBasedReport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TemplateBasedReport {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  private BulkReportingJobStatus reportStatus;

  private String templateId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String token;

  public TemplateBasedReport() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TemplateBasedReport(BulkReportingJobStatus reportStatus, String templateId) {
    this.reportStatus = reportStatus;
    this.templateId = templateId;
  }

  public TemplateBasedReport message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public TemplateBasedReport reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  /**
   * Get reportStatus
   * @return reportStatus
   */
  @NotNull @Valid 
  @Schema(name = "report_status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  @JsonProperty("report_status")
  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  public TemplateBasedReport templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Unique identifier of a template.
   * @return templateId
   */
  @NotNull @Size(max = 18) 
  @Schema(name = "template_id", description = "Unique identifier of a template.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("template_id")
  public String getTemplateId() {
    return templateId;
  }

  @JsonProperty("template_id")
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public TemplateBasedReport token(@Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  
  @Schema(name = "token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public @Nullable String getToken() {
    return token;
  }

  @JsonProperty("token")
  public void setToken(@Nullable String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateBasedReport templateBasedReport = (TemplateBasedReport) o;
    return Objects.equals(this.message, templateBasedReport.message) &&
        Objects.equals(this.reportStatus, templateBasedReport.reportStatus) &&
        Objects.equals(this.templateId, templateBasedReport.templateId) &&
        Objects.equals(this.token, templateBasedReport.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reportStatus, templateId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateBasedReport {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

