@isTest
private class OASCampaignsApiTest {
    /**
     * Get targeting analytics for campaigns
     *
     * Get targeting analytics for one or more campaigns.\nFor the requested account and metrics, the response will include the requested metric information\n(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. &quot;age_bucket&quot;) for applicable values (e.g. &quot;45-49&quot;). &lt;p/&gt;\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one\nof the necessary roles granted to them via\n&lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @isTest
    private static void campaignTargetingAnalyticsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignIds' => new List<String>{''},
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'targetingTypes' => new List<OASAdsAnalyticsCampaignTargetingType>{OASAdsAnalyticsCampaignTargetingType.getExample()},
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'attributionTypes' => ''
        };

        OASClient client;
        OASCampaignsApi api;
        OASMetricsResponse response;
        OASMetricsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @isTest
    private static void campaignsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'campaignIds' => new List<String>{''},
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASCampaignsApi api;
        List<OASCampaignsAnalyticsResponseInner> response;
        List<OASCampaignsAnalyticsResponseInner> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASCampaignsAnalyticsResponseInner>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASCampaignsAnalyticsResponseInner>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASCampaignsAnalyticsResponseInner>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create campaigns
     *
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.\nFor more, see &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/set-up-your-campaign/&quot;&gt;Set up your campaign&lt;/a&gt;. &lt;p/&gt;\n&lt;strong&gt;Note:&lt;/strong&gt;\n- The values for \&#39;lifetime_spend_cap\&#39; and \&#39;daily_spend_cap\&#39; are microcurrency amounts based on the currency field set in the advertiser\&#39;s profile. (e.g. USD) &lt;p/&gt;\n&lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt;\n&lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt;\n &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;\n  &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt;\n&lt;/ul&gt;\n&lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;\n  &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt;\n&lt;/ul&gt;
     */
    @isTest
    private static void campaignsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCampaignCreateRequest' => new List<OASCampaignCreateRequest>{OASCampaignCreateRequest.getExample()}
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignCreateResponse response;
        OASCampaignCreateResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignCreateResponse.getExample();
        response = (OASCampaignCreateResponse) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignCreateResponse.getExample();
        response = (OASCampaignCreateResponse) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get campaign
     *
     * Get a specific campaign given the campaign ID.
     */
    @isTest
    private static void campaignsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignId' => 'null'
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignResponse response;
        OASCampaignResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignResponse.getExample();
        response = (OASCampaignResponse) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignResponse.getExample();
        response = (OASCampaignResponse) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List campaigns
     *
     * Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @isTest
    private static void campaignsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignIds' => new List<String>{''},
            'entityStatuses' => new List<String>{'ACTIVE'},
            'pageSize' => '',
            'order' => ASCENDING,
            'bookmark' => 'null'
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignsList200Response response;
        OASCampaignsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update campaigns
     *
     * Update multiple ad campaigns based on campaign_ids. &lt;p/&gt;\n&lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt;\n - &lt;p&gt;The values for \&#39;lifetime_spend_cap\&#39; and \&#39;daily_spend_cap\&#39; are microcurrency amounts based on the currency field set in the advertiser\&#39;s profile. (e.g. USD) &lt;p/&gt;\n&lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt;\n&lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.&lt;/p&gt;\n&lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;\n  &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt;\n&lt;/ul&gt;\n&lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt;\n&lt;ul&gt;\n  &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;\n  &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt;\n&lt;/ul&gt;
     */
    @isTest
    private static void campaignsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCampaignUpdateRequest' => new List<OASCampaignUpdateRequest>{OASCampaignUpdateRequest.getExample()}
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignUpdateResponse response;
        OASCampaignUpdateResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignUpdateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignUpdateResponse.getExample();
        response = (OASCampaignUpdateResponse) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignUpdateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignUpdateResponse.getExample();
        response = (OASCampaignUpdateResponse) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}