/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateMMMReportRequest   {
  
  private String reportName;
  private String startDate;
  private String endDate;


  public enum GranularityEnum {
    DAY("DAY"),
    WEEK("WEEK");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private GranularityEnum granularity;


  public enum LevelEnum {
    CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    AD_GROUP_TARGETING("AD_GROUP_TARGETING");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LevelEnum level;
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();
  private List<MMMReportingColumn> columns = new ArrayList<>();
  private List<TargetingAdvertiserCountry> countries;

  /**
   * Name of the Marketing Mix Modeling (MMM) report
   */
  public CreateMMMReportRequest reportName(String reportName) {
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
   */
  public CreateMMMReportRequest startDate(String startDate) {
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
   * Metric report end date (UTC). Format: YYYY-MM-DD
   */
  public CreateMMMReportRequest endDate(String endDate) {
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
   * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
   */
  public CreateMMMReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   */
  public CreateMMMReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * List of targeting types
   */
  public CreateMMMReportRequest targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
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

  /**
   * Metric and entity columns
   */
  public CreateMMMReportRequest columns(List<MMMReportingColumn> columns) {
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
   */
  public CreateMMMReportRequest countries(List<TargetingAdvertiserCountry> countries) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMMMReportRequest createMMMReportRequest = (CreateMMMReportRequest) o;
    return Objects.equals(reportName, createMMMReportRequest.reportName) &&
        Objects.equals(startDate, createMMMReportRequest.startDate) &&
        Objects.equals(endDate, createMMMReportRequest.endDate) &&
        Objects.equals(granularity, createMMMReportRequest.granularity) &&
        Objects.equals(level, createMMMReportRequest.level) &&
        Objects.equals(targetingTypes, createMMMReportRequest.targetingTypes) &&
        Objects.equals(columns, createMMMReportRequest.columns) &&
        Objects.equals(countries, createMMMReportRequest.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportName, startDate, endDate, granularity, level, targetingTypes, columns, countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMMMReportRequest {\n");
    
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    targetingTypes: ").append(toIndentedString(targetingTypes)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

