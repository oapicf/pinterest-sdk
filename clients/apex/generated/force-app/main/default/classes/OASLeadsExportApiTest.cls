@isTest
private class OASLeadsExportApiTest {
    /**
     * Create a request to export leads collected from a lead ad
     *
     * **This feature is currently in beta and not available to all apps. If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**\n\nCreate an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.\n\nNote: Lead ad data will be available up to 30 days after the lead has been submitted.\n\nFor more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @isTest
    private static void leadsExportCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLeadsExportsCreate' => ''
        };

        OASClient client;
        OASLeadsExportApi api;
        OASLeadsExports response;
        OASLeadsExports expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadsExportApi(client);

        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExports.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExports.getExample();
        response = (OASLeadsExports) api.leadsExportCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get the lead export from the lead export create call
     *
     * **This feature is currently in beta and not available to all apps. If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**\n\nGet the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.\n\nNote: Lead ad data will be available up to 30 days after the lead has been submitted.\n\nFor more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @isTest
    private static void leadsExportGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'leadsExportId' => 'null'
        };

        OASClient client;
        OASLeadsExportApi api;
        OASLeadsExportResponseData response;
        OASLeadsExportResponseData expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadsExportApi(client);

        js = JSON.serialize(OASLeadsExportResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExportResponseData.getExample();
        response = (OASLeadsExportResponseData) api.leadsExportGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExportResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExportResponseData.getExample();
        response = (OASLeadsExportResponseData) api.leadsExportGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExportResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExportResponseData.getExample();
        response = (OASLeadsExportResponseData) api.leadsExportGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExportResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExportResponseData.getExample();
        response = (OASLeadsExportResponseData) api.leadsExportGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExportResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExportResponseData.getExample();
        response = (OASLeadsExportResponseData) api.leadsExportGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExportResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExportResponseData.getExample();
        response = (OASLeadsExportResponseData) api.leadsExportGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadsExportResponseData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadsExportResponseData.getExample();
        response = (OASLeadsExportResponseData) api.leadsExportGet(params);
        System.assertEquals(expectedResponse, response);
    }
}