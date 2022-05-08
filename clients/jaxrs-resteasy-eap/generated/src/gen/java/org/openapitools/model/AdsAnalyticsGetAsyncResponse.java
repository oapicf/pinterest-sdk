package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-08T00:33:44.584572Z[Etc/UTC]")
public class AdsAnalyticsGetAsyncResponse   {
  

  private String reportStatus;

  private String url;

  private BigDecimal size;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("report_status")
  public String getReportStatus() {
    return reportStatus;
  }
  public void setReportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   **/
  
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
    AdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse = (AdsAnalyticsGetAsyncResponse) o;
    return Objects.equals(reportStatus, adsAnalyticsGetAsyncResponse.reportStatus) &&
        Objects.equals(url, adsAnalyticsGetAsyncResponse.url) &&
        Objects.equals(size, adsAnalyticsGetAsyncResponse.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, url, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsGetAsyncResponse {\n");
    
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

