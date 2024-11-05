/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsReportDistributionStats;
import org.openapitools.model.CatalogsReportFeedIngestionStats;



/**
 * Diagnostics aggregated numbers
 */

@ApiModel(description = "Diagnostics aggregated numbers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportStats   {
  


  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES"),
    DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ReportTypeEnum reportType;
  private String catalogId;
  private Integer code;
  private String codeLabel;
  private String message;
  private Integer occurrences;


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
      return value;
    }
  }

  private SeverityEnum severity;
  private Boolean ineligibleForAds;
  private Boolean ineligibleForOrganic;

  /**
   */
  public CatalogsReportStats reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * ID of the catalog entity.
   */
  public CatalogsReportStats catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "ID of the catalog entity.")
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * The event code that a diagnostics aggregated number references
   */
  public CatalogsReportStats code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "The event code that a diagnostics aggregated number references")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * A human-friendly label for the event code (e.g, 'SPAM')
   */
  public CatalogsReportStats codeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

  
  @ApiModelProperty(example = "SPAM", value = "A human-friendly label for the event code (e.g, 'SPAM')")
  @JsonProperty("code_label")
  public String getCodeLabel() {
    return codeLabel;
  }
  public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

  /**
   * Title message describing the diagnostic issue
   */
  public CatalogsReportStats message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Title message describing the diagnostic issue")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Number of occurrences of the issue
   */
  public CatalogsReportStats occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "Number of occurrences of the issue")
  @JsonProperty("occurrences")
  public Integer getOccurrences() {
    return occurrences;
  }
  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  /**
   * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
   */
  public CatalogsReportStats severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(value = "An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue")
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  /**
   * Indicates if issue makes items ineligible for ads distribution
   */
  public CatalogsReportStats ineligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Indicates if issue makes items ineligible for ads distribution")
  @JsonProperty("ineligible_for_ads")
  public Boolean getIneligibleForAds() {
    return ineligibleForAds;
  }
  public void setIneligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
  }

  /**
   * Indicates if issue makes items ineligible for organic distribution
   */
  public CatalogsReportStats ineligibleForOrganic(Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Indicates if issue makes items ineligible for organic distribution")
  @JsonProperty("ineligible_for_organic")
  public Boolean getIneligibleForOrganic() {
    return ineligibleForOrganic;
  }
  public void setIneligibleForOrganic(Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsReportStats catalogsReportStats = (CatalogsReportStats) o;
    return Objects.equals(reportType, catalogsReportStats.reportType) &&
        Objects.equals(catalogId, catalogsReportStats.catalogId) &&
        Objects.equals(code, catalogsReportStats.code) &&
        Objects.equals(codeLabel, catalogsReportStats.codeLabel) &&
        Objects.equals(message, catalogsReportStats.message) &&
        Objects.equals(occurrences, catalogsReportStats.occurrences) &&
        Objects.equals(severity, catalogsReportStats.severity) &&
        Objects.equals(ineligibleForAds, catalogsReportStats.ineligibleForAds) &&
        Objects.equals(ineligibleForOrganic, catalogsReportStats.ineligibleForOrganic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, catalogId, code, codeLabel, message, occurrences, severity, ineligibleForAds, ineligibleForOrganic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportStats {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeLabel: ").append(toIndentedString(codeLabel)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    ineligibleForAds: ").append(toIndentedString(ineligibleForAds)).append("\n");
    sb.append("    ineligibleForOrganic: ").append(toIndentedString(ineligibleForOrganic)).append("\n");
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

