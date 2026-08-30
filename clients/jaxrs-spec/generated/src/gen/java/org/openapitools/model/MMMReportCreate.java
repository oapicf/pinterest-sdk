package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("MMMReportCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MMMReportCreate   {
  private @Valid List<String> advertiserIds = new ArrayList<>();
  private @Valid List<MMMReportingColumn> columns = new ArrayList<>();
  private @Valid List<TargetingAdvertiserCountry> countries = new ArrayList<>();
  private @Valid List<String> customColumnIds = new ArrayList<>();
  private String endDate;
  private MMMReportGranularity granularity;
  private MMMReportLevel level;
  private String reportName;
  private String startDate;
  private @Valid List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  public MMMReportCreate() {
  }

  @JsonCreator
  public MMMReportCreate(
    @JsonProperty(required = true, value = "columns") List<MMMReportingColumn> columns,
    @JsonProperty(required = true, value = "end_date") String endDate,
    @JsonProperty(required = true, value = "granularity") MMMReportGranularity granularity,
    @JsonProperty(required = true, value = "level") MMMReportLevel level,
    @JsonProperty(required = true, value = "report_name") String reportName,
    @JsonProperty(required = true, value = "start_date") String startDate,
    @JsonProperty(required = true, value = "targeting_types") List<MMMReportingTargetingType> targetingTypes
  ) {
    this.columns = columns;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.reportName = reportName;
    this.startDate = startDate;
    this.targetingTypes = targetingTypes;
  }

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

  @JsonProperty("advertiser_ids")
  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  public MMMReportCreate addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }

    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

  public MMMReportCreate removeAdvertiserIdsItem(String advertiserIdsItem) {
    if (advertiserIdsItem != null && this.advertiserIds != null) {
      this.advertiserIds.remove(advertiserIdsItem);
    }

    return this;
  }
  /**
   * Metric and entity columns
   **/
  public MMMReportCreate columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty(required = true, value = "columns")
  @NotNull public List<MMMReportingColumn> getColumns() {
    return columns;
  }

  @JsonProperty(required = true, value = "columns")
  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  public MMMReportCreate addColumnsItem(MMMReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }

    this.columns.add(columnsItem);
    return this;
  }

  public MMMReportCreate removeColumnsItem(MMMReportingColumn columnsItem) {
    if (columnsItem != null && this.columns != null) {
      this.columns.remove(columnsItem);
    }

    return this;
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

  @JsonProperty("countries")
  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

  public MMMReportCreate addCountriesItem(TargetingAdvertiserCountry countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }

    this.countries.add(countriesItem);
    return this;
  }

  public MMMReportCreate removeCountriesItem(TargetingAdvertiserCountry countriesItem) {
    if (countriesItem != null && this.countries != null) {
      this.countries.remove(countriesItem);
    }

    return this;
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
   @Size(max=20)public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  @JsonProperty("custom_column_ids")
  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  public MMMReportCreate addCustomColumnIdsItem(String customColumnIdsItem) {
    if (this.customColumnIds == null) {
      this.customColumnIds = new ArrayList<>();
    }

    this.customColumnIds.add(customColumnIdsItem);
    return this;
  }

  public MMMReportCreate removeCustomColumnIdsItem(String customColumnIdsItem) {
    if (customColumnIdsItem != null && this.customColumnIds != null) {
      this.customColumnIds.remove(customColumnIdsItem);
    }

    return this;
  }
  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  public MMMReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty(required = true, value = "end_date")
  @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty(required = true, value = "end_date")
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
  @JsonProperty(required = true, value = "granularity")
  @NotNull public MMMReportGranularity getGranularity() {
    return granularity;
  }

  @JsonProperty(required = true, value = "granularity")
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
  @JsonProperty(required = true, value = "level")
  @NotNull public MMMReportLevel getLevel() {
    return level;
  }

  @JsonProperty(required = true, value = "level")
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
  @JsonProperty(required = true, value = "report_name")
  @NotNull public String getReportName() {
    return reportName;
  }

  @JsonProperty(required = true, value = "report_name")
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
  @JsonProperty(required = true, value = "start_date")
  @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty(required = true, value = "start_date")
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
  @JsonProperty(required = true, value = "targeting_types")
  @NotNull  @Size(min=1,max=7)public List<MMMReportingTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  @JsonProperty(required = true, value = "targeting_types")
  public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public MMMReportCreate addTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }

    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  public MMMReportCreate removeTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    if (targetingTypesItem != null && this.targetingTypes != null) {
      this.targetingTypes.remove(targetingTypesItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
