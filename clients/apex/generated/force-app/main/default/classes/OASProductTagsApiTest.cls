@isTest
private class OASProductTagsApiTest {
    /**
     * Add product tags to pin
     *
     * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin.\n- Maximum 24 product tags can be added in a single request.\n- Duplicate pin_ids in the request will result in an error.\n- If any product tag fails eligibility check, the entire request fails (all-or-nothing).\n- If a product tag is already tagged on the pin, it is treated as a no-op success.
     */
    @isTest
    private static void productTagsBulkAddTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null',
            'oaSProductTagsBulkAddRequest' => ''
        };

        OASClient client;
        OASProductTagsApi api;
        OASProductTagsResponse response;
        OASProductTagsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductTagsApi(client);

        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsBulkAdd(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsBulkAdd(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsBulkAdd(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsBulkAdd(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsBulkAdd(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsBulkAdd(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete product tags from pin
     *
     * Delete product tags from a pin.\n- If a product tag is not found on the pin, it is treated as a no-op success.
     */
    @isTest
    private static void productTagsBulkDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null',
            'oaSProductTagsBulkDeleteRequest' => ''
        };

        OASClient client;
        OASProductTagsApi api;
        String js = '';

        client = new OASClient();
        api = new OASProductTagsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.productTagsBulkDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.productTagsBulkDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.productTagsBulkDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.productTagsBulkDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.productTagsBulkDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.productTagsBulkDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get product tags for pin
     *
     * Retrieve all product tags for a pin.\n- Returns an empty array if the pin has no product tags.
     */
    @isTest
    private static void productTagsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null'
        };

        OASClient client;
        OASProductTagsApi api;
        OASProductTagsResponse response;
        OASProductTagsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductTagsApi(client);

        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProductTagsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProductTagsResponse.getExample();
        response = (OASProductTagsResponse) api.productTagsList(params);
        System.assertEquals(expectedResponse, response);
    }
}