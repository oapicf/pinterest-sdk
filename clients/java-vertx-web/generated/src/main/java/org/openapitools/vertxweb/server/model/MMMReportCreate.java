package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MMMReportGranularity;
import org.openapitools.vertxweb.server.model.MMMReportLevel;
import org.openapitools.vertxweb.server.model.MMMReportingColumn;
import org.openapitools.vertxweb.server.model.MMMReportingTargetingType;
import org.openapitools.vertxweb.server.model.TargetingAdvertiserCountry;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public MMMReportCreate () {

  }

  public MMMReportCreate (List<String> advertiserIds, List<MMMReportingColumn> columns, List<TargetingAdvertiserCountry> countries, List<String> customColumnIds, String endDate, MMMReportGranularity granularity, MMMReportLevel level, String reportName, String startDate, List<MMMReportingTargetingType> targetingTypes) {
    this.advertiserIds = advertiserIds;
    this.columns = columns;
    this.countries = countries;
    this.customColumnIds = customColumnIds;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.reportName = reportName;
    this.startDate = startDate;
    this.targetingTypes = targetingTypes;
  }

    
  @JsonProperty("advertiser_ids")
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }
  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

    
  @JsonProperty("columns")
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

    
  @JsonProperty("countries")
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }
  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

    
  @JsonProperty("custom_column_ids")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }
  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("granularity")
  public MMMReportGranularity getGranularity() {
    return granularity;
  }
  public void setGranularity(MMMReportGranularity granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("level")
  public MMMReportLevel getLevel() {
    return level;
  }
  public void setLevel(MMMReportLevel level) {
    this.level = level;
  }

    
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
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
