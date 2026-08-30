@isTest
private class OASCustomerSegmentApiTest {
    /**
     * Create customer segments
     *
     * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
     */
    @isTest
    private static void customerSegmentCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCustomerSegmentCreate' => ''
        };

        OASClient client;
        OASCustomerSegmentApi api;
        OASCustomerSegment response;
        OASCustomerSegment expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerSegmentApi(client);

        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegment.getExample();
        response = (OASCustomerSegment) api.customerSegmentCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List customer segments
     *
     * Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
     */
    @isTest
    private static void customerSegmentListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => '',
            'includeSizing' => '',
            'searchQuery' => 'null'
        };

        OASClient client;
        OASCustomerSegmentApi api;
        OASCustomerSegmentList200Response response;
        OASCustomerSegmentList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerSegmentApi(client);

        js = JSON.serialize(OASCustomerSegmentList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegmentList200Response.getExample();
        response = (OASCustomerSegmentList200Response) api.customerSegmentList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegmentList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegmentList200Response.getExample();
        response = (OASCustomerSegmentList200Response) api.customerSegmentList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegmentList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegmentList200Response.getExample();
        response = (OASCustomerSegmentList200Response) api.customerSegmentList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegmentList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegmentList200Response.getExample();
        response = (OASCustomerSegmentList200Response) api.customerSegmentList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegmentList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegmentList200Response.getExample();
        response = (OASCustomerSegmentList200Response) api.customerSegmentList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegmentList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegmentList200Response.getExample();
        response = (OASCustomerSegmentList200Response) api.customerSegmentList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerSegmentList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerSegmentList200Response.getExample();
        response = (OASCustomerSegmentList200Response) api.customerSegmentList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update customer segments
     *
     * Update the customer segment given advertiser ID and customer segment ID
     */
    @isTest
    private static void customerSegmentUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCustomerSegmentUpdateRequestUpdat' => ''
        };

        OASClient client;
        OASCustomerSegmentApi api;
        String js = '';

        client = new OASClient();
        api = new OASCustomerSegmentApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.customerSegmentUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.customerSegmentUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.customerSegmentUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.customerSegmentUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.customerSegmentUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.customerSegmentUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}