package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsReportDistributionStats;
import org.openapitools.vertxweb.server.model.CatalogsReportFeedIngestionStats;

/**
 * Diagnostics aggregated numbers
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public CatalogsReportStats () {

  }

  public CatalogsReportStats (ReportTypeEnum reportType, String catalogId, Integer code, String codeLabel, String message, Integer occurrences, SeverityEnum severity, Boolean ineligibleForAds, Boolean ineligibleForOrganic) {
    this.reportType = reportType;
    this.catalogId = catalogId;
    this.code = code;
    this.codeLabel = codeLabel;
    this.message = message;
    this.occurrences = occurrences;
    this.severity = severity;
    this.ineligibleForAds = ineligibleForAds;
    this.ineligibleForOrganic = ineligibleForOrganic;
  }

    
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

    
  @JsonProperty("code_label")
  public String getCodeLabel() {
    return codeLabel;
  }
  public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("occurrences")
  public Integer getOccurrences() {
    return occurrences;
  }
  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

    
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

    
  @JsonProperty("ineligible_for_ads")
  public Boolean getIneligibleForAds() {
    return ineligibleForAds;
  }
  public void setIneligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
  }

    
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
