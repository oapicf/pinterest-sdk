package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AccountTemplate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AccountTemplate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> adAccountIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> attributionType = JsonNullable.<Object>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal clickWindowDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ReportingColumn> columns = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionReportTimeType conversionReportTimeType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreationSource creationSource;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<String>> customColumnIds = JsonNullable.<List<String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String displayMetadata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal engagementWindowDays;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> filtersJson = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Granularity granularity;

  private String id;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<IngestionSource>> ingestionSources = JsonNullable.<List<IngestionSource>>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isDefault;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isDeleted = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isOwnedByUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isScheduled;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal reportEndRelativeDaysInPast;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable DataOutputFormat reportFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable MetricsReportingLevel reportLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal reportStartRelativeDaysInPast;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ReportingTimeZone reportingTimeZone;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> sortBy = JsonNullable.<Object>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal updatedTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String userId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal viewWindowDays;

  public AccountTemplate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountTemplate(String id) {
    this.id = id;
  }

  public AccountTemplate adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * ID of the Ad Account that owns the template
   * @return adAccountId
   */
  
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, description = "ID of the Ad Account that owns the template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
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
   */
  
  @Schema(name = "ad_account_ids", description = "IDs of the Ad Accounts that have access to this template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_ids")
  public List<String> getAdAccountIds() {
    return adAccountIds;
  }

  @JsonProperty("ad_account_ids")
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
   */
  
  @Schema(name = "ade_columns", example = "[\"ADE_COST_PER_ACTION-download_picture\"]", description = "A list of ADE columns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ade_columns")
  public List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> getAdeColumns() {
    return adeColumns;
  }

  @JsonProperty("ade_columns")
  public void setAdeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
    this.adeColumns = adeColumns;
  }

  public AccountTemplate attributionType(Object attributionType) {
    this.attributionType = JsonNullable.of(attributionType);
    return this;
  }

  /**
   * Attribution type for Brand/Category/SKU reports
   * @return attributionType
   */
  
  @Schema(name = "attribution_type", example = "ADVERTISER_LEVEL", description = "Attribution type for Brand/Category/SKU reports", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_type")
  public JsonNullable<Object> getAttributionType() {
    return attributionType;
  }

  public void setAttributionType(JsonNullable<Object> attributionType) {
    this.attributionType = attributionType;
  }

  public AccountTemplate clickWindowDays(@Nullable BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * The length of the sliding window over which click conversions will be attributed
   * @return clickWindowDays
   */
  @Valid 
  @Schema(name = "click_window_days", description = "The length of the sliding window over which click conversions will be attributed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window_days")
  public @Nullable BigDecimal getClickWindowDays() {
    return clickWindowDays;
  }

  @JsonProperty("click_window_days")
  public void setClickWindowDays(@Nullable BigDecimal clickWindowDays) {
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
   */
  @Valid 
  @Schema(name = "columns", description = "A list of columns to be included in the report", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columns")
  public List<ReportingColumn> getColumns() {
    return columns;
  }

  @JsonProperty("columns")
  public void setColumns(List<ReportingColumn> columns) {
    this.columns = columns;
  }

  public AccountTemplate conversionReportTimeType(@Nullable ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
    return this;
  }

  /**
   * Conversion report time type
   * @return conversionReportTimeType
   */
  @Valid 
  @Schema(name = "conversion_report_time_type", description = "Conversion report time type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_report_time_type")
  public @Nullable ConversionReportTimeType getConversionReportTimeType() {
    return conversionReportTimeType;
  }

  @JsonProperty("conversion_report_time_type")
  public void setConversionReportTimeType(@Nullable ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
  }

  public AccountTemplate creationSource(@Nullable CreationSource creationSource) {
    this.creationSource = creationSource;
    return this;
  }

  /**
   * The surface used to create this template
   * @return creationSource
   */
  @Valid 
  @Schema(name = "creation_source", description = "The surface used to create this template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creation_source")
  public @Nullable CreationSource getCreationSource() {
    return creationSource;
  }

  @JsonProperty("creation_source")
  public void setCreationSource(@Nullable CreationSource creationSource) {
    this.creationSource = creationSource;
  }

  public AccountTemplate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = JsonNullable.of(customColumnIds);
    return this;
  }

  public AccountTemplate addCustomColumnIdsItem(String customColumnIdsItem) {
    if (this.customColumnIds == null || !this.customColumnIds.isPresent()) {
      this.customColumnIds = JsonNullable.of(new ArrayList<>());
    }
    this.customColumnIds.get().add(customColumnIdsItem);
    return this;
  }

  /**
   * A list of custom column IDs
   * @return customColumnIds
   */
  
  @Schema(name = "custom_column_ids", description = "A list of custom column IDs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_column_ids")
  public JsonNullable<List<String>> getCustomColumnIds() {
    return customColumnIds;
  }

  public void setCustomColumnIds(JsonNullable<List<String>> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  public AccountTemplate displayMetadata(@Nullable String displayMetadata) {
    this.displayMetadata = displayMetadata;
    return this;
  }

  /**
   * Additional metadata about this reporting template
   * @return displayMetadata
   */
  
  @Schema(name = "display_metadata", description = "Additional metadata about this reporting template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_metadata")
  public @Nullable String getDisplayMetadata() {
    return displayMetadata;
  }

  @JsonProperty("display_metadata")
  public void setDisplayMetadata(@Nullable String displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

  public AccountTemplate engagementWindowDays(@Nullable BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * The length of the sliding window over which engagement conversions will be attributed
   * @return engagementWindowDays
   */
  @Valid 
  @Schema(name = "engagement_window_days", description = "The length of the sliding window over which engagement conversions will be attributed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_window_days")
  public @Nullable BigDecimal getEngagementWindowDays() {
    return engagementWindowDays;
  }

  @JsonProperty("engagement_window_days")
  public void setEngagementWindowDays(@Nullable BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AccountTemplate filtersJson(String filtersJson) {
    this.filtersJson = JsonNullable.of(filtersJson);
    return this;
  }

  /**
   * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
   * @return filtersJson
   */
  
  @Schema(name = "filters_json", description = "A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters_json")
  public JsonNullable<String> getFiltersJson() {
    return filtersJson;
  }

  public void setFiltersJson(JsonNullable<String> filtersJson) {
    this.filtersJson = filtersJson;
  }

  public AccountTemplate granularity(@Nullable Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * Get granularity
   * @return granularity
   */
  @Valid 
  @Schema(name = "granularity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granularity")
  public @Nullable Granularity getGranularity() {
    return granularity;
  }

  @JsonProperty("granularity")
  public void setGranularity(@Nullable Granularity granularity) {
    this.granularity = granularity;
  }

  public AccountTemplate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Template ID
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Template ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public AccountTemplate ingestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = JsonNullable.of(ingestionSources);
    return this;
  }

  public AccountTemplate addIngestionSourcesItem(IngestionSource ingestionSourcesItem) {
    if (this.ingestionSources == null || !this.ingestionSources.isPresent()) {
      this.ingestionSources = JsonNullable.of(new ArrayList<>());
    }
    this.ingestionSources.get().add(ingestionSourcesItem);
    return this;
  }

  /**
   * The filter on the conversion ingestion source method for conversion metrics
   * @return ingestionSources
   */
  @Valid 
  @Schema(name = "ingestion_sources", description = "The filter on the conversion ingestion source method for conversion metrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ingestion_sources")
  public JsonNullable<List<IngestionSource>> getIngestionSources() {
    return ingestionSources;
  }

  public void setIngestionSources(JsonNullable<List<IngestionSource>> ingestionSources) {
    this.ingestionSources = ingestionSources;
  }

  public AccountTemplate isDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * A boolean representing if this is the default view that loads for this template type
   * @return isDefault
   */
  
  @Schema(name = "is_default", example = "false", description = "A boolean representing if this is the default view that loads for this template type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_default")
  public @Nullable Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public AccountTemplate isDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.of(isDeleted);
    return this;
  }

  /**
   * A boolean that indicates if the template has been deleted
   * @return isDeleted
   */
  
  @Schema(name = "is_deleted", description = "A boolean that indicates if the template has been deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_deleted")
  public JsonNullable<Boolean> getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(JsonNullable<Boolean> isDeleted) {
    this.isDeleted = isDeleted;
  }

  public AccountTemplate isOwnedByUser(@Nullable Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
    return this;
  }

  /**
   * A boolean value that indicates if the user owns the template
   * @return isOwnedByUser
   */
  
  @Schema(name = "is_owned_by_user", description = "A boolean value that indicates if the user owns the template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_owned_by_user")
  public @Nullable Boolean getIsOwnedByUser() {
    return isOwnedByUser;
  }

  @JsonProperty("is_owned_by_user")
  public void setIsOwnedByUser(@Nullable Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
  }

  public AccountTemplate isScheduled(@Nullable Boolean isScheduled) {
    this.isScheduled = isScheduled;
    return this;
  }

  /**
   * A boolean value that indicates if this template has been used to create a scheduled report
   * @return isScheduled
   */
  
  @Schema(name = "is_scheduled", description = "A boolean value that indicates if this template has been used to create a scheduled report", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_scheduled")
  public @Nullable Boolean getIsScheduled() {
    return isScheduled;
  }

  @JsonProperty("is_scheduled")
  public void setIsScheduled(@Nullable Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

  public AccountTemplate name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Template Name
   * @return name
   */
  
  @Schema(name = "name", description = "Template Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public AccountTemplate reportEndRelativeDaysInPast(@Nullable BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
    return this;
  }

  /**
   * The number of days prior to the day the report will be delivered at which the report will end
   * @return reportEndRelativeDaysInPast
   */
  @Valid 
  @Schema(name = "report_end_relative_days_in_past", description = "The number of days prior to the day the report will be delivered at which the report will end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_end_relative_days_in_past")
  public @Nullable BigDecimal getReportEndRelativeDaysInPast() {
    return reportEndRelativeDaysInPast;
  }

  @JsonProperty("report_end_relative_days_in_past")
  public void setReportEndRelativeDaysInPast(@Nullable BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
  }

  public AccountTemplate reportFormat(@Nullable DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  /**
   * Get reportFormat
   * @return reportFormat
   */
  @Valid 
  @Schema(name = "report_format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_format")
  public @Nullable DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  @JsonProperty("report_format")
  public void setReportFormat(@Nullable DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  public AccountTemplate reportLevel(@Nullable MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
    return this;
  }

  /**
   * Get reportLevel
   * @return reportLevel
   */
  @Valid 
  @Schema(name = "report_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_level")
  public @Nullable MetricsReportingLevel getReportLevel() {
    return reportLevel;
  }

  @JsonProperty("report_level")
  public void setReportLevel(@Nullable MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
  }

  public AccountTemplate reportStartRelativeDaysInPast(@Nullable BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
    return this;
  }

  /**
   * The number of days prior to the day the report will be delivered at which the report will start
   * @return reportStartRelativeDaysInPast
   */
  @Valid 
  @Schema(name = "report_start_relative_days_in_past", description = "The number of days prior to the day the report will be delivered at which the report will start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_start_relative_days_in_past")
  public @Nullable BigDecimal getReportStartRelativeDaysInPast() {
    return reportStartRelativeDaysInPast;
  }

  @JsonProperty("report_start_relative_days_in_past")
  public void setReportStartRelativeDaysInPast(@Nullable BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
  }

  public AccountTemplate reportingTimeZone(@Nullable ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
    return this;
  }

  /**
   * Timezone for reporting data
   * @return reportingTimeZone
   */
  @Valid 
  @Schema(name = "reporting_time_zone", description = "Timezone for reporting data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reporting_time_zone")
  public @Nullable ReportingTimeZone getReportingTimeZone() {
    return reportingTimeZone;
  }

  @JsonProperty("reporting_time_zone")
  public void setReportingTimeZone(@Nullable ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
  }

  public AccountTemplate sortBy(Object sortBy) {
    this.sortBy = JsonNullable.of(sortBy);
    return this;
  }

  /**
   * Unified metric sort configuration
   * @return sortBy
   */
  
  @Schema(name = "sort_by", description = "Unified metric sort configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_by")
  public JsonNullable<Object> getSortBy() {
    return sortBy;
  }

  public void setSortBy(JsonNullable<Object> sortBy) {
    this.sortBy = sortBy;
  }

  public AccountTemplate type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the template
   * @return type
   */
  
  @Schema(name = "type", description = "Type of the template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
    this.type = type;
  }

  public AccountTemplate updatedTime(@Nullable BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Time of last update in seconds since Unix epoch
   * @return updatedTime
   */
  @Valid 
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Time of last update in seconds since Unix epoch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public @Nullable BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(@Nullable BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AccountTemplate userId(@Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * ID of the user who created the template
   * @return userId
   */
  
  @Schema(name = "user_id", description = "ID of the user who created the template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public @Nullable String getUserId() {
    return userId;
  }

  @JsonProperty("user_id")
  public void setUserId(@Nullable String userId) {
    this.userId = userId;
  }

  public AccountTemplate viewWindowDays(@Nullable BigDecimal viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * The length of the sliding window over which view conversions will be attributed
   * @return viewWindowDays
   */
  @Valid 
  @Schema(name = "view_window_days", description = "The length of the sliding window over which view conversions will be attributed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window_days")
  public @Nullable BigDecimal getViewWindowDays() {
    return viewWindowDays;
  }

  @JsonProperty("view_window_days")
  public void setViewWindowDays(@Nullable BigDecimal viewWindowDays) {
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
        equalsNullable(this.attributionType, accountTemplate.attributionType) &&
        Objects.equals(this.clickWindowDays, accountTemplate.clickWindowDays) &&
        Objects.equals(this.columns, accountTemplate.columns) &&
        Objects.equals(this.conversionReportTimeType, accountTemplate.conversionReportTimeType) &&
        Objects.equals(this.creationSource, accountTemplate.creationSource) &&
        equalsNullable(this.customColumnIds, accountTemplate.customColumnIds) &&
        Objects.equals(this.displayMetadata, accountTemplate.displayMetadata) &&
        Objects.equals(this.engagementWindowDays, accountTemplate.engagementWindowDays) &&
        equalsNullable(this.filtersJson, accountTemplate.filtersJson) &&
        Objects.equals(this.granularity, accountTemplate.granularity) &&
        Objects.equals(this.id, accountTemplate.id) &&
        equalsNullable(this.ingestionSources, accountTemplate.ingestionSources) &&
        Objects.equals(this.isDefault, accountTemplate.isDefault) &&
        equalsNullable(this.isDeleted, accountTemplate.isDeleted) &&
        Objects.equals(this.isOwnedByUser, accountTemplate.isOwnedByUser) &&
        Objects.equals(this.isScheduled, accountTemplate.isScheduled) &&
        equalsNullable(this.name, accountTemplate.name) &&
        Objects.equals(this.reportEndRelativeDaysInPast, accountTemplate.reportEndRelativeDaysInPast) &&
        Objects.equals(this.reportFormat, accountTemplate.reportFormat) &&
        Objects.equals(this.reportLevel, accountTemplate.reportLevel) &&
        Objects.equals(this.reportStartRelativeDaysInPast, accountTemplate.reportStartRelativeDaysInPast) &&
        Objects.equals(this.reportingTimeZone, accountTemplate.reportingTimeZone) &&
        equalsNullable(this.sortBy, accountTemplate.sortBy) &&
        Objects.equals(this.type, accountTemplate.type) &&
        Objects.equals(this.updatedTime, accountTemplate.updatedTime) &&
        Objects.equals(this.userId, accountTemplate.userId) &&
        Objects.equals(this.viewWindowDays, accountTemplate.viewWindowDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adAccountIds, adeColumns, hashCodeNullable(attributionType), clickWindowDays, columns, conversionReportTimeType, creationSource, hashCodeNullable(customColumnIds), displayMetadata, engagementWindowDays, hashCodeNullable(filtersJson), granularity, id, hashCodeNullable(ingestionSources), isDefault, hashCodeNullable(isDeleted), isOwnedByUser, isScheduled, hashCodeNullable(name), reportEndRelativeDaysInPast, reportFormat, reportLevel, reportStartRelativeDaysInPast, reportingTimeZone, hashCodeNullable(sortBy), type, updatedTime, userId, viewWindowDays);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

