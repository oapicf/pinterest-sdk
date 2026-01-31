@isTest
private class OASConversionTagsApiTest {
    /**
     * Create conversion tag
     *
     * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.\n\nThe Pinterest Tag tracks actions people take on the ad account\&#39;s website after they view the ad account\&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.\n\nFor more information, see:\n\n[Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)\n\n[Pinterest Tag](/docs/track-conversions/pinterest-tag/)\n\n[Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
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
        OASConversionTag response;
        OASConversionTag expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsCreate(params);
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
        OASConversionTag response;
        OASConversionTag expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTag.getExample();
        response = (OASConversionTag) api.conversionTagsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List conversion tags
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
            'filterDeleted' => ''
        };

        OASClient client;
        OASConversionTagsApi api;
        OASConversionTagsList200Response response;
        OASConversionTagsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionTagsApi(client);

        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionTagsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionTagsList200Response.getExample();
        response = (OASConversionTagsList200Response) api.conversionTagsList(params);
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