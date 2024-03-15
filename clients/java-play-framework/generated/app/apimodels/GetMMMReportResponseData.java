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
 * GetMMMReportResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  public GetMMMReportResponseData reportStatus(ReportStatusEnum reportStatus) {
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

  public GetMMMReportResponseData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

