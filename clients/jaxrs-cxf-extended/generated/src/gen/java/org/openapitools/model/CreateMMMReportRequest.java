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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateMMMReportRequest  {
  
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
  * Metric report end date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  private String endDate;

public enum GranularityEnum {

    @JsonProperty("DAY") DAY(String.valueOf("DAY")),
    @JsonProperty("WEEK") WEEK(String.valueOf("WEEK"));

    private String value;

    GranularityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GranularityEnum fromValue(String value) {
        for (GranularityEnum b : GranularityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  */
  @ApiModelProperty(required = true, value = "DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.")
  private GranularityEnum granularity;

public enum LevelEnum {

    @JsonProperty("CAMPAIGN_TARGETING") CAMPAIGN_TARGETING(String.valueOf("CAMPAIGN_TARGETING")),
    @JsonProperty("AD_GROUP_TARGETING") AD_GROUP_TARGETING(String.valueOf("AD_GROUP_TARGETING"));

    private String value;

    LevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LevelEnum fromValue(String value) {
        for (LevelEnum b : LevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Level of the report
  */
  @ApiModelProperty(required = true, value = "Level of the report")
  private LevelEnum level;

 /**
  * List of targeting types
  */
  @ApiModelProperty(example = "[\"GENDER\"]", required = true, value = "List of targeting types")
  @Valid
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

 /**
  * Metric and entity columns
  */
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @Valid
  private List<MMMReportingColumn> columns = new ArrayList<>();

 /**
  * A List of countries for filtering
  */
  @ApiModelProperty(value = "A List of countries for filtering")
  @Valid
  private List<TargetingAdvertiserCountry> countries;
 /**
  * Name of the Marketing Mix Modeling (MMM) report
  * @return reportName
  */
  @JsonProperty("report_name")
  @NotNull
  public String getReportName() {
    return reportName;
  }

  /**
   * Sets the <code>reportName</code> property.
   */
 public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Sets the <code>reportName</code> property.
   */
  public CreateMMMReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

 /**
  * Metric report start date (UTC). Format: YYYY-MM-DD
  * @return startDate
  */
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public CreateMMMReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * Metric report end date (UTC). Format: YYYY-MM-DD
  * @return endDate
  */
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public CreateMMMReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.
  * @return granularity
  */
  @JsonProperty("granularity")
  @NotNull
  public String getGranularity() {
    return granularity == null ? null : granularity.value();
  }

  /**
   * Sets the <code>granularity</code> property.
   */
 public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
  public CreateMMMReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
  * Level of the report
  * @return level
  */
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    return level == null ? null : level.value();
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public CreateMMMReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

 /**
  * List of targeting types
  * @return targetingTypes
  */
  @JsonProperty("targeting_types")
  @NotNull
 @Size(min=1,max=5)  public List<MMMReportingTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
 public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
  public CreateMMMReportRequest targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>targetingTypes</code> list.
   */
  public CreateMMMReportRequest addTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

 /**
  * Metric and entity columns
  * @return columns
  */
  @JsonProperty("columns")
  @NotNull
  public List<MMMReportingColumn> getColumns() {
    return columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
 public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
  public CreateMMMReportRequest columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Adds a new item to the <code>columns</code> list.
   */
  public CreateMMMReportRequest addColumnsItem(MMMReportingColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
  * A List of countries for filtering
  * @return countries
  */
  @JsonProperty("countries")
  public List<TargetingAdvertiserCountry> getCountries() {
    return countries;
  }

  /**
   * Sets the <code>countries</code> property.
   */
 public void setCountries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
  }

  /**
   * Sets the <code>countries</code> property.
   */
  public CreateMMMReportRequest countries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
    return this;
  }

  /**
   * Adds a new item to the <code>countries</code> list.
   */
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

