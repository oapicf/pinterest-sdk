package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsReportDistributionStats
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportDistributionStats implements CatalogsReportStats {

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ReportTypeEnum reportType;

  private String catalogId;

  private Integer code;

  private String codeLabel;

  private String message;

  private Integer occurrences;

  private Boolean ineligibleForAds;

  private Boolean ineligibleForOrganic;

  public CatalogsReportDistributionStats reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
   */
  
  @Schema(name = "report_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsReportDistributionStats catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * ID of the catalog entity.
   * @return catalogId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", description = "ID of the catalog entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsReportDistributionStats code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The event code that a diagnostics aggregated number references
   * @return code
   */
  
  @Schema(name = "code", description = "The event code that a diagnostics aggregated number references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CatalogsReportDistributionStats codeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

  /**
   * A human-friendly label for the event code (e.g, 'SPAM')
   * @return codeLabel
   */
  
  @Schema(name = "code_label", example = "SPAM", description = "A human-friendly label for the event code (e.g, 'SPAM')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_label")
  public String getCodeLabel() {
    return codeLabel;
  }

  public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

  public CatalogsReportDistributionStats message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Title message describing the diagnostic issue
   * @return message
   */
  
  @Schema(name = "message", description = "Title message describing the diagnostic issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CatalogsReportDistributionStats occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  /**
   * Number of occurrences of the issue
   * @return occurrences
   */
  
  @Schema(name = "occurrences", example = "10", description = "Number of occurrences of the issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occurrences")
  public Integer getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  public CatalogsReportDistributionStats ineligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
    return this;
  }

  /**
   * Indicates if issue makes items ineligible for ads distribution
   * @return ineligibleForAds
   */
  
  @Schema(name = "ineligible_for_ads", example = "true", description = "Indicates if issue makes items ineligible for ads distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ineligible_for_ads")
  public Boolean getIneligibleForAds() {
    return ineligibleForAds;
  }

  public void setIneligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
  }

  public CatalogsReportDistributionStats ineligibleForOrganic(Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
    return this;
  }

  /**
   * Indicates if issue makes items ineligible for organic distribution
   * @return ineligibleForOrganic
   */
  
  @Schema(name = "ineligible_for_organic", example = "true", description = "Indicates if issue makes items ineligible for organic distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CatalogsReportDistributionStats catalogsReportDistributionStats = (CatalogsReportDistributionStats) o;
    return Objects.equals(this.reportType, catalogsReportDistributionStats.reportType) &&
        Objects.equals(this.catalogId, catalogsReportDistributionStats.catalogId) &&
        Objects.equals(this.code, catalogsReportDistributionStats.code) &&
        Objects.equals(this.codeLabel, catalogsReportDistributionStats.codeLabel) &&
        Objects.equals(this.message, catalogsReportDistributionStats.message) &&
        Objects.equals(this.occurrences, catalogsReportDistributionStats.occurrences) &&
        Objects.equals(this.ineligibleForAds, catalogsReportDistributionStats.ineligibleForAds) &&
        Objects.equals(this.ineligibleForOrganic, catalogsReportDistributionStats.ineligibleForOrganic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, catalogId, code, codeLabel, message, occurrences, ineligibleForAds, ineligibleForOrganic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportDistributionStats {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeLabel: ").append(toIndentedString(codeLabel)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
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

