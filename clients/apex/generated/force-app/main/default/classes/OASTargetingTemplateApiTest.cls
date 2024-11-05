@isTest
private class OASTargetingTemplateApiTest {
    /**
     * Create targeting templates
     *
     * &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,\n keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;\n &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse\n  performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
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
        OASTargetingTemplateGetResponseData response;
        OASTargetingTemplateGetResponseData expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASTargetingTemplateApi(client);

        js = JSON.serialize(OASTargetingTemplateGetResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateGetResponseData.getExample();
        response = (OASTargetingTemplateGetResponseData) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateGetResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateGetResponseData.getExample();
        response = (OASTargetingTemplateGetResponseData) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTargetingTemplateGetResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTargetingTemplateGetResponseData.getExample();
        response = (OASTargetingTemplateGetResponseData) api.targetingTemplateCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List targeting templates
     *
     * Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
     */
    @isTest
    private static void targetingTemplateListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'order' => ASCENDING,
            'includeSizing' => '',
            'searchQuery' => gaming,
            'pageSize' => '',
            'bookmark' => 'null'
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
    }

    /**
     * Update targeting templates
     *
     * &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
     */
    @isTest
    private static void targetingTemplateUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSTargetingTemplateUpdateRequest' => ''
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
    }
}