package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Account;
import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.BoardsUserFollowsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.FollowUserRequest;
import org.openapitools.server.api.model.FollowersList200Response;
import org.openapitools.server.api.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TopPinsAnalyticsResponse;
import org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.server.api.model.UserAccountFollowedInterests200Response;
import org.openapitools.server.api.model.UserFollowingFeedType;
import org.openapitools.server.api.model.UserFollowingGet200Response;
import org.openapitools.server.api.model.UserSummary;
import org.openapitools.server.api.model.UserWebsiteSummary;
import org.openapitools.server.api.model.UserWebsiteVerificationCode;
import org.openapitools.server.api.model.UserWebsiteVerifyRequest;
import org.openapitools.server.api.model.UserWebsitesGet200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface UserAccountApi  {
    //boards_user_follows/list
    void boardsUserFollowsList(String bookmark, Integer pageSize, Boolean explicitFollowing, String adAccountId, Handler<AsyncResult<BoardsUserFollowsList200Response>> handler);

    //follow_user/update
    void followUserUpdate(String username, FollowUserRequest followUserRequest, Handler<AsyncResult<UserSummary>> handler);

    //followers/list
    void followersList(String bookmark, Integer pageSize, Handler<AsyncResult<FollowersList200Response>> handler);

    //linked_business_accounts/get
    void linkedBusinessAccountsGet(Handler<AsyncResult<List<LinkedBusiness>>> handler);

    //unverify_website/delete
    void unverifyWebsiteDelete(String website, Handler<AsyncResult<Void>> handler);

    //user_account/analytics
    void userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField, String adAccountId, Handler<AsyncResult<Map<String, AnalyticsMetricsResponse>>> handler);

    //user_account/analytics/top_pins
    void userAccountAnalyticsTopPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId, Handler<AsyncResult<TopPinsAnalyticsResponse>> handler);

    //user_account/analytics/top_video_pins
    void userAccountAnalyticsTopVideoPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId, Handler<AsyncResult<TopVideoPinsAnalyticsResponse>> handler);

    //user_account/followed_interests
    void userAccountFollowedInterests(String username, String bookmark, Integer pageSize, Handler<AsyncResult<UserAccountFollowedInterests200Response>> handler);

    //user_account/get
    void userAccountGet(String adAccountId, Handler<AsyncResult<Account>> handler);

    //user_following/get
    void userFollowingGet(String bookmark, Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing, String adAccountId, Handler<AsyncResult<UserFollowingGet200Response>> handler);

    //user_websites/get
    void userWebsitesGet(String bookmark, Integer pageSize, Handler<AsyncResult<UserWebsitesGet200Response>> handler);

    //verify_website/update
    void verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest, String adAccountId, Handler<AsyncResult<UserWebsiteSummary>> handler);

    //website_verification/get
    void websiteVerificationGet(String adAccountId, Handler<AsyncResult<UserWebsiteVerificationCode>> handler);

}
