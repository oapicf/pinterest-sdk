@isTest
private class OASConversionEventsApiTest {
    /**
     * Send conversions
     *
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.\n- This endpoint requires an &#x60;access_token&#x60; be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is &#x60;Authorization: Bearer &lt;access_token&gt;&#x60;).\n- The token\&#39;s &#x60;user_account&#x60; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.)\n- This endpoint has a rate limit of 5,000 calls per minute per ad account.\n- If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     */
    @isTest
    private static void eventsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSConversionEventsCreate' => '',
            'test' => ''
        };

        OASClient client;
        OASConversionEventsApi api;
        OASConversionEvents response;
        OASConversionEvents expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionEventsApi(client);

        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionEventsApi(client);

        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionEvents.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionEvents.getExample();
        response = (OASConversionEvents) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);
    }
}