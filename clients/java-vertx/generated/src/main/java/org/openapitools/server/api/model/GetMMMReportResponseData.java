package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMMMReportResponseData   {
  


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
      return value;
    }
  }

  private ReportStatusEnum reportStatus;
  private String url;
  private BigDecimal size;

  public GetMMMReportResponseData () {

  }

  public GetMMMReportResponseData (ReportStatusEnum reportStatus, String url, BigDecimal size) {
    this.reportStatus = reportStatus;
    this.url = url;
    this.size = size;
  }

    
  @JsonProperty("report_status")
  public ReportStatusEnum getReportStatus() {
    return reportStatus;
  }
  public void setReportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("size")
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
    return Objects.equals(reportStatus, getMMMReportResponseData.reportStatus) &&
        Objects.equals(url, getMMMReportResponseData.url) &&
        Objects.equals(size, getMMMReportResponseData.size);
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
