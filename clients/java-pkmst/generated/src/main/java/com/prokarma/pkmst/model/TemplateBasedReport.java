package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.BulkReportingJobStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TemplateBasedReport
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TemplateBasedReport   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("report_status")
  private BulkReportingJobStatus reportStatus;

  @JsonProperty("template_id")
  private String templateId;

  @JsonProperty("token")
  private String token;

  public TemplateBasedReport message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
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
  @ApiModelProperty(required = true, value = "")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

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
  @ApiModelProperty(required = true, value = "Unique identifier of a template.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public TemplateBasedReport token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

