package apimodels;

import apimodels.MMMReportGranularity;
import apimodels.MMMReportLevel;
import apimodels.MMMReportingColumn;
import apimodels.MMMReportingTargetingType;
import apimodels.TargetingAdvertiserCountry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MMMReportCreate   {
  @JsonProperty("advertiser_ids")
  
  private List<String> advertiserIds = null;

  @JsonProperty("columns")
  @NotNull
@Valid

  private List<MMMReportingColumn> columns = new ArrayList<>();

  @JsonProperty("countries")
  @Valid

  private List<TargetingAdvertiserCountry> countries = null;

  @JsonProperty("custom_column_ids")
  @Size(max=20)

  private List<String> customColumnIds = null;

  @JsonProperty("end_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String endDate;

  @JsonProperty("granularity")
  @NotNull
@Valid

  private MMMReportGranularity granularity;

  @JsonProperty("level")
  @NotNull
@Valid

  private MMMReportLevel level;

  @JsonProperty("report_name")
  @NotNull

  private String reportName;

  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String startDate;

  @JsonProperty("targeting_types")
  @NotNull
@Size(min=1,max=7)
@Valid

  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

