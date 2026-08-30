package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsReportDistributionStats
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsReportDistributionStats implements CatalogsReportStats {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String catalogId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String codeLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean ineligibleForAds;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean ineligibleForOrganic;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer occurrences;

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

    private final String value;

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

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ReportTypeEnum reportType;

  public CatalogsReportDistributionStats catalogId(@Nullable String catalogId) {
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
  public @Nullable String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
  public void setCatalogId(@Nullable String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsReportDistributionStats code(@Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The event code that a diagnostics aggregated number references
   * @return code
   */
  
  @Schema(name = "code", description = "The event code that a diagnostics aggregated number references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable Integer code) {
    this.code = code;
  }

  public CatalogsReportDistributionStats codeLabel(@Nullable String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

  /**
   * A human-friendly label for the event code (e.g, 'SPAM')
   * @return codeLabel
   */
  
  @Schema(name = "code_label", example = "SPAM", description = "A human-friendly label for the event code (e.g, 'SPAM')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_label")
  public @Nullable String getCodeLabel() {
    return codeLabel;
  }

  @JsonProperty("code_label")
  public void setCodeLabel(@Nullable String codeLabel) {
    this.codeLabel = codeLabel;
  }

  public CatalogsReportDistributionStats ineligibleForAds(@Nullable Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
    return this;
  }

  /**
   * Indicates if issue makes items ineligible for ads distribution
   * @return ineligibleForAds
   */
  
  @Schema(name = "ineligible_for_ads", example = "true", description = "Indicates if issue makes items ineligible for ads distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ineligible_for_ads")
  public @Nullable Boolean getIneligibleForAds() {
    return ineligibleForAds;
  }

  @JsonProperty("ineligible_for_ads")
  public void setIneligibleForAds(@Nullable Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
  }

  public CatalogsReportDistributionStats ineligibleForOrganic(@Nullable Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
    return this;
  }

  /**
   * Indicates if issue makes items ineligible for organic distribution
   * @return ineligibleForOrganic
   */
  
  @Schema(name = "ineligible_for_organic", example = "true", description = "Indicates if issue makes items ineligible for organic distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ineligible_for_organic")
  public @Nullable Boolean getIneligibleForOrganic() {
    return ineligibleForOrganic;
  }

  @JsonProperty("ineligible_for_organic")
  public void setIneligibleForOrganic(@Nullable Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
  }

  public CatalogsReportDistributionStats message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Title message describing the diagnostic issue
   * @return message
   */
  
  @Schema(name = "message", description = "Title message describing the diagnostic issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public CatalogsReportDistributionStats occurrences(@Nullable Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  /**
   * Number of occurrences of the issue
   * @return occurrences
   */
  
  @Schema(name = "occurrences", example = "10", description = "Number of occurrences of the issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occurrences")
  public @Nullable Integer getOccurrences() {
    return occurrences;
  }

  @JsonProperty("occurrences")
  public void setOccurrences(@Nullable Integer occurrences) {
    this.occurrences = occurrences;
  }

  public CatalogsReportDistributionStats reportType(@Nullable ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
   */
  
  @Schema(name = "report_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_type")
  public @Nullable ReportTypeEnum getReportType() {
    return reportType;
  }

  @JsonProperty("report_type")
  public void setReportType(@Nullable ReportTypeEnum reportType) {
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
    return Objects.equals(this.catalogId, catalogsReportDistributionStats.catalogId) &&
        Objects.equals(this.code, catalogsReportDistributionStats.code) &&
        Objects.equals(this.codeLabel, catalogsReportDistributionStats.codeLabel) &&
        Objects.equals(this.ineligibleForAds, catalogsReportDistributionStats.ineligibleForAds) &&
        Objects.equals(this.ineligibleForOrganic, catalogsReportDistributionStats.ineligibleForOrganic) &&
        Objects.equals(this.message, catalogsReportDistributionStats.message) &&
        Objects.equals(this.occurrences, catalogsReportDistributionStats.occurrences) &&
        Objects.equals(this.reportType, catalogsReportDistributionStats.reportType);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

