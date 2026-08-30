package org.openapitools.api.consumer;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QuerymetrictypesItems;
import org.openapitools.model.QueryvideopinmetrictypesItems;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopPinsSortBy;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsSortBy;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserWebsite;
import org.openapitools.model.UserWebsiteCreate;
import org.openapitools.model.UserWebsiteVerification;
import org.openapitools.model.UserWebsitesGet200Response;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.UserAccountService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/user_account")
public class UserAccountServiceController {

    @DubboReference
    private UserAccountService userAccountService;

    @RequestMapping(method = RequestMethod.GET, value = "/following/boards")
    public BoardsList200Response boardsUserFollowsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "explicitFollowing", defaultValue = "false") Boolean explicitFollowing,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return userAccountService.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/following/{username}")
    public FollowUser followUserUpdate(
        @RequestParam(name = "username") String username,
        @RequestParam(name = "followUserCreate") FollowUserCreate followUserCreate
    ) {
        return userAccountService.followUserUpdate(username, followUserCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/followers")
    public FollowersList200Response followersList(
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return userAccountService.followersList(bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/businesses")
    public List<LinkedBusiness> linkedBusinessAccountsGet(
    ) {
        return userAccountService.linkedBusinessAccountsGet();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/websites")
    public UserWebsite unverifyWebsiteDelete(
        @RequestParam(name = "website") String website
    ) {
        return userAccountService.unverifyWebsiteDelete(website);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/analytics")
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "fromClaimedContent", defaultValue = "BOTH") String fromClaimedContent,
        @RequestParam(name = "pinFormat", defaultValue = "ALL") String pinFormat,
        @RequestParam(name = "appTypes", defaultValue = "ALL") String appTypes,
        @RequestParam(name = "contentType", defaultValue = "ALL") String contentType,
        @RequestParam(name = "source", defaultValue = "ALL") String source,
        @RequestParam(name = "metricTypes") List<QuerymetrictypesItems> metricTypes,
        @RequestParam(name = "splitField", defaultValue = "NO_SPLIT") String splitField,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return userAccountService.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/analytics/top_pins")
    public TopPinsAnalyticsResponse userAccountAnalyticsTopPins(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "sortBy") TopPinsSortBy sortBy,
        @RequestParam(name = "fromClaimedContent", defaultValue = "BOTH") String fromClaimedContent,
        @RequestParam(name = "pinFormat", defaultValue = "ALL") String pinFormat,
        @RequestParam(name = "appTypes", defaultValue = "ALL") String appTypes,
        @RequestParam(name = "contentType", defaultValue = "ALL") String contentType,
        @RequestParam(name = "source", defaultValue = "ALL") String source,
        @RequestParam(name = "metricTypes") List<QuerymetrictypesItems> metricTypes,
        @RequestParam(name = "numOfPins", defaultValue = "10") Integer numOfPins,
        @RequestParam(name = "createdInLastNDays") BigDecimal createdInLastNDays,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return userAccountService.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/analytics/top_video_pins")
    public TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "sortBy") TopVideoPinsSortBy sortBy,
        @RequestParam(name = "fromClaimedContent", defaultValue = "BOTH") String fromClaimedContent,
        @RequestParam(name = "pinFormat", defaultValue = "ALL") String pinFormat,
        @RequestParam(name = "appTypes", defaultValue = "ALL") String appTypes,
        @RequestParam(name = "contentType", defaultValue = "ALL") String contentType,
        @RequestParam(name = "source", defaultValue = "ALL") String source,
        @RequestParam(name = "metricTypes") List<QueryvideopinmetrictypesItems> metricTypes,
        @RequestParam(name = "numOfPins", defaultValue = "10") Integer numOfPins,
        @RequestParam(name = "createdInLastNDays") BigDecimal createdInLastNDays,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return userAccountService.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Account userAccountGet(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return userAccountService.userAccountGet(adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/following")
    public FollowersList200Response userFollowingGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "explicitFollowing", defaultValue = "false") Boolean explicitFollowing,
        @RequestParam(name = "feedType", defaultValue = "ALL") UserFollowingFeedType feedType,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return userAccountService.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/websites")
    public UserWebsitesGet200Response userWebsitesGet(
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return userAccountService.userWebsitesGet(bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/websites")
    public UserWebsite verifyWebsiteUpdate(
        @RequestParam(name = "userWebsiteCreate") UserWebsiteCreate userWebsiteCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return userAccountService.verifyWebsiteUpdate(userWebsiteCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/websites/verification")
    public UserWebsiteVerification websiteVerificationGet(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return userAccountService.websiteVerificationGet(adAccountId);
    }
}
