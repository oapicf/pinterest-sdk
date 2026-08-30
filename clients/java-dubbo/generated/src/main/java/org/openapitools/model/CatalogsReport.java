package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsReport implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("report_status")
  private String reportStatus;

  /**
   * Size of the report in bytes
   */
  @JsonProperty("size")
  private BigDecimal size;

  /**
   * URL to download the report
   */
  @JsonProperty("url")
  private String url;

  /**
   * 
   * @return reportStatus
   */
  public String getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   * Size of the report in bytes
   * @return size
   */
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  /**
   * URL to download the report
   * @return url
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
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
    CatalogsReport catalogsReport = (CatalogsReport) o;
    return Objects.equals(this.reportStatus, catalogsReport.reportStatus) &&
        Objects.equals(this.size, catalogsReport.size) &&
        Objects.equals(this.url, catalogsReport.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, size, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReport {\n");
    
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
