package org.openapitools.model;

import org.openapitools.model.MMMReportGranularity;
import org.openapitools.model.MMMReportLevel;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class MMMReportCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Advertiser IDs for multi-advertiser report
   */
  @JsonProperty("advertiser_ids")
  private List<String> advertiserIds = new ArrayList<>();

  /**
   * Metric and entity columns
   */
  @JsonProperty("columns")
  private List<MMMReportingColumn> columns = new ArrayList<>();

  /**
   * A List of countries for filtering
   */
  @JsonProperty("countries")
  private List<TargetingAdvertiserCountry> countries = new ArrayList<>();

  /**
   * List of custom column IDs
   */
  @JsonProperty("custom_column_ids")
  private List<String> customColumnIds = new ArrayList<>();

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   */
  @JsonProperty("end_date")
  private String endDate;

  /**
   *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
   */
  @JsonProperty("granularity")
  private MMMReportGranularity granularity;

  /**
   * Level of the report
   */
  @JsonProperty("level")
  private MMMReportLevel level;

  /**
   * Name of the Marketing Mix Modeling (MMM) report
   */
  @JsonProperty("report_name")
  private String reportName;

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   */
  @JsonProperty("start_date")
  private String startDate;

  /**
   * List of targeting types
   */
  @JsonProperty("targeting_types")
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  /**
   * Advertiser IDs for multi-advertiser report
   * @return advertiserIds
   */
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }

  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  /**
   * Metric and entity columns
   * @return columns
   */
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * A List of countries for filtering
   * @return countries
   */
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }

  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

  /**
   * List of custom column IDs
   * @return customColumnIds
   */
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
   */
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
   * @return granularity
   */
  public MMMReportGranularity getGranularity() {
    return granularity;
  }

  public void setGranularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   * @return level
   */
  public MMMReportLevel getLevel() {
    return level;
  }

  public void setLevel(MMMReportLevel level) {
    this.level = level;
  }

  /**
   * Name of the Marketing Mix Modeling (MMM) report
   * @return reportName
   */
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
   */
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * List of targeting types
   * @return targetingTypes
   */
  public List<MMMReportingTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MMMReportCreate mmMReportCreate = (MMMReportCreate) o;
    return Objects.equals(this.advertiserIds, mmMReportCreate.advertiserIds) &&
        Objects.equals(this.columns, mmMReportCreate.columns) &&
        Objects.equals(this.countries, mmMReportCreate.countries) &&
        Objects.equals(this.customColumnIds, mmMReportCreate.customColumnIds) &&
        Objects.equals(this.endDate, mmMReportCreate.endDate) &&
        Objects.equals(this.granularity, mmMReportCreate.granularity) &&
        Objects.equals(this.level, mmMReportCreate.level) &&
        Objects.equals(this.reportName, mmMReportCreate.reportName) &&
        Objects.equals(this.startDate, mmMReportCreate.startDate) &&
        Objects.equals(this.targetingTypes, mmMReportCreate.targetingTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, columns, countries, customColumnIds, endDate, granularity, level, reportName, startDate, targetingTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MMMReportCreate {\n");
    
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    customColumnIds: ").append(toIndentedString(customColumnIds)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    targetingTypes: ").append(toIndentedString(targetingTypes)).append("\n");
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
