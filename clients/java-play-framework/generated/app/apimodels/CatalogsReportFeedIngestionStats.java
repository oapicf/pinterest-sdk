package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsReportFeedIngestionStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsReportFeedIngestionStats   {
  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES");

    private final String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("report_type")
  
  private ReportTypeEnum reportType;

  @JsonProperty("catalog_id")
  @Pattern(regexp="^\\d+$")

  private String catalogId;

  @JsonProperty("code")
  
  private Integer code;

  @JsonProperty("code_label")
  
  private String codeLabel;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("occurrences")
  
  private Integer occurrences;

  /**
   * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
   */
  public enum SeverityEnum {
    WARN("WARN"),
    
    ERROR("ERROR");

    private final String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("severity")
  
  private SeverityEnum severity;

  public CatalogsReportFeedIngestionStats reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsReportFeedIngestionStats catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * ID of the catalog entity.
   * @return catalogId
  **/
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsReportFeedIngestionStats code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * The event code that a diagnostics aggregated number references
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CatalogsReportFeedIngestionStats codeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

   /**
   * A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
   * @return codeLabel
  **/
  public String getCodeLabel() {
    return codeLabel;
  }

  public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

  public CatalogsReportFeedIngestionStats message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Title message describing the diagnostic issue
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CatalogsReportFeedIngestionStats occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

   /**
   * Number of occurrences of the issue
   * @return occurrences
  **/
  public Integer getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  public CatalogsReportFeedIngestionStats severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
   * @return severity
  **/
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsReportFeedIngestionStats catalogsReportFeedIngestionStats = (CatalogsReportFeedIngestionStats) o;
    return Objects.equals(reportType, catalogsReportFeedIngestionStats.reportType) &&
        Objects.equals(catalogId, catalogsReportFeedIngestionStats.catalogId) &&
        Objects.equals(code, catalogsReportFeedIngestionStats.code) &&
        Objects.equals(codeLabel, catalogsReportFeedIngestionStats.codeLabel) &&
        Objects.equals(message, catalogsReportFeedIngestionStats.message) &&
        Objects.equals(occurrences, catalogsReportFeedIngestionStats.occurrences) &&
        Objects.equals(severity, catalogsReportFeedIngestionStats.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, catalogId, code, codeLabel, message, occurrences, severity);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportFeedIngestionStats {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeLabel: ").append(toIndentedString(codeLabel)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

