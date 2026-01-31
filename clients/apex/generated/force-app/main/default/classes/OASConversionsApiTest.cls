@isTest
private class OASConversionsApiTest {
    /**
     * Get advertiser defined events
     *
     * &lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;
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
        OASAdvertiserDefinedEventsResponse response;
        OASAdvertiserDefinedEventsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsResponse.getExample();
        response = (OASAdvertiserDefinedEventsResponse) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsResponse.getExample();
        response = (OASAdvertiserDefinedEventsResponse) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionsApi(client);

        js = JSON.serialize(OASAdvertiserDefinedEventsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsResponse.getExample();
        response = (OASAdvertiserDefinedEventsResponse) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvertiserDefinedEventsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvertiserDefinedEventsResponse.getExample();
        response = (OASAdvertiserDefinedEventsResponse) api.advertiserDefinedEventsGet(params);
        System.assertEquals(expectedResponse, response);
    }
}