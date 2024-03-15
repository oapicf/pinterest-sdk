package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.time.LocalDate;
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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for UserAccountApi
 */
@MicronautTest
public class UserAccountApiTest {

    @Inject
    UserAccountApi api;

    
    /**
     * List following boards
     *
     * Get a list of the boards a user follows. The request returns a board summary object array.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardsUserFollowsListTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        Boolean explicitFollowing = false;
        String adAccountId = "example";

        // when
        BoardsUserFollowsList200Response body = api.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId).block();

        // then
        // TODO implement the boardsUserFollowsListTest()
    }

    
    /**
     * Follow user
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
     */
    @Test
    @Disabled("Not Implemented")
    public void followUserUpdateTest() {
        // given
        String username = "username";
        FollowUserRequest followUserRequest = new FollowUserRequest();

        // when
        UserSummary body = api.followUserUpdate(username, followUserRequest).block();

        // then
        // TODO implement the followUserUpdateTest()
    }

    
    /**
     * List followers
     *
     * Get a list of your followers.
     */
    @Test
    @Disabled("Not Implemented")
    public void followersListTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        FollowersList200Response body = api.followersList(bookmark, pageSize).block();

        // then
        // TODO implement the followersListTest()
    }

    
    /**
     * List linked businesses
     *
     * Get a list of your linked business accounts.
     */
    @Test
    @Disabled("Not Implemented")
    public void linkedBusinessAccountsGetTest() {
        // given

        // when
        List<LinkedBusiness> body = api.linkedBusinessAccountsGet().block();

        // then
        // TODO implement the linkedBusinessAccountsGetTest()
    }

    
    /**
     * Unverify website
     *
     * Unverifu a website verified by the signed-in user.
     */
    @Test
    @Disabled("Not Implemented")
    public void unverifyWebsiteDeleteTest() {
        // given
        String website = "mysite.test";

        // when
        api.unverifyWebsiteDelete(website).block();

        // then
        // TODO implement the unverifyWebsiteDeleteTest()
    }

    
    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     */
    @Test
    @Disabled("Not Implemented")
    public void userAccountAnalyticsTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        String fromClaimedContent = "BOTH";
        String pinFormat = "ALL";
        String appTypes = "ALL";
        String contentType = "ALL";
        String source = "ALL";
        List<String> metricTypes = Arrays.asList("example");
        String splitField = "NO_SPLIT";
        String adAccountId = "example";

        // when
        Map<String, AnalyticsMetricsResponse> body = api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId).block();

        // then
        // TODO implement the userAccountAnalyticsTest()
    }

    
    /**
     * Get user account top pins analytics
     *
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     */
    @Test
    @Disabled("Not Implemented")
    public void userAccountAnalyticsTopPinsTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        String sortBy = "example";
        String fromClaimedContent = "BOTH";
        String pinFormat = "ALL";
        String appTypes = "ALL";
        String contentType = "ALL";
        String source = "ALL";
        List<String> metricTypes = Arrays.asList("example");
        Integer numOfPins = 10;
        Integer createdInLastNDays = 30;
        String adAccountId = "example";

        // when
        TopPinsAnalyticsResponse body = api.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId).block();

        // then
        // TODO implement the userAccountAnalyticsTopPinsTest()
    }

    
    /**
     * Get user account top video pins analytics
     *
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     */
    @Test
    @Disabled("Not Implemented")
    public void userAccountAnalyticsTopVideoPinsTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        String sortBy = "example";
        String fromClaimedContent = "BOTH";
        String pinFormat = "ALL";
        String appTypes = "ALL";
        String contentType = "ALL";
        String source = "ALL";
        List<String> metricTypes = Arrays.asList("example");
        Integer numOfPins = 10;
        Integer createdInLastNDays = 30;
        String adAccountId = "example";

        // when
        TopVideoPinsAnalyticsResponse body = api.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId).block();

        // then
        // TODO implement the userAccountAnalyticsTopVideoPinsTest()
    }

    
    /**
     * List following interests
     *
     * Get a list of a user&#39;s following interests in one place.
     */
    @Test
    @Disabled("Not Implemented")
    public void userAccountFollowedInterestsTest() {
        // given
        String username = "username";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        UserAccountFollowedInterests200Response body = api.userAccountFollowedInterests(username, bookmark, pageSize).block();

        // then
        // TODO implement the userAccountFollowedInterestsTest()
    }

    
    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     */
    @Test
    @Disabled("Not Implemented")
    public void userAccountGetTest() {
        // given
        String adAccountId = "example";

        // when
        Account body = api.userAccountGet(adAccountId).block();

        // then
        // TODO implement the userAccountGetTest()
    }

    
    /**
     * List following
     *
     * Get a list of who a certain user follows.
     */
    @Test
    @Disabled("Not Implemented")
    public void userFollowingGetTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        UserFollowingFeedType feedType = UserFollowingFeedType.fromValue("ALL");
        Boolean explicitFollowing = false;
        String adAccountId = "example";

        // when
        UserFollowingGet200Response body = api.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId).block();

        // then
        // TODO implement the userFollowingGetTest()
    }

    
    /**
     * Get user websites
     *
     * Get user websites, claimed or not
     */
    @Test
    @Disabled("Not Implemented")
    public void userWebsitesGetTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        UserWebsitesGet200Response body = api.userWebsitesGet(bookmark, pageSize).block();

        // then
        // TODO implement the userWebsitesGetTest()
    }

    
    /**
     * Verify website
     *
     * Verify a website as a signed-in user.
     */
    @Test
    @Disabled("Not Implemented")
    public void verifyWebsiteUpdateTest() {
        // given
        UserWebsiteVerifyRequest userWebsiteVerifyRequest = new UserWebsiteVerifyRequest();

        // when
        UserWebsiteSummary body = api.verifyWebsiteUpdate(userWebsiteVerifyRequest).block();

        // then
        // TODO implement the verifyWebsiteUpdateTest()
    }

    
    /**
     * Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     */
    @Test
    @Disabled("Not Implemented")
    public void websiteVerificationGetTest() {
        // given

        // when
        UserWebsiteVerificationCode body = api.websiteVerificationGet().block();

        // then
        // TODO implement the websiteVerificationGetTest()
    }

    
}
