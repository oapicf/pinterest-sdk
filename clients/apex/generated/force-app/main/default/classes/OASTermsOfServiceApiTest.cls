@isTest
private class OASTermsOfServiceApiTest {
    /**
     * Get terms of service
     *
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     */
    @isTest
    private static void termsOfServiceGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'includeHtml' => '',
            'tosType' => 'null'
        };

        OASClient client;
        OASTermsOfServiceApi api;
        OASTermsOfService response;
        OASTermsOfService expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASTermsOfServiceApi(client);

        js = JSON.serialize(OASTermsOfService.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTermsOfService.getExample();
        response = (OASTermsOfService) api.termsOfServiceGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTermsOfService.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTermsOfService.getExample();
        response = (OASTermsOfService) api.termsOfServiceGet(params);
        System.assertEquals(expectedResponse, response);
    }
}