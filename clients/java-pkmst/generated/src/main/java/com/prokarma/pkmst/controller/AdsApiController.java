package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Ad;
import com.prokarma.pkmst.model.AdBatchUpdate;
import com.prokarma.pkmst.model.AdBatchWriteResponseModel;
import com.prokarma.pkmst.model.AdCreate;
import com.prokarma.pkmst.model.AdPreviewRequest;
import com.prokarma.pkmst.model.AdPreviewURLResponse;
import com.prokarma.pkmst.model.AdsAnalytics;
import com.prokarma.pkmst.model.AdsAnalyticsAdTargetingType;
import com.prokarma.pkmst.model.AdsList200Response;
import java.math.BigDecimal;
import com.prokarma.pkmst.model.CampaignAdPreview;
import com.prokarma.pkmst.model.CampaignAdPreviewCreate;
import com.prokarma.pkmst.model.CampaignAdPreviewCreate200ResponseInner;
import com.prokarma.pkmst.model.CampaignAdPreviewDelete200ResponseInner;
import com.prokarma.pkmst.model.ConversionAttributionWindowDays;
import com.prokarma.pkmst.model.ConversionReportAttributionType;
import com.prokarma.pkmst.model.ConversionReportTimeType;
import com.prokarma.pkmst.model.EntityStatus;
import com.prokarma.pkmst.model.Granularity;
import java.util.List;
import java.time.LocalDate;
import com.prokarma.pkmst.model.MetricsResponse;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.PinterestLibPaginationOrder;
import com.prokarma.pkmst.model.ReportingColumnSync;
import com.prokarma.pkmst.model.ReportingTimeZone;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Controller
public class AdsApiController implements AdsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AdsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdPreviewURLResponse> adPreviewsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody AdPreviewRequest adPreviewRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdPreviewURLResponse>(objectMapper.readValue("", AdPreviewURLResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdPreviewURLResponse>(HttpStatus.OK);
    }

    public ResponseEntity<MetricsResponse> adTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of Ad Ids to use to filter the results.", required = true)  @RequestParam(value = "ad_ids", required = true) List<String> adIds,
        @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true)  @RequestParam(value = "targeting_types", required = true) List<AdsAnalyticsAdTargetingType> targetingTypes,
        @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true)  @RequestParam(value = "columns", required = true) List<ReportingColumnSync> columns,
        @ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues = "TOTAL, DAY, HOUR, WEEK, MONTH")  @RequestParam(value = "granularity", required = true) Granularity granularity,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues = "0, 1, 7, 14, 30, 60")  @RequestParam(value = "click_window_days", required = false) ConversionAttributionWindowDays clickWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues = "0, 1, 7, 14, 30, 60")  @RequestParam(value = "engagement_window_days", required = false) ConversionAttributionWindowDays engagementWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues = "0, 1, 7, 14, 30, 60")  @RequestParam(value = "view_window_days", required = false) ConversionAttributionWindowDays viewWindowDays,
        @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues = "TIME_OF_AD_ACTION, TIME_OF_CONVERSION")  @RequestParam(value = "conversion_report_time", required = false) ConversionReportTimeType conversionReportTime,
        @ApiParam(value = "List of types of attribution for the conversion report")  @RequestParam(value = "attribution_types", required = false) List<ConversionReportAttributionType> attributionTypes,
        @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues = "PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @RequestParam(value = "reporting_timezone", required = false) ReportingTimeZone reportingTimezone,
        @ApiParam(value = "Sort Columns.")  @RequestParam(value = "sort_columns", required = false) List<String> sortColumns,
        @ApiParam(value = "Sort ascending.")  @RequestParam(value = "sort_ascending", required = false) Boolean sortAscending,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MetricsResponse>(objectMapper.readValue("", MetricsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MetricsResponse>(objectMapper.readValue("", MetricsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MetricsResponse>(objectMapper.readValue("", MetricsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MetricsResponse>(objectMapper.readValue("", MetricsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MetricsResponse>(objectMapper.readValue("", MetricsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MetricsResponse>(objectMapper.readValue("", MetricsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MetricsResponse>(objectMapper.readValue("", MetricsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<MetricsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<List<AdsAnalytics>> adsAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true)  @RequestParam(value = "columns", required = true) List<ReportingColumnSync> columns,
        @ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues = "TOTAL, DAY, HOUR, WEEK, MONTH")  @RequestParam(value = "granularity", required = true) Granularity granularity,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of Pin IDs.")  @RequestParam(value = "pin_ids", required = false) List<String> pinIds,
        @ApiParam(value = "List of Ad Ids to use to filter the results.")  @RequestParam(value = "ad_ids", required = false) List<String> adIds,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "click_window_days", required = false, defaultValue="30") BigDecimal clickWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") BigDecimal engagementWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "1")  @RequestParam(value = "view_window_days", required = false, defaultValue="1") BigDecimal viewWindowDays,
        @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues = "TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION")  @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") String conversionReportTime,
        @ApiParam(value = "List of Campaign Ids to use to filter the results.")  @RequestParam(value = "campaign_ids", required = false) List<String> campaignIds,
        @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues = "PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @RequestParam(value = "reporting_timezone", required = false) ReportingTimeZone reportingTimezone,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdsAnalytics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdsAnalytics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdsAnalytics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdsAnalytics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdsAnalytics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdsAnalytics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdsAnalytics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<AdsAnalytics>>(HttpStatus.OK);
    }

    public ResponseEntity<AdBatchWriteResponseModel> adsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<AdCreate> adCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdBatchWriteResponseModel>(HttpStatus.OK);
    }

    public ResponseEntity<Ad> adsGet(@ApiParam(value = "The ID of this ad.",required=true ) @PathVariable("ad_id") String adId,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ad>(objectMapper.readValue("", Ad.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ad>(objectMapper.readValue("", Ad.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ad>(objectMapper.readValue("", Ad.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ad>(objectMapper.readValue("", Ad.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ad>(objectMapper.readValue("", Ad.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ad>(objectMapper.readValue("", Ad.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ad>(objectMapper.readValue("", Ad.class), HttpStatus.OK);
        }

        return new ResponseEntity<Ad>(HttpStatus.OK);
    }

    public ResponseEntity<AdsList200Response> adsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @ApiParam(value = "List of Campaign Ids to use to filter the results.")  @RequestParam(value = "campaign_ids", required = false) List<String> campaignIds,
        @ApiParam(value = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.")  @RequestParam(value = "ad_group_ids", required = false) List<String> adGroupIds,
        @ApiParam(value = "List of Ad Ids to use to filter the results.")  @RequestParam(value = "ad_ids", required = false) List<String> adIds,
        @ApiParam(value = "Entity status")  @RequestParam(value = "entity_statuses", required = false) List<EntityStatus> entityStatuses,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsList200Response>(objectMapper.readValue("", AdsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsList200Response>(objectMapper.readValue("", AdsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsList200Response>(objectMapper.readValue("", AdsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsList200Response>(objectMapper.readValue("", AdsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsList200Response>(objectMapper.readValue("", AdsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsList200Response>(objectMapper.readValue("", AdsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsList200Response>(objectMapper.readValue("", AdsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<AdBatchWriteResponseModel> adsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<AdBatchUpdate> adBatchUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdBatchWriteResponseModel>(objectMapper.readValue("", AdBatchWriteResponseModel.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdBatchWriteResponseModel>(HttpStatus.OK);
    }

    public ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>> campaignAdPreviewCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<CampaignAdPreviewCreate> campaignAdPreviewCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>>(HttpStatus.OK);
    }

    public ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>> campaignAdPreviewDelete(@ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true)  @RequestParam(value = "ad_group_ids", required = true) List<String> adGroupIds,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>>(HttpStatus.OK);
    }

    public ResponseEntity<List<CampaignAdPreview>> campaignAdPreviewRead(@ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true)  @RequestParam(value = "ad_group_ids", required = true) List<String> adGroupIds,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreview>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreview>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreview>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreview>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreview>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreview>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CampaignAdPreview>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<CampaignAdPreview>>(HttpStatus.OK);
    }

}
