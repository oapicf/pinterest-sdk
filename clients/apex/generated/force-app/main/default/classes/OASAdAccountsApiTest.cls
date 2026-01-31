@isTest
private class OASAdAccountsApiTest {
    /**
     * Get ad account analytics
     *
     * Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
     */
    @isTest
    private static void adAccountAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'reportingTimezone' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        List<OASAdAccountAnalyticsResponseInner> response;
        List<OASAdAccountAnalyticsResponseInner> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdAccountAnalyticsResponseInner>) api.adAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdAccountAnalyticsResponseInner>) api.adAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdAccountAnalyticsResponseInner>) api.adAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdAccountAnalyticsResponseInner>) api.adAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdAccountAnalyticsResponseInner>) api.adAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdAccountAnalyticsResponseInner>) api.adAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get targeting analytics for an ad account
     *
     * Get targeting analytics for an ad account.\nFor the requested account and metrics, the response will include the requested metric information\n(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. &quot;age_bucket&quot;) for applicable values (e.g. &quot;45-49&quot;). &lt;p/&gt;\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one\nof the necessary roles granted to them via\n&lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @isTest
    private static void adAccountTargetingAnalyticsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'targetingTypes' => new List<OASAdsAnalyticsTargetingType>{OASAdsAnalyticsTargetingType.getExample()},
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'attributionTypes' => new List<OASConversionReportAttributionType>{OASConversionReportAttributionType.getExample()},
            'reportingTimezone' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASMetricsResponse response;
        OASMetricsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adAccountTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adAccountTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adAccountTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adAccountTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create ad account
     *
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc.\nAn ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.\n\nYou can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.)\nFor more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
     */
    @isTest
    private static void adAccountsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAdAccountCreate' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASAdAccount response;
        OASAdAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ad account
     *
     * Get an ad account
     */
    @isTest
    private static void adAccountsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdAccountsApi api;
        OASAdAccount response;
        OASAdAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccount.getExample();
        response = (OASAdAccount) api.adAccountsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ad accounts
     *
     * Get a list of the ad_accounts that the &quot;operation user_account&quot; has access to.\n        - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
     */
    @isTest
    private static void adAccountsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'includeSharedAccounts' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASAdAccountsList200Response response;
        OASAdAccountsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsList200Response.getExample();
        response = (OASAdAccountsList200Response) api.adAccountsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a request for a brand, category, SKU report
     *
     * &lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;blank&quot; target&#x3D;&quot;blank&quot;&gt;Restricted&lt;/a&gt;\nThis creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
     */
    @isTest
    private static void analyticsCreateConversionProductReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSConversionProductReportRequest' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASAdsAnalyticsCreateAsyncResponse response;
        OASAdsAnalyticsCreateAsyncResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdsAnalyticsCreateAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsCreateAsyncResponse.getExample();
        response = (OASAdsAnalyticsCreateAsyncResponse) api.analyticsCreateConversionProductReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsCreateAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsCreateAsyncResponse.getExample();
        response = (OASAdsAnalyticsCreateAsyncResponse) api.analyticsCreateConversionProductReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsCreateAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsCreateAsyncResponse.getExample();
        response = (OASAdsAnalyticsCreateAsyncResponse) api.analyticsCreateConversionProductReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     *
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download\nthe report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\&#39;s in beta release.
     */
    @isTest
    private static void analyticsCreateMmmReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCreateMMMReportRequest' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASCreateMMMReportResponse response;
        OASCreateMMMReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASCreateMMMReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateMMMReportResponse.getExample();
        response = (OASCreateMMMReportResponse) api.analyticsCreateMmmReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateMMMReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateMMMReportResponse.getExample();
        response = (OASCreateMMMReportResponse) api.analyticsCreateMmmReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateMMMReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateMMMReportResponse.getExample();
        response = (OASCreateMMMReportResponse) api.analyticsCreateMmmReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create async request for an account analytics report
     *
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.\n- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.\n- If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.\n- If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     */
    @isTest
    private static void analyticsCreateReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdsAnalyticsCreateAsyncRequest' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASAdsAnalyticsCreateAsyncResponse response;
        OASAdsAnalyticsCreateAsyncResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdsAnalyticsCreateAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsCreateAsyncResponse.getExample();
        response = (OASAdsAnalyticsCreateAsyncResponse) api.analyticsCreateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsCreateAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsCreateAsyncResponse.getExample();
        response = (OASAdsAnalyticsCreateAsyncResponse) api.analyticsCreateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsCreateAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsCreateAsyncResponse.getExample();
        response = (OASAdsAnalyticsCreateAsyncResponse) api.analyticsCreateReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create async request for an analytics report using a template
     *
     * \n  This takes a template ID and an optional custom timeframe and\n  constructs an asynchronous report based on the template. It returns\n  a token that you can use to download the report when it is ready.
     */
    @isTest
    private static void analyticsCreateTemplateReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'templateId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'granularity' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASTemplateBasedReport response;
        OASTemplateBasedReport expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplateBasedReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplateBasedReport.getExample();
        response = (OASTemplateBasedReport) api.analyticsCreateTemplateReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get advertiser brand, category, SKU report
     *
     * &lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;blank&quot; target&#x3D;&quot;blank&quot;&gt;Restricted&lt;/a&gt;\nGet a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
     */
    @isTest
    private static void analyticsGetConversionProductReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'token' => 'null'
        };

        OASClient client;
        OASAdAccountsApi api;
        OASAdsAnalyticsGetAsyncResponse response;
        OASAdsAnalyticsGetAsyncResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdsAnalyticsGetAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsGetAsyncResponse.getExample();
        response = (OASAdsAnalyticsGetAsyncResponse) api.analyticsGetConversionProductReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsGetAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsGetAsyncResponse.getExample();
        response = (OASAdsAnalyticsGetAsyncResponse) api.analyticsGetConversionProductReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsGetAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsGetAsyncResponse.getExample();
        response = (OASAdsAnalyticsGetAsyncResponse) api.analyticsGetConversionProductReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     *
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the\ncreate mmm report endpoint.
     */
    @isTest
    private static void analyticsGetMmmReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'token' => 'null'
        };

        OASClient client;
        OASAdAccountsApi api;
        OASGetMMMReportResponse response;
        OASGetMMMReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASGetMMMReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetMMMReportResponse.getExample();
        response = (OASGetMMMReportResponse) api.analyticsGetMmmReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetMMMReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetMMMReportResponse.getExample();
        response = (OASGetMMMReportResponse) api.analyticsGetMmmReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetMMMReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetMMMReportResponse.getExample();
        response = (OASGetMMMReportResponse) api.analyticsGetMmmReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get the account analytics report created by the async call
     *
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @isTest
    private static void analyticsGetReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'token' => 'null'
        };

        OASClient client;
        OASAdAccountsApi api;
        OASAdsAnalyticsGetAsyncResponse response;
        OASAdsAnalyticsGetAsyncResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASAdsAnalyticsGetAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsGetAsyncResponse.getExample();
        response = (OASAdsAnalyticsGetAsyncResponse) api.analyticsGetReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsGetAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsGetAsyncResponse.getExample();
        response = (OASAdsAnalyticsGetAsyncResponse) api.analyticsGetReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsAnalyticsGetAsyncResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsAnalyticsGetAsyncResponse.getExample();
        response = (OASAdsAnalyticsGetAsyncResponse) api.analyticsGetReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete ads data for ad account in API Sandbox
     *
     * Delete an ad account and all the ads data associated with that account.\nA string message is returned indicating the status of the delete operation.\n\nNote: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).\nGo to /docs/developer-tools/sandbox/ for more information.
     */
    @isTest
    private static void sandboxDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdAccountsApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize('Delete Success');
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = 'Delete Success';
        response = (String) api.sandboxDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize('Delete Success');
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = 'Delete Success';
        response = (String) api.sandboxDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize('Delete Success');
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = 'Delete Success';
        response = (String) api.sandboxDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List templates
     *
     * Gets all Templates associated with an ad account ID.
     */
    @isTest
    private static void templatesListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'pageSize' => '',
            'order' => ASCENDING,
            'bookmark' => 'null'
        };

        OASClient client;
        OASAdAccountsApi api;
        OASTemplatesList200Response response;
        OASTemplatesList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(OASTemplatesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplatesList200Response.getExample();
        response = (OASTemplatesList200Response) api.templatesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplatesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplatesList200Response.getExample();
        response = (OASTemplatesList200Response) api.templatesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTemplatesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemplatesList200Response.getExample();
        response = (OASTemplatesList200Response) api.templatesList(params);
        System.assertEquals(expectedResponse, response);
    }
}