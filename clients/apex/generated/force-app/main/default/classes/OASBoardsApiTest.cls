@isTest
private class OASBoardsApiTest {
    /**
     * Create board section
     *
     * Create a board section on a board owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardSectionsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'oaSBoardSection' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBoardsApi api;
        OASBoardSection response;
        OASBoardSection expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete board section
     *
     * Delete a board section on a board owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardSectionsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'sectionId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBoardsApi api;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardSectionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardSectionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardSectionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardSectionsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List board sections
     *
     * Get a list of all board sections from a board owned by the &quot;operation user_account&quot; - or a group board that has been shared with this account.\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardSectionsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBoardsApi api;
        OASBoardSectionsList200Response response;
        OASBoardSectionsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardSectionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSectionsList200Response.getExample();
        response = (OASBoardSectionsList200Response) api.boardSectionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSectionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSectionsList200Response.getExample();
        response = (OASBoardSectionsList200Response) api.boardSectionsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardSectionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSectionsList200Response.getExample();
        response = (OASBoardSectionsList200Response) api.boardSectionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSectionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSectionsList200Response.getExample();
        response = (OASBoardSectionsList200Response) api.boardSectionsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardSectionsListPinsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'sectionId' => 'null',
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBoardsApi api;
        OASBoardsListPins200Response response;
        OASBoardsListPins200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardSectionsListPins(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update board section
     *
     * Update a board section on a board owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardSectionsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'sectionId' => 'null',
            'oaSBoardSection' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBoardsApi api;
        OASBoardSection response;
        OASBoardSection expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardSection.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardSection.getExample();
        response = (OASBoardSection) api.boardSectionsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create board
     *
     * Create a board owned by the &quot;operation user_account&quot;.\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSBoard' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBoardsApi api;
        OASBoard response;
        OASBoard expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete board
     *
     * Delete a board owned by the &quot;operation user_account&quot;.\n- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBoardsApi api;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.boardsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account.\n- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBoardsApi api;
        OASBoard response;
        OASBoard expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List boards
     *
     * Get a list of the boards owned by the &quot;operation user_account&quot; + group boards where this account is a collaborator\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\nOptional: Specify a privacy type (public, protected, or secret) to indicate which boards to return.\n- If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     */
    @isTest
    private static void boardsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'privacy' => ALL
        };

        OASClient client;
        OASBoardsApi api;
        OASBoardsList200Response response;
        OASBoardsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List Pins on board
     *
     * Get a list of the Pins on a board owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\n- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardsListPinsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'creativeTypes' => new List<String>{'REGULAR'},
            'adAccountId' => 'null',
            'pinMetrics' => ''
        };

        OASClient client;
        OASBoardsApi api;
        OASBoardsListPins200Response response;
        OASBoardsListPins200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardsListPins(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardsListPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsListPins200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsListPins200Response.getExample();
        response = (OASBoardsListPins200Response) api.boardsListPins(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update board
     *
     * Update a board owned by the &quot;operating user_account&quot;.\n- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.
     */
    @isTest
    private static void boardsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'boardId' => 'null',
            'oaSBoardUpdate' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBoardsApi api;
        OASBoard response;
        OASBoard expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBoardsApi(client);

        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoard.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoard.getExample();
        response = (OASBoard) api.boardsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}