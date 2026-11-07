@isTest
private class OASLeadFormsApiTest {
    /**
     * Get lead form by id
     *
     * **This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**\n\nGets a lead form given it\&#39;s ID. It must also be associated with the provided ad account ID.\n\nFor more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @isTest
    private static void leadFormGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'leadFormId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadForm response;
        OASLeadForm expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadForm.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadForm.getExample();
        response = (OASLeadForm) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadForm.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadForm.getExample();
        response = (OASLeadForm) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadForm.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadForm.getExample();
        response = (OASLeadForm) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadForm.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadForm.getExample();
        response = (OASLeadForm) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadForm.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadForm.getExample();
        response = (OASLeadForm) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadForm.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadForm.getExample();
        response = (OASLeadForm) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadForm.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadForm.getExample();
        response = (OASLeadForm) api.leadFormGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body.\n- List of answers should follow the questions creation order.
     */
    @isTest
    private static void leadFormTestCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'leadFormId' => 'null',
            'oaSLeadFormTestCreate' => ''
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadFormTest response;
        OASLeadFormTest expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormTest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTest.getExample();
        response = (OASLeadFormTest) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormTest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTest.getExample();
        response = (OASLeadFormTest) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormTest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTest.getExample();
        response = (OASLeadFormTest) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormTest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormTest.getExample();
        response = (OASLeadFormTest) api.leadFormTestCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**\n\nCreate lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form\&#39;s description, questions and confirmation sections.\n\nFor more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @isTest
    private static void leadFormsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLeadFormCreate' => new List<OASLeadFormCreate>{OASLeadFormCreate.getExample()}
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadFormsCreate200Response response;
        OASLeadFormsCreate200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**\n\nList lead forms associated with an ad account ID.\n\nFor more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @isTest
    private static void leadFormsListTest() {
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


        js = JSON.serialize(OASLeadFormsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsList200Response.getExample();
        response = (OASLeadFormsList200Response) api.leadFormsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**\n\nUpdate lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.\n\nFor more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @isTest
    private static void leadFormsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLeadFormBatchUpdate' => new List<OASLeadFormBatchUpdate>{OASLeadFormBatchUpdate.getExample()}
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadFormsCreate200Response response;
        OASLeadFormsCreate200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormsCreate200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormsCreate200Response.getExample();
        response = (OASLeadFormsCreate200Response) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}