@isTest
private class OASOauthApiTest {
    /**
     * Generate OAuth access token for conversion API
     *
     * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
     */
    @isTest
    private static void oauthConversionTokenTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASOauthApi api;
        OASConversionAccessTokenResponse response;
        OASConversionAccessTokenResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOauthApi(client);

        js = JSON.serialize(OASConversionAccessTokenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessTokenResponse.getExample();
        response = (OASConversionAccessTokenResponse) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionAccessTokenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessTokenResponse.getExample();
        response = (OASConversionAccessTokenResponse) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Generate OAuth access token
     *
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.\n\nFollow the complete steps for &lt;a href&#x3D;\&#39;/docs/getting-started/set-up-authentication-and-authorization/\&#39; target&#x3D;\&#39;blank\&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.\n\n&lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).\n\nDisregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.\n\nUse &lt;a href&#x3D;\&#39;/docs/developer-tools/token-debugger/\&#39; target&#x3D;\&#39;blank\&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.
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

    /**
     * Revoke a token
     *
     * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
     */
    @isTest
    private static void tokenRevokeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'token' => 'null',
            'tokenTypeHint' => 'null'
        };

        OASClient client;
        OASOauthApi api;
        String js = '';

        client = new OASClient();
        api = new OASOauthApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.tokenRevoke(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.tokenRevoke(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.tokenRevoke(params);
        System.assertEquals(expectedResponse, response);
    }
}