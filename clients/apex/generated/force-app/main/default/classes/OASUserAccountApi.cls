/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

public class OASUserAccountApi {
    OASClient client;

    public OASUserAccountApi(OASClient client) {
        this.client = client;
    }

    public OASUserAccountApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * List following boards
     * Get a list of the boards a user follows. The request returns a board summary object array.
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to false)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return OASBoardsUserFollowsList200Response
     * @throws OAS.ApiException if fails to make API call
     */
    public OASBoardsUserFollowsList200Response boardsUserFollowsList(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));
        query.addAll(client.makeParam('explicit_following', (Boolean) params.get('explicitFollowing')));
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASBoardsUserFollowsList200Response) client.invoke(
            'GET', '/user_account/following/boards', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASBoardsUserFollowsList200Response.class
        );
    }
    /**
     * Follow user
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nUse this request, as a signed-in user, to follow another user.
     * @param username A valid username (required)
     * @param oaSFollowUserRequest Follow a user. (required)
     * @return OASUserSummary
     * @throws OAS.ApiException if fails to make API call
     */
    public OASUserSummary followUserUpdate(Map<String, Object> params) {
        client.assertNotNull(params.get('username'), 'username');
        client.assertNotNull(params.get('oaSFollowUserRequest'), 'oaSFollowUserRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASUserSummary) client.invoke(
            'POST', '/user_account/following/{username}',
            (OASFollowUserRequest) params.get('oaSFollowUserRequest'),
            query, form,
            new Map<String, Object>{
                'username' => (String) params.get('username')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'pinterest_oauth2' },
            OASUserSummary.class
        );
    }
    /**
     * List followers
     * Get a list of your followers.
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return OASFollowersList200Response
     * @throws OAS.ApiException if fails to make API call
     */
    public OASFollowersList200Response followersList(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASFollowersList200Response) client.invoke(
            'GET', '/user_account/followers', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASFollowersList200Response.class
        );
    }
    /**
     * List linked businesses
     * Get a list of your linked business accounts.
     * @return List<OASLinkedBusiness>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASLinkedBusiness> linkedBusinessAccountsGet() {
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASLinkedBusiness>) client.invoke(
            'GET', '/user_account/businesses', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            List<OASLinkedBusiness>.class
        );
    }
    /**
     * Unverify website
     * Unverifu a website verified by the signed-in user.
     * @param website Website with path or domain only (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void unverifyWebsiteDelete(Map<String, Object> params) {
        client.assertNotNull(params.get('website'), 'website');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('website', (String) params.get('website')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'DELETE', '/user_account/websites', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            null
        );
    }
    /**
     * Get user account analytics
     * Get analytics for the &quot;operation user_account&quot;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to BOTH)
     * @param pinFormat Pin formats to get data for, default is all. (optional, default to ALL)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param contentType Filter to paid or organic data. Default is all. (optional, default to ALL)
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
     * @param metricTypes Metric types to get data for, default is all.  (optional, default to new List<String>())
     * @param splitField How to split the data into groups. Not including this param means data won\&#39;t be split. (optional, default to NO_SPLIT)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Map<String, OASAnalyticsMetricsResponse>
     * @throws OAS.ApiException if fails to make API call
     */
    public Map<String, OASAnalyticsMetricsResponse> userAccountAnalytics(Map<String, Object> params) {
        client.assertNotNull(params.get('startDate'), 'startDate');
        client.assertNotNull(params.get('endDate'), 'endDate');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('start_date', (Date) params.get('startDate')));
        query.addAll(client.makeParam('end_date', (Date) params.get('endDate')));
        query.addAll(client.makeParam('from_claimed_content', (String) params.get('fromClaimedContent')));
        query.addAll(client.makeParam('pin_format', (String) params.get('pinFormat')));
        query.addAll(client.makeParam('app_types', (String) params.get('appTypes')));
        query.addAll(client.makeParam('content_type', (String) params.get('contentType')));
        query.addAll(client.makeParam('source', (String) params.get('source')));
        query.addAll(client.makeParam('metric_types', (List<String>) params.get('metricTypes'), 'csv'));
        query.addAll(client.makeParam('split_field', (String) params.get('splitField')));
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (Map<String, OASAnalyticsMetricsResponse>) client.invoke(
            'GET', '/user_account/analytics', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            Map<String, OASAnalyticsMetricsResponse>.class
        );
    }
    /**
     * Get user account top pins analytics
     * Gets analytics data about a user\&#39;s top pins (limited to the top 50).\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param sortBy Specify sorting order for metrics (required)
     * @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to BOTH)
     * @param pinFormat Pin formats to get data for, default is all. (optional, default to ALL)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param contentType Filter to paid or organic data. Default is all. (optional, default to ALL)
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
     * @param metricTypes Metric types to get data for, default is all.  (optional, default to new List<String>())
     * @param numOfPins Number of pins to include, default is 10. Max is 50. (optional, default to 10)
     * @param createdInLastNDays Get metrics for pins created in the last &quot;n&quot; days. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return OASTopPinsAnalyticsResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASTopPinsAnalyticsResponse userAccountAnalyticsTopPins(Map<String, Object> params) {
        client.assertNotNull(params.get('startDate'), 'startDate');
        client.assertNotNull(params.get('endDate'), 'endDate');
        client.assertNotNull(params.get('sortBy'), 'sortBy');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('start_date', (Date) params.get('startDate')));
        query.addAll(client.makeParam('end_date', (Date) params.get('endDate')));
        query.addAll(client.makeParam('sort_by', (String) params.get('sortBy')));
        query.addAll(client.makeParam('from_claimed_content', (String) params.get('fromClaimedContent')));
        query.addAll(client.makeParam('pin_format', (String) params.get('pinFormat')));
        query.addAll(client.makeParam('app_types', (String) params.get('appTypes')));
        query.addAll(client.makeParam('content_type', (String) params.get('contentType')));
        query.addAll(client.makeParam('source', (String) params.get('source')));
        query.addAll(client.makeParam('metric_types', (List<String>) params.get('metricTypes'), 'csv'));
        query.addAll(client.makeParam('num_of_pins', (Integer) params.get('numOfPins')));
        query.addAll(client.makeParam('created_in_last_n_days', (Integer) params.get('createdInLastNDays')));
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASTopPinsAnalyticsResponse) client.invoke(
            'GET', '/user_account/analytics/top_pins', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASTopPinsAnalyticsResponse.class
        );
    }
    /**
     * Get user account top video pins analytics
     * Gets analytics data about a user\&#39;s top video pins (limited to the top 50).\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param sortBy Specify sorting order for video metrics (required)
     * @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to BOTH)
     * @param pinFormat Pin formats to get data for, default is all. (optional, default to ALL)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param contentType Filter to paid or organic data. Default is all. (optional, default to ALL)
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
     * @param metricTypes Metric types to get video data for, default is all.  (optional, default to new List<String>())
     * @param numOfPins Number of pins to include, default is 10. Max is 50. (optional, default to 10)
     * @param createdInLastNDays Get metrics for pins created in the last &quot;n&quot; days. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return OASTopVideoPinsAnalyticsResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASTopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(Map<String, Object> params) {
        client.assertNotNull(params.get('startDate'), 'startDate');
        client.assertNotNull(params.get('endDate'), 'endDate');
        client.assertNotNull(params.get('sortBy'), 'sortBy');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('start_date', (Date) params.get('startDate')));
        query.addAll(client.makeParam('end_date', (Date) params.get('endDate')));
        query.addAll(client.makeParam('sort_by', (String) params.get('sortBy')));
        query.addAll(client.makeParam('from_claimed_content', (String) params.get('fromClaimedContent')));
        query.addAll(client.makeParam('pin_format', (String) params.get('pinFormat')));
        query.addAll(client.makeParam('app_types', (String) params.get('appTypes')));
        query.addAll(client.makeParam('content_type', (String) params.get('contentType')));
        query.addAll(client.makeParam('source', (String) params.get('source')));
        query.addAll(client.makeParam('metric_types', (List<String>) params.get('metricTypes'), 'csv'));
        query.addAll(client.makeParam('num_of_pins', (Integer) params.get('numOfPins')));
        query.addAll(client.makeParam('created_in_last_n_days', (Integer) params.get('createdInLastNDays')));
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASTopVideoPinsAnalyticsResponse) client.invoke(
            'GET', '/user_account/analytics/top_video_pins', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASTopVideoPinsAnalyticsResponse.class
        );
    }
    /**
     * List following interests
     * Get a list of a user\&#39;s following interests in one place.
     * @param username A valid username (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return OASUserAccountFollowedInterests200Re
     * @throws OAS.ApiException if fails to make API call
     */
    public OASUserAccountFollowedInterests200Re userAccountFollowedInterests(Map<String, Object> params) {
        client.assertNotNull(params.get('username'), 'username');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASUserAccountFollowedInterests200Re) client.invoke(
            'GET', '/users/{username}/interests/follow', '',
            query, form,
            new Map<String, Object>{
                'username' => (String) params.get('username')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASUserAccountFollowedInterests200Re.class
        );
    }
    /**
     * Get user account
     * Get account information for the &quot;operation user_account&quot;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nIf using Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;. See &lt;a href&#x3D;\&#39;/docs/getting-started/using-business-access/\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return OASAccount
     * @throws OAS.ApiException if fails to make API call
     */
    public OASAccount userAccountGet(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASAccount) client.invoke(
            'GET', '/user_account', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASAccount.class
        );
    }
    /**
     * List following
     * Get a list of who a certain user follows.
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param feedType Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to false)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return OASUserFollowingGet200Response
     * @throws OAS.ApiException if fails to make API call
     */
    public OASUserFollowingGet200Response userFollowingGet(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));
        query.addAll(client.makeParam('feed_type', (OASUserFollowingFeedType) params.get('feedType')));
        query.addAll(client.makeParam('explicit_following', (Boolean) params.get('explicitFollowing')));
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASUserFollowingGet200Response) client.invoke(
            'GET', '/user_account/following', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASUserFollowingGet200Response.class
        );
    }
    /**
     * Get user websites
     * Get user websites, claimed or not
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return OASUserWebsitesGet200Response
     * @throws OAS.ApiException if fails to make API call
     */
    public OASUserWebsitesGet200Response userWebsitesGet(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASUserWebsitesGet200Response) client.invoke(
            'GET', '/user_account/websites', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASUserWebsitesGet200Response.class
        );
    }
    /**
     * Verify website
     * Verify a website as a signed-in user.
     * @param oaSUserWebsiteVerifyRequest Verify a website. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return OASUserWebsiteSummary
     * @throws OAS.ApiException if fails to make API call
     */
    public OASUserWebsiteSummary verifyWebsiteUpdate(Map<String, Object> params) {
        client.assertNotNull(params.get('oaSUserWebsiteVerifyRequest'), 'oaSUserWebsiteVerifyRequest');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASUserWebsiteSummary) client.invoke(
            'POST', '/user_account/websites',
            (OASUserWebsiteVerifyRequest) params.get('oaSUserWebsiteVerifyRequest'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'pinterest_oauth2' },
            OASUserWebsiteSummary.class
        );
    }
    /**
     * Get user verification code for website claiming
     * Get verification code for user to install on the website to claim it.
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return OASUserWebsiteVerificationCode
     * @throws OAS.ApiException if fails to make API call
     */
    public OASUserWebsiteVerificationCode websiteVerificationGet(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('ad_account_id', (String) params.get('adAccountId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASUserWebsiteVerificationCode) client.invoke(
            'GET', '/user_account/websites/verification', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2', 'client_credentials' },
            OASUserWebsiteVerificationCode.class
        );
    }
}
