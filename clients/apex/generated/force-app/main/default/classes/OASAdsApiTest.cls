@isTest
private class OASAdsApiTest {
    /**
     * Create ad preview with pin or image
     *
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt;\nIf you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview&quot; target&#x3D;&quot;_blank&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt;\nYou can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
     */
    @isTest
    private static void adPreviewsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdPreviewRequest' => ''
        };

        OASClient client;
        OASAdsApi api;
        OASAdPreviewURLResponse response;
        OASAdPreviewURLResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get targeting analytics for ads
     *
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics,\nthe response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type\n(e.g. &quot;age_bucket&quot;) for applicable values (e.g. &quot;45-49&quot;). &lt;p/&gt;\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one\nof the necessary roles granted to them via\n&lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @isTest
    private static void adTargetingAnalyticsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'adIds' => new List<String>{''},
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
        OASAdsApi api;
        OASMetricsResponse response;
        OASMetricsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
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
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASAdsApi api;
        List<OASAdsAnalyticsResponseInner> response;
        List<OASAdsAnalyticsResponseInner> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdsAnalyticsResponseInner>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdsAnalyticsResponseInner>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASAdsAnalyticsResponseInner>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create ads
     *
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     */
    @isTest
    private static void adsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdCreateRequest' => new List<OASAdCreateRequest>{OASAdCreateRequest.getExample()}
        };

        OASClient client;
        OASAdsApi api;
        OASAdArrayResponse response;
        OASAdArrayResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdArrayResponse.getExample();
        response = (OASAdArrayResponse) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdArrayResponse.getExample();
        response = (OASAdArrayResponse) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will\ncontain additional information from the Ad Review process.\nFor more information about our policies and rejection reasons see the &lt;a href&#x3D;&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/&quot;\ntarget&#x3D;&quot;_blank&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     */
    @isTest
    private static void adsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'adId' => 'null'
        };

        OASClient client;
        OASAdsApi api;
        OASAdResponse response;
        OASAdResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdResponse.getExample();
        response = (OASAdResponse) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdResponse.getExample();
        response = (OASAdResponse) api.adsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ads
     *
     * List ads that meet the filters provided:\n  - Listed campaign ids or ad group ids or ad ids\n  - Listed entity statuses &lt;p/&gt;\nIf no filter is provided, all ads in the ad account are returned. &lt;p/&gt;\n&lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt;\nProvide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt;\nReview status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information.\nFor more, see &lt;a href&#x3D;&quot;https://policy.pinterest.com/en/advertising-guidelines&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
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
        OASAdsApi api;
        OASAdsList200Response response;
        OASAdsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update ads
     *
     * Update multiple existing ads
     */
    @isTest
    private static void adsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdUpdateRequest' => new List<OASAdUpdateRequest>{OASAdUpdateRequest.getExample()}
        };

        OASClient client;
        OASAdsApi api;
        OASAdArrayResponse response;
        OASAdArrayResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdArrayResponse.getExample();
        response = (OASAdArrayResponse) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdArrayResponse.getExample();
        response = (OASAdArrayResponse) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}