package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for UserAccountController
 */
@MicronautTest
public class UserAccountControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    UserAccountController controller;

    /**
     * This test is used to validate the implementation of boardsUserFollowsList() method
     *
     * The method should: List following boards
     *
     * Get a list of the boards a user follows. The request returns a board summary object array.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsUserFollowsListMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        Boolean explicitFollowing = false;
        String adAccountId = "example";

        // when
        BoardsUserFollowsList200Response result = controller.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/following/boards' to the features of boardsUserFollowsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsUserFollowsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/following/boards").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6625d4aa");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("explicit_following", String.valueOf(false)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BoardsUserFollowsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of followUserUpdate() method
     *
     * The method should: Follow user
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void followUserUpdateMethodTest() {
        // given
        String username = "username";
        FollowUserRequest followUserRequest = new FollowUserRequest();

        // when
        UserSummary result = controller.followUserUpdate(username, followUserRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/following/{username}' to the features of followUserUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void followUserUpdateClientApiTest() throws IOException {
        // given
        FollowUserRequest body = new FollowUserRequest();
        String uri = UriTemplate.of("/user_account/following/{username}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("username", "username");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@23be198a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserSummary.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of followersList() method
     *
     * The method should: List followers
     *
     * Get a list of your followers.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void followersListMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        FollowersList200Response result = controller.followersList(bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/followers' to the features of followersList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void followersListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/followers").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@45507d66");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FollowersList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of linkedBusinessAccountsGet() method
     *
     * The method should: List linked businesses
     *
     * Get a list of your linked business accounts.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void linkedBusinessAccountsGetMethodTest() {
        // given

        // when
        List<LinkedBusiness> result = controller.linkedBusinessAccountsGet().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/businesses' to the features of linkedBusinessAccountsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void linkedBusinessAccountsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/businesses").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2d604f79");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, LinkedBusiness.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of unverifyWebsiteDelete() method
     *
     * The method should: Unverify website
     *
     * Unverifu a website verified by the signed-in user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void unverifyWebsiteDeleteMethodTest() {
        // given
        String website = "mysite.test";

        // when
        controller.unverifyWebsiteDelete(website).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/websites' to the features of unverifyWebsiteDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void unverifyWebsiteDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/websites").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@65284efb");
        request.getParameters()
            .add("website", "mysite.test"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userAccountAnalytics() method
     *
     * The method should: Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsMethodTest() {
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
        Map<String, AnalyticsMetricsResponse> result = controller.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/analytics' to the features of userAccountAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/analytics").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3689699d");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("from_claimed_content", "BOTH") // The query parameter format should be 
            .add("pin_format", "ALL") // The query parameter format should be 
            .add("app_types", "ALL") // The query parameter format should be 
            .add("content_type", "ALL") // The query parameter format should be 
            .add("source", "ALL") // The query parameter format should be 
            .add("metric_types", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("split_field", "NO_SPLIT") // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(Map.class, String.class, AnalyticsMetricsResponse.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userAccountAnalyticsTopPins() method
     *
     * The method should: Get user account top pins analytics
     *
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsTopPinsMethodTest() {
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
        TopPinsAnalyticsResponse result = controller.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/analytics/top_pins' to the features of userAccountAnalyticsTopPins() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsTopPinsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/analytics/top_pins").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@70749967");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("sort_by", "example") // The query parameter format should be 
            .add("from_claimed_content", "BOTH") // The query parameter format should be 
            .add("pin_format", "ALL") // The query parameter format should be 
            .add("app_types", "ALL") // The query parameter format should be 
            .add("content_type", "ALL") // The query parameter format should be 
            .add("source", "ALL") // The query parameter format should be 
            .add("metric_types", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("num_of_pins", String.valueOf(10)) // The query parameter format should be 
            .add("created_in_last_n_days", String.valueOf(30)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TopPinsAnalyticsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userAccountAnalyticsTopVideoPins() method
     *
     * The method should: Get user account top video pins analytics
     *
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsTopVideoPinsMethodTest() {
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
        TopVideoPinsAnalyticsResponse result = controller.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/analytics/top_video_pins' to the features of userAccountAnalyticsTopVideoPins() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsTopVideoPinsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/analytics/top_video_pins").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5f400b97");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("sort_by", "example") // The query parameter format should be 
            .add("from_claimed_content", "BOTH") // The query parameter format should be 
            .add("pin_format", "ALL") // The query parameter format should be 
            .add("app_types", "ALL") // The query parameter format should be 
            .add("content_type", "ALL") // The query parameter format should be 
            .add("source", "ALL") // The query parameter format should be 
            .add("metric_types", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("num_of_pins", String.valueOf(10)) // The query parameter format should be 
            .add("created_in_last_n_days", String.valueOf(30)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TopVideoPinsAnalyticsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userAccountFollowedInterests() method
     *
     * The method should: List following interests
     *
     * Get a list of a user&#39;s following interests in one place.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountFollowedInterestsMethodTest() {
        // given
        String username = "username";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        UserAccountFollowedInterests200Response result = controller.userAccountFollowedInterests(username, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/users/{username}/interests/follow' to the features of userAccountFollowedInterests() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountFollowedInterestsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/users/{username}/interests/follow").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("username", "username");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@78b8c912");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserAccountFollowedInterests200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userAccountGet() method
     *
     * The method should: Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountGetMethodTest() {
        // given
        String adAccountId = "example";

        // when
        Account result = controller.userAccountGet(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account' to the features of userAccountGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5009219");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Account.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userFollowingGet() method
     *
     * The method should: List following
     *
     * Get a list of who a certain user follows.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userFollowingGetMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        UserFollowingFeedType feedType = UserFollowingFeedType.fromValue("ALL");
        Boolean explicitFollowing = false;
        String adAccountId = "example";

        // when
        UserFollowingGet200Response result = controller.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/following' to the features of userFollowingGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userFollowingGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/following").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@516b9c7f");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("feed_type", UserFollowingFeedType.fromValue("ALL")) // The query parameter format should be 
            .add("explicit_following", String.valueOf(false)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserFollowingGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userWebsitesGet() method
     *
     * The method should: Get user websites
     *
     * Get user websites, claimed or not
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userWebsitesGetMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        UserWebsitesGet200Response result = controller.userWebsitesGet(bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/websites' to the features of userWebsitesGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userWebsitesGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/websites").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@e283976");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserWebsitesGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of verifyWebsiteUpdate() method
     *
     * The method should: Verify website
     *
     * Verify a website as a signed-in user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void verifyWebsiteUpdateMethodTest() {
        // given
        UserWebsiteVerifyRequest userWebsiteVerifyRequest = new UserWebsiteVerifyRequest();
        String adAccountId = "example";

        // when
        UserWebsiteSummary result = controller.verifyWebsiteUpdate(userWebsiteVerifyRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/websites' to the features of verifyWebsiteUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void verifyWebsiteUpdateClientApiTest() throws IOException {
        // given
        UserWebsiteVerifyRequest body = new UserWebsiteVerifyRequest();
        String uri = UriTemplate.of("/user_account/websites").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@30e691f8");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserWebsiteSummary.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of websiteVerificationGet() method
     *
     * The method should: Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void websiteVerificationGetMethodTest() {
        // given
        String adAccountId = "example";

        // when
        UserWebsiteVerificationCode result = controller.websiteVerificationGet(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/websites/verification' to the features of websiteVerificationGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void websiteVerificationGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/websites/verification").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@31f75da7");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserWebsiteVerificationCode.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
