package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import org.joda.time.LocalDate;
import java.util.Map;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserFollowingGet200Response;
import org.openapitools.model.UserSummary;
import org.openapitools.model.UserWebsiteSummary;
import org.openapitools.model.UserWebsiteVerificationCode;
import org.openapitools.model.UserWebsiteVerifyRequest;
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
    public BoardsUserFollowsList200Response boardsUserFollowsList(String bookmark, Integer pageSize, Boolean explicitFollowing, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Follow user
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
     *
     */
    public UserSummary followUserUpdate(String username, FollowUserRequest followUserRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * List followers
     *
     * Get a list of your followers.
     *
     */
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
    public List<LinkedBusiness> linkedBusinessAccountsGet() {
        // TODO: Implement...

        return null;
    }

    /**
     * Unverify website
     *
     * Unverifu a website verified by the signed-in user.
     *
     */
    public void unverifyWebsiteDelete(String website) {
        // TODO: Implement...

        
    }

    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get user account top pins analytics
     *
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    public TopPinsAnalyticsResponse userAccountAnalyticsTopPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get user account top video pins analytics
     *
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    public TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List following interests
     *
     * Get a list of a user&#39;s following interests in one place.
     *
     */
    public UserAccountFollowedInterests200Response userAccountFollowedInterests(String username, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     */
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
    public UserFollowingGet200Response userFollowingGet(String bookmark, Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get user websites
     *
     * Get user websites, claimed or not
     *
     */
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
    public UserWebsiteSummary verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     *
     */
    public UserWebsiteVerificationCode websiteVerificationGet(String adAccountId) {
        // TODO: Implement...

        return null;
    }

}
