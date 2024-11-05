package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GetMMMReportResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetMMMReportResponseData   {
  /**
   * Gets or Sets reportStatus
   */
  public enum ReportStatusEnum {
    DOES_NOT_EXIST("DOES_NOT_EXIST"),
    
    FINISHED("FINISHED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    EXPIRED("EXPIRED"),
    
    FAILED("FAILED"),
    
    CANCELLED("CANCELLED");

    private String value;

    ReportStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportStatusEnum fromValue(String text) {
      for (ReportStatusEnum b : ReportStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("report_status")
  private ReportStatusEnum reportStatus;

  @JsonProperty("url")
  private String url;

  @JsonProperty("size")
  private BigDecimal size;

  public GetMMMReportResponseData reportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

   /**
   * Get reportStatus
   * @return reportStatus
  **/
  @ApiModelProperty(value = "")
  public ReportStatusEnum getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
  }

  public GetMMMReportResponseData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GetMMMReportResponseData size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMMMReportResponseData getMMMReportResponseData = (GetMMMReportResponseData) o;
    return Objects.equals(this.reportStatus, getMMMReportResponseData.reportStatus) &&
        Objects.equals(this.url, getMMMReportResponseData.url) &&
        Objects.equals(this.size, getMMMReportResponseData.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, url, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMMMReportResponseData {\n");
    
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

