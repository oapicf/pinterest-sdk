package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import org.joda.time.LocalDate;
import java.util.Map;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QuerymetrictypesItems;
import org.openapitools.model.QueryvideopinmetrictypesItems;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopPinsSortBy;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsSortBy;
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserWebsite;
import org.openapitools.model.UserWebsiteCreate;
import org.openapitools.model.UserWebsiteVerification;
import org.openapitools.model.UserWebsitesGet200Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class UserAccountApiServiceImpl implements UserAccountApi {
    /**
     * List following boards
     *
     * Get a list of the boards a user follows. The request returns a board summary object array.
     *
     */
    @Override
    public BoardsList200Response boardsUserFollowsList(String adAccountId, Boolean explicitFollowing, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Follow user
     *
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
     *
     */
    @Override
    public FollowUser followUserUpdate(String username, FollowUserCreate followUserCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * List followers
     *
     * Get a list of your followers.
     *
     */
    @Override
    public FollowersList200Response followersList(String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * List linked businesses
     *
     * Get a list of your linked business accounts.
     *
     */
    @Override
    public List<LinkedBusiness> linkedBusinessAccountsGet() {
        // TODO: Implement...
        return null;
    }

    /**
     * Unverify website
     *
     * Unverify a website verified by the signed-in user.
     *
     */
    @Override
    public UserWebsite unverifyWebsiteDelete(String website) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @Override
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, String splitField, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user account top pins analytics
     *
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @Override
    public TopPinsAnalyticsResponse userAccountAnalyticsTopPins(LocalDate startDate, LocalDate endDate, TopPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user account top video pins analytics
     *
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @Override
    public TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(LocalDate startDate, LocalDate endDate, TopVideoPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QueryvideopinmetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List following interests
     *
     * Get a list of a user&#39;s following interests in one place.
     *
     */
    @Override
    public UserAccountFollowedInterests200Response userAccountFollowedInterests(String username, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.
     *
     */
    @Override
    public Account userAccountGet(String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List following
     *
     * Get a list of who a certain user follows.
     *
     */
    @Override
    public FollowersList200Response userFollowingGet(String adAccountId, Boolean explicitFollowing, UserFollowingFeedType feedType, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user websites
     *
     * Get user websites, claimed or not
     *
     */
    @Override
    public UserWebsitesGet200Response userWebsitesGet(String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Verify website
     *
     * Verify a website as a signed-in user.
     *
     */
    @Override
    public UserWebsite verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     *
     */
    @Override
    public UserWebsiteVerification websiteVerificationGet(String adAccountId) {
        // TODO: Implement...
        return null;
    }

}
