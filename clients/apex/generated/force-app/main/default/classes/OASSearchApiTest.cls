@isTest
private class OASSearchApiTest {
    /**
     * Search pins by a given search term
     *
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**\n\nGet the top 10 Pins by a given search term.
     */
    @isTest
    private static void searchPartnerPinsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'term' => 'null',
            'countryCode' => 'null',
            'bookmark' => 'null',
            'locale' => 'null',
            'r_limit' => ''
        };

        OASClient client;
        OASSearchApi api;
        OASSearchPartnerPins200Response response;
        OASSearchPartnerPins200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSearchApi(client);

        js = JSON.serialize(OASSearchPartnerPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchPartnerPins200Response.getExample();
        response = (OASSearchPartnerPins200Response) api.searchPartnerPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchPartnerPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchPartnerPins200Response.getExample();
        response = (OASSearchPartnerPins200Response) api.searchPartnerPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchPartnerPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchPartnerPins200Response.getExample();
        response = (OASSearchPartnerPins200Response) api.searchPartnerPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchPartnerPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchPartnerPins200Response.getExample();
        response = (OASSearchPartnerPins200Response) api.searchPartnerPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchPartnerPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchPartnerPins200Response.getExample();
        response = (OASSearchPartnerPins200Response) api.searchPartnerPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchPartnerPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchPartnerPins200Response.getExample();
        response = (OASSearchPartnerPins200Response) api.searchPartnerPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchPartnerPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchPartnerPins200Response.getExample();
        response = (OASSearchPartnerPins200Response) api.searchPartnerPins(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Search user\&#39;s boards
     *
     * Search for boards for the &quot;operation user_account&quot;. This includes boards of all board types.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nIf using Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     */
    @isTest
    private static void searchUserBoardsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'query' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASSearchApi api;
        OASBoardsList200Response response;
        OASBoardsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSearchApi(client);

        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASSearchApi(client);

        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Search user\&#39;s Pins
     *
     * Search for pins for the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nIf using Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     */
    @isTest
    private static void searchUserPinsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'query' => 'null',
            'adAccountId' => 'null',
            'bookmark' => 'null'
        };

        OASClient client;
        OASSearchApi api;
        OASPinsList200Response response;
        OASPinsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSearchApi(client);

        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.searchUserPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.searchUserPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.searchUserPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.searchUserPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.searchUserPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.searchUserPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.searchUserPinsList(params);
        System.assertEquals(expectedResponse, response);
    }
}