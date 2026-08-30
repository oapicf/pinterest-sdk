package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.CreationSource;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.IngestionSource;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumn;
import org.openapitools.model.ReportingTimeZone;

/**
 * AccountTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AccountTemplate   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("ad_account_ids")
  private List<String> adAccountIds = null;

  @JsonProperty("ade_columns")
  private List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns = null;

  @JsonProperty("attribution_type")
  private Object attributionType = null;

  @JsonProperty("click_window_days")
  private BigDecimal clickWindowDays;

  @JsonProperty("columns")
  private List<ReportingColumn> columns = null;

  @JsonProperty("conversion_report_time_type")
  private ConversionReportTimeType conversionReportTimeType;

  @JsonProperty("creation_source")
  private CreationSource creationSource;

  @JsonProperty("custom_column_ids")
  private List<String> customColumnIds = null;

  @JsonProperty("display_metadata")
  private String displayMetadata;

  @JsonProperty("engagement_window_days")
  private BigDecimal engagementWindowDays;

  @JsonProperty("filters_json")
  private String filtersJson;

  @JsonProperty("granularity")
  private Granularity granularity;

  @JsonProperty("id")
  private String id;

  @JsonProperty("ingestion_sources")
  private List<IngestionSource> ingestionSources = null;

  @JsonProperty("is_default")
  private Boolean isDefault;

  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  @JsonProperty("is_owned_by_user")
  private Boolean isOwnedByUser;

  @JsonProperty("is_scheduled")
  private Boolean isScheduled;

  @JsonProperty("name")
  private String name;

  @JsonProperty("report_end_relative_days_in_past")
  private BigDecimal reportEndRelativeDaysInPast;

  @JsonProperty("report_format")
  private DataOutputFormat reportFormat;

  @JsonProperty("report_level")
  private MetricsReportingLevel reportLevel;

  @JsonProperty("report_start_relative_days_in_past")
  private BigDecimal reportStartRelativeDaysInPast;

  @JsonProperty("reporting_time_zone")
  private ReportingTimeZone reportingTimeZone;

  @JsonProperty("sort_by")
  private Object sortBy = null;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updated_time")
  private BigDecimal updatedTime;

  @JsonProperty("user_id")
  private String userId;

  @JsonProperty("view_window_days")
  private BigDecimal viewWindowDays;

   /**
   * ID of the Ad Account that owns the template
   * @return adAccountId
  **/
  @ApiModelProperty(value = "ID of the Ad Account that owns the template")
  public String getAdAccountId() {
    return adAccountId;
  }

  public AccountTemplate adAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
    return this;
  }

  public AccountTemplate addAdAccountIdsItem(String adAccountIdsItem) {
    if (this.adAccountIds == null) {
      this.adAccountIds = new ArrayList<>();
    }
    this.adAccountIds.add(adAccountIdsItem);
    return this;
  }

   /**
   * IDs of the Ad Accounts that have access to this template
   * @return adAccountIds
  **/
  @ApiModelProperty(value = "IDs of the Ad Accounts that have access to this template")
  public List<String> getAdAccountIds() {
    return adAccountIds;
  }

  public void setAdAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
  }

  public AccountTemplate adeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
    this.adeColumns = adeColumns;
    return this;
  }

  public AccountTemplate addAdeColumnsItem(String adeColumnsItem) {
    if (this.adeColumns == null) {
      this.adeColumns = new ArrayList<>();
    }
    this.adeColumns.add(adeColumnsItem);
    return this;
  }

   /**
   * A list of ADE columns
   * @return adeColumns
  **/
  @ApiModelProperty(example = "[\"ADE_COST_PER_ACTION-download_picture\"]", value = "A list of ADE columns")
  public List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> getAdeColumns() {
    return adeColumns;
  }

  public void setAdeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
    this.adeColumns = adeColumns;
  }

  public AccountTemplate attributionType(Object attributionType) {
    this.attributionType = attributionType;
    return this;
  }

   /**
   * Attribution type for Brand/Category/SKU reports
   * @return attributionType
  **/
  @ApiModelProperty(example = "ADVERTISER_LEVEL", value = "Attribution type for Brand/Category/SKU reports")
  public Object getAttributionType() {
    return attributionType;
  }

  public void setAttributionType(Object attributionType) {
    this.attributionType = attributionType;
  }

  public AccountTemplate clickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

   /**
   * The length of the sliding window over which click conversions will be attributed
   * @return clickWindowDays
  **/
  @ApiModelProperty(value = "The length of the sliding window over which click conversions will be attributed")
  public BigDecimal getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AccountTemplate columns(List<ReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public AccountTemplate addColumnsItem(ReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * A list of columns to be included in the report
   * @return columns
  **/
  @ApiModelProperty(value = "A list of columns to be included in the report")
  public List<ReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumn> columns) {
    this.columns = columns;
  }

  public AccountTemplate conversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
    return this;
  }

   /**
   * Conversion report time type
   * @return conversionReportTimeType
  **/
  @ApiModelProperty(value = "Conversion report time type")
  public ConversionReportTimeType getConversionReportTimeType() {
    return conversionReportTimeType;
  }

  public void setConversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
  }

  public AccountTemplate creationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
    return this;
  }

   /**
   * The surface used to create this template
   * @return creationSource
  **/
  @ApiModelProperty(value = "The surface used to create this template")
  public CreationSource getCreationSource() {
    return creationSource;
  }

  public void setCreationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
  }

  public AccountTemplate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
    return this;
  }

  public AccountTemplate addCustomColumnIdsItem(String customColumnIdsItem) {
    if (this.customColumnIds == null) {
      this.customColumnIds = ;
    }
    this.customColumnIds.add(customColumnIdsItem);
    return this;
  }

   /**
   * A list of custom column IDs
   * @return customColumnIds
  **/
  @ApiModelProperty(value = "A list of custom column IDs")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  public AccountTemplate displayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
    return this;
  }

   /**
   * Additional metadata about this reporting template
   * @return displayMetadata
  **/
  @ApiModelProperty(value = "Additional metadata about this reporting template")
  public String getDisplayMetadata() {
    return displayMetadata;
  }

  public void setDisplayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

  public AccountTemplate engagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

   /**
   * The length of the sliding window over which engagement conversions will be attributed
   * @return engagementWindowDays
  **/
  @ApiModelProperty(value = "The length of the sliding window over which engagement conversions will be attributed")
  public BigDecimal getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AccountTemplate filtersJson(String filtersJson) {
    this.filtersJson = filtersJson;
    return this;
  }

   /**
   * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
   * @return filtersJson
  **/
  @ApiModelProperty(value = "A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values")
  public String getFiltersJson() {
    return filtersJson;
  }

  public void setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
  }

  public AccountTemplate granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Get granularity
   * @return granularity
  **/
  @ApiModelProperty(value = "")
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

   /**
   * Template ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Template ID")
  public String getId() {
    return id;
  }

  public AccountTemplate ingestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
    return this;
  }

  public AccountTemplate addIngestionSourcesItem(IngestionSource ingestionSourcesItem) {
    if (this.ingestionSources == null) {
      this.ingestionSources = ;
    }
    this.ingestionSources.add(ingestionSourcesItem);
    return this;
  }

   /**
   * The filter on the conversion ingestion source method for conversion metrics
   * @return ingestionSources
  **/
  @ApiModelProperty(value = "The filter on the conversion ingestion source method for conversion metrics")
  public List<IngestionSource> getIngestionSources() {
    return ingestionSources;
  }

  public void setIngestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
  }

  public AccountTemplate isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * A boolean representing if this is the default view that loads for this template type
   * @return isDefault
  **/
  @ApiModelProperty(example = "false", value = "A boolean representing if this is the default view that loads for this template type")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public AccountTemplate isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * A boolean that indicates if the template has been deleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "A boolean that indicates if the template has been deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public AccountTemplate isOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
    return this;
  }

   /**
   * A boolean value that indicates if the user owns the template
   * @return isOwnedByUser
  **/
  @ApiModelProperty(value = "A boolean value that indicates if the user owns the template")
  public Boolean getIsOwnedByUser() {
    return isOwnedByUser;
  }

  public void setIsOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
  }

  public AccountTemplate isScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
    return this;
  }

   /**
   * A boolean value that indicates if this template has been used to create a scheduled report
   * @return isScheduled
  **/
  @ApiModelProperty(value = "A boolean value that indicates if this template has been used to create a scheduled report")
  public Boolean getIsScheduled() {
    return isScheduled;
  }

  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

  public AccountTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template Name
   * @return name
  **/
  @ApiModelProperty(value = "Template Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountTemplate reportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
    return this;
  }

   /**
   * The number of days prior to the day the report will be delivered at which the report will end
   * @return reportEndRelativeDaysInPast
  **/
  @ApiModelProperty(value = "The number of days prior to the day the report will be delivered at which the report will end")
  public BigDecimal getReportEndRelativeDaysInPast() {
    return reportEndRelativeDaysInPast;
  }

  public void setReportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
  }

  public AccountTemplate reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

   /**
   * Get reportFormat
   * @return reportFormat
  **/
  @ApiModelProperty(value = "")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  public AccountTemplate reportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
    return this;
  }

   /**
   * Get reportLevel
   * @return reportLevel
  **/
  @ApiModelProperty(value = "")
  public MetricsReportingLevel getReportLevel() {
    return reportLevel;
  }

  public void setReportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
  }

  public AccountTemplate reportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
    return this;
  }

   /**
   * The number of days prior to the day the report will be delivered at which the report will start
   * @return reportStartRelativeDaysInPast
  **/
  @ApiModelProperty(value = "The number of days prior to the day the report will be delivered at which the report will start")
  public BigDecimal getReportStartRelativeDaysInPast() {
    return reportStartRelativeDaysInPast;
  }

  public void setReportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
  }

  public AccountTemplate reportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
    return this;
  }

   /**
   * Timezone for reporting data
   * @return reportingTimeZone
  **/
  @ApiModelProperty(value = "Timezone for reporting data")
  public ReportingTimeZone getReportingTimeZone() {
    return reportingTimeZone;
  }

  public void setReportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
  }

  public AccountTemplate sortBy(Object sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Unified metric sort configuration
   * @return sortBy
  **/
  @ApiModelProperty(value = "Unified metric sort configuration")
  public Object getSortBy() {
    return sortBy;
  }

  public void setSortBy(Object sortBy) {
    this.sortBy = sortBy;
  }

  public AccountTemplate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the template
   * @return type
  **/
  @ApiModelProperty(value = "Type of the template")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

   /**
   * Time of last update in seconds since Unix epoch
   * @return updatedTime
  **/
  @ApiModelProperty(value = "Time of last update in seconds since Unix epoch")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  public AccountTemplate userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user who created the template
   * @return userId
  **/
  @ApiModelProperty(value = "ID of the user who created the template")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AccountTemplate viewWindowDays(BigDecimal viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * The length of the sliding window over which view conversions will be attributed
   * @return viewWindowDays
  **/
  @ApiModelProperty(value = "The length of the sliding window over which view conversions will be attributed")
  public BigDecimal getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(BigDecimal viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTemplate accountTemplate = (AccountTemplate) o;
    return Objects.equals(this.adAccountId, accountTemplate.adAccountId) &&
        Objects.equals(this.adAccountIds, accountTemplate.adAccountIds) &&
        Objects.equals(this.adeColumns, accountTemplate.adeColumns) &&
        Objects.equals(this.attributionType, accountTemplate.attributionType) &&
        Objects.equals(this.clickWindowDays, accountTemplate.clickWindowDays) &&
        Objects.equals(this.columns, accountTemplate.columns) &&
        Objects.equals(this.conversionReportTimeType, accountTemplate.conversionReportTimeType) &&
        Objects.equals(this.creationSource, accountTemplate.creationSource) &&
        Objects.equals(this.customColumnIds, accountTemplate.customColumnIds) &&
        Objects.equals(this.displayMetadata, accountTemplate.displayMetadata) &&
        Objects.equals(this.engagementWindowDays, accountTemplate.engagementWindowDays) &&
        Objects.equals(this.filtersJson, accountTemplate.filtersJson) &&
        Objects.equals(this.granularity, accountTemplate.granularity) &&
        Objects.equals(this.id, accountTemplate.id) &&
        Objects.equals(this.ingestionSources, accountTemplate.ingestionSources) &&
        Objects.equals(this.isDefault, accountTemplate.isDefault) &&
        Objects.equals(this.isDeleted, accountTemplate.isDeleted) &&
        Objects.equals(this.isOwnedByUser, accountTemplate.isOwnedByUser) &&
        Objects.equals(this.isScheduled, accountTemplate.isScheduled) &&
        Objects.equals(this.name, accountTemplate.name) &&
        Objects.equals(this.reportEndRelativeDaysInPast, accountTemplate.reportEndRelativeDaysInPast) &&
        Objects.equals(this.reportFormat, accountTemplate.reportFormat) &&
        Objects.equals(this.reportLevel, accountTemplate.reportLevel) &&
        Objects.equals(this.reportStartRelativeDaysInPast, accountTemplate.reportStartRelativeDaysInPast) &&
        Objects.equals(this.reportingTimeZone, accountTemplate.reportingTimeZone) &&
        Objects.equals(this.sortBy, accountTemplate.sortBy) &&
        Objects.equals(this.type, accountTemplate.type) &&
        Objects.equals(this.updatedTime, accountTemplate.updatedTime) &&
        Objects.equals(this.userId, accountTemplate.userId) &&
        Objects.equals(this.viewWindowDays, accountTemplate.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adAccountIds, adeColumns, attributionType, clickWindowDays, columns, conversionReportTimeType, creationSource, customColumnIds, displayMetadata, engagementWindowDays, filtersJson, granularity, id, ingestionSources, isDefault, isDeleted, isOwnedByUser, isScheduled, name, reportEndRelativeDaysInPast, reportFormat, reportLevel, reportStartRelativeDaysInPast, reportingTimeZone, sortBy, type, updatedTime, userId, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTemplate {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    adAccountIds: ").append(toIndentedString(adAccountIds)).append("\n");
    sb.append("    adeColumns: ").append(toIndentedString(adeColumns)).append("\n");
    sb.append("    attributionType: ").append(toIndentedString(attributionType)).append("\n");
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    conversionReportTimeType: ").append(toIndentedString(conversionReportTimeType)).append("\n");
    sb.append("    creationSource: ").append(toIndentedString(creationSource)).append("\n");
    sb.append("    customColumnIds: ").append(toIndentedString(customColumnIds)).append("\n");
    sb.append("    displayMetadata: ").append(toIndentedString(displayMetadata)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    filtersJson: ").append(toIndentedString(filtersJson)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingestionSources: ").append(toIndentedString(ingestionSources)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isOwnedByUser: ").append(toIndentedString(isOwnedByUser)).append("\n");
    sb.append("    isScheduled: ").append(toIndentedString(isScheduled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reportEndRelativeDaysInPast: ").append(toIndentedString(reportEndRelativeDaysInPast)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    reportLevel: ").append(toIndentedString(reportLevel)).append("\n");
    sb.append("    reportStartRelativeDaysInPast: ").append(toIndentedString(reportStartRelativeDaysInPast)).append("\n");
    sb.append("    reportingTimeZone: ").append(toIndentedString(reportingTimeZone)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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

