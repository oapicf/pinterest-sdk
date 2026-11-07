@isTest
private class OASConversionsApiTest {
    /**
     * Create advertiser defined events
     *
     * Map advertiser defined events to standard events for the given ad account.
     */
    @isTest
    private static void advertiserDefinedEventsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdvertiserDefinedEventsCreateRequ' => ''
        };

        OASClient client;
        OASConversionsApi api;
        OASAdvertiserDefinedEventsCreate200R response;
        OASAdvertiserDefinedEventsCreate200R expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete advertiser defined events
     *
     * Untrack advertiser defined events for the given ad account.
     */
    @isTest
    private static void advertiserDefinedEventsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'eventNames' => new List<String>{''}
        };

        OASClient client;
        OASConversionsApi api;
        OASAdvertiserDefinedEventsCreate200R response;
        OASAdvertiserDefinedEventsCreate200R expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get advertiser defined events
     *
     * Get advertiser defined events for the given ad account.
     */
    @isTest
    private static void advertiserDefinedEventsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASConversionsApi api;
        OASAdvertiserDefinedEventsGet200Resp response;
        OASAdvertiserDefinedEventsGet200Resp expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsGet200Resp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsGet200Resp.getExample();
        response = (OASAdvertiserDefinedEventsGet200Resp) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update advertiser defined events
     *
     * Update advertiser defined event names or mappings for the given ad account.
     */
    @isTest
    private static void advertiserDefinedEventsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdvertiserDefinedEventsCreateRequ' => ''
        };

        OASClient client;
        OASConversionsApi api;
        OASAdvertiserDefinedEventsCreate200R response;
        OASAdvertiserDefinedEventsCreate200R expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsCreate200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsCreate200R.getExample();
        response = (OASAdvertiserDefinedEventsCreate200R) api.advertiserDefinedEventsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}