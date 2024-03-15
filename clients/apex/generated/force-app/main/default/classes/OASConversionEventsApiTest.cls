@isTest
private class OASConversionEventsApiTest {
    /**
     * Send conversions
     *
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.\n- This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;&quot;/docs/conversions/conversions/&quot;&gt;Conversions Guide&lt;/a&gt; for more details.\n- The token\&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.)\n- This endpoint has a rate limit of 5,000 calls per minute per ad account.\n- If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     */
    @isTest
    private static void eventsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSConversionEvents' => '',
            'test' => ''
        };

        OASClient client;
        OASConversionEventsApi api;
        OASConversionApiResponse response;
        OASConversionApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionEventsApi(client);

        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionEventsApi(client);

        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionApiResponse.getExample();
        response = (OASConversionApiResponse) api.eventsCreate(params);
        System.assertEquals(expectedResponse, response);
    }
}