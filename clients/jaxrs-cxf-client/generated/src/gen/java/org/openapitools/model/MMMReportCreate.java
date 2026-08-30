package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MMMReportGranularity;
import org.openapitools.model.MMMReportLevel;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class MMMReportCreate  {
  
 /**
  * Advertiser IDs for multi-advertiser report
  */
  @ApiModelProperty(value = "Advertiser IDs for multi-advertiser report")

  private List<String> advertiserIds = new ArrayList<>();

 /**
  * Metric and entity columns
  */
  @ApiModelProperty(required = true, value = "Metric and entity columns")

  private List<MMMReportingColumn> columns = new ArrayList<>();

 /**
  * A List of countries for filtering
  */
  @ApiModelProperty(value = "A List of countries for filtering")

  private List<TargetingAdvertiserCountry> countries = new ArrayList<>();

 /**
  * List of custom column IDs
  */
  @ApiModelProperty(value = "List of custom column IDs")

  private List<String> customColumnIds = new ArrayList<>();

 /**
  * Metric report end date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")

  private String endDate;

 /**
  *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
  */
  @ApiModelProperty(required = true, value = "  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.")

  private MMMReportGranularity granularity;

 /**
  * Level of the report
  */
  @ApiModelProperty(required = true, value = "Level of the report")

  private MMMReportLevel level;

 /**
  * Name of the Marketing Mix Modeling (MMM) report
  */
  @ApiModelProperty(required = true, value = "Name of the Marketing Mix Modeling (MMM) report")

  private String reportName;

 /**
  * Metric report start date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")

  private String startDate;

 /**
  * List of targeting types
  */
  @ApiModelProperty(example = "[\"GENDER\"]", required = true, value = "List of targeting types")

  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();
 /**
   * Advertiser IDs for multi-advertiser report
   * @return advertiserIds
  **/
  @JsonProperty("advertiser_ids")
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }

  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  public MMMReportCreate advertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public MMMReportCreate addAdvertiserIdsItem(String advertiserIdsItem) {
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

 /**
   * Metric and entity columns
   * @return columns
  **/
  @JsonProperty("columns")
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  public MMMReportCreate columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public MMMReportCreate addColumnsItem(MMMReportingColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
   * A List of countries for filtering
   * @return countries
  **/
  @JsonProperty("countries")
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }

  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

  public MMMReportCreate countries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
    return this;
  }

  public MMMReportCreate addCountriesItem(TargetingAdvertiserCountry countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

 /**
   * List of custom column IDs
   * @return customColumnIds
  **/
  @JsonProperty("custom_column_ids")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  public MMMReportCreate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
    return this;
  }

  public MMMReportCreate addCustomColumnIdsItem(String customColumnIdsItem) {
    this.customColumnIds.add(customColumnIdsItem);
    return this;
  }

 /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
  **/
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public MMMReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
   * @return granularity
  **/
  @JsonProperty("granularity")
  public MMMReportGranularity getGranularity() {
    return granularity;
  }

  public void setGranularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
  }

  public MMMReportCreate granularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
   * Level of the report
   * @return level
  **/
  @JsonProperty("level")
  public MMMReportLevel getLevel() {
    return level;
  }

  public void setLevel(MMMReportLevel level) {
    this.level = level;
  }

  public MMMReportCreate level(MMMReportLevel level) {
    this.level = level;
    return this;
  }

 /**
   * Name of the Marketing Mix Modeling (MMM) report
   * @return reportName
  **/
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public MMMReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

 /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  **/
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public MMMReportCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * List of targeting types
   * @return targetingTypes
  **/
  @JsonProperty("targeting_types")
  public List<MMMReportingTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public MMMReportCreate targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public MMMReportCreate addTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    this.targetingTypes.add(targetingTypesItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

