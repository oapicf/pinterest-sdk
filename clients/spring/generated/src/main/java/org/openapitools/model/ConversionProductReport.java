package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
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
 * ConversionProductReport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionProductReport {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BulkReportingJobStatus reportStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal size;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String token;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String url;

  public ConversionProductReport message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Message returned from the create report request
   * @return message
   */
  
  @Schema(name = "message", accessMode = Schema.AccessMode.READ_ONLY, description = "Message returned from the create report request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ConversionProductReport reportStatus(@Nullable BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  /**
   * Async report status
   * @return reportStatus
   */
  @Valid 
  @Schema(name = "report_status", accessMode = Schema.AccessMode.READ_ONLY, description = "Async report status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_status")
  public @Nullable BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

  @JsonProperty("report_status")
  public void setReportStatus(@Nullable BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

  public ConversionProductReport size(@Nullable BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Size of the report in bytes
   * @return size
   */
  @Valid 
  @Schema(name = "size", accessMode = Schema.AccessMode.READ_ONLY, description = "Size of the report in bytes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable BigDecimal getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(@Nullable BigDecimal size) {
    this.size = size;
  }

  public ConversionProductReport token(@Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Token returned from the create report request
   * @return token
   */
  
  @Schema(name = "token", accessMode = Schema.AccessMode.READ_ONLY, description = "Token returned from the create report request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public @Nullable String getToken() {
    return token;
  }

  @JsonProperty("token")
  public void setToken(@Nullable String token) {
    this.token = token;
  }

  public ConversionProductReport url(@Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the report
   * @return url
   */
  
  @Schema(name = "url", accessMode = Schema.AccessMode.READ_ONLY, description = "URL of the report", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(@Nullable String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionProductReport conversionProductReport = (ConversionProductReport) o;
    return Objects.equals(this.message, conversionProductReport.message) &&
        Objects.equals(this.reportStatus, conversionProductReport.reportStatus) &&
        Objects.equals(this.size, conversionProductReport.size) &&
        Objects.equals(this.token, conversionProductReport.token) &&
        Objects.equals(this.url, conversionProductReport.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reportStatus, size, token, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionProductReport {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

