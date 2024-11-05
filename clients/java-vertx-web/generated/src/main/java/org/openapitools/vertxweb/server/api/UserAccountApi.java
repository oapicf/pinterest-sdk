package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Account;
import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.BoardsUserFollowsList200Response;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.FollowUserRequest;
import org.openapitools.vertxweb.server.model.FollowersList200Response;
import org.openapitools.vertxweb.server.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.TopPinsAnalyticsResponse;
import org.openapitools.vertxweb.server.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.vertxweb.server.model.UserAccountFollowedInterests200Response;
import org.openapitools.vertxweb.server.model.UserFollowingFeedType;
import org.openapitools.vertxweb.server.model.UserFollowingGet200Response;
import org.openapitools.vertxweb.server.model.UserSummary;
import org.openapitools.vertxweb.server.model.UserWebsiteSummary;
import org.openapitools.vertxweb.server.model.UserWebsiteVerificationCode;
import org.openapitools.vertxweb.server.model.UserWebsiteVerifyRequest;
import org.openapitools.vertxweb.server.model.UserWebsitesGet200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface UserAccountApi  {
    Future<ApiResponse<BoardsUserFollowsList200Response>> boardsUserFollowsList(String bookmark, Integer pageSize, Boolean explicitFollowing, String adAccountId);
    Future<ApiResponse<UserSummary>> followUserUpdate(String username, FollowUserRequest followUserRequest);
    Future<ApiResponse<FollowersList200Response>> followersList(String bookmark, Integer pageSize);
    Future<ApiResponse<List<LinkedBusiness>>> linkedBusinessAccountsGet();
    Future<ApiResponse<Void>> unverifyWebsiteDelete(String website);
    Future<ApiResponse<Map<String, AnalyticsMetricsResponse>>> userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField, String adAccountId);
    Future<ApiResponse<TopPinsAnalyticsResponse>> userAccountAnalyticsTopPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId);
    Future<ApiResponse<TopVideoPinsAnalyticsResponse>> userAccountAnalyticsTopVideoPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId);
    Future<ApiResponse<UserAccountFollowedInterests200Response>> userAccountFollowedInterests(String username, String bookmark, Integer pageSize);
    Future<ApiResponse<Account>> userAccountGet(String adAccountId);
    Future<ApiResponse<UserFollowingGet200Response>> userFollowingGet(String bookmark, Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing, String adAccountId);
    Future<ApiResponse<UserWebsitesGet200Response>> userWebsitesGet(String bookmark, Integer pageSize);
    Future<ApiResponse<UserWebsiteSummary>> verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest, String adAccountId);
    Future<ApiResponse<UserWebsiteVerificationCode>> websiteVerificationGet(String adAccountId);
}
