package org.openapitools.api;

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
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserWebsite;
import org.openapitools.model.UserWebsiteCreate;
import org.openapitools.model.UserWebsiteVerification;
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
        String adAccountId = "example";
        Boolean explicitFollowing = false;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BoardsList200Response body = api.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize).block();

        // then
        // TODO implement the boardsUserFollowsListTest()
    }

    
    /**
     * Follow user
     *
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
     */
    @Test
    @Disabled("Not Implemented")
    public void followUserUpdateTest() {
        // given
        String username = "example";
        FollowUserCreate followUserCreate = new FollowUserCreate();

        // when
        FollowUser body = api.followUserUpdate(username, followUserCreate).block();

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
     * Unverify a website verified by the signed-in user.
     */
    @Test
    @Disabled("Not Implemented")
    public void unverifyWebsiteDeleteTest() {
        // given
        String website = "example";

        // when
        UserWebsite body = api.unverifyWebsiteDelete(website).block();

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
        List<QuerymetrictypesItems> metricTypes = Arrays.asList();
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
        TopPinsSortBy sortBy = TopPinsSortBy.fromValue("ENGAGEMENT");
        String fromClaimedContent = "BOTH";
        String pinFormat = "ALL";
        String appTypes = "ALL";
        String contentType = "ALL";
        String source = "ALL";
        List<QuerymetrictypesItems> metricTypes = Arrays.asList();
        Integer numOfPins = 10;
        BigDecimal createdInLastNDays = new BigDecimal(78);
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
        TopVideoPinsSortBy sortBy = TopVideoPinsSortBy.fromValue("SAVE");
        String fromClaimedContent = "BOTH";
        String pinFormat = "ALL";
        String appTypes = "ALL";
        String contentType = "ALL";
        String source = "ALL";
        List<QueryvideopinmetrictypesItems> metricTypes = Arrays.asList();
        Integer numOfPins = 10;
        BigDecimal createdInLastNDays = new BigDecimal(78);
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
        String username = "example";
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
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.
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
        String adAccountId = "example";
        Boolean explicitFollowing = false;
        UserFollowingFeedType feedType = UserFollowingFeedType.fromValue("ALL");
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        FollowersList200Response body = api.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize).block();

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
        UserWebsiteCreate userWebsiteCreate = new UserWebsiteCreate();
        String adAccountId = "example";

        // when
        UserWebsite body = api.verifyWebsiteUpdate(userWebsiteCreate, adAccountId).block();

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
        String adAccountId = "example";

        // when
        UserWebsiteVerification body = api.websiteVerificationGet(adAccountId).block();

        // then
        // TODO implement the websiteVerificationGetTest()
    }

    
}
