package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsReportDistributionStats;
import com.prokarma.pkmst.model.CatalogsReportFeedIngestionStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Diagnostics aggregated numbers
 */
@ApiModel(description = "Diagnostics aggregated numbers")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "report_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsReportDistributionStats.class, name = "DISTRIBUTION_ISSUES"),
  @JsonSubTypes.Type(value = CatalogsReportFeedIngestionStats.class, name = "FEED_INGESTION_ISSUES"),
})

public class CatalogsReportStats   {
  /**
   * Gets or Sets reportType
   */
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

  @JsonProperty("ineligible_for_ads")
  private Boolean ineligibleForAds;

  @JsonProperty("ineligible_for_organic")
  private Boolean ineligibleForOrganic;

  public CatalogsReportStats reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
   */
  @ApiModelProperty(required = true, value = "")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsReportStats catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * ID of the catalog entity.
   * @return catalogId
   */
  @ApiModelProperty(value = "ID of the catalog entity.")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsReportStats code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The event code that a diagnostics aggregated number references
   * @return code
   */
  @ApiModelProperty(value = "The event code that a diagnostics aggregated number references")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CatalogsReportStats codeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

  /**
   * A human-friendly label for the event code (e.g, 'SPAM')
   * @return codeLabel
   */
  @ApiModelProperty(example = "SPAM", value = "A human-friendly label for the event code (e.g, 'SPAM')")
  public String getCodeLabel() {
    return codeLabel;
  }

  public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

  public CatalogsReportStats message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Title message describing the diagnostic issue
   * @return message
   */
  @ApiModelProperty(value = "Title message describing the diagnostic issue")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CatalogsReportStats occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  /**
   * Number of occurrences of the issue
   * @return occurrences
   */
  @ApiModelProperty(example = "10", value = "Number of occurrences of the issue")
  public Integer getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  public CatalogsReportStats severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
   * @return severity
   */
  @ApiModelProperty(value = "An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public CatalogsReportStats ineligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
    return this;
  }

  /**
   * Indicates if issue makes items ineligible for ads distribution
   * @return ineligibleForAds
   */
  @ApiModelProperty(example = "true", value = "Indicates if issue makes items ineligible for ads distribution")
  public Boolean getIneligibleForAds() {
    return ineligibleForAds;
  }

  public void setIneligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
  }

  public CatalogsReportStats ineligibleForOrganic(Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
    return this;
  }

  /**
   * Indicates if issue makes items ineligible for organic distribution
   * @return ineligibleForOrganic
   */
  @ApiModelProperty(example = "true", value = "Indicates if issue makes items ineligible for organic distribution")
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
    return Objects.equals(this.reportType, catalogsReportStats.reportType) &&
        Objects.equals(this.catalogId, catalogsReportStats.catalogId) &&
        Objects.equals(this.code, catalogsReportStats.code) &&
        Objects.equals(this.codeLabel, catalogsReportStats.codeLabel) &&
        Objects.equals(this.message, catalogsReportStats.message) &&
        Objects.equals(this.occurrences, catalogsReportStats.occurrences) &&
        Objects.equals(this.severity, catalogsReportStats.severity) &&
        Objects.equals(this.ineligibleForAds, catalogsReportStats.ineligibleForAds) &&
        Objects.equals(this.ineligibleForOrganic, catalogsReportStats.ineligibleForOrganic);
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

