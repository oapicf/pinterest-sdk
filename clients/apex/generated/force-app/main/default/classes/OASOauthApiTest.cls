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
        OASConversionAccessToken response;
        OASConversionAccessToken expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOauthApi(client);

        js = JSON.serialize(OASConversionAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessToken.getExample();
        response = (OASConversionAccessToken) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessToken.getExample();
        response = (OASConversionAccessToken) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessToken.getExample();
        response = (OASConversionAccessToken) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessToken.getExample();
        response = (OASConversionAccessToken) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessToken.getExample();
        response = (OASConversionAccessToken) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessToken.getExample();
        response = (OASConversionAccessToken) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASConversionAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASConversionAccessToken.getExample();
        response = (OASConversionAccessToken) api.oauthConversionToken();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Generate OAuth access token
     *
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.\n\nFollow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).\n\n**Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).\n\nDisregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.\n\nUse [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token.\n
     */
    @isTest
    private static void oauthTokenTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'grantType' => '',
            'code' => 'null',
            'continuousRefresh' => 'null',
            'redirectUri' => 'null',
            'refreshToken' => 'null',
            'scope' => 'null'
        };

        OASClient client;
        OASOauthApi api;
        OASOauthAccessToken response;
        OASOauthAccessToken expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOauthApi(client);

        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASOauthAccessToken.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOauthAccessToken.getExample();
        response = (OASOauthAccessToken) api.oauthToken(params);
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
            'tokenTypeHint' => ''
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