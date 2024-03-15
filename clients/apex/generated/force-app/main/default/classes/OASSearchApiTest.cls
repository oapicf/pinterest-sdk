@isTest
private class OASSearchApiTest {
    /**
     * Search pins by a given search term
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nGet the top 10 Pins by a given search term.
     */
    @isTest
    private static void searchPartnerPinsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'term' => 'null',
            'countryCode' => US,
            'bookmark' => 'null',
            'locale' => 'null',
            'r_limit' => 4
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
    }

    /**
     * Search user\&#39;s boards
     *
     * Search for boards for the &quot;operation user_account&quot;. This includes boards of all board types.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nIf using Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;. See &lt;a href&#x3D;\&#39;/docs/reference/business-access/\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     */
    @isTest
    private static void searchUserBoardsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'query' => 'null'
        };

        OASClient client;
        OASSearchApi api;
        OASSearchUserBoardsGet200Response response;
        OASSearchUserBoardsGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSearchApi(client);

        js = JSON.serialize(OASSearchUserBoardsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchUserBoardsGet200Response.getExample();
        response = (OASSearchUserBoardsGet200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchUserBoardsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchUserBoardsGet200Response.getExample();
        response = (OASSearchUserBoardsGet200Response) api.searchUserBoardsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Search user\&#39;s Pins
     *
     * Search for pins for the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nIf using Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;. See &lt;a href&#x3D;\&#39;/docs/reference/business-access/\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     */
    @isTest
    private static void searchUserPinsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'query' => Plants,
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
    }
}