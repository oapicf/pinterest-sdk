@isTest
private class OASConversionDeletionRequestsApiTest {
    /**
     * Create a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.**\n[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).\nCreate a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;.\nAfter 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion\nwithin a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
     */
    @isTest
    private static void conversionDeletionRequestCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSConversionDeletionRequestCreate' => ''
        };

        OASClient client;
        OASConversionDeletionRequestsApi api;
        OASConversionDeletionRequest response;
        OASConversionDeletionRequest expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.**\n[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).\nDelete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.\nThis will cancel the request and prevent it from being processed. This can only be\ndone if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
     */
    @isTest
    private static void conversionDeletionRequestDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'requestId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASConversionDeletionRequestsApi api;
        OASConversionDeletionRequest response;
        OASConversionDeletionRequest expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get a single conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.**\n[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).\nGet a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
     */
    @isTest
    private static void conversionDeletionRequestGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'requestId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASConversionDeletionRequestsApi api;
        OASConversionDeletionRequest response;
        OASConversionDeletionRequest expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequest.getExample();
        response = (OASConversionDeletionRequest) api.conversionDeletionRequestGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List conversion deletion requests
     *
     * **This endpoint is currently in beta and not available to all apps.**\n[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).\nGet a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
     */
    @isTest
    private static void conversionDeletionRequestListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => ''
        };

        OASClient client;
        OASConversionDeletionRequestsApi api;
        OASConversionDeletionRequestList200R response;
        OASConversionDeletionRequestList200R expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionDeletionRequestsApi(client);

        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionDeletionRequestList200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionDeletionRequestList200R.getExample();
        response = (OASConversionDeletionRequestList200R) api.conversionDeletionRequestList(params);
        System.assertEquals(expectedResponse, response);
    }
}