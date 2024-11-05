package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CatalogsReportFeedIngestionStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportFeedIngestionStats   {
  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String text) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("report_type")
  private ReportTypeEnum reportType;

  @JsonProperty("catalog_id")
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

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "ID of the catalog entity.")
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
  @ApiModelProperty(example = "112", value = "The event code that a diagnostics aggregated number references")
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
  @ApiModelProperty(example = "AVAILABILITY_INVALID", value = "A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')")
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
  @ApiModelProperty(value = "Title message describing the diagnostic issue")
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
  @ApiModelProperty(example = "10", value = "Number of occurrences of the issue")
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
  @ApiModelProperty(value = "An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue")
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
    return Objects.equals(this.reportType, catalogsReportFeedIngestionStats.reportType) &&
        Objects.equals(this.catalogId, catalogsReportFeedIngestionStats.catalogId) &&
        Objects.equals(this.code, catalogsReportFeedIngestionStats.code) &&
        Objects.equals(this.codeLabel, catalogsReportFeedIngestionStats.codeLabel) &&
        Objects.equals(this.message, catalogsReportFeedIngestionStats.message) &&
        Objects.equals(this.occurrences, catalogsReportFeedIngestionStats.occurrences) &&
        Objects.equals(this.severity, catalogsReportFeedIngestionStats.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, catalogId, code, codeLabel, message, occurrences, severity);
  }

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

