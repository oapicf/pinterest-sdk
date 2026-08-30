package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MMMReportGranularity;
import org.openapitools.model.MMMReportLevel;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "MMMReportCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MMMReportCreate {

  @Valid
  private List<String> advertiserIds = new ArrayList<>();

  @Valid
  private List<MMMReportingColumn> columns = new ArrayList<>();

  @Valid
  private List<TargetingAdvertiserCountry> countries = new ArrayList<>();

  @Valid
  private List<String> customColumnIds = new ArrayList<>();

  private String endDate;

  private MMMReportGranularity granularity;

  private MMMReportLevel level;

  private String reportName;

  private String startDate;

  @Valid
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  public MMMReportCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MMMReportCreate(List<MMMReportingColumn> columns, String endDate, MMMReportGranularity granularity, MMMReportLevel level, String reportName, String startDate, List<MMMReportingTargetingType> targetingTypes) {
    this.columns = columns;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.reportName = reportName;
    this.startDate = startDate;
    this.targetingTypes = targetingTypes;
  }

  public MMMReportCreate advertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public MMMReportCreate addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

  /**
   * Advertiser IDs for multi-advertiser report
   * @return advertiserIds
   */
  
  @Schema(name = "advertiser_ids", description = "Advertiser IDs for multi-advertiser report", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advertiser_ids")
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }

  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  public MMMReportCreate columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public MMMReportCreate addColumnsItem(MMMReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Metric and entity columns
   * @return columns
   */
  @NotNull @Valid 
  @Schema(name = "columns", description = "Metric and entity columns", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("columns")
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  public MMMReportCreate countries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
    return this;
  }

  public MMMReportCreate addCountriesItem(TargetingAdvertiserCountry countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * A List of countries for filtering
   * @return countries
   */
  @Valid 
  @Schema(name = "countries", description = "A List of countries for filtering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countries")
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }

  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

  public MMMReportCreate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
    return this;
  }

  public MMMReportCreate addCustomColumnIdsItem(String customColumnIdsItem) {
    if (this.customColumnIds == null) {
      this.customColumnIds = new ArrayList<>();
    }
    this.customColumnIds.add(customColumnIdsItem);
    return this;
  }

  /**
   * List of custom column IDs
   * @return customColumnIds
   */
  @Size(max = 20) 
  @Schema(name = "custom_column_ids", description = "List of custom column IDs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_column_ids")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  public MMMReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "end_date", example = "2020-12-20", description = "Metric report end date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public MMMReportCreate granularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
   * @return granularity
   */
  @NotNull @Valid 
  @Schema(name = "granularity", description = "  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("granularity")
  public MMMReportGranularity getGranularity() {
    return granularity;
  }

  public void setGranularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
  }

  public MMMReportCreate level(MMMReportLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the report
   * @return level
   */
  @NotNull @Valid 
  @Schema(name = "level", description = "Level of the report", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public MMMReportLevel getLevel() {
    return level;
  }

  public void setLevel(MMMReportLevel level) {
    this.level = level;
  }

  public MMMReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * Name of the Marketing Mix Modeling (MMM) report
   * @return reportName
   */
  @NotNull 
  @Schema(name = "report_name", description = "Name of the Marketing Mix Modeling (MMM) report", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public MMMReportCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "start_date", example = "2020-12-20", description = "Metric report start date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public MMMReportCreate targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public MMMReportCreate addTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  /**
   * List of targeting types
   * @return targetingTypes
   */
  @NotNull @Valid @Size(min = 1, max = 7) 
  @Schema(name = "targeting_types", example = "[\"GENDER\"]", description = "List of targeting types", requiredMode = Schema.RequiredMode.REQUIRED)
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

