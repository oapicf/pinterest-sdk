@isTest
private class OASOrderLinesApiTest {
    /**
     * Get order line
     *
     * Get a specific existing order line associated with an ad account.
     */
    @isTest
    private static void orderLinesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'orderLineId' => 'null'
        };

        OASClient client;
        OASOrderLinesApi api;
        OASOrderLine response;
        OASOrderLine expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderLinesApi(client);

        js = JSON.serialize(OASOrderLine.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOrderLine.getExample();
        response = (OASOrderLine) api.orderLinesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOrderLine.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOrderLine.getExample();
        response = (OASOrderLine) api.orderLinesGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get order lines
     *
     * List existing order lines associated with an ad account.
     */
    @isTest
    private static void orderLinesListTest() {
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
        OASOrderLinesApi api;
        OASOrderLinesList200Response response;
        OASOrderLinesList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderLinesApi(client);

        js = JSON.serialize(OASOrderLinesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOrderLinesList200Response.getExample();
        response = (OASOrderLinesList200Response) api.orderLinesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOrderLinesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOrderLinesList200Response.getExample();
        response = (OASOrderLinesList200Response) api.orderLinesList(params);
        System.assertEquals(expectedResponse, response);
    }
}