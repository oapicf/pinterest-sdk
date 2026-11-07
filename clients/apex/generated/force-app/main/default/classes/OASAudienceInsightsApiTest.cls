@isTest
private class OASAudienceInsightsApiTest {
    /**
     * Get audience insights
     *
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\&#39;s engaged audience on Pinterest, the ad account\&#39;s total audience on Pinterest and Pinterest\&#39;s total audience.\n\n[Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).
     */
    @isTest
    private static void audienceInsightsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'audienceInsightType' => ''
        };

        OASClient client;
        OASAudienceInsightsApi api;
        OASAudienceInsights response;
        OASAudienceInsights expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceInsightsApi(client);

        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAudienceInsightsApi(client);

        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsights.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsights.getExample();
        response = (OASAudienceInsights) api.audienceInsightsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get audience insights scope and type
     *
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     */
    @isTest
    private static void audienceInsightsScopeAndTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAudienceInsightsApi api;
        OASAudienceInsightsScopeAndTypeGet20 response;
        OASAudienceInsightsScopeAndTypeGet20 expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceInsightsApi(client);

        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAudienceInsightsApi(client);

        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudienceInsightsScopeAndTypeGet20.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudienceInsightsScopeAndTypeGet20.getExample();
        response = (OASAudienceInsightsScopeAndTypeGet20) api.audienceInsightsScopeAndTypeGet(params);
        System.assertEquals(expectedResponse, response);
    }
}