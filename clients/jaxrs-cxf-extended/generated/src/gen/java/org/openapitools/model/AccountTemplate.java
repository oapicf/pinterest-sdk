package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountTemplate  {
  
 /**
  * ID of the Ad Account that owns the template
  */
  @ApiModelProperty(value = "ID of the Ad Account that owns the template")
  private String adAccountId;

 /**
  * IDs of the Ad Accounts that have access to this template
  */
  @ApiModelProperty(value = "IDs of the Ad Accounts that have access to this template")
  private List<String> adAccountIds = new ArrayList<>();

 /**
  * A list of ADE columns
  */
  @ApiModelProperty(example = "[\"ADE_COST_PER_ACTION-download_picture\"]", value = "A list of ADE columns")
  private List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns = new ArrayList<>();

 /**
  * Attribution type for Brand/Category/SKU reports
  */
  @ApiModelProperty(example = "ADVERTISER_LEVEL", value = "Attribution type for Brand/Category/SKU reports")
  private Object attributionType = null;

 /**
  * The length of the sliding window over which click conversions will be attributed
  */
  @ApiModelProperty(value = "The length of the sliding window over which click conversions will be attributed")
  @Valid
  private BigDecimal clickWindowDays;

 /**
  * A list of columns to be included in the report
  */
  @ApiModelProperty(value = "A list of columns to be included in the report")
  @Valid
  private List<ReportingColumn> columns = new ArrayList<>();

 /**
  * Conversion report time type
  */
  @ApiModelProperty(value = "Conversion report time type")
  @Valid
  private ConversionReportTimeType conversionReportTimeType;

 /**
  * The surface used to create this template
  */
  @ApiModelProperty(value = "The surface used to create this template")
  @Valid
  private CreationSource creationSource;

 /**
  * A list of custom column IDs
  */
  @ApiModelProperty(value = "A list of custom column IDs")
  private List<String> customColumnIds;

 /**
  * Additional metadata about this reporting template
  */
  @ApiModelProperty(value = "Additional metadata about this reporting template")
  private String displayMetadata;

 /**
  * The length of the sliding window over which engagement conversions will be attributed
  */
  @ApiModelProperty(value = "The length of the sliding window over which engagement conversions will be attributed")
  @Valid
  private BigDecimal engagementWindowDays;

 /**
  * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
  */
  @ApiModelProperty(value = "A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values")
  private String filtersJson;

  @ApiModelProperty(value = "")
  @Valid
  private Granularity granularity;

 /**
  * Template ID
  */
  @ApiModelProperty(required = true, value = "Template ID")
  private String id;

 /**
  * The filter on the conversion ingestion source method for conversion metrics
  */
  @ApiModelProperty(value = "The filter on the conversion ingestion source method for conversion metrics")
  @Valid
  private List<IngestionSource> ingestionSources;

 /**
  * A boolean representing if this is the default view that loads for this template type
  */
  @ApiModelProperty(example = "false", value = "A boolean representing if this is the default view that loads for this template type")
  private Boolean isDefault;

 /**
  * A boolean that indicates if the template has been deleted
  */
  @ApiModelProperty(value = "A boolean that indicates if the template has been deleted")
  private Boolean isDeleted;

 /**
  * A boolean value that indicates if the user owns the template
  */
  @ApiModelProperty(value = "A boolean value that indicates if the user owns the template")
  private Boolean isOwnedByUser;

 /**
  * A boolean value that indicates if this template has been used to create a scheduled report
  */
  @ApiModelProperty(value = "A boolean value that indicates if this template has been used to create a scheduled report")
  private Boolean isScheduled;

 /**
  * Template Name
  */
  @ApiModelProperty(value = "Template Name")
  private String name;

 /**
  * The number of days prior to the day the report will be delivered at which the report will end
  */
  @ApiModelProperty(value = "The number of days prior to the day the report will be delivered at which the report will end")
  @Valid
  private BigDecimal reportEndRelativeDaysInPast;

  @ApiModelProperty(value = "")
  @Valid
  private DataOutputFormat reportFormat;

  @ApiModelProperty(value = "")
  @Valid
  private MetricsReportingLevel reportLevel;

 /**
  * The number of days prior to the day the report will be delivered at which the report will start
  */
  @ApiModelProperty(value = "The number of days prior to the day the report will be delivered at which the report will start")
  @Valid
  private BigDecimal reportStartRelativeDaysInPast;

 /**
  * Timezone for reporting data
  */
  @ApiModelProperty(value = "Timezone for reporting data")
  @Valid
  private ReportingTimeZone reportingTimeZone;

 /**
  * Unified metric sort configuration
  */
  @ApiModelProperty(value = "Unified metric sort configuration")
  private Object sortBy = null;

 /**
  * Type of the template
  */
  @ApiModelProperty(value = "Type of the template")
  private String type;

 /**
  * Time of last update in seconds since Unix epoch
  */
  @ApiModelProperty(value = "Time of last update in seconds since Unix epoch")
  @Valid
  private BigDecimal updatedTime;

 /**
  * ID of the user who created the template
  */
  @ApiModelProperty(value = "ID of the user who created the template")
  private String userId;

 /**
  * The length of the sliding window over which view conversions will be attributed
  */
  @ApiModelProperty(value = "The length of the sliding window over which view conversions will be attributed")
  @Valid
  private BigDecimal viewWindowDays;
 /**
  * ID of the Ad Account that owns the template
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AccountTemplate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * IDs of the Ad Accounts that have access to this template
  * @return adAccountIds
  */
  @JsonProperty("ad_account_ids")
  public List<String> getAdAccountIds() {
    return adAccountIds;
  }

  /**
   * Sets the <code>adAccountIds</code> property.
   */
 public void setAdAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
  }

  /**
   * Sets the <code>adAccountIds</code> property.
   */
  public AccountTemplate adAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
    return this;
  }

  /**
   * Adds a new item to the <code>adAccountIds</code> list.
   */
  public AccountTemplate addAdAccountIdsItem(String adAccountIdsItem) {
    this.adAccountIds.add(adAccountIdsItem);
    return this;
  }

 /**
  * A list of ADE columns
  * @return adeColumns
  */
  @JsonProperty("ade_columns")
  public List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> getAdeColumns() {
    return adeColumns;
  }

  /**
   * Sets the <code>adeColumns</code> property.
   */
 public void setAdeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
    this.adeColumns = adeColumns;
  }

  /**
   * Sets the <code>adeColumns</code> property.
   */
  public AccountTemplate adeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
    this.adeColumns = adeColumns;
    return this;
  }

  /**
   * Adds a new item to the <code>adeColumns</code> list.
   */
  public AccountTemplate addAdeColumnsItem(String adeColumnsItem) {
    this.adeColumns.add(adeColumnsItem);
    return this;
  }

 /**
  * Attribution type for Brand/Category/SKU reports
  * @return attributionType
  */
  @JsonProperty("attribution_type")
  public Object getAttributionType() {
    return attributionType;
  }

  /**
   * Sets the <code>attributionType</code> property.
   */
 public void setAttributionType(Object attributionType) {
    this.attributionType = attributionType;
  }

  /**
   * Sets the <code>attributionType</code> property.
   */
  public AccountTemplate attributionType(Object attributionType) {
    this.attributionType = attributionType;
    return this;
  }

 /**
  * The length of the sliding window over which click conversions will be attributed
  * @return clickWindowDays
  */
  @JsonProperty("click_window_days")
  public BigDecimal getClickWindowDays() {
    return clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
 public void setClickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
  public AccountTemplate clickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

 /**
  * A list of columns to be included in the report
  * @return columns
  */
  @JsonProperty("columns")
  public List<ReportingColumn> getColumns() {
    return columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
 public void setColumns(List<ReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
  public AccountTemplate columns(List<ReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Adds a new item to the <code>columns</code> list.
   */
  public AccountTemplate addColumnsItem(ReportingColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
  * Conversion report time type
  * @return conversionReportTimeType
  */
  @JsonProperty("conversion_report_time_type")
  public ConversionReportTimeType getConversionReportTimeType() {
    return conversionReportTimeType;
  }

  /**
   * Sets the <code>conversionReportTimeType</code> property.
   */
 public void setConversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
  }

  /**
   * Sets the <code>conversionReportTimeType</code> property.
   */
  public AccountTemplate conversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
    return this;
  }

 /**
  * The surface used to create this template
  * @return creationSource
  */
  @JsonProperty("creation_source")
  public CreationSource getCreationSource() {
    return creationSource;
  }

  /**
   * Sets the <code>creationSource</code> property.
   */
 public void setCreationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
  }

  /**
   * Sets the <code>creationSource</code> property.
   */
  public AccountTemplate creationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
    return this;
  }

 /**
  * A list of custom column IDs
  * @return customColumnIds
  */
  @JsonProperty("custom_column_ids")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  /**
   * Sets the <code>customColumnIds</code> property.
   */
 public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  /**
   * Sets the <code>customColumnIds</code> property.
   */
  public AccountTemplate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
    return this;
  }

  /**
   * Adds a new item to the <code>customColumnIds</code> list.
   */
  public AccountTemplate addCustomColumnIdsItem(String customColumnIdsItem) {
    this.customColumnIds.add(customColumnIdsItem);
    return this;
  }

 /**
  * Additional metadata about this reporting template
  * @return displayMetadata
  */
  @JsonProperty("display_metadata")
  public String getDisplayMetadata() {
    return displayMetadata;
  }

  /**
   * Sets the <code>displayMetadata</code> property.
   */
 public void setDisplayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

  /**
   * Sets the <code>displayMetadata</code> property.
   */
  public AccountTemplate displayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
    return this;
  }

 /**
  * The length of the sliding window over which engagement conversions will be attributed
  * @return engagementWindowDays
  */
  @JsonProperty("engagement_window_days")
  public BigDecimal getEngagementWindowDays() {
    return engagementWindowDays;
  }

  /**
   * Sets the <code>engagementWindowDays</code> property.
   */
 public void setEngagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   * Sets the <code>engagementWindowDays</code> property.
   */
  public AccountTemplate engagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

 /**
  * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values
  * @return filtersJson
  */
  @JsonProperty("filters_json")
  public String getFiltersJson() {
    return filtersJson;
  }

  /**
   * Sets the <code>filtersJson</code> property.
   */
 public void setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
  }

  /**
   * Sets the <code>filtersJson</code> property.
   */
  public AccountTemplate filtersJson(String filtersJson) {
    this.filtersJson = filtersJson;
    return this;
  }

 /**
  * Get granularity
  * @return granularity
  */
  @JsonProperty("granularity")
  public Granularity getGranularity() {
    return granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
 public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
  public AccountTemplate granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
  * Template ID
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AccountTemplate id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The filter on the conversion ingestion source method for conversion metrics
  * @return ingestionSources
  */
  @JsonProperty("ingestion_sources")
  public List<IngestionSource> getIngestionSources() {
    return ingestionSources;
  }

  /**
   * Sets the <code>ingestionSources</code> property.
   */
 public void setIngestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
  }

  /**
   * Sets the <code>ingestionSources</code> property.
   */
  public AccountTemplate ingestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
    return this;
  }

  /**
   * Adds a new item to the <code>ingestionSources</code> list.
   */
  public AccountTemplate addIngestionSourcesItem(IngestionSource ingestionSourcesItem) {
    this.ingestionSources.add(ingestionSourcesItem);
    return this;
  }

 /**
  * A boolean representing if this is the default view that loads for this template type
  * @return isDefault
  */
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
 public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
  public AccountTemplate isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
  * A boolean that indicates if the template has been deleted
  * @return isDeleted
  */
  @JsonProperty("is_deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * Sets the <code>isDeleted</code> property.
   */
 public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   * Sets the <code>isDeleted</code> property.
   */
  public AccountTemplate isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

 /**
  * A boolean value that indicates if the user owns the template
  * @return isOwnedByUser
  */
  @JsonProperty("is_owned_by_user")
  public Boolean getIsOwnedByUser() {
    return isOwnedByUser;
  }

  /**
   * Sets the <code>isOwnedByUser</code> property.
   */
 public void setIsOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
  }

  /**
   * Sets the <code>isOwnedByUser</code> property.
   */
  public AccountTemplate isOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
    return this;
  }

 /**
  * A boolean value that indicates if this template has been used to create a scheduled report
  * @return isScheduled
  */
  @JsonProperty("is_scheduled")
  public Boolean getIsScheduled() {
    return isScheduled;
  }

  /**
   * Sets the <code>isScheduled</code> property.
   */
 public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

  /**
   * Sets the <code>isScheduled</code> property.
   */
  public AccountTemplate isScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
    return this;
  }

 /**
  * Template Name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AccountTemplate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The number of days prior to the day the report will be delivered at which the report will end
  * @return reportEndRelativeDaysInPast
  */
  @JsonProperty("report_end_relative_days_in_past")
  public BigDecimal getReportEndRelativeDaysInPast() {
    return reportEndRelativeDaysInPast;
  }

  /**
   * Sets the <code>reportEndRelativeDaysInPast</code> property.
   */
 public void setReportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
  }

  /**
   * Sets the <code>reportEndRelativeDaysInPast</code> property.
   */
  public AccountTemplate reportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
    return this;
  }

 /**
  * Get reportFormat
  * @return reportFormat
  */
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  /**
   * Sets the <code>reportFormat</code> property.
   */
 public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   * Sets the <code>reportFormat</code> property.
   */
  public AccountTemplate reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

 /**
  * Get reportLevel
  * @return reportLevel
  */
  @JsonProperty("report_level")
  public MetricsReportingLevel getReportLevel() {
    return reportLevel;
  }

  /**
   * Sets the <code>reportLevel</code> property.
   */
 public void setReportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
  }

  /**
   * Sets the <code>reportLevel</code> property.
   */
  public AccountTemplate reportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
    return this;
  }

 /**
  * The number of days prior to the day the report will be delivered at which the report will start
  * @return reportStartRelativeDaysInPast
  */
  @JsonProperty("report_start_relative_days_in_past")
  public BigDecimal getReportStartRelativeDaysInPast() {
    return reportStartRelativeDaysInPast;
  }

  /**
   * Sets the <code>reportStartRelativeDaysInPast</code> property.
   */
 public void setReportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
  }

  /**
   * Sets the <code>reportStartRelativeDaysInPast</code> property.
   */
  public AccountTemplate reportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
    return this;
  }

 /**
  * Timezone for reporting data
  * @return reportingTimeZone
  */
  @JsonProperty("reporting_time_zone")
  public ReportingTimeZone getReportingTimeZone() {
    return reportingTimeZone;
  }

  /**
   * Sets the <code>reportingTimeZone</code> property.
   */
 public void setReportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
  }

  /**
   * Sets the <code>reportingTimeZone</code> property.
   */
  public AccountTemplate reportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
    return this;
  }

 /**
  * Unified metric sort configuration
  * @return sortBy
  */
  @JsonProperty("sort_by")
  public Object getSortBy() {
    return sortBy;
  }

  /**
   * Sets the <code>sortBy</code> property.
   */
 public void setSortBy(Object sortBy) {
    this.sortBy = sortBy;
  }

  /**
   * Sets the <code>sortBy</code> property.
   */
  public AccountTemplate sortBy(Object sortBy) {
    this.sortBy = sortBy;
    return this;
  }

 /**
  * Type of the template
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AccountTemplate type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Time of last update in seconds since Unix epoch
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AccountTemplate updatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * ID of the user who created the template
  * @return userId
  */
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
 public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public AccountTemplate userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
  * The length of the sliding window over which view conversions will be attributed
  * @return viewWindowDays
  */
  @JsonProperty("view_window_days")
  public BigDecimal getViewWindowDays() {
    return viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
 public void setViewWindowDays(BigDecimal viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
  public AccountTemplate viewWindowDays(BigDecimal viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

