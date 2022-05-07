@isTest
private class OASOauthApiTest {
    /**
     * Generate OAuth access token
     *
     * Generate an OAuth access token by using an authorization code or a refresh token.\n\nSee &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Authentication\&#39;&gt;Authentication&lt;/a&gt; for more.
     */
    @isTest
    private static void oauthTokenTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'grantType' => 'null'
        };

        OASClient client;
        OASOauthApi api;
        OASOauthAccessTokenResponse response;
        OASOauthAccessTokenResponse expectedResponse;
        String js = '';

        api = new OASOauthApi(new OASClient());

        js = JSON.serialize(OASOauthAccessTokenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessTokenResponse.getExample();
        response = (OASOauthAccessTokenResponse) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);
    }
}