package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportDistributionStats   {
  

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
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
  }

  private ReportTypeEnum reportType;
  private String catalogId;
  private Integer code;
  private String codeLabel;
  private String message;
  private Integer occurrences;
  private Boolean ineligibleForAds;
  private Boolean ineligibleForOrganic;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * ID of the catalog entity.
   **/
  
  @ApiModelProperty(value = "ID of the catalog entity.")
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * The event code that a diagnostics aggregated number references
   **/
  
  @ApiModelProperty(value = "The event code that a diagnostics aggregated number references")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * A human-friendly label for the event code (e.g, &#39;SPAM&#39;)
   **/
  
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
   **/
  
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
   **/
  
  @ApiModelProperty(example = "10", value = "Number of occurrences of the issue")
  @JsonProperty("occurrences")
  public Integer getOccurrences() {
    return occurrences;
  }
  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }

  /**
   * Indicates if issue makes items ineligible for ads distribution
   **/
  
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
   **/
  
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

