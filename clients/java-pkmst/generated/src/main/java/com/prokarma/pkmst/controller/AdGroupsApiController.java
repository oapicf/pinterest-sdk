package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdGroup;
import com.prokarma.pkmst.model.AdGroupAudienceSizing;
import com.prokarma.pkmst.model.AdGroupAudienceSizingCreate;
import com.prokarma.pkmst.model.AdGroupCreateCreate;
import com.prokarma.pkmst.model.AdGroupUpdateBatchUpdate;
import com.prokarma.pkmst.model.AdGroupsAnalyticsMetrics;
import com.prokarma.pkmst.model.AdGroupsCreate200Response;
import com.prokarma.pkmst.model.AdGroupsList200Response;
import com.prokarma.pkmst.model.AdsAnalyticsAdGroupTargetingType;
import com.prokarma.pkmst.model.BidFloor;
import com.prokarma.pkmst.model.BidFloorCreate;
import java.math.BigDecimal;
import com.prokarma.pkmst.model.ConversionReportAttributionType;
import com.prokarma.pkmst.model.DynamicTitlesDownloadCSV;
import com.prokarma.pkmst.model.DynamicTitlesGetStatus;
import com.prokarma.pkmst.model.DynamicTitlesProcessCSV;
import com.prokarma.pkmst.model.DynamicTitlesProcessCSVCreate;
import com.prokarma.pkmst.model.DynamicTitlesUploadURL;
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
public class AdGroupsApiController implements AdGroupsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AdGroupsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<List<AdGroupsAnalyticsMetrics>> adGroupsAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true)  @RequestParam(value = "ad_group_ids", required = true) List<String> adGroupIds,
        @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true)  @RequestParam(value = "columns", required = true) List<ReportingColumnSync> columns,
        @ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues = "TOTAL, DAY, HOUR, WEEK, MONTH")  @RequestParam(value = "granularity", required = true) Granularity granularity,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "click_window_days", required = false, defaultValue="30") BigDecimal clickWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") BigDecimal engagementWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "1")  @RequestParam(value = "view_window_days", required = false, defaultValue="1") BigDecimal viewWindowDays,
        @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues = "TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION")  @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") String conversionReportTime,
        @ApiParam(value = "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", defaultValue = "false")  @RequestParam(value = "aggregate_report_rows", required = false, defaultValue="false") Boolean aggregateReportRows,
        @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues = "PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @RequestParam(value = "reporting_timezone", required = false) ReportingTimeZone reportingTimezone,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<AdGroupsAnalyticsMetrics>>(HttpStatus.OK);
    }

    public ResponseEntity<AdGroupAudienceSizing> adGroupsAudienceSizing(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody AdGroupAudienceSizingCreate adGroupAudienceSizingCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupAudienceSizing>(objectMapper.readValue("", AdGroupAudienceSizing.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdGroupAudienceSizing>(HttpStatus.OK);
    }

    public ResponseEntity<BidFloor> adGroupsBidFloorGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody BidFloorCreate bidFloorCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BidFloor>(objectMapper.readValue("", BidFloor.class), HttpStatus.OK);
        }

        return new ResponseEntity<BidFloor>(HttpStatus.OK);
    }

    public ResponseEntity<AdGroupsCreate200Response> adGroupsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<AdGroupCreateCreate> adGroupCreateCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdGroupsCreate200Response>(HttpStatus.OK);
    }

    public ResponseEntity<DynamicTitlesDownloadCSV> adGroupsDynamicTitlesDownloadCsv(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Ad group ID.",required=true ) @PathVariable("ad_group_id") String adGroupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesDownloadCSV>(objectMapper.readValue("", DynamicTitlesDownloadCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesDownloadCSV>(objectMapper.readValue("", DynamicTitlesDownloadCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesDownloadCSV>(objectMapper.readValue("", DynamicTitlesDownloadCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesDownloadCSV>(objectMapper.readValue("", DynamicTitlesDownloadCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesDownloadCSV>(objectMapper.readValue("", DynamicTitlesDownloadCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesDownloadCSV>(objectMapper.readValue("", DynamicTitlesDownloadCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesDownloadCSV>(objectMapper.readValue("", DynamicTitlesDownloadCSV.class), HttpStatus.OK);
        }

        return new ResponseEntity<DynamicTitlesDownloadCSV>(HttpStatus.OK);
    }

    public ResponseEntity<DynamicTitlesGetStatus> adGroupsDynamicTitlesGetStatus(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Ad group ID.",required=true ) @PathVariable("ad_group_id") String adGroupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesGetStatus>(objectMapper.readValue("", DynamicTitlesGetStatus.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesGetStatus>(objectMapper.readValue("", DynamicTitlesGetStatus.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesGetStatus>(objectMapper.readValue("", DynamicTitlesGetStatus.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesGetStatus>(objectMapper.readValue("", DynamicTitlesGetStatus.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesGetStatus>(objectMapper.readValue("", DynamicTitlesGetStatus.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesGetStatus>(objectMapper.readValue("", DynamicTitlesGetStatus.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesGetStatus>(objectMapper.readValue("", DynamicTitlesGetStatus.class), HttpStatus.OK);
        }

        return new ResponseEntity<DynamicTitlesGetStatus>(HttpStatus.OK);
    }

    public ResponseEntity<DynamicTitlesUploadURL> adGroupsDynamicTitlesGetUploadUrl(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Ad group ID.",required=true ) @PathVariable("ad_group_id") String adGroupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesUploadURL>(objectMapper.readValue("", DynamicTitlesUploadURL.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesUploadURL>(objectMapper.readValue("", DynamicTitlesUploadURL.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesUploadURL>(objectMapper.readValue("", DynamicTitlesUploadURL.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesUploadURL>(objectMapper.readValue("", DynamicTitlesUploadURL.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesUploadURL>(objectMapper.readValue("", DynamicTitlesUploadURL.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesUploadURL>(objectMapper.readValue("", DynamicTitlesUploadURL.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesUploadURL>(objectMapper.readValue("", DynamicTitlesUploadURL.class), HttpStatus.OK);
        }

        return new ResponseEntity<DynamicTitlesUploadURL>(HttpStatus.OK);
    }

    public ResponseEntity<DynamicTitlesProcessCSV> adGroupsDynamicTitlesProcessCsv(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Ad group ID.",required=true ) @PathVariable("ad_group_id") String adGroupId,
        @ApiParam(value = "" ,required=true )   @RequestBody DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DynamicTitlesProcessCSV>(objectMapper.readValue("", DynamicTitlesProcessCSV.class), HttpStatus.OK);
        }

        return new ResponseEntity<DynamicTitlesProcessCSV>(HttpStatus.OK);
    }

    public ResponseEntity<AdGroup> adGroupsGet(@ApiParam(value = "Ad group ID.",required=true ) @PathVariable("ad_group_id") String adGroupId,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroup>(objectMapper.readValue("", AdGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroup>(objectMapper.readValue("", AdGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroup>(objectMapper.readValue("", AdGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroup>(objectMapper.readValue("", AdGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroup>(objectMapper.readValue("", AdGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroup>(objectMapper.readValue("", AdGroup.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroup>(objectMapper.readValue("", AdGroup.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdGroup>(HttpStatus.OK);
    }

    public ResponseEntity<AdGroupsList200Response> adGroupsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @ApiParam(value = "List of Campaign Ids to use to filter the results.")  @RequestParam(value = "campaign_ids", required = false) List<String> campaignIds,
        @ApiParam(value = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.")  @RequestParam(value = "ad_group_ids", required = false) List<String> adGroupIds,
        @ApiParam(value = "Entity status")  @RequestParam(value = "entity_statuses", required = false) List<EntityStatus> entityStatuses,
        @ApiParam(value = "Return interests as text names (if value is true) rather than topic IDs.", defaultValue = "false")  @RequestParam(value = "translate_interests_to_names", required = false, defaultValue="false") Boolean translateInterestsToNames,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdGroupsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<MetricsResponse> adGroupsTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true)  @RequestParam(value = "ad_group_ids", required = true) List<String> adGroupIds,
        @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.", required = true)  @RequestParam(value = "targeting_types", required = true) List<AdsAnalyticsAdGroupTargetingType> targetingTypes,
        @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true)  @RequestParam(value = "columns", required = true) List<ReportingColumnSync> columns,
        @ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues = "TOTAL, DAY, HOUR, WEEK, MONTH")  @RequestParam(value = "granularity", required = true) Granularity granularity,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "click_window_days", required = false, defaultValue="30") BigDecimal clickWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") BigDecimal engagementWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "1")  @RequestParam(value = "view_window_days", required = false, defaultValue="1") BigDecimal viewWindowDays,
        @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues = "TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION")  @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") String conversionReportTime,
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

    public ResponseEntity<AdGroupsCreate200Response> adGroupsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsCreate200Response>(objectMapper.readValue("", AdGroupsCreate200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdGroupsCreate200Response>(HttpStatus.OK);
    }

    public ResponseEntity<AdGroupsList200Response> getAdGroupsByPromotionIdsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "List of Promotion IDs to use to filter the results.", required = true)  @RequestParam(value = "promotion_ids", required = true) List<String> promotionIds,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdGroupsList200Response>(objectMapper.readValue("", AdGroupsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdGroupsList200Response>(HttpStatus.OK);
    }

}
