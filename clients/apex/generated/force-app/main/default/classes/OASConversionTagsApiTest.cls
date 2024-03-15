@isTest
private class OASConversionTagsApiTest {
    /**
     * Create conversion tag
     *
     * Create a conversion tag, also known as &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag&quot; target&#x3D;&quot;_blank&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt;\nThe Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt;\nFor more information, see:&lt;p/&gt;\n&lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt;\n&lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://developers.pinterest.com/docs/conversions/pinterest-tag/&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt;\n&lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://developers.pinterest.com/docs/conversions/enhanced-match/&quot;&gt;Enhanced match&lt;/a&gt;
     */
    @isTest
    private static void conversionTagsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSConversionTagCreate' => ''
        };

        OASClient client;
        OASConversionTagsApi api;
        OASConversionTagResponse response;
        OASConversionTagResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTagResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagResponse.getExample();
        response = (OASConversionTagResponse) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagResponse.getExample();
        response = (OASConversionTagResponse) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get conversion tag
     *
     * Get information about an existing conversion tag.
     */
    @isTest
    private static void conversionTagsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'conversionTagId' => 2617998078212
        };

        OASClient client;
        OASConversionTagsApi api;
        OASConversionTagResponse response;
        OASConversionTagResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTagResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagResponse.getExample();
        response = (OASConversionTagResponse) api.conversionTagsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagResponse.getExample();
        response = (OASConversionTagResponse) api.conversionTagsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get conversion tags
     *
     * List conversion tags associated with an ad account.
     */
    @isTest
    private static void conversionTagsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'filterDeleted' => true
        };

        OASClient client;
        OASConversionTagsApi api;
        OASConversionTagListResponse response;
        OASConversionTagListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTagListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagListResponse.getExample();
        response = (OASConversionTagListResponse) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagListResponse.getExample();
        response = (OASConversionTagListResponse) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Ocpm eligible conversion tags
     *
     * Get Ocpm eligible conversion tag events for an ad account.
     */
    @isTest
    private static void ocpmEligibleConversionTagsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASConversionTagsApi api;
        Map<String, List<OASConversionEventResponse>> response;
        Map<String, List<OASConversionEventResponse>> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, List<OASConversionEventResponse>>) api.ocpmEligibleConversionTagsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, List<OASConversionEventResponse>>) api.ocpmEligibleConversionTagsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get page visit conversion tags
     *
     * Get all page visit conversion tag events for an ad account.
     */
    @isTest
    private static void pageVisitConversionTagsGetTest() {
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
        OASConversionTagsApi api;
        OASPageVisitConversionTagsGet200Resp response;
        OASPageVisitConversionTagsGet200Resp expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASPageVisitConversionTagsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPageVisitConversionTagsGet200Resp.getExample();
        response = (OASPageVisitConversionTagsGet200Resp) api.pageVisitConversionTagsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPageVisitConversionTagsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPageVisitConversionTagsGet200Resp.getExample();
        response = (OASPageVisitConversionTagsGet200Resp) api.pageVisitConversionTagsGet(params);
        System.assertEquals(expectedResponse, response);
    }
}