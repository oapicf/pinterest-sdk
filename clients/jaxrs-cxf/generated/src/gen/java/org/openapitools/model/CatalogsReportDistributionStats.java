package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsReportDistributionStats  {
  
public enum ReportTypeEnum {

DISTRIBUTION_ISSUES(String.valueOf("DISTRIBUTION_ISSUES"));


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

  @ApiModelProperty(value = "")
  private ReportTypeEnum reportType;

  @ApiModelProperty(value = "ID of the catalog entity.")
 /**
   * ID of the catalog entity.
  **/
  private String catalogId;

  @ApiModelProperty(value = "The event code that a diagnostics aggregated number references")
 /**
   * The event code that a diagnostics aggregated number references
  **/
  private Integer code;

  @ApiModelProperty(example = "SPAM", value = "A human-friendly label for the event code (e.g, 'SPAM')")
 /**
   * A human-friendly label for the event code (e.g, 'SPAM')
  **/
  private String codeLabel;

  @ApiModelProperty(value = "Title message describing the diagnostic issue")
 /**
   * Title message describing the diagnostic issue
  **/
  private String message;

  @ApiModelProperty(example = "10", value = "Number of occurrences of the issue")
 /**
   * Number of occurrences of the issue
  **/
  private Integer occurrences;

  @ApiModelProperty(example = "true", value = "Indicates if issue makes items ineligible for ads distribution")
 /**
   * Indicates if issue makes items ineligible for ads distribution
  **/
  private Boolean ineligibleForAds;

  @ApiModelProperty(example = "true", value = "Indicates if issue makes items ineligible for organic distribution")
 /**
   * Indicates if issue makes items ineligible for organic distribution
  **/
  private Boolean ineligibleForOrganic;
 /**
   * Get reportType
   * @return reportType
  **/
  @JsonProperty("report_type")
  public String getReportType() {
    if (reportType == null) {
      return null;
    }
    return reportType.value();
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsReportDistributionStats reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

 /**
   * ID of the catalog entity.
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsReportDistributionStats catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * The event code that a diagnostics aggregated number references
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CatalogsReportDistributionStats code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * A human-friendly label for the event code (e.g, &#39;SPAM&#39;)
   * @return codeLabel
  **/
  @JsonProperty("code_label")
  public String getCodeLabel() {
    return codeLabel;
  }

  public void setCodeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
  }

  public CatalogsReportDistributionStats codeLabel(String codeLabel) {
    this.codeLabel = codeLabel;
    return this;
  }

 /**
   * Title message describing the diagnostic issue
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CatalogsReportDistributionStats message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Number of occurrences of the issue
   * @return occurrences
  **/
  @JsonProperty("occurrences")
  public Integer getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  public CatalogsReportDistributionStats occurrences(Integer occurrences) {
    this.occurrences = occurrences;
    return this;
  }

 /**
   * Indicates if issue makes items ineligible for ads distribution
   * @return ineligibleForAds
  **/
  @JsonProperty("ineligible_for_ads")
  public Boolean getIneligibleForAds() {
    return ineligibleForAds;
  }

  public void setIneligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
  }

  public CatalogsReportDistributionStats ineligibleForAds(Boolean ineligibleForAds) {
    this.ineligibleForAds = ineligibleForAds;
    return this;
  }

 /**
   * Indicates if issue makes items ineligible for organic distribution
   * @return ineligibleForOrganic
  **/
  @JsonProperty("ineligible_for_organic")
  public Boolean getIneligibleForOrganic() {
    return ineligibleForOrganic;
  }

  public void setIneligibleForOrganic(Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
  }

  public CatalogsReportDistributionStats ineligibleForOrganic(Boolean ineligibleForOrganic) {
    this.ineligibleForOrganic = ineligibleForOrganic;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

