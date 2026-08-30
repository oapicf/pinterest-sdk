package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdAccount;
import com.prokarma.pkmst.model.AdAccountAnalyticsItems;
import com.prokarma.pkmst.model.AdAccountCreate;
import com.prokarma.pkmst.model.AdAccountsList200Response;
import com.prokarma.pkmst.model.AdsAnalyticsAccountTargetingType;
import com.prokarma.pkmst.model.AdsAnalyticsCreateAsyncRequest;
import com.prokarma.pkmst.model.AdsAnalyticsCreateAsyncResponse;
import com.prokarma.pkmst.model.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import com.prokarma.pkmst.model.ConversionProductReport;
import com.prokarma.pkmst.model.ConversionProductReportCreate;
import com.prokarma.pkmst.model.ConversionReportAttributionType;
import com.prokarma.pkmst.model.Granularity;
import java.util.List;
import java.time.LocalDate;
import com.prokarma.pkmst.model.MMMReport;
import com.prokarma.pkmst.model.MMMReportCreate;
import com.prokarma.pkmst.model.MetricsResponse;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.PinterestLibPaginationOrder;
import com.prokarma.pkmst.model.ReportingColumnSync;
import com.prokarma.pkmst.model.ReportingTimeZone;
import com.prokarma.pkmst.model.TemplateBasedReport;
import com.prokarma.pkmst.model.TemplatesList200Response;

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
public class AdAccountsApiController implements AdAccountsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AdAccountsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<List<AdAccountAnalyticsItems>> adAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true)  @RequestParam(value = "columns", required = true) List<ReportingColumnSync> columns,
        @ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues = "TOTAL, DAY, HOUR, WEEK, MONTH")  @RequestParam(value = "granularity", required = true) Granularity granularity,
        @ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "click_window_days", required = false, defaultValue="30") BigDecimal clickWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") BigDecimal engagementWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "1")  @RequestParam(value = "view_window_days", required = false, defaultValue="1") BigDecimal viewWindowDays,
        @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues = "TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION")  @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") String conversionReportTime,
        @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues = "PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @RequestParam(value = "reporting_timezone", required = false) ReportingTimeZone reportingTimezone,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdAccountAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdAccountAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdAccountAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdAccountAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdAccountAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdAccountAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<AdAccountAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<AdAccountAnalyticsItems>>(HttpStatus.OK);
    }

    public ResponseEntity<MetricsResponse> adAccountTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true)  @RequestParam(value = "targeting_types", required = true) List<AdsAnalyticsAccountTargetingType> targetingTypes,
        @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true)  @RequestParam(value = "columns", required = true) List<ReportingColumnSync> columns,
        @ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues = "TOTAL, DAY, HOUR, WEEK, MONTH")  @RequestParam(value = "granularity", required = true) Granularity granularity,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "click_window_days", required = false, defaultValue="30") BigDecimal clickWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "30")  @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") BigDecimal engagementWindowDays,
        @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues = "0, 1, 7, 14, 30, 60", defaultValue = "1")  @RequestParam(value = "view_window_days", required = false, defaultValue="1") BigDecimal viewWindowDays,
        @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues = "TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION")  @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") String conversionReportTime,
        @ApiParam(value = "List of types of attribution for the conversion report")  @RequestParam(value = "attribution_types", required = false) List<ConversionReportAttributionType> attributionTypes,
        @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues = "PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @RequestParam(value = "reporting_timezone", required = false) ReportingTimeZone reportingTimezone,
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

    public ResponseEntity<AdAccount> adAccountsCreate(@ApiParam(value = "" ,required=true )   @RequestBody AdAccountCreate adAccountCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccount>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccount> adAccountsGet(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccount>(objectMapper.readValue("", AdAccount.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccount>(HttpStatus.OK);
    }

    public ResponseEntity<AdAccountsList200Response> adAccountsList(@ApiParam(value = "Include shared ad accounts", defaultValue = "true")  @RequestParam(value = "include_shared_accounts", required = false, defaultValue="true") Boolean includeSharedAccounts,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsList200Response>(objectMapper.readValue("", AdAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsList200Response>(objectMapper.readValue("", AdAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsList200Response>(objectMapper.readValue("", AdAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsList200Response>(objectMapper.readValue("", AdAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsList200Response>(objectMapper.readValue("", AdAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsList200Response>(objectMapper.readValue("", AdAccountsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdAccountsList200Response>(objectMapper.readValue("", AdAccountsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdAccountsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<ConversionProductReport> analyticsCreateConversionProductReport(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody ConversionProductReportCreate conversionProductReportCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionProductReport>(HttpStatus.OK);
    }

    public ResponseEntity<MMMReport> analyticsCreateMmmReport(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody MMMReportCreate mmMReportCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }

        return new ResponseEntity<MMMReport>(HttpStatus.OK);
    }

    public ResponseEntity<AdsAnalyticsCreateAsyncResponse> analyticsCreateReport(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(objectMapper.readValue("", AdsAnalyticsCreateAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(objectMapper.readValue("", AdsAnalyticsCreateAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(objectMapper.readValue("", AdsAnalyticsCreateAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(objectMapper.readValue("", AdsAnalyticsCreateAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(objectMapper.readValue("", AdsAnalyticsCreateAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(objectMapper.readValue("", AdsAnalyticsCreateAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(objectMapper.readValue("", AdsAnalyticsCreateAsyncResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdsAnalyticsCreateAsyncResponse>(HttpStatus.OK);
    }

    public ResponseEntity<TemplateBasedReport> analyticsCreateTemplateReport(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a template.",required=true ) @PathVariable("template_id") String templateId,
        @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.")  @RequestParam(value = "start_date", required = false) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.")  @RequestParam(value = "end_date", required = false) LocalDate endDate,
        @ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", allowableValues = "TOTAL, DAY, HOUR, WEEK, MONTH")  @RequestParam(value = "granularity", required = false) Granularity granularity,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplateBasedReport>(objectMapper.readValue("", TemplateBasedReport.class), HttpStatus.OK);
        }

        return new ResponseEntity<TemplateBasedReport>(HttpStatus.OK);
    }

    public ResponseEntity<ConversionProductReport> analyticsGetConversionProductReport(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Token returned from the post request creation call", required = true)  @RequestParam(value = "token", required = true) String token,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ConversionProductReport>(objectMapper.readValue("", ConversionProductReport.class), HttpStatus.OK);
        }

        return new ResponseEntity<ConversionProductReport>(HttpStatus.OK);
    }

    public ResponseEntity<MMMReport> analyticsGetMmmReport(@ApiParam(value = "",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Token returned from the post request creation call", required = true)  @RequestParam(value = "token", required = true) String token,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MMMReport>(objectMapper.readValue("", MMMReport.class), HttpStatus.OK);
        }

        return new ResponseEntity<MMMReport>(HttpStatus.OK);
    }

    public ResponseEntity<AdsAnalyticsGetAsyncResponse> analyticsGetReport(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Token returned from the post request creation call", required = true)  @RequestParam(value = "token", required = true) String token,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(objectMapper.readValue("", AdsAnalyticsGetAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(objectMapper.readValue("", AdsAnalyticsGetAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(objectMapper.readValue("", AdsAnalyticsGetAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(objectMapper.readValue("", AdsAnalyticsGetAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(objectMapper.readValue("", AdsAnalyticsGetAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(objectMapper.readValue("", AdsAnalyticsGetAsyncResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(objectMapper.readValue("", AdsAnalyticsGetAsyncResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdsAnalyticsGetAsyncResponse>(HttpStatus.OK);
    }

    public ResponseEntity<String> sandboxDelete(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.OK);
        }

        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<TemplatesList200Response> templatesList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplatesList200Response>(objectMapper.readValue("", TemplatesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplatesList200Response>(objectMapper.readValue("", TemplatesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplatesList200Response>(objectMapper.readValue("", TemplatesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplatesList200Response>(objectMapper.readValue("", TemplatesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplatesList200Response>(objectMapper.readValue("", TemplatesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplatesList200Response>(objectMapper.readValue("", TemplatesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TemplatesList200Response>(objectMapper.readValue("", TemplatesList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<TemplatesList200Response>(HttpStatus.OK);
    }

}
