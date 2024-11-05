package apimodels;

import apimodels.CatalogsReportDistributionStats;
import apimodels.CatalogsReportFeedIngestionStats;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Diagnostics aggregated numbers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsReportStats   {
  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES"),
    
    DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

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
  @NotNull

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

