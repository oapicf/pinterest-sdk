@isTest
private class OASOauthApiTest {
    /**
     * Generate OAuth access token
     *
     * Generate an OAuth access token by using an authorization code or a refresh token.\n\nIMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).\n\nSee &lt;a href&#x3D;\&#39;/docs/getting-started/authentication-and-scopes/\&#39;&gt;Authentication&lt;/a&gt; for more.\n\n&lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\n&lt;strong&gt;Grant type &lt;i&gt;client_credentials&lt;/i&gt; and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.&lt;/strong&gt;
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

        client = new OASClient();
        api = new OASOauthApi(client);

        js = JSON.serialize(OASOauthAccessTokenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessTokenResponse.getExample();
        response = (OASOauthAccessTokenResponse) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessTokenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessTokenResponse.getExample();
        response = (OASOauthAccessTokenResponse) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);
    }
}