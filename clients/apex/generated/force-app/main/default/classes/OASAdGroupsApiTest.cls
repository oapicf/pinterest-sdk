@isTest
private class OASAdGroupsApiTest {
    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.\n\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @isTest
    private static void adGroupsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'adGroupIds' => new List<String>{''},
            'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
            'granularity' => '',
            'adAccountId' => 'null',
            'clickWindowDays' => '',
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'aggregateReportRows' => '',
            'reportingTimezone' => ''
        };

        OASClient client;
        OASAdGroupsApi api;
        List<OASAdGroupsAnalyticsMetrics> response;
        List<OASAdGroupsAnalyticsMetrics> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdGroupsAnalyticsMetrics>{OASAdGroupsAnalyticsMetrics.getExample()};
        response = (List<OASAdGroupsAnalyticsMetrics>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria.\nPotential audience size estimates the number of people you may be able to reach per month with your campaign.\nIt is based on historical advertising data and the targeting criteria you select.\nIt does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     */
    @isTest
    private static void adGroupsAudienceSizingTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdGroupAudienceSizingCreate' => ''
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupAudienceSizing response;
        OASAdGroupAudienceSizing expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupAudienceSizing.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupAudienceSizing.getExample();
        response = (OASAdGroupAudienceSizing) api.adGroupsAudienceSizing(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get bid floors
     *
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.\n\nMicrocurrency is used to track very small transactions, based on the currency set in the advertiser\&#39;s profile.\n\nA microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\&#39;s profile.\n\n**Equivalency equations**, using dollars as an example currency:\n\n* $1 &#x3D; 1,000,000 microdollars\n* 1 microdollar &#x3D; $0.000001\n\n**To convert between currency and microcurrency**, using dollars as an example currency:\n\n* To convert dollars to microdollars, mutiply dollars by 1,000,000\n* To convert microdollars to dollars, divide microdollars by 1,000,000\n\nFor more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
     */
    @isTest
    private static void adGroupsBidFloorGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSBidFloorCreate' => ''
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
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).\n\nFor more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).\n\n**Notes:**\n- &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser\&#39;s profile.\n\nMicrocurrency is used to track very small transactions, based on the currency set in the advertiser\&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\&#39;s profile.\n\n**Equivalency equations**, using dollars as an example currency:\n- $1 &#x3D; 1,000,000 microdollars\n- 1 microdollar &#x3D; $0.000001\n\n**To convert between currency and microcurrency**, using dollars as an example currency:\n- To convert dollars to microdollars, multiply dollars by 1,000,000\n- To convert microdollars to dollars, divide microdollars by 1,000,000\n\n- Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.\n- Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only.\n- If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
     */
    @isTest
    private static void adGroupsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdGroupCreateCreate' => new List<OASAdGroupCreateCreate>{OASAdGroupCreateCreate.getExample()}
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupsCreate200Response response;
        OASAdGroupsCreate200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get dynamic titles CSV download URL
     *
     * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
     */
    @isTest
    private static void adGroupsDynamicTitlesDownloadCsvTest() {
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
        OASDynamicTitlesDownloadCSV response;
        OASDynamicTitlesDownloadCSV expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASDynamicTitlesDownloadCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesDownloadCSV.getExample();
        response = (OASDynamicTitlesDownloadCSV) api.adGroupsDynamicTitlesDownloadCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesDownloadCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesDownloadCSV.getExample();
        response = (OASDynamicTitlesDownloadCSV) api.adGroupsDynamicTitlesDownloadCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesDownloadCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesDownloadCSV.getExample();
        response = (OASDynamicTitlesDownloadCSV) api.adGroupsDynamicTitlesDownloadCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesDownloadCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesDownloadCSV.getExample();
        response = (OASDynamicTitlesDownloadCSV) api.adGroupsDynamicTitlesDownloadCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesDownloadCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesDownloadCSV.getExample();
        response = (OASDynamicTitlesDownloadCSV) api.adGroupsDynamicTitlesDownloadCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesDownloadCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesDownloadCSV.getExample();
        response = (OASDynamicTitlesDownloadCSV) api.adGroupsDynamicTitlesDownloadCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesDownloadCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesDownloadCSV.getExample();
        response = (OASDynamicTitlesDownloadCSV) api.adGroupsDynamicTitlesDownloadCsv(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get dynamic titles status
     *
     * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
     */
    @isTest
    private static void adGroupsDynamicTitlesGetStatusTest() {
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
        OASDynamicTitlesGetStatus response;
        OASDynamicTitlesGetStatus expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASDynamicTitlesGetStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesGetStatus.getExample();
        response = (OASDynamicTitlesGetStatus) api.adGroupsDynamicTitlesGetStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesGetStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesGetStatus.getExample();
        response = (OASDynamicTitlesGetStatus) api.adGroupsDynamicTitlesGetStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesGetStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesGetStatus.getExample();
        response = (OASDynamicTitlesGetStatus) api.adGroupsDynamicTitlesGetStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesGetStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesGetStatus.getExample();
        response = (OASDynamicTitlesGetStatus) api.adGroupsDynamicTitlesGetStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesGetStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesGetStatus.getExample();
        response = (OASDynamicTitlesGetStatus) api.adGroupsDynamicTitlesGetStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesGetStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesGetStatus.getExample();
        response = (OASDynamicTitlesGetStatus) api.adGroupsDynamicTitlesGetStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesGetStatus.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesGetStatus.getExample();
        response = (OASDynamicTitlesGetStatus) api.adGroupsDynamicTitlesGetStatus(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get dynamic titles upload URL
     *
     * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
     */
    @isTest
    private static void adGroupsDynamicTitlesGetUploadUrlTest() {
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
        OASDynamicTitlesUploadURL response;
        OASDynamicTitlesUploadURL expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASDynamicTitlesUploadURL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesUploadURL.getExample();
        response = (OASDynamicTitlesUploadURL) api.adGroupsDynamicTitlesGetUploadUrl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesUploadURL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesUploadURL.getExample();
        response = (OASDynamicTitlesUploadURL) api.adGroupsDynamicTitlesGetUploadUrl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesUploadURL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesUploadURL.getExample();
        response = (OASDynamicTitlesUploadURL) api.adGroupsDynamicTitlesGetUploadUrl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesUploadURL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesUploadURL.getExample();
        response = (OASDynamicTitlesUploadURL) api.adGroupsDynamicTitlesGetUploadUrl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesUploadURL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesUploadURL.getExample();
        response = (OASDynamicTitlesUploadURL) api.adGroupsDynamicTitlesGetUploadUrl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesUploadURL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesUploadURL.getExample();
        response = (OASDynamicTitlesUploadURL) api.adGroupsDynamicTitlesGetUploadUrl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesUploadURL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesUploadURL.getExample();
        response = (OASDynamicTitlesUploadURL) api.adGroupsDynamicTitlesGetUploadUrl(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Process dynamic titles CSV
     *
     * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
     */
    @isTest
    private static void adGroupsDynamicTitlesProcessCsvTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'adGroupId' => 'null',
            'oaSDynamicTitlesProcessCSVCreate' => ''
        };

        OASClient client;
        OASAdGroupsApi api;
        OASDynamicTitlesProcessCSV response;
        OASDynamicTitlesProcessCSV expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDynamicTitlesProcessCSV.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDynamicTitlesProcessCSV.getExample();
        response = (OASDynamicTitlesProcessCSV) api.adGroupsDynamicTitlesProcessCsv(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ad group
     *
     * Get a specific ad group given the ad group ID.
     */
    @isTest
    private static void adGroupsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adGroupId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroup response;
        OASAdGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroup.getExample();
        response = (OASAdGroup) api.adGroupsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids).\n**Note:** Provide only campaign_id or ad_group_id. Do not provide both.
     */
    @isTest
    private static void adGroupsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => '',
            'campaignIds' => new List<String>{''},
            'adGroupIds' => new List<String>{''},
            'entityStatuses' => new List<OASEntityStatus>{OASEntityStatus.getExample()},
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


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.adGroupsList(params);
        System.assertEquals(expectedResponse, response);
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
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. &quot;age_bucket&quot;) for applicable values (e.g. &quot;45-49&quot;).\n\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
            'targetingTypes' => new List<OASAdsAnalyticsAdGroupTargetingType>{OASAdsAnalyticsAdGroupTargetingType.getExample()},
            'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
            'granularity' => '',
            'clickWindowDays' => '',
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'attributionTypes' => new List<OASConversionReportAttributionType>{OASConversionReportAttributionType.getExample()},
            'reportingTimezone' => '',
            'sortColumns' => new List<String>{''},
            'sortAscending' => ''
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


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adGroupsTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
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
            'oaSAdGroupUpdateBatchUpdate' => new List<OASAdGroupUpdateBatchUpdate>{OASAdGroupUpdateBatchUpdate.getExample()}
        };

        OASClient client;
        OASAdGroupsApi api;
        OASAdGroupsCreate200Response response;
        OASAdGroupsCreate200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdGroupsApi(client);

        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsCreate200Response.getExample();
        response = (OASAdGroupsCreate200Response) api.adGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List of ad groups using promotions IDs.
     *
     *   Get a list of ad groups that are associated with those promotion ids
     */
    @isTest
    private static void getAdGroupsByPromotionIdsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'promotionIds' => new List<String>{''},
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => ''
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
        response = (OASAdGroupsList200Response) api.getAdGroupsByPromotionIdsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.getAdGroupsByPromotionIdsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.getAdGroupsByPromotionIdsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.getAdGroupsByPromotionIdsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.getAdGroupsByPromotionIdsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.getAdGroupsByPromotionIdsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdGroupsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdGroupsList200Response.getExample();
        response = (OASAdGroupsList200Response) api.getAdGroupsByPromotionIdsList(params);
        System.assertEquals(expectedResponse, response);
    }
}