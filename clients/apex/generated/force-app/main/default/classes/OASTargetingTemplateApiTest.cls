@isTest
private class OASTargetingTemplateApiTest {
    /**
     * Create targeting templates
     *
     * Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.\n\nTemplates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
     */
    @isTest
    private static void targetingTemplateCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSTargetingTemplateCreate' => ''
        };

        OASClient client;
        OASTargetingTemplateApi api;
        OASTargetingTemplate response;
        OASTargetingTemplate expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASTargetingTemplateApi(client);

        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplate.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplate.getExample();
        response = (OASTargetingTemplate) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List targeting templates
     *
     * Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
     */
    @isTest
    private static void targetingTemplateListTest() {
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
        OASTargetingTemplateApi api;
        OASTargetingTemplateList200Response response;
        OASTargetingTemplateList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASTargetingTemplateApi(client);

        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASTargetingTemplateApi(client);

        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateList200Response.getExample();
        response = (OASTargetingTemplateList200Response) api.targetingTemplateList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update targeting templates
     *
     * Update the targeting template given advertiser ID and targeting template ID
     */
    @isTest
    private static void targetingTemplateUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSTargetingTemplateUpdateRequestRea' => ''
        };

        OASClient client;
        OASTargetingTemplateApi api;
        String js = '';

        client = new OASClient();
        api = new OASTargetingTemplateApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.targetingTemplateUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.targetingTemplateUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.targetingTemplateUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.targetingTemplateUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.targetingTemplateUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.targetingTemplateUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}