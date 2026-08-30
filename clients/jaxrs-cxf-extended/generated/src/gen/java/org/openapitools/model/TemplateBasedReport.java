package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BulkReportingJobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TemplateBasedReport  {
  
  @ApiModelProperty(value = "")
  private String message;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BulkReportingJobStatus reportStatus;

 /**
  * Unique identifier of a template.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of a template.")
  private String templateId;

  @ApiModelProperty(value = "")
  private String token;
 /**
  * Get message
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public TemplateBasedReport message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Get reportStatus
  * @return reportStatus
  */
  @JsonProperty("report_status")
  @NotNull
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   */
 public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   * Sets the <code>reportStatus</code> property.
   */
  public TemplateBasedReport reportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

 /**
  * Unique identifier of a template.
  * @return templateId
  */
  @JsonProperty("template_id")
  @NotNull
 @Size(max=18)  public String getTemplateId() {
    return templateId;
  }

  /**
   * Sets the <code>templateId</code> property.
   */
 public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  /**
   * Sets the <code>templateId</code> property.
   */
  public TemplateBasedReport templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

 /**
  * Get token
  * @return token
  */
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  /**
   * Sets the <code>token</code> property.
   */
 public void setToken(String token) {
    this.token = token;
  }

  /**
   * Sets the <code>token</code> property.
   */
  public TemplateBasedReport token(String token) {
    this.token = token;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

