@isTest
private class OASLeadFormsApiTest {
    /**
     * Get lead form by id
     *
     * Gets a lead form given it\&#39;s ID. It must also be associated with the provided ad account ID.\nRetrieving an advertiser\&#39;s lead form will only contain results if you\&#39;re a part of the Lead ads beta. If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void leadFormGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'leadFormId' => 1234567890123
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadFormResponse response;
        OASLeadFormResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormResponse.getExample();
        response = (OASLeadFormResponse) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormResponse.getExample();
        response = (OASLeadFormResponse) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormResponse.getExample();
        response = (OASLeadFormResponse) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormResponse.getExample();
        response = (OASLeadFormResponse) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body.\n- List of answers should follow the questions creation order.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void leadFormTestCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'leadFormId' => 1234567890123,
            'oaSLeadFormTestRequest' => ''
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadFormTestResponse response;
        OASLeadFormTestResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormTestResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTestResponse.getExample();
        response = (OASLeadFormTestResponse) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormTestResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTestResponse.getExample();
        response = (OASLeadFormTestResponse) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormTestResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTestResponse.getExample();
        response = (OASLeadFormTestResponse) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormTestResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTestResponse.getExample();
        response = (OASLeadFormTestResponse) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get lead forms
     *
     * Gets all Lead Forms associated with an ad account ID.\nRetrieving an advertiser\&#39;s list of lead forms will only contain results if you\&#39;re a part of the Lead ads beta.  If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void leadFormsListTest() {
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
        OASLeadFormsApi api;
        OASLeadFormsList200Response response;
        OASLeadFormsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsList200Response.getExample();
        response = (OASLeadFormsList200Response) api.leadFormsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsList200Response.getExample();
        response = (OASLeadFormsList200Response) api.leadFormsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsList200Response.getExample();
        response = (OASLeadFormsList200Response) api.leadFormsList(params);
        System.assertEquals(expectedResponse, response);
    }
}