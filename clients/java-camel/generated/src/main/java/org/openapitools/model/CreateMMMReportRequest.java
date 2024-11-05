package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateMMMReportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateMMMReportRequest {

  private String reportName;

  private String startDate;

  private String endDate;

  /**
   * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
   */
  public enum GranularityEnum {
    DAY("DAY"),
    
    WEEK("WEEK");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private GranularityEnum granularity;

  /**
   * Level of the report
   */
  public enum LevelEnum {
    CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    
    AD_GROUP_TARGETING("AD_GROUP_TARGETING");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private LevelEnum level;

  @Valid
  private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

  @Valid
  private List<MMMReportingColumn> columns = new ArrayList<>();

  @Valid
  private List<TargetingAdvertiserCountry> countries = new ArrayList<>();

  public CreateMMMReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateMMMReportRequest(String reportName, String startDate, String endDate, GranularityEnum granularity, LevelEnum level, List<MMMReportingTargetingType> targetingTypes, List<MMMReportingColumn> columns) {
    this.reportName = reportName;
    this.startDate = startDate;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.targetingTypes = targetingTypes;
    this.columns = columns;
  }

  public CreateMMMReportRequest reportName(String reportName) {
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

  public CreateMMMReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
   */
  @NotNull @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "start_date", example = "2020-12-20", description = "Metric report start date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CreateMMMReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
   */
  @NotNull @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "end_date", example = "2020-12-20", description = "Metric report end date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CreateMMMReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
   * @return granularity
   */
  @NotNull 
  @Schema(name = "granularity", description = "DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }

  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  public CreateMMMReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the report
   * @return level
   */
  @NotNull 
  @Schema(name = "level", description = "Level of the report", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public CreateMMMReportRequest targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public CreateMMMReportRequest addTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
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
  @NotNull @Valid @Size(min = 1, max = 5) 
  @Schema(name = "targeting_types", example = "[\"GENDER\"]", description = "List of targeting types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targeting_types")
  public List<MMMReportingTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public CreateMMMReportRequest columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public CreateMMMReportRequest addColumnsItem(MMMReportingColumn columnsItem) {
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

  public CreateMMMReportRequest countries(List<TargetingAdvertiserCountry> countries) {
    this.countries = countries;
    return this;
  }

  public CreateMMMReportRequest addCountriesItem(TargetingAdvertiserCountry countriesItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

