package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Account;
import com.prokarma.pkmst.model.AnalyticsMetricsResponse;
import com.prokarma.pkmst.model.BoardsUserFollowsList200Response;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.FollowUserRequest;
import com.prokarma.pkmst.model.FollowersList200Response;
import com.prokarma.pkmst.model.LinkedBusiness;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import com.prokarma.pkmst.model.TopPinsAnalyticsResponse;
import com.prokarma.pkmst.model.TopVideoPinsAnalyticsResponse;
import com.prokarma.pkmst.model.UserAccountFollowedInterests200Response;
import com.prokarma.pkmst.model.UserFollowingFeedType;
import com.prokarma.pkmst.model.UserFollowingGet200Response;
import com.prokarma.pkmst.model.UserSummary;
import com.prokarma.pkmst.model.UserWebsiteSummary;
import com.prokarma.pkmst.model.UserWebsiteVerificationCode;
import com.prokarma.pkmst.model.UserWebsiteVerifyRequest;
import com.prokarma.pkmst.model.UserWebsitesGet200Response;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
public class UserAccountApiController implements UserAccountApi {
    private final ObjectMapper objectMapper;
@Autowired
    public UserAccountApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<BoardsUserFollowsList200Response> boardsUserFollowsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue = "false")  @RequestParam(value = "explicit_following", required = false, defaultValue="false") Boolean explicitFollowing,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsUserFollowsList200Response>(objectMapper.readValue("", BoardsUserFollowsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsUserFollowsList200Response>(objectMapper.readValue("", BoardsUserFollowsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsUserFollowsList200Response>(objectMapper.readValue("", BoardsUserFollowsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardsUserFollowsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<UserSummary> followUserUpdate(@ApiParam(value = "A valid username",required=true ) @PathVariable("username") String username,
        @ApiParam(value = "Follow a user." ,required=true )   @RequestBody FollowUserRequest followUserRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserSummary>(objectMapper.readValue("", UserSummary.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserSummary>(objectMapper.readValue("", UserSummary.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserSummary>(objectMapper.readValue("", UserSummary.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserSummary>(HttpStatus.OK);
    }

    public ResponseEntity<FollowersList200Response> followersList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FollowersList200Response>(objectMapper.readValue("", FollowersList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FollowersList200Response>(objectMapper.readValue("", FollowersList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FollowersList200Response>(objectMapper.readValue("", FollowersList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<FollowersList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<List<LinkedBusiness>> linkedBusinessAccountsGet(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<LinkedBusiness>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<LinkedBusiness>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<LinkedBusiness>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> unverifyWebsiteDelete(@ApiParam(value = "Website with path or domain only", required = true)  @RequestParam(value = "website", required = true) String website,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, AnalyticsMetricsResponse>> userAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues = "OTHER, CLAIMED, BOTH", defaultValue = "BOTH")  @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") String fromClaimedContent,
        @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues = "ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue = "ALL")  @RequestParam(value = "pin_format", required = false, defaultValue="ALL") String pinFormat,
        @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,
        @ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues = "ALL, PAID, ORGANIC", defaultValue = "ALL")  @RequestParam(value = "content_type", required = false, defaultValue="ALL") String contentType,
        @ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues = "ALL, YOUR_PINS, OTHER_PINS", defaultValue = "ALL")  @RequestParam(value = "source", required = false, defaultValue="ALL") String source,
        @ApiParam(value = "Metric types to get data for, default is all. ", allowableValues = "ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE")  @RequestParam(value = "metric_types", required = false) List<String> metricTypes,
        @ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues = "NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT", defaultValue = "NO_SPLIT")  @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") String splitField,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, AnalyticsMetricsResponse>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, AnalyticsMetricsResponse>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Map<String, AnalyticsMetricsResponse>>(objectMapper.readValue("", Map.class), HttpStatus.OK);
        }

        return new ResponseEntity<Map<String, AnalyticsMetricsResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<TopPinsAnalyticsResponse> userAccountAnalyticsTopPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Specify sorting order for metrics", required = true, allowableValues = "ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE")  @RequestParam(value = "sort_by", required = true) String sortBy,
        @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues = "OTHER, CLAIMED, BOTH", defaultValue = "BOTH")  @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") String fromClaimedContent,
        @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues = "ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue = "ALL")  @RequestParam(value = "pin_format", required = false, defaultValue="ALL") String pinFormat,
        @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,
        @ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues = "ALL, PAID, ORGANIC", defaultValue = "ALL")  @RequestParam(value = "content_type", required = false, defaultValue="ALL") String contentType,
        @ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues = "ALL, YOUR_PINS, OTHER_PINS", defaultValue = "ALL")  @RequestParam(value = "source", required = false, defaultValue="ALL") String source,
        @ApiParam(value = "Metric types to get data for, default is all. ", allowableValues = "ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE")  @RequestParam(value = "metric_types", required = false) List<String> metricTypes,
        @ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue = "10")  @RequestParam(value = "num_of_pins", required = false, defaultValue="10") Integer numOfPins,
        @ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues = "30")  @RequestParam(value = "created_in_last_n_days", required = false) Integer createdInLastNDays,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TopPinsAnalyticsResponse>(objectMapper.readValue("", TopPinsAnalyticsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TopPinsAnalyticsResponse>(objectMapper.readValue("", TopPinsAnalyticsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TopPinsAnalyticsResponse>(objectMapper.readValue("", TopPinsAnalyticsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<TopPinsAnalyticsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<TopVideoPinsAnalyticsResponse> userAccountAnalyticsTopVideoPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,
        @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,
        @ApiParam(value = "Specify sorting order for video metrics", required = true, allowableValues = "IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START")  @RequestParam(value = "sort_by", required = true) String sortBy,
        @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues = "OTHER, CLAIMED, BOTH", defaultValue = "BOTH")  @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") String fromClaimedContent,
        @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues = "ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue = "ALL")  @RequestParam(value = "pin_format", required = false, defaultValue="ALL") String pinFormat,
        @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,
        @ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues = "ALL, PAID, ORGANIC", defaultValue = "ALL")  @RequestParam(value = "content_type", required = false, defaultValue="ALL") String contentType,
        @ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues = "ALL, YOUR_PINS, OTHER_PINS", defaultValue = "ALL")  @RequestParam(value = "source", required = false, defaultValue="ALL") String source,
        @ApiParam(value = "Metric types to get video data for, default is all. ", allowableValues = "IMPRESSION, SAVE, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START, OUTBOUND_CLICK")  @RequestParam(value = "metric_types", required = false) List<String> metricTypes,
        @ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue = "10")  @RequestParam(value = "num_of_pins", required = false, defaultValue="10") Integer numOfPins,
        @ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues = "30")  @RequestParam(value = "created_in_last_n_days", required = false) Integer createdInLastNDays,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TopVideoPinsAnalyticsResponse>(objectMapper.readValue("", TopVideoPinsAnalyticsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TopVideoPinsAnalyticsResponse>(objectMapper.readValue("", TopVideoPinsAnalyticsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TopVideoPinsAnalyticsResponse>(objectMapper.readValue("", TopVideoPinsAnalyticsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<TopVideoPinsAnalyticsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UserAccountFollowedInterests200Response> userAccountFollowedInterests(@ApiParam(value = "A valid username",required=true ) @PathVariable("username") String username,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserAccountFollowedInterests200Response>(objectMapper.readValue("", UserAccountFollowedInterests200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserAccountFollowedInterests200Response>(objectMapper.readValue("", UserAccountFollowedInterests200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserAccountFollowedInterests200Response>(objectMapper.readValue("", UserAccountFollowedInterests200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserAccountFollowedInterests200Response>(objectMapper.readValue("", UserAccountFollowedInterests200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserAccountFollowedInterests200Response>(objectMapper.readValue("", UserAccountFollowedInterests200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserAccountFollowedInterests200Response>(HttpStatus.OK);
    }

    public ResponseEntity<Account> userAccountGet(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Account>(objectMapper.readValue("", Account.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Account>(objectMapper.readValue("", Account.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Account>(objectMapper.readValue("", Account.class), HttpStatus.OK);
        }

        return new ResponseEntity<Account>(HttpStatus.OK);
    }

    public ResponseEntity<UserFollowingGet200Response> userFollowingGet(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Thrift param specifying what type of followees will be kept. Default to include all followees.", allowableValues = "ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY", defaultValue = "ALL")  @RequestParam(value = "feed_type", required = false, defaultValue="ALL") UserFollowingFeedType feedType,
        @ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue = "false")  @RequestParam(value = "explicit_following", required = false, defaultValue="false") Boolean explicitFollowing,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserFollowingGet200Response>(objectMapper.readValue("", UserFollowingGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserFollowingGet200Response>(objectMapper.readValue("", UserFollowingGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserFollowingGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<UserWebsitesGet200Response> userWebsitesGet(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsitesGet200Response>(objectMapper.readValue("", UserWebsitesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsitesGet200Response>(objectMapper.readValue("", UserWebsitesGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsitesGet200Response>(objectMapper.readValue("", UserWebsitesGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserWebsitesGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<UserWebsiteSummary> verifyWebsiteUpdate(@ApiParam(value = "Verify a website." ,required=true )   @RequestBody UserWebsiteVerifyRequest userWebsiteVerifyRequest,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsiteSummary>(objectMapper.readValue("", UserWebsiteSummary.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsiteSummary>(objectMapper.readValue("", UserWebsiteSummary.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserWebsiteSummary>(HttpStatus.OK);
    }

    public ResponseEntity<UserWebsiteVerificationCode> websiteVerificationGet(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsiteVerificationCode>(objectMapper.readValue("", UserWebsiteVerificationCode.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsiteVerificationCode>(objectMapper.readValue("", UserWebsiteVerificationCode.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserWebsiteVerificationCode>(objectMapper.readValue("", UserWebsiteVerificationCode.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserWebsiteVerificationCode>(HttpStatus.OK);
    }

}
