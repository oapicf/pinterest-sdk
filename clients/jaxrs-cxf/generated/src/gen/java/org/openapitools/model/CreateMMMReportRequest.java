package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateMMMReportRequest  {
  
  @ApiModelProperty(required = true, value = "Name of the Marketing Mix Modeling (MMM) report")
 /**
   * Name of the Marketing Mix Modeling (MMM) report
  **/
  private String reportName;

  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
 /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
  **/
  private String startDate;

  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
 /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
  **/
  private String endDate;

public enum GranularityEnum {

DAY(String.valueOf("DAY")), WEEK(String.valueOf("WEEK"));


    private String value;

    GranularityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static GranularityEnum fromValue(String value) {
        for (GranularityEnum b : GranularityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.")
 /**
   * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  **/
  private GranularityEnum granularity;

public enum LevelEnum {

CAMPAIGN_TARGETING(String.valueOf("CAMPAIGN_TARGETING")), AD_GROUP_TARGETING(String.valueOf("AD_GROUP_TARGETING"));


    private String value;

    LevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String value) {
        for (LevelEnum b : LevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "Level of the report")
 /**
   * Level of the report
  **/
  private LevelEnum level;

  @ApiModelProperty(example = "[\"GENDER\"]", required = true, value = "List of targeting types")
  @Valid
 /**
   * List of targeting types
  **/
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @Valid
 /**
   * Metric and entity columns
  **/
  private List<MMMReportingColumn> columns = new ArrayList<>();

  @ApiModelProperty(value = "A List of countries for filtering")
  @Valid
 /**
   * A List of countries for filtering
  **/
  private List<TargetingAdvertiserCountry> countries;
 /**
   * Name of the Marketing Mix Modeling (MMM) report
   * @return reportName
  **/
  @JsonProperty("report_name")
  @NotNull
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public CreateMMMReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

 /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  **/
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CreateMMMReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
  **/
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CreateMMMReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.
   * @return granularity
  **/
  @JsonProperty("granularity")
  @NotNull
  public String getGranularity() {
    if (granularity == null) {
      return null;
    }
    return granularity.value();
  }

  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  public CreateMMMReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
   * Level of the report
   * @return level
  **/
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    if (level == null) {
      return null;
    }
    return level.value();
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public CreateMMMReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

 /**
   * List of targeting types
   * @return targetingTypes
  **/
  @JsonProperty("targeting_types")
  @NotNull
 @Size(min=1,max=5)  public List<MMMReportingTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public CreateMMMReportRequest targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public CreateMMMReportRequest addTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

 /**
   * Metric and entity columns
   * @return columns
  **/
  @JsonProperty("columns")
  @NotNull
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  public CreateMMMReportRequest columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public CreateMMMReportRequest addColumnsItem(MMMReportingColumn columnsItem) {
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

  public CreateMMMReportRequest countries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
    return this;
  }

  public CreateMMMReportRequest addCountriesItem(TargetingAdvertiserCountry countriesItem) {
    this.countries.add(countriesItem);
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
    CreateMMMReportRequest createMMMReportRequest = (CreateMMMReportRequest) o;
    return Objects.equals(this.reportName, createMMMReportRequest.reportName) &&
        Objects.equals(this.startDate, createMMMReportRequest.startDate) &&
        Objects.equals(this.endDate, createMMMReportRequest.endDate) &&
        Objects.equals(this.granularity, createMMMReportRequest.granularity) &&
        Objects.equals(this.level, createMMMReportRequest.level) &&
        Objects.equals(this.targetingTypes, createMMMReportRequest.targetingTypes) &&
        Objects.equals(this.columns, createMMMReportRequest.columns) &&
        Objects.equals(this.countries, createMMMReportRequest.countries);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

