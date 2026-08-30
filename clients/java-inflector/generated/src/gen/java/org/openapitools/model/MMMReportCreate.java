package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MMMReportGranularity;
import org.openapitools.model.MMMReportLevel;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;



/**
 * Resource create operation model.
 **/

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MMMReportCreate   {
  @JsonProperty("advertiser_ids")
  private List<String> advertiserIds = null;

  @JsonProperty("columns")
  private List<MMMReportingColumn> columns = new ArrayList<>();

  @JsonProperty("countries")
  private List<TargetingAdvertiserCountry> countries = null;

  @JsonProperty("custom_column_ids")
  private List<String> customColumnIds = null;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("granularity")
  private MMMReportGranularity granularity;

  @JsonProperty("level")
  private MMMReportLevel level;

  @JsonProperty("report_name")
  private String reportName;

  @JsonProperty("start_date")
  private String startDate;

  @JsonProperty("targeting_types")
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  /**
   * Advertiser IDs for multi-advertiser report
   **/
  public MMMReportCreate advertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  
  @ApiModelProperty(value = "Advertiser IDs for multi-advertiser report")
  @JsonProperty("advertiser_ids")
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }
  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  /**
   * Metric and entity columns
   **/
  public MMMReportCreate columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * A List of countries for filtering
   **/
  public MMMReportCreate countries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
    return this;
  }

  
  @ApiModelProperty(value = "A List of countries for filtering")
  @JsonProperty("countries")
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }
  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

  /**
   * List of custom column IDs
   **/
  public MMMReportCreate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
    return this;
  }

  
  @ApiModelProperty(value = "List of custom column IDs")
  @JsonProperty("custom_column_ids")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }
  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  public MMMReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
   **/
  public MMMReportCreate granularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.")
  @JsonProperty("granularity")
  public MMMReportGranularity getGranularity() {
    return granularity;
  }
  public void setGranularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  public MMMReportCreate level(MMMReportLevel level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  public MMMReportLevel getLevel() {
    return level;
  }
  public void setLevel(MMMReportLevel level) {
    this.level = level;
  }

  /**
   * Name of the Marketing Mix Modeling (MMM) report
   **/
  public MMMReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the Marketing Mix Modeling (MMM) report")
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   **/
  public MMMReportCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * List of targeting types
   **/
  public MMMReportCreate targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"GENDER\"]", required = true, value = "List of targeting types")
  @JsonProperty("targeting_types")
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
    return Objects.equals(advertiserIds, mmMReportCreate.advertiserIds) &&
        Objects.equals(columns, mmMReportCreate.columns) &&
        Objects.equals(countries, mmMReportCreate.countries) &&
        Objects.equals(customColumnIds, mmMReportCreate.customColumnIds) &&
        Objects.equals(endDate, mmMReportCreate.endDate) &&
        Objects.equals(granularity, mmMReportCreate.granularity) &&
        Objects.equals(level, mmMReportCreate.level) &&
        Objects.equals(reportName, mmMReportCreate.reportName) &&
        Objects.equals(startDate, mmMReportCreate.startDate) &&
        Objects.equals(targetingTypes, mmMReportCreate.targetingTypes);
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

