@isTest
private class OASProductGroupPromotionsApiTest {
    /**
     * Create product group promotions
     *
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \&#39;product group promotion.\&#39;)
     */
    @isTest
    private static void productGroupPromotionsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSProductGroupPromotionCreateReques' => ''
        };

        OASClient client;
        OASProductGroupPromotionsApi api;
        OASProductGroupPromotionResponse response;
        OASProductGroupPromotionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductGroupPromotionsApi(client);

        js = JSON.serialize(OASProductGroupPromotionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionResponse.getExample();
        response = (OASProductGroupPromotionResponse) api.productGroupPromotionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductGroupPromotionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionResponse.getExample();
        response = (OASProductGroupPromotionResponse) api.productGroupPromotionsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get a product group promotion by id
     *
     * Get a product group promotion by id
     */
    @isTest
    private static void productGroupPromotionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'productGroupPromotionId' => 'null'
        };

        OASClient client;
        OASProductGroupPromotionsApi api;
        OASProductGroupPromotionResponse response;
        OASProductGroupPromotionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductGroupPromotionsApi(client);

        js = JSON.serialize(OASProductGroupPromotionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionResponse.getExample();
        response = (OASProductGroupPromotionResponse) api.productGroupPromotionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductGroupPromotionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionResponse.getExample();
        response = (OASProductGroupPromotionResponse) api.productGroupPromotionsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get product group promotions
     *
     * List existing product group promotions associated with an ad account.\n\nInclude either ad_group_id or product_group_promotion_ids in your request.\n\n&lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters.\nOnly provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     */
    @isTest
    private static void productGroupPromotionsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'productGroupPromotionIds' => new List<String>{''},
            'entityStatuses' => new List<String>{'ACTIVE'},
            'adGroupId' => 123123123,
            'pageSize' => '',
            'order' => ASCENDING,
            'bookmark' => 'null'
        };

        OASClient client;
        OASProductGroupPromotionsApi api;
        OASProductGroupPromotionsList200Resp response;
        OASProductGroupPromotionsList200Resp expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductGroupPromotionsApi(client);

        js = JSON.serialize(OASProductGroupPromotionsList200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionsList200Resp.getExample();
        response = (OASProductGroupPromotionsList200Resp) api.productGroupPromotionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductGroupPromotionsList200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionsList200Resp.getExample();
        response = (OASProductGroupPromotionsList200Resp) api.productGroupPromotionsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update product group promotions
     *
     * Update multiple existing Product Group Promotions (by product_group_id)
     */
    @isTest
    private static void productGroupPromotionsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSProductGroupPromotionUpdateReques' => ''
        };

        OASClient client;
        OASProductGroupPromotionsApi api;
        OASProductGroupPromotionResponse response;
        OASProductGroupPromotionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductGroupPromotionsApi(client);

        js = JSON.serialize(OASProductGroupPromotionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionResponse.getExample();
        response = (OASProductGroupPromotionResponse) api.productGroupPromotionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductGroupPromotionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductGroupPromotionResponse.getExample();
        response = (OASProductGroupPromotionResponse) api.productGroupPromotionsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
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
            'columns' => new List<String>{'TOTAL_CONVERSIONS'},
            'granularity' => DAY,
            'clickWindowDays' => 1,
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASProductGroupPromotionsApi api;
        List<OASProductGroupAnalyticsResponseInne> response;
        List<OASProductGroupAnalyticsResponseInne> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductGroupPromotionsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASProductGroupAnalyticsResponseInne>) api.productGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASProductGroupAnalyticsResponseInne>) api.productGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASProductGroupAnalyticsResponseInne>) api.productGroupsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }
}