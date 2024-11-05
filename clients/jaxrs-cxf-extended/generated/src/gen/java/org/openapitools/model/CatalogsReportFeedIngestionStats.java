package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsReportFeedIngestionStats  {
  
public enum ReportTypeEnum {

    @JsonProperty("FEED_INGESTION_ISSUES") FEED_INGESTION_ISSUES(String.valueOf("FEED_INGESTION_ISSUES"));

    private String value;

    ReportTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String value) {
        for (ReportTypeEnum b : ReportTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private ReportTypeEnum reportType;

 /**
  * ID of the catalog entity.
  */
  @ApiModelProperty(value = "ID of the catalog entity.")
  private String catalogId;

 /**
  * The event code that a diagnostics aggregated number references
  */
  @ApiModelProperty(example = "112", value = "The event code that a diagnostics aggregated number references")
  private Integer code;

 /**
  * A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
  */
  @ApiModelProperty(example = "AVAILABILITY_INVALID", value = "A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')")
  private String codeLabel;

 /**
  * Title message describing the diagnostic issue
  */
  @ApiModelProperty(value = "Title message describing the diagnostic issue")
  private String message;

 /**
  * Number of occurrences of the issue
  */
  @ApiModelProperty(example = "10", value = "Number of occurrences of the issue")
  private Integer occurrences;

public enum SeverityEnum {

    @JsonProperty("WARN") WARN(String.valueOf("WARN")),
    @JsonProperty("ERROR") ERROR(String.valueOf("ERROR"));

    private String value;

    SeverityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
        for (SeverityEnum b : SeverityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  */
  @ApiModelProperty(value = "An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue")
  private SeverityEnum severity;
 /**
  * Get reportType
  * @return reportType
  */
  @JsonProperty("report_type")
  public String getReportType() {
    return reportType == null ? null : reportType.value();
  }

  /**
   * Sets the <code>reportType</code> property.
   */
 public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * Sets the <code>reportType</code> property.
   */
  public CatalogsReportFeedIngestionStats reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

 /**
  * ID of the catalog entity.
  * @return catalogId
  */
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsReportFeedIngestionStats catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * The event code that a diagnostics aggregated number references
  * @return code
  */
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public CatalogsReportFeedIngestionStats code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;)
  * @return codeLabel
  */
  @JsonProperty("code_label")
  public String getCodeLabel() {
    return codeLabel;
  }

  /**
   * Sets the <code>codeLabel</code> property.
   */
 public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

  /**
   * Sets the <code>codeLabel</code> property.
   */
  public CatalogsReportFeedIngestionStats codeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

 /**
  * Title message describing the diagnostic issue
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public CatalogsReportFeedIngestionStats message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Number of occurrences of the issue
  * @return occurrences
  */
  @JsonProperty("occurrences")
  public Integer getOccurrences() {
    return occurrences;
  }

  /**
   * Sets the <code>occurrences</code> property.
   */
 public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  /**
   * Sets the <code>occurrences</code> property.
   */
  public CatalogsReportFeedIngestionStats occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

 /**
  * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  * @return severity
  */
  @JsonProperty("severity")
  public String getSeverity() {
    return severity == null ? null : severity.value();
  }

  /**
   * Sets the <code>severity</code> property.
   */
 public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  /**
   * Sets the <code>severity</code> property.
   */
  public CatalogsReportFeedIngestionStats severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

