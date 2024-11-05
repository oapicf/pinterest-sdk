@isTest
private class OASAdGroupsApiTest {
    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @isTest
    private static void adGroupsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'adGroupIds' => new List<String>{''},
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASAdGroupsApi api;
        List<OASAdGroupsAnalyticsResponseInner> response;
        List<OASAdGroupsAnalyticsResponseInner> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdGroupsAnalyticsResponseInner>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdGroupsAnalyticsResponseInner>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdGroupsAnalyticsResponseInner>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria. \nPotential audience size estimates the number of people you may be able to reach per month with your campaign. \nIt is based on historical advertising data and the targeting criteria you select.\nIt does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     */
    @isTest
    private static void adGroupsAudienceSizingTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdGroupAudienceSizingRequest' => ''
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupAudienceSizingResponse response;
        OASAdGroupAudienceSizingResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupAudienceSizingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizingResponse.getExample();
        response = (OASAdGroupAudienceSizingResponse) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizingResponse.getExample();
        response = (OASAdGroupAudienceSizingResponse) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizingResponse.getExample();
        response = (OASAdGroupAudienceSizingResponse) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizingResponse.getExample();
        response = (OASAdGroupAudienceSizingResponse) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get bid floors
     *
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. &lt;p/&gt;\n&lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt;\n&lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.&lt;/p&gt;\n&lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;\n  &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt;\n&lt;/ul&gt;\n&lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;\n  &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt;\n &lt;/ul&gt;\nFor more on bid floors see &lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/set-your-bid&quot;&gt; Set your bid&lt;/a&gt;.
     */
    @isTest
    private static void adGroupsBidFloorGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSBidFloorRequest' => ''
        };

        OASClient client;
        OASAdGroupsApi api;
        OASBidFloor response;
        OASBidFloor expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASBidFloor.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBidFloor.getExample();
        response = (OASBidFloor) api.adGroupsBidFloorGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBidFloor.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBidFloor.getExample();
        response = (OASBidFloor) api.adGroupsBidFloorGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create ad groups
     *
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/campaign-structure&quot; target&#x3D;&quot;_blank&quot;&gt; click here&lt;/a&gt;.&lt;/p&gt;\n&lt;strong&gt;Note:&lt;/strong&gt;\n- \&#39;bid_in_micro_currency\&#39; and \&#39;budget_in_micro_currency\&#39; should be expressed in microcurrency amounts based on the currency field set in the advertiser\&#39;s profile.&lt;p/&gt;\n&lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt;\n&lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt;\n &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;\n  &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt;\n&lt;/ul&gt;\n&lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;\n  &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt;\n&lt;/ul&gt;\n- Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.\n- Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
     */
    @isTest
    private static void adGroupsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdGroupCreateRequest' => new List<OASAdGroupCreateRequest>{OASAdGroupCreateRequest.getExample()}
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupArrayResponse response;
        OASAdGroupArrayResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupArrayResponse.getExample();
        response = (OASAdGroupArrayResponse) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupArrayResponse.getExample();
        response = (OASAdGroupArrayResponse) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ad group
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will\ncontain additional information from the Ad Review process.\nFor more information about our policies and rejection reasons see the &lt;a href&#x3D;&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/&quot; target&#x3D;&quot;_blank&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     */
    @isTest
    private static void adGroupsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'adGroupId' => 'null'
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupResponse response;
        OASAdGroupResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupResponse.getExample();
        response = (OASAdGroupResponse) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupResponse.getExample();
        response = (OASAdGroupResponse) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt;\n&lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt;\nProvide only campaign_id or ad_group_id. Do not provide both.
     */
    @isTest
    private static void adGroupsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignIds' => new List<String>{''},
            'adGroupIds' => new List<String>{''},
            'entityStatuses' => new List<String>{'ACTIVE'},
            'pageSize' => '',
            'order' => ASCENDING,
            'bookmark' => 'null',
            'translateInterestsToNames' => ''
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupsList200Response response;
        OASAdGroupsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.adGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.adGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.adGroupsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get targeting analytics for ad groups
     *
     * Get targeting analytics for one or more ad groups.\nFor the requested ad group(s) and metrics, the response will include the requested metric information\n(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. &quot;age_bucket&quot;) for applicable values (e.g. &quot;45-49&quot;). &lt;p/&gt;\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one\nof the necessary roles granted to them via\n&lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @isTest
    private static void adGroupsTargetingAnalyticsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'adGroupIds' => new List<String>{''},
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'targetingTypes' => new List<OASAdsAnalyticsTargetingType>{OASAdsAnalyticsTargetingType.getExample()},
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'attributionTypes' => ''
        };

        OASClient client;
        OASAdGroupsApi api;
        OASMetricsResponse response;
        OASMetricsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adGroupsTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adGroupsTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update ad groups
     *
     * Update multiple existing ad groups.
     */
    @isTest
    private static void adGroupsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdGroupUpdateRequest' => new List<OASAdGroupUpdateRequest>{OASAdGroupUpdateRequest.getExample()}
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupArrayResponse response;
        OASAdGroupArrayResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupArrayResponse.getExample();
        response = (OASAdGroupArrayResponse) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupArrayResponse.getExample();
        response = (OASAdGroupArrayResponse) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}