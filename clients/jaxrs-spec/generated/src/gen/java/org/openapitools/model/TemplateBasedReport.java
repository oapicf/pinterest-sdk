package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkReportingJobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TemplateBasedReport")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TemplateBasedReport   {
  private String message;
  private BulkReportingJobStatus reportStatus;
  private String templateId;
  private String token;

  public TemplateBasedReport() {
  }

  @JsonCreator
  public TemplateBasedReport(
    @JsonProperty(required = true, value = "report_status") BulkReportingJobStatus reportStatus,
    @JsonProperty(required = true, value = "template_id") String templateId
  ) {
    this.reportStatus = reportStatus;
    this.templateId = templateId;
  }

  /**
   **/
  public TemplateBasedReport message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public TemplateBasedReport reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "report_status")
  @NotNull public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  @JsonProperty(required = true, value = "report_status")
  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   * Unique identifier of a template.
   **/
  public TemplateBasedReport templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of a template.")
  @JsonProperty(required = true, value = "template_id")
  @NotNull  @Size(max=18)public String getTemplateId() {
    return templateId;
  }

  @JsonProperty(required = true, value = "template_id")
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  /**
   **/
  public TemplateBasedReport token(String token) {
    this.token = token;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  @JsonProperty("token")
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
