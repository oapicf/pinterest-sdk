package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Account;
import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.BoardsList200Response;
import org.openapitools.vertxweb.server.model.FollowUser;
import org.openapitools.vertxweb.server.model.FollowUserCreate;
import org.openapitools.vertxweb.server.model.FollowersList200Response;
import org.openapitools.vertxweb.server.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.QuerymetrictypesItems;
import org.openapitools.vertxweb.server.model.QueryvideopinmetrictypesItems;
import org.openapitools.vertxweb.server.model.TopPinsAnalyticsResponse;
import org.openapitools.vertxweb.server.model.TopPinsSortBy;
import org.openapitools.vertxweb.server.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.vertxweb.server.model.TopVideoPinsSortBy;
import org.openapitools.vertxweb.server.model.UserAccountFollowedInterests200Response;
import org.openapitools.vertxweb.server.model.UserFollowingFeedType;
import org.openapitools.vertxweb.server.model.UserWebsite;
import org.openapitools.vertxweb.server.model.UserWebsiteCreate;
import org.openapitools.vertxweb.server.model.UserWebsiteVerification;
import org.openapitools.vertxweb.server.model.UserWebsitesGet200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class UserAccountApiImpl implements UserAccountApi {
    public Future<ApiResponse<BoardsList200Response>> boardsUserFollowsList(String adAccountId, Boolean explicitFollowing, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FollowUser>> followUserUpdate(String username, FollowUserCreate followUserCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FollowersList200Response>> followersList(String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<LinkedBusiness>>> linkedBusinessAccountsGet() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UserWebsite>> unverifyWebsiteDelete(String website) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Map<String, AnalyticsMetricsResponse>>> userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, String splitField, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TopPinsAnalyticsResponse>> userAccountAnalyticsTopPins(LocalDate startDate, LocalDate endDate, TopPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TopVideoPinsAnalyticsResponse>> userAccountAnalyticsTopVideoPins(LocalDate startDate, LocalDate endDate, TopVideoPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QueryvideopinmetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UserAccountFollowedInterests200Response>> userAccountFollowedInterests(String username, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Account>> userAccountGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FollowersList200Response>> userFollowingGet(String adAccountId, Boolean explicitFollowing, UserFollowingFeedType feedType, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UserWebsitesGet200Response>> userWebsitesGet(String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UserWebsite>> verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UserWebsiteVerification>> websiteVerificationGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
