/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

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
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 * API tests for UserAccountApi.
 */
public class UserAccountApiTest {

    private UserAccountApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://api.pinterest.com/v5", UserAccountApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * List following boards
     *
     * Get a list of the boards a user follows. The request returns a board summary object array.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void boardsUserFollowsListTest() throws Exception {
        // TODO: assign appropriate parameter values
        String bookmark = null;
        Integer pageSize = null;
        Boolean explicitFollowing = null;
        String adAccountId = null;

        // TODO: delete this line and uncomment the next
        // BoardsUserFollowsList200Response response = api.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId);
        // TODO: complete test assertions
    }
    
    /**
     * Follow user
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void followUserUpdateTest() throws Exception {
        // TODO: assign appropriate parameter values
        String username = null;
        FollowUserRequest followUserRequest = null;

        // TODO: delete this line and uncomment the next
        // UserSummary response = api.followUserUpdate(username, followUserRequest);
        // TODO: complete test assertions
    }
    
    /**
     * List followers
     *
     * Get a list of your followers.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void followersListTest() throws Exception {
        // TODO: assign appropriate parameter values
        String bookmark = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // FollowersList200Response response = api.followersList(bookmark, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * List linked businesses
     *
     * Get a list of your linked business accounts.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void linkedBusinessAccountsGetTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // List<LinkedBusiness> response = api.linkedBusinessAccountsGet();
        // TODO: complete test assertions
    }
    
    /**
     * Unverify website
     *
     * Unverifu a website verified by the signed-in user.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void unverifyWebsiteDeleteTest() throws Exception {
        // TODO: assign appropriate parameter values
        String website = null;

        // TODO: delete this line and uncomment the next
        // api.unverifyWebsiteDelete(website);
    }
    
    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void userAccountAnalyticsTest() throws Exception {
        // TODO: assign appropriate parameter values
        LocalDate startDate = null;
        LocalDate endDate = null;
        String fromClaimedContent = null;
        String pinFormat = null;
        String appTypes = null;
        String contentType = null;
        String source = null;
        List<String> metricTypes = null;
        String splitField = null;
        String adAccountId = null;

        // TODO: delete this line and uncomment the next
        // Map<String, AnalyticsMetricsResponse> response = api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId);
        // TODO: complete test assertions
    }
    
    /**
     * Get user account top pins analytics
     *
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void userAccountAnalyticsTopPinsTest() throws Exception {
        // TODO: assign appropriate parameter values
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortBy = null;
        String fromClaimedContent = null;
        String pinFormat = null;
        String appTypes = null;
        String contentType = null;
        String source = null;
        List<String> metricTypes = null;
        Integer numOfPins = null;
        Integer createdInLastNDays = null;
        String adAccountId = null;

        // TODO: delete this line and uncomment the next
        // TopPinsAnalyticsResponse response = api.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
        // TODO: complete test assertions
    }
    
    /**
     * Get user account top video pins analytics
     *
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void userAccountAnalyticsTopVideoPinsTest() throws Exception {
        // TODO: assign appropriate parameter values
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortBy = null;
        String fromClaimedContent = null;
        String pinFormat = null;
        String appTypes = null;
        String contentType = null;
        String source = null;
        List<String> metricTypes = null;
        Integer numOfPins = null;
        Integer createdInLastNDays = null;
        String adAccountId = null;

        // TODO: delete this line and uncomment the next
        // TopVideoPinsAnalyticsResponse response = api.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
        // TODO: complete test assertions
    }
    
    /**
     * List following interests
     *
     * Get a list of a user&#39;s following interests in one place.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void userAccountFollowedInterestsTest() throws Exception {
        // TODO: assign appropriate parameter values
        String username = null;
        String bookmark = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // UserAccountFollowedInterests200Response response = api.userAccountFollowedInterests(username, bookmark, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void userAccountGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String adAccountId = null;

        // TODO: delete this line and uncomment the next
        // Account response = api.userAccountGet(adAccountId);
        // TODO: complete test assertions
    }
    
    /**
     * List following
     *
     * Get a list of who a certain user follows.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void userFollowingGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String bookmark = null;
        Integer pageSize = null;
        UserFollowingFeedType feedType = null;
        Boolean explicitFollowing = null;
        String adAccountId = null;

        // TODO: delete this line and uncomment the next
        // UserFollowingGet200Response response = api.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId);
        // TODO: complete test assertions
    }
    
    /**
     * Get user websites
     *
     * Get user websites, claimed or not
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void userWebsitesGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String bookmark = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // UserWebsitesGet200Response response = api.userWebsitesGet(bookmark, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * Verify website
     *
     * Verify a website as a signed-in user.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void verifyWebsiteUpdateTest() throws Exception {
        // TODO: assign appropriate parameter values
        UserWebsiteVerifyRequest userWebsiteVerifyRequest = null;

        // TODO: delete this line and uncomment the next
        // UserWebsiteSummary response = api.verifyWebsiteUpdate(userWebsiteVerifyRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void websiteVerificationGetTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // UserWebsiteVerificationCode response = api.websiteVerificationGet();
        // TODO: complete test assertions
    }
    
}