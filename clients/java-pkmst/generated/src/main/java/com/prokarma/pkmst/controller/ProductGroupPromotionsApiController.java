package com.prokarma.pkmst.controller;

import java.math.BigDecimal;
import com.prokarma.pkmst.model.EntityStatus;
import com.prokarma.pkmst.model.Granularity;
import java.util.List;
import java.time.LocalDate;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.PinterestLibPaginationOrder;
import com.prokarma.pkmst.model.ProductGroupAnalyticsItems;
import com.prokarma.pkmst.model.ProductGroupPromotion;
import com.prokarma.pkmst.model.ProductGroupPromotions;
import com.prokarma.pkmst.model.ProductGroupPromotionsCreate;
import com.prokarma.pkmst.model.ProductGroupPromotionsList200Response;
import com.prokarma.pkmst.model.ProductGroupPromotionsUpdateWithRequiredBody;
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
public class ProductGroupPromotionsApiController implements ProductGroupPromotionsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ProductGroupPromotionsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ProductGroupPromotions> productGroupPromotionsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody ProductGroupPromotionsCreate productGroupPromotionsCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProductGroupPromotions>(HttpStatus.OK);
    }

    public ResponseEntity<ProductGroupPromotion> productGroupPromotionsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Unique identifier of a product group promotion",required=true ) @PathVariable("product_group_promotion_id") String productGroupPromotionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotion>(objectMapper.readValue("", ProductGroupPromotion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotion>(objectMapper.readValue("", ProductGroupPromotion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotion>(objectMapper.readValue("", ProductGroupPromotion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotion>(objectMapper.readValue("", ProductGroupPromotion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotion>(objectMapper.readValue("", ProductGroupPromotion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotion>(objectMapper.readValue("", ProductGroupPromotion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotion>(objectMapper.readValue("", ProductGroupPromotion.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProductGroupPromotion>(HttpStatus.OK);
    }

    public ResponseEntity<ProductGroupPromotionsList200Response> productGroupPromotionsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) PinterestLibPaginationOrder order,
        @ApiParam(value = "List of Product group promotion Ids.")  @RequestParam(value = "product_group_promotion_ids", required = false) List<String> productGroupPromotionIds,
        @ApiParam(value = "Entity status")  @RequestParam(value = "entity_statuses", required = false) List<EntityStatus> entityStatuses,
        @ApiParam(value = "Ad group Id.")  @RequestParam(value = "ad_group_id", required = false) String adGroupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotionsList200Response>(objectMapper.readValue("", ProductGroupPromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotionsList200Response>(objectMapper.readValue("", ProductGroupPromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotionsList200Response>(objectMapper.readValue("", ProductGroupPromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotionsList200Response>(objectMapper.readValue("", ProductGroupPromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotionsList200Response>(objectMapper.readValue("", ProductGroupPromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotionsList200Response>(objectMapper.readValue("", ProductGroupPromotionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotionsList200Response>(objectMapper.readValue("", ProductGroupPromotionsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProductGroupPromotionsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<ProductGroupPromotions> productGroupPromotionsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,
        @ApiParam(value = "" ,required=true )   @RequestBody ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProductGroupPromotions>(objectMapper.readValue("", ProductGroupPromotions.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProductGroupPromotions>(HttpStatus.OK);
    }

    public ResponseEntity<List<ProductGroupAnalyticsItems>> productGroupsAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "List of Product group Ids to use to filter the results.", required = true)  @RequestParam(value = "product_group_ids", required = true) List<String> productGroupIds,
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
            return new ResponseEntity<List<ProductGroupAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<ProductGroupAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<ProductGroupAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<ProductGroupAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<ProductGroupAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<ProductGroupAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<ProductGroupAnalyticsItems>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<ProductGroupAnalyticsItems>>(HttpStatus.OK);
    }

}
