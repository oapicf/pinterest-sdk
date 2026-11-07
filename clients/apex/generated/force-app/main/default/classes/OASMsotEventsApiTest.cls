@isTest
private class OASMsotEventsApiTest {
    /**
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     *
     * **This feature is currently in beta and not available to all apps.**\nIf you are interested in joining the beta, reach out to your Pinterest account manager.\n\nAdvertisers or their measurement partners can send attributed MSOT conversion events to Pinterest\nbased on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.\n\n- These events will not be used in Reporting.
     */
    @isTest
    private static void msotEventsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSConversionMSOTEventsCreate' => ''
        };

        OASClient client;
        OASMsotEventsApi api;
        String js = '';

        client = new OASClient();
        api = new OASMsotEventsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.msotEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.msotEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.msotEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.msotEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.msotEventsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.msotEventsCreate(params);
        System.assertEquals(expectedResponse, response);
    }
}