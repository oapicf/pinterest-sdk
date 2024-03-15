@isTest
private class OASIntegrationsApiTest {
    /**
     * Delete commerce integration
     *
     * Delete commerce integration metadata for the given external business ID.\nNote: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void integrationsCommerceDelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'externalBusinessId' => 'null'
        };

        OASClient client;
        OASIntegrationsApi api;
        String js = '';

        client = new OASClient();
        api = new OASIntegrationsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.integrationsCommerceDel(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get commerce integration
     *
     * Get commerce integration metadata associated with the given external business ID.\nNote: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void integrationsCommerceGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'externalBusinessId' => 'null'
        };

        OASClient client;
        OASIntegrationsApi api;
        OASIntegrationMetadata response;
        OASIntegrationMetadata expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASIntegrationsApi(client);

        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommerceGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommerceGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommerceGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommerceGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update commerce integration
     *
     * Update commerce integration metadata for the given external business ID.\nNote: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void integrationsCommercePatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'externalBusinessId' => 'null',
            'oaSIntegrationRequestPatch' => ''
        };

        OASClient client;
        OASIntegrationsApi api;
        OASIntegrationMetadata response;
        OASIntegrationMetadata expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASIntegrationsApi(client);

        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePatch(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePatch(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePatch(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePatch(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create commerce integration
     *
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account.\nNote: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void integrationsCommercePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSIntegrationRequest' => ''
        };

        OASClient client;
        OASIntegrationsApi api;
        OASIntegrationMetadata response;
        OASIntegrationMetadata expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASIntegrationsApi(client);

        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationMetadata.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationMetadata.getExample();
        response = (OASIntegrationMetadata) api.integrationsCommercePost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get integration metadata
     *
     * Get integration metadata by ID.\nNote: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void integrationsGetByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASIntegrationsApi api;
        OASIntegrationRecord response;
        OASIntegrationRecord expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASIntegrationsApi(client);

        js = JSON.serialize(OASIntegrationRecord.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationRecord.getExample();
        response = (OASIntegrationRecord) api.integrationsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationRecord.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationRecord.getExample();
        response = (OASIntegrationRecord) api.integrationsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationRecord.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationRecord.getExample();
        response = (OASIntegrationRecord) api.integrationsGetById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get integration metadata list
     *
     * Get integration metadata list.\nNote: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void integrationsGetListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASIntegrationsApi api;
        OASIntegrationsGetList200Response response;
        OASIntegrationsGetList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASIntegrationsApi(client);

        js = JSON.serialize(OASIntegrationsGetList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationsGetList200Response.getExample();
        response = (OASIntegrationsGetList200Response) api.integrationsGetList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationsGetList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationsGetList200Response.getExample();
        response = (OASIntegrationsGetList200Response) api.integrationsGetList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Receives batched logs from integration applications.
     *
     * This endpoint receives batched logs from integration applications on partner platforms.\nNote: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @isTest
    private static void integrationsLogsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSIntegrationLogsRequest' => ''
        };

        OASClient client;
        OASIntegrationsApi api;
        OASIntegrationLogsSuccessResponse response;
        OASIntegrationLogsSuccessResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASIntegrationsApi(client);

        js = JSON.serialize(OASIntegrationLogsSuccessResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationLogsSuccessResponse.getExample();
        response = (OASIntegrationLogsSuccessResponse) api.integrationsLogsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationLogsSuccessResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationLogsSuccessResponse.getExample();
        response = (OASIntegrationLogsSuccessResponse) api.integrationsLogsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASIntegrationLogsSuccessResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIntegrationLogsSuccessResponse.getExample();
        response = (OASIntegrationLogsSuccessResponse) api.integrationsLogsPost(params);
        System.assertEquals(expectedResponse, response);
    }
}