package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class GetMMMReportResponseData   {
  

public enum ReportStatusEnum {

    @JsonProperty("DOES_NOT_EXIST") DOES_NOT_EXIST(String.valueOf("DOES_NOT_EXIST")), @JsonProperty("FINISHED") FINISHED(String.valueOf("FINISHED")), @JsonProperty("IN_PROGRESS") IN_PROGRESS(String.valueOf("IN_PROGRESS")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED"));


    private String value;

    ReportStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportStatusEnum fromValue(String value) {
        for (ReportStatusEnum b : ReportStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ReportStatusEnum reportStatus;

  private String url;

  private BigDecimal size;

  /**
   **/
  public GetMMMReportResponseData reportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("report_status")
  public ReportStatusEnum getReportStatus() {
    return reportStatus;
  }
  public void setReportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
  }


  /**
   **/
  public GetMMMReportResponseData url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   **/
  public GetMMMReportResponseData size(BigDecimal size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

