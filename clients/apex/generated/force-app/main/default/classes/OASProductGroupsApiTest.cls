@isTest
private class OASProductGroupsApiTest {
    /**
     * Get catalog product groups
     *
     * This endpoint is completely deprecated. Please use &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/catalogs_product_groups/list\&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
     */
    @isTest
    private static void adAccountsCatalogsProductGroupsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'feedProfileId' => 'null'
        };

        OASClient client;
        OASProductGroupsApi api;
        OASAdAccountsCatalogsProductGroupsLi response;
        OASAdAccountsCatalogsProductGroupsLi expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductGroupsApi(client);

        js = JSON.serialize(OASAdAccountsCatalogsProductGroupsLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsCatalogsProductGroupsLi.getExample();
        response = (OASAdAccountsCatalogsProductGroupsLi) api.adAccountsCatalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsCatalogsProductGroupsLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsCatalogsProductGroupsLi.getExample();
        response = (OASAdAccountsCatalogsProductGroupsLi) api.adAccountsCatalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsCatalogsProductGroupsLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsCatalogsProductGroupsLi.getExample();
        response = (OASAdAccountsCatalogsProductGroupsLi) api.adAccountsCatalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsCatalogsProductGroupsLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsCatalogsProductGroupsLi.getExample();
        response = (OASAdAccountsCatalogsProductGroupsLi) api.adAccountsCatalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsCatalogsProductGroupsLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsCatalogsProductGroupsLi.getExample();
        response = (OASAdAccountsCatalogsProductGroupsLi) api.adAccountsCatalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);
    }
}