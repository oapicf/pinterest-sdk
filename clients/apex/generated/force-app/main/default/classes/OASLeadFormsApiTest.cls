@isTest
private class OASLeadFormsApiTest {
    /**
     * Get lead form by id
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;\n\nGets a lead form given it\&#39;s ID. It must also be associated with the provided ad account ID.\n\nFor more, see &lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/lead-ads&quot;&gt;Lead ads&lt;/a&gt;.
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
     * Create lead form test data based on the list of answers provided as part of the body.\n- List of answers should follow the questions creation order.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
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
     * Create lead forms
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;\n\nCreate lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.\n\nFor more, see &lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/lead-ads&quot;&gt;Lead ads&lt;/a&gt;.
     */
    @isTest
    private static void leadFormsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLeadFormCreateRequest' => new List<OASLeadFormCreateRequest>{OASLeadFormCreateRequest.getExample()}
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadFormArrayResponse response;
        OASLeadFormArrayResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormArrayResponse.getExample();
        response = (OASLeadFormArrayResponse) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormArrayResponse.getExample();
        response = (OASLeadFormArrayResponse) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormArrayResponse.getExample();
        response = (OASLeadFormArrayResponse) api.leadFormsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List lead forms
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;\n\nList lead forms associated with an ad account ID.\n\nFor more, see &lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/lead-ads&quot;&gt;Lead ads&lt;/a&gt;.
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

    /**
     * Update lead forms
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;\n\nUpdate lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.\n\nFor more, see &lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/lead-ads&quot;&gt;Lead ads&lt;/a&gt;.
     */
    @isTest
    private static void leadFormsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLeadFormUpdateRequest' => new List<OASLeadFormUpdateRequest>{OASLeadFormUpdateRequest.getExample()}
        };

        OASClient client;
        OASLeadFormsApi api;
        OASLeadFormArrayResponse response;
        OASLeadFormArrayResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadFormsApi(client);

        js = JSON.serialize(OASLeadFormArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormArrayResponse.getExample();
        response = (OASLeadFormArrayResponse) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormArrayResponse.getExample();
        response = (OASLeadFormArrayResponse) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadFormArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadFormArrayResponse.getExample();
        response = (OASLeadFormArrayResponse) api.leadFormsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}