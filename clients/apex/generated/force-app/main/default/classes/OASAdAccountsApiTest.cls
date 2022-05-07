@isTest
private class OASAdAccountsApiTest {
    /**
     * Get ad account analytics
     *
     * Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
            'columns' => new List<String>{'SPEND_IN_DOLLAR'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASAdAccountsApi api;
        List<Map<String, Object>> response;
        List<Map<String, Object>> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Map<String, Object>>) api.adAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ad accounts
     *
     * Get a list of the ad_accounts that the &quot;operation user_account&quot; has access to.\n- This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;.
     */
    @isTest
    private static void adAccountsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => '',
            'includeSharedAccounts' => ''
        };

        OASClient client;
        OASAdAccountsApi api;
        OASPaginated response;
        OASPaginated expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);
        api.adAccountsList(params);
    }

    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
            'columns' => new List<String>{'SPEND_IN_DOLLAR'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASAdAccountsApi api;
        List<Map<String, Object>> response;
        List<Map<String, Object>> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Map<String, Object>>) api.adGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ad groups
     *
     * Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
        OASAdAccountsApi api;
        OASPaginated response;
        OASPaginated expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);
        api.adGroupsList(params);
    }

    /**
     * Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @isTest
    private static void adsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'adIds' => new List<String>{''},
            'columns' => new List<String>{'SPEND_IN_DOLLAR'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASAdAccountsApi api;
        List<Map<String, Object>> response;
        List<Map<String, Object>> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Map<String, Object>>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ads
     *
     * Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @isTest
    private static void adsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignIds' => new List<String>{''},
            'adGroupIds' => new List<String>{''},
            'adIds' => new List<String>{''},
            'entityStatuses' => new List<String>{'ACTIVE'},
            'pageSize' => '',
            'order' => ASCENDING,
            'bookmark' => 'null'
        };

        OASClient client;
        OASAdAccountsApi api;
        OASPaginated response;
        OASPaginated expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);
        api.adsList(params);
    }

    /**
     * Create async request for an account analytics report
     *
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
    }

    /**
     * Get the account analytics report created by the async call
     *
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it\&#39;s valid for an hour.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
    }

    /**
     * Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
            'columns' => new List<String>{'SPEND_IN_DOLLAR'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASAdAccountsApi api;
        List<Map<String, Object>> response;
        List<Map<String, Object>> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Map<String, Object>>) api.campaignsAnalytics(params);
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
        OASAdAccountsApi api;
        OASPaginated response;
        OASPaginated expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);
        api.campaignsList(params);
    }

    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @isTest
    private static void productGroupsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'productGroupIds' => new List<String>{''},
            'columns' => new List<String>{'SPEND_IN_DOLLAR'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASAdAccountsApi api;
        List<Map<String, Object>> response;
        List<Map<String, Object>> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdAccountsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Map<String, Object>>) api.productGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }
}