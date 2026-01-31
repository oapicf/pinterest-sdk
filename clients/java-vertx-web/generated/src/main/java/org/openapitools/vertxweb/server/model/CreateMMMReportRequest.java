package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MMMReportingColumn;
import org.openapitools.vertxweb.server.model.MMMReportingTargetingType;
import org.openapitools.vertxweb.server.model.TargetingAdvertiserCountry;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMMMReportRequest   {
  
  private List<TargetingAdvertiserCountry> countries = new ArrayList<>();
  private List<MMMReportingColumn> columns = new ArrayList<>();
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
  private String reportName;
  private String startDate;
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  public CreateMMMReportRequest () {

  }

  public CreateMMMReportRequest (List<TargetingAdvertiserCountry> countries, List<MMMReportingColumn> columns, String endDate, GranularityEnum granularity, LevelEnum level, String reportName, String startDate, List<MMMReportingTargetingType> targetingTypes) {
    this.countries = countries;
    this.columns = columns;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.reportName = reportName;
    this.startDate = startDate;
    this.targetingTypes = targetingTypes;
  }

    
  @JsonProperty("countries")
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }
  public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

    
  @JsonProperty("columns")
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
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
    CreateMMMReportRequest createMMMReportRequest = (CreateMMMReportRequest) o;
    return Objects.equals(countries, createMMMReportRequest.countries) &&
        Objects.equals(columns, createMMMReportRequest.columns) &&
        Objects.equals(endDate, createMMMReportRequest.endDate) &&
        Objects.equals(granularity, createMMMReportRequest.granularity) &&
        Objects.equals(level, createMMMReportRequest.level) &&
        Objects.equals(reportName, createMMMReportRequest.reportName) &&
        Objects.equals(startDate, createMMMReportRequest.startDate) &&
        Objects.equals(targetingTypes, createMMMReportRequest.targetingTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, columns, endDate, granularity, level, reportName, startDate, targetingTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMMMReportRequest {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
