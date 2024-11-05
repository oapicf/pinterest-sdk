package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CatalogsReportFeedIngestionStats")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportFeedIngestionStats   {
  public enum ReportTypeEnum {

    FEED_INGESTION_ISSUES(String.valueOf("FEED_INGESTION_ISSUES"));


    private String value;

    ReportTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ReportTypeEnum fromString(String s) {
        for (ReportTypeEnum b : ReportTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private ReportTypeEnum reportType;
  private String catalogId;
  private Integer code;
  private String codeLabel;
  private String message;
  private Integer occurrences;
  public enum SeverityEnum {

    WARN(String.valueOf("WARN")), ERROR(String.valueOf("ERROR"));


    private String value;

    SeverityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SeverityEnum fromString(String s) {
        for (SeverityEnum b : SeverityEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private SeverityEnum severity;

  /**
   **/
  public CatalogsReportFeedIngestionStats reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  @JsonProperty("report_type")
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * ID of the catalog entity.
   **/
  public CatalogsReportFeedIngestionStats catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "ID of the catalog entity.")
  @JsonProperty("catalog_id")
   @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * The event code that a diagnostics aggregated number references
   **/
  public CatalogsReportFeedIngestionStats code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "112", value = "The event code that a diagnostics aggregated number references")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;)
   **/
  public CatalogsReportFeedIngestionStats codeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

  
  @ApiModelProperty(example = "AVAILABILITY_INVALID", value = "A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')")
  @JsonProperty("code_label")
  public String getCodeLabel() {
    return codeLabel;
  }

  @JsonProperty("code_label")
  public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

  /**
   * Title message describing the diagnostic issue
   **/
  public CatalogsReportFeedIngestionStats message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Title message describing the diagnostic issue")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Number of occurrences of the issue
   **/
  public CatalogsReportFeedIngestionStats occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "Number of occurrences of the issue")
  @JsonProperty("occurrences")
  public Integer getOccurrences() {
    return occurrences;
  }

  @JsonProperty("occurrences")
  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  /**
   * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
   **/
  public CatalogsReportFeedIngestionStats severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(value = "An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue")
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  @JsonProperty("severity")
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

