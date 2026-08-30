package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MMMReportGranularity;
import org.openapitools.server.model.MMMReportLevel;
import org.openapitools.server.model.MMMReportingColumn;
import org.openapitools.server.model.MMMReportingTargetingType;
import org.openapitools.server.model.TargetingAdvertiserCountry;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class MMMReportCreate   {

    private List<String> advertiserIds = new ArrayList<>();
    private List<MMMReportingColumn> columns = new ArrayList<>();
    private List<TargetingAdvertiserCountry> countries = new ArrayList<>();
    private List<String> customColumnIds = new ArrayList<>();
    private String endDate;
    private MMMReportGranularity granularity;
    private MMMReportLevel level;
    private String reportName;
    private String startDate;
    private List<MMMReportingTargetingType> targetingTypes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MMMReportCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create MMMReportCreate.
     *
     * @param advertiserIds Advertiser IDs for multi-advertiser report
     * @param columns Metric and entity columns
     * @param countries A List of countries for filtering
     * @param customColumnIds List of custom column IDs
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
     * @param granularity   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
     * @param level Level of the report
     * @param reportName Name of the Marketing Mix Modeling (MMM) report
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
     * @param targetingTypes List of targeting types
     */
    public MMMReportCreate(
        List<String> advertiserIds, 
        List<MMMReportingColumn> columns, 
        List<TargetingAdvertiserCountry> countries, 
        List<String> customColumnIds, 
        String endDate, 
        MMMReportGranularity granularity, 
        MMMReportLevel level, 
        String reportName, 
        String startDate, 
        List<MMMReportingTargetingType> targetingTypes
    ) {
        this.advertiserIds = advertiserIds;
        this.columns = columns;
        this.countries = countries;
        this.customColumnIds = customColumnIds;
        this.endDate = endDate;
        this.granularity = granularity;
        this.level = level;
        this.reportName = reportName;
        this.startDate = startDate;
        this.targetingTypes = targetingTypes;
    }



    /**
     * Advertiser IDs for multi-advertiser report
     * @return advertiserIds
     */
    public List<String> getAdvertiserIds() {
        return advertiserIds;
    }

    public void setAdvertiserIds(List<String> advertiserIds) {
        this.advertiserIds = advertiserIds;
    }

    /**
     * Metric and entity columns
     * @return columns
     */
    public List<MMMReportingColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<MMMReportingColumn> columns) {
        this.columns = columns;
    }

    /**
     * A List of countries for filtering
     * @return countries
     */
    public List<TargetingAdvertiserCountry> getCountries() {
        return countries;
    }

    public void setCountries(List<TargetingAdvertiserCountry> countries) {
        this.countries = countries;
    }

    /**
     * List of custom column IDs
     * @return customColumnIds
     */
    public List<String> getCustomColumnIds() {
        return customColumnIds;
    }

    public void setCustomColumnIds(List<String> customColumnIds) {
        this.customColumnIds = customColumnIds;
    }

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
     * @return granularity
     */
    public MMMReportGranularity getGranularity() {
        return granularity;
    }

    public void setGranularity(MMMReportGranularity granularity) {
        this.granularity = granularity;
    }

    /**
     * Level of the report
     * @return level
     */
    public MMMReportLevel getLevel() {
        return level;
    }

    public void setLevel(MMMReportLevel level) {
        this.level = level;
    }

    /**
     * Name of the Marketing Mix Modeling (MMM) report
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * List of targeting types
     * @return targetingTypes
     */
    public List<MMMReportingTargetingType> getTargetingTypes() {
        return targetingTypes;
    }

    public void setTargetingTypes(List<MMMReportingTargetingType> targetingTypes) {
        this.targetingTypes = targetingTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MMMReportCreate {\n");
        
        sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
        sb.append("    customColumnIds: ").append(toIndentedString(customColumnIds)).append("\n");
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

