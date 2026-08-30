package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.BulkReportingJobStatus;

/**
 * MMMReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MMMReport   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("report_status")
  private BulkReportingJobStatus reportStatus;

  @JsonProperty("size")
  private BigDecimal size;

  @JsonProperty("status")
  private String status;

  @JsonProperty("token")
  private String token;

  @JsonProperty("url")
  private String url;

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

   /**
   * Get reportStatus
   * @return reportStatus
  **/
  @ApiModelProperty(value = "")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "success", value = "")
  public String getStatus() {
    return status;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MMMReport mmMReport = (MMMReport) o;
    return Objects.equals(this.message, mmMReport.message) &&
        Objects.equals(this.reportStatus, mmMReport.reportStatus) &&
        Objects.equals(this.size, mmMReport.size) &&
        Objects.equals(this.status, mmMReport.status) &&
        Objects.equals(this.token, mmMReport.token) &&
        Objects.equals(this.url, mmMReport.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reportStatus, size, status, token, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MMMReport {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

