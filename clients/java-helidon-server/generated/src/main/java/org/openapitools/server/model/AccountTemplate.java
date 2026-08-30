package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ConversionReportTimeType;
import org.openapitools.server.model.CreationSource;
import org.openapitools.server.model.DataOutputFormat;
import org.openapitools.server.model.Granularity;
import org.openapitools.server.model.IngestionSource;
import org.openapitools.server.model.MetricsReportingLevel;
import org.openapitools.server.model.ReportingColumn;
import org.openapitools.server.model.ReportingTimeZone;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AccountTemplate   {

    private String adAccountId;
    private List<String> adAccountIds = new ArrayList<>();
    private List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns = new ArrayList<>();
    private Object attributionType = null;
    private BigDecimal clickWindowDays;
    private List<ReportingColumn> columns = new ArrayList<>();
    private ConversionReportTimeType conversionReportTimeType;
    private CreationSource creationSource;
    private List<String> customColumnIds;
    private String displayMetadata;
    private BigDecimal engagementWindowDays;
    private String filtersJson;
    private Granularity granularity;
    private String id;
    private List<IngestionSource> ingestionSources;
    private Boolean isDefault;
    private Boolean isDeleted;
    private Boolean isOwnedByUser;
    private Boolean isScheduled;
    private String name;
    private BigDecimal reportEndRelativeDaysInPast;
    private DataOutputFormat reportFormat;
    private MetricsReportingLevel reportLevel;
    private BigDecimal reportStartRelativeDaysInPast;
    private ReportingTimeZone reportingTimeZone;
    private Object sortBy = null;
    private String type;
    private BigDecimal updatedTime;
    private String userId;
    private BigDecimal viewWindowDays;

    /**
     * Default constructor.
     */
    public AccountTemplate() {
    // JSON-B / Jackson
    }

    /**
     * Create AccountTemplate.
     *
     * @param adAccountId ID of the Ad Account that owns the template
     * @param adAccountIds IDs of the Ad Accounts that have access to this template
     * @param adeColumns A list of ADE columns
     * @param attributionType Attribution type for Brand/Category/SKU reports
     * @param clickWindowDays The length of the sliding window over which click conversions will be attributed
     * @param columns A list of columns to be included in the report
     * @param conversionReportTimeType Conversion report time type
     * @param creationSource The surface used to create this template
     * @param customColumnIds A list of custom column IDs
     * @param displayMetadata Additional metadata about this reporting template
     * @param engagementWindowDays The length of the sliding window over which engagement conversions will be attributed
     * @param filtersJson A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values
     * @param granularity granularity
     * @param id Template ID
     * @param ingestionSources The filter on the conversion ingestion source method for conversion metrics
     * @param isDefault A boolean representing if this is the default view that loads for this template type
     * @param isDeleted A boolean that indicates if the template has been deleted
     * @param isOwnedByUser A boolean value that indicates if the user owns the template
     * @param isScheduled A boolean value that indicates if this template has been used to create a scheduled report
     * @param name Template Name
     * @param reportEndRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will end
     * @param reportFormat reportFormat
     * @param reportLevel reportLevel
     * @param reportStartRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will start
     * @param reportingTimeZone Timezone for reporting data
     * @param sortBy Unified metric sort configuration
     * @param type Type of the template
     * @param updatedTime Time of last update in seconds since Unix epoch
     * @param userId ID of the user who created the template
     * @param viewWindowDays The length of the sliding window over which view conversions will be attributed
     */
    public AccountTemplate(
        String adAccountId, 
        List<String> adAccountIds, 
        List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns, 
        Object attributionType, 
        BigDecimal clickWindowDays, 
        List<ReportingColumn> columns, 
        ConversionReportTimeType conversionReportTimeType, 
        CreationSource creationSource, 
        List<String> customColumnIds, 
        String displayMetadata, 
        BigDecimal engagementWindowDays, 
        String filtersJson, 
        Granularity granularity, 
        String id, 
        List<IngestionSource> ingestionSources, 
        Boolean isDefault, 
        Boolean isDeleted, 
        Boolean isOwnedByUser, 
        Boolean isScheduled, 
        String name, 
        BigDecimal reportEndRelativeDaysInPast, 
        DataOutputFormat reportFormat, 
        MetricsReportingLevel reportLevel, 
        BigDecimal reportStartRelativeDaysInPast, 
        ReportingTimeZone reportingTimeZone, 
        Object sortBy, 
        String type, 
        BigDecimal updatedTime, 
        String userId, 
        BigDecimal viewWindowDays
    ) {
        this.adAccountId = adAccountId;
        this.adAccountIds = adAccountIds;
        this.adeColumns = adeColumns;
        this.attributionType = attributionType;
        this.clickWindowDays = clickWindowDays;
        this.columns = columns;
        this.conversionReportTimeType = conversionReportTimeType;
        this.creationSource = creationSource;
        this.customColumnIds = customColumnIds;
        this.displayMetadata = displayMetadata;
        this.engagementWindowDays = engagementWindowDays;
        this.filtersJson = filtersJson;
        this.granularity = granularity;
        this.id = id;
        this.ingestionSources = ingestionSources;
        this.isDefault = isDefault;
        this.isDeleted = isDeleted;
        this.isOwnedByUser = isOwnedByUser;
        this.isScheduled = isScheduled;
        this.name = name;
        this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
        this.reportFormat = reportFormat;
        this.reportLevel = reportLevel;
        this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
        this.reportingTimeZone = reportingTimeZone;
        this.sortBy = sortBy;
        this.type = type;
        this.updatedTime = updatedTime;
        this.userId = userId;
        this.viewWindowDays = viewWindowDays;
    }



    /**
     * ID of the Ad Account that owns the template
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * IDs of the Ad Accounts that have access to this template
     * @return adAccountIds
     */
    public List<String> getAdAccountIds() {
        return adAccountIds;
    }

    public void setAdAccountIds(List<String> adAccountIds) {
        this.adAccountIds = adAccountIds;
    }

    /**
     * A list of ADE columns
     * @return adeColumns
     */
    public List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> getAdeColumns() {
        return adeColumns;
    }

    public void setAdeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
        this.adeColumns = adeColumns;
    }

    /**
     * Attribution type for Brand/Category/SKU reports
     * @return attributionType
     */
    public Object getAttributionType() {
        return attributionType;
    }

    public void setAttributionType(Object attributionType) {
        this.attributionType = attributionType;
    }

    /**
     * The length of the sliding window over which click conversions will be attributed
     * @return clickWindowDays
     */
    public BigDecimal getClickWindowDays() {
        return clickWindowDays;
    }

    public void setClickWindowDays(BigDecimal clickWindowDays) {
        this.clickWindowDays = clickWindowDays;
    }

    /**
     * A list of columns to be included in the report
     * @return columns
     */
    public List<ReportingColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<ReportingColumn> columns) {
        this.columns = columns;
    }

    /**
     * Conversion report time type
     * @return conversionReportTimeType
     */
    public ConversionReportTimeType getConversionReportTimeType() {
        return conversionReportTimeType;
    }

    public void setConversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
        this.conversionReportTimeType = conversionReportTimeType;
    }

    /**
     * The surface used to create this template
     * @return creationSource
     */
    public CreationSource getCreationSource() {
        return creationSource;
    }

    public void setCreationSource(CreationSource creationSource) {
        this.creationSource = creationSource;
    }

    /**
     * A list of custom column IDs
     * @return customColumnIds
     */
    public List<String> getCustomColumnIds() {
        return customColumnIds;
    }

    public void setCustomColumnIds(List<String> customColumnIds) {
        this.customColumnIds = customColumnIds;
    }

    /**
     * Additional metadata about this reporting template
     * @return displayMetadata
     */
    public String getDisplayMetadata() {
        return displayMetadata;
    }

    public void setDisplayMetadata(String displayMetadata) {
        this.displayMetadata = displayMetadata;
    }

    /**
     * The length of the sliding window over which engagement conversions will be attributed
     * @return engagementWindowDays
     */
    public BigDecimal getEngagementWindowDays() {
        return engagementWindowDays;
    }

    public void setEngagementWindowDays(BigDecimal engagementWindowDays) {
        this.engagementWindowDays = engagementWindowDays;
    }

    /**
     * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
     * @return filtersJson
     */
    public String getFiltersJson() {
        return filtersJson;
    }

    public void setFiltersJson(String filtersJson) {
        this.filtersJson = filtersJson;
    }

    /**
     * Get granularity
     * @return granularity
     */
    public Granularity getGranularity() {
        return granularity;
    }

    public void setGranularity(Granularity granularity) {
        this.granularity = granularity;
    }

    /**
     * Template ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The filter on the conversion ingestion source method for conversion metrics
     * @return ingestionSources
     */
    public List<IngestionSource> getIngestionSources() {
        return ingestionSources;
    }

    public void setIngestionSources(List<IngestionSource> ingestionSources) {
        this.ingestionSources = ingestionSources;
    }

    /**
     * A boolean representing if this is the default view that loads for this template type
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * A boolean that indicates if the template has been deleted
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * A boolean value that indicates if the user owns the template
     * @return isOwnedByUser
     */
    public Boolean getIsOwnedByUser() {
        return isOwnedByUser;
    }

    public void setIsOwnedByUser(Boolean isOwnedByUser) {
        this.isOwnedByUser = isOwnedByUser;
    }

    /**
     * A boolean value that indicates if this template has been used to create a scheduled report
     * @return isScheduled
     */
    public Boolean getIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(Boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    /**
     * Template Name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The number of days prior to the day the report will be delivered at which the report will end
     * @return reportEndRelativeDaysInPast
     */
    public BigDecimal getReportEndRelativeDaysInPast() {
        return reportEndRelativeDaysInPast;
    }

    public void setReportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
        this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
    }

    /**
     * Get reportFormat
     * @return reportFormat
     */
    public DataOutputFormat getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(DataOutputFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * Get reportLevel
     * @return reportLevel
     */
    public MetricsReportingLevel getReportLevel() {
        return reportLevel;
    }

    public void setReportLevel(MetricsReportingLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    /**
     * The number of days prior to the day the report will be delivered at which the report will start
     * @return reportStartRelativeDaysInPast
     */
    public BigDecimal getReportStartRelativeDaysInPast() {
        return reportStartRelativeDaysInPast;
    }

    public void setReportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
        this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
    }

    /**
     * Timezone for reporting data
     * @return reportingTimeZone
     */
    public ReportingTimeZone getReportingTimeZone() {
        return reportingTimeZone;
    }

    public void setReportingTimeZone(ReportingTimeZone reportingTimeZone) {
        this.reportingTimeZone = reportingTimeZone;
    }

    /**
     * Unified metric sort configuration
     * @return sortBy
     */
    public Object getSortBy() {
        return sortBy;
    }

    public void setSortBy(Object sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * Type of the template
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Time of last update in seconds since Unix epoch
     * @return updatedTime
     */
    public BigDecimal getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(BigDecimal updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * ID of the user who created the template
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * The length of the sliding window over which view conversions will be attributed
     * @return viewWindowDays
     */
    public BigDecimal getViewWindowDays() {
        return viewWindowDays;
    }

    public void setViewWindowDays(BigDecimal viewWindowDays) {
        this.viewWindowDays = viewWindowDays;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

