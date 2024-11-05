package apimodels;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsReport   {
  /**
   * Gets or Sets reportStatus
   */
  public enum ReportStatusEnum {
    FINISHED("FINISHED"),
    
    IN_PROGRESS("IN_PROGRESS");

    private final String value;

    ReportStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportStatusEnum fromValue(String value) {
      for (ReportStatusEnum b : ReportStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("report_status")
  
  private ReportStatusEnum reportStatus;

  @JsonProperty("url")
  
  private String url;

  @JsonProperty("size")
  @Valid

  private BigDecimal size;

  public CatalogsReport reportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

   /**
   * Get reportStatus
   * @return reportStatus
  **/
  public ReportStatusEnum getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
  }

  public CatalogsReport url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to download the report
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CatalogsReport size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Size of the report in bytes
   * @return size
  **/
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
    CatalogsReport catalogsReport = (CatalogsReport) o;
    return Objects.equals(reportStatus, catalogsReport.reportStatus) &&
        Objects.equals(url, catalogsReport.url) &&
        Objects.equals(size, catalogsReport.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, url, size);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReport {\n");
    
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

