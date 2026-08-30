package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Resource create operation model.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MMMReportCreate   {
  
  private List<String> advertiserIds = new ArrayList<>();
  private List<MMMReportingColumn> columns = new ArrayList<>();
  private List<TargetingAdvertiserCountry> countries = new ArrayList<>();
  private List<String> customColumnIds = new ArrayList<>();
  private String endDate;
  private MMMReportGranularity granularity;
  private MMMReportLevel level;
  private String reportName;
  private String startDate;
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  /**
   * Advertiser IDs for multi-advertiser report
   **/
  
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
  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  @NotNull
  @Valid
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * A List of countries for filtering
   **/
  
  @ApiModelProperty(value = "A List of countries for filtering")
  @JsonProperty("countries")
  @Valid
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }
  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

  /**
   * List of custom column IDs
   **/
  
  @ApiModelProperty(value = "List of custom column IDs")
  @JsonProperty("custom_column_ids")
 @Size(max=20)  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }
  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
   **/
  
  @ApiModelProperty(required = true, value = "  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.")
  @JsonProperty("granularity")
  @NotNull
  @Valid
  public MMMReportGranularity getGranularity() {
    return granularity;
  }
  public void setGranularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  @NotNull
  @Valid
  public MMMReportLevel getLevel() {
    return level;
  }
  public void setLevel(MMMReportLevel level) {
    this.level = level;
  }

  /**
   * Name of the Marketing Mix Modeling (MMM) report
   **/
  
  @ApiModelProperty(required = true, value = "Name of the Marketing Mix Modeling (MMM) report")
  @JsonProperty("report_name")
  @NotNull
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * List of targeting types
   **/
  
  @ApiModelProperty(example = "[\"GENDER\"]", required = true, value = "List of targeting types")
  @JsonProperty("targeting_types")
  @NotNull
 @Size(min=1,max=7)  @Valid
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

