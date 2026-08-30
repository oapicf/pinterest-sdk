package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsReportDistributionStats   {
  
  private String catalogId;
  private Integer code;
  private String codeLabel;
  private Boolean ineligibleForAds;
  private Boolean ineligibleForOrganic;
  private String message;
  private Integer occurrences;


  public enum ReportTypeEnum {
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

  public CatalogsReportDistributionStats () {

  }

  public CatalogsReportDistributionStats (String catalogId, Integer code, String codeLabel, Boolean ineligibleForAds, Boolean ineligibleForOrganic, String message, Integer occurrences, ReportTypeEnum reportType) {
    this.catalogId = catalogId;
    this.code = code;
    this.codeLabel = codeLabel;
    this.ineligibleForAds = ineligibleForAds;
    this.ineligibleForOrganic = ineligibleForOrganic;
    this.message = message;
    this.occurrences = occurrences;
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

    
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsReportDistributionStats catalogsReportDistributionStats = (CatalogsReportDistributionStats) o;
    return Objects.equals(catalogId, catalogsReportDistributionStats.catalogId) &&
        Objects.equals(code, catalogsReportDistributionStats.code) &&
        Objects.equals(codeLabel, catalogsReportDistributionStats.codeLabel) &&
        Objects.equals(ineligibleForAds, catalogsReportDistributionStats.ineligibleForAds) &&
        Objects.equals(ineligibleForOrganic, catalogsReportDistributionStats.ineligibleForOrganic) &&
        Objects.equals(message, catalogsReportDistributionStats.message) &&
        Objects.equals(occurrences, catalogsReportDistributionStats.occurrences) &&
        Objects.equals(reportType, catalogsReportDistributionStats.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, code, codeLabel, ineligibleForAds, ineligibleForOrganic, message, occurrences, reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportDistributionStats {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeLabel: ").append(toIndentedString(codeLabel)).append("\n");
    sb.append("    ineligibleForAds: ").append(toIndentedString(ineligibleForAds)).append("\n");
    sb.append("    ineligibleForOrganic: ").append(toIndentedString(ineligibleForOrganic)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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
