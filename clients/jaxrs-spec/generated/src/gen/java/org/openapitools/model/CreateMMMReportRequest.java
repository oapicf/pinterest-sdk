package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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



@JsonTypeName("CreateMMMReportRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateMMMReportRequest   {
  private String reportName;
  private String startDate;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static GranularityEnum fromString(String s) {
        for (GranularityEnum b : GranularityEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static LevelEnum fromString(String s) {
        for (LevelEnum b : LevelEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private @Valid List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();
  private @Valid List<MMMReportingColumn> columns = new ArrayList<>();
  private @Valid List<TargetingAdvertiserCountry> countries = new ArrayList<>();

  /**
   * Name of the Marketing Mix Modeling (MMM) report
   **/
  public CreateMMMReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the Marketing Mix Modeling (MMM) report")
  @JsonProperty("report_name")
  @NotNull public String getReportName() {
    return reportName;
  }

  @JsonProperty("report_name")
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   **/
  public CreateMMMReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  public CreateMMMReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.
   **/
  public CreateMMMReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.")
  @JsonProperty("granularity")
  @NotNull public GranularityEnum getGranularity() {
    return granularity;
  }

  @JsonProperty("granularity")
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  public CreateMMMReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  @NotNull public LevelEnum getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * List of targeting types
   **/
  public CreateMMMReportRequest targetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"GENDER\"]", required = true, value = "List of targeting types")
  @JsonProperty("targeting_types")
  @NotNull  @Size(min=1,max=5)public List<MMMReportingTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  @JsonProperty("targeting_types")
  public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public CreateMMMReportRequest addTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }

    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  public CreateMMMReportRequest removeTargetingTypesItem(MMMReportingTargetingType targetingTypesItem) {
    if (targetingTypesItem != null && this.targetingTypes != null) {
      this.targetingTypes.remove(targetingTypesItem);
    }

    return this;
  }
  /**
   * Metric and entity columns
   **/
  public CreateMMMReportRequest columns(List<MMMReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  @NotNull public List<MMMReportingColumn> getColumns() {
    return columns;
  }

  @JsonProperty("columns")
  public void setColumns(List<MMMReportingColumn> columns) {
    this.columns = columns;
  }

  public CreateMMMReportRequest addColumnsItem(MMMReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }

    this.columns.add(columnsItem);
    return this;
  }

  public CreateMMMReportRequest removeColumnsItem(MMMReportingColumn columnsItem) {
    if (columnsItem != null && this.columns != null) {
      this.columns.remove(columnsItem);
    }

    return this;
  }
  /**
   * A List of countries for filtering
   **/
  public CreateMMMReportRequest countries(List<TargetingAdvertiserCountry> countries) {
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

  public CreateMMMReportRequest addCountriesItem(TargetingAdvertiserCountry countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }

    this.countries.add(countriesItem);
    return this;
  }

  public CreateMMMReportRequest removeCountriesItem(TargetingAdvertiserCountry countriesItem) {
    if (countriesItem != null && this.countries != null) {
      this.countries.remove(countriesItem);
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

