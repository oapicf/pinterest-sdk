@isTest
private class OASUserAccountApiTest {
    /**
     * List following boards
     *
     * Get a list of the boards a user follows. The request returns a board summary object array.
     */
    @isTest
    private static void boardsUserFollowsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'explicitFollowing' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASUserAccountApi api;
        OASBoardsList200Response response;
        OASBoardsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBoardsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBoardsList200Response.getExample();
        response = (OASBoardsList200Response) api.boardsUserFollowsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Follow user
     *
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**\n\nUse this request, as a signed-in user, to follow another user.
     */
    @isTest
    private static void followUserUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'username' => 'null',
            'oaSFollowUserCreate' => ''
        };

        OASClient client;
        OASUserAccountApi api;
        OASFollowUser response;
        OASFollowUser expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowUser.getExample();
        response = (OASFollowUser) api.followUserUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List followers
     *
     * Get a list of your followers.
     */
    @isTest
    private static void followersListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASUserAccountApi api;
        OASFollowersList200Response response;
        OASFollowersList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.followersList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List linked businesses
     *
     * Get a list of your linked business accounts.
     */
    @isTest
    private static void linkedBusinessAccountsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASUserAccountApi api;
        List<OASLinkedBusiness> response;
        List<OASLinkedBusiness> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASLinkedBusiness>{OASLinkedBusiness.getExample()};
        response = (List<OASLinkedBusiness>) api.linkedBusinessAccountsGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Unverify website
     *
     * Unverify a website verified by the signed-in user.
     */
    @isTest
    private static void unverifyWebsiteDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'website' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        OASUserWebsite response;
        OASUserWebsite expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.unverifyWebsiteDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.unverifyWebsiteDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.unverifyWebsiteDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.unverifyWebsiteDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.unverifyWebsiteDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.unverifyWebsiteDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.unverifyWebsiteDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get user account analytics
     *
     * Get analytics for the &quot;operation user_account&quot;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.
     */
    @isTest
    private static void userAccountAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'fromClaimedContent' => OTHER,
            'pinFormat' => ALL,
            'appTypes' => ALL,
            'contentType' => ALL,
            'source' => ALL,
            'metricTypes' => new List<OASQuerymetrictypesItems>{OASQuerymetrictypesItems.getExample()},
            'splitField' => NO_SPLIT,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        Map<String, OASAnalyticsMetricsResponse> response;
        Map<String, OASAnalyticsMetricsResponse> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASAnalyticsMetricsResponse>) api.userAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASAnalyticsMetricsResponse>) api.userAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASAnalyticsMetricsResponse>) api.userAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASAnalyticsMetricsResponse>) api.userAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASAnalyticsMetricsResponse>) api.userAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASAnalyticsMetricsResponse>) api.userAccountAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get user account top pins analytics
     *
     * Gets analytics data about a user\&#39;s top pins (limited to the top 50).\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.
     */
    @isTest
    private static void userAccountAnalyticsTopPinsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'sortBy' => '',
            'fromClaimedContent' => OTHER,
            'pinFormat' => ALL,
            'appTypes' => ALL,
            'contentType' => ALL,
            'source' => ALL,
            'metricTypes' => new List<OASQuerymetrictypesItems>{OASQuerymetrictypesItems.getExample()},
            'numOfPins' => '',
            'createdInLastNDays' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        OASTopPinsAnalyticsResponse response;
        OASTopPinsAnalyticsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopPinsAnalyticsResponse.getExample();
        response = (OASTopPinsAnalyticsResponse) api.userAccountAnalyticsTopPins(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get user account top video pins analytics
     *
     * Gets analytics data about a user\&#39;s top video pins (limited to the top 50).\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.
     */
    @isTest
    private static void userAccountAnalyticsTopVideoPinsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'sortBy' => '',
            'fromClaimedContent' => OTHER,
            'pinFormat' => ALL,
            'appTypes' => ALL,
            'contentType' => ALL,
            'source' => ALL,
            'metricTypes' => new List<OASQueryvideopinmetrictypesItems>{OASQueryvideopinmetrictypesItems.getExample()},
            'numOfPins' => '',
            'createdInLastNDays' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        OASTopVideoPinsAnalyticsResponse response;
        OASTopVideoPinsAnalyticsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTopVideoPinsAnalyticsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTopVideoPinsAnalyticsResponse.getExample();
        response = (OASTopVideoPinsAnalyticsResponse) api.userAccountAnalyticsTopVideoPins(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List following interests
     *
     * Get a list of a user\&#39;s following interests in one place.
     */
    @isTest
    private static void userAccountFollowedInterestsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'username' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASUserAccountApi api;
        OASUserAccountFollowedInterests200Re response;
        OASUserAccountFollowedInterests200Re expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserAccountFollowedInterests200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserAccountFollowedInterests200Re.getExample();
        response = (OASUserAccountFollowedInterests200Re) api.userAccountFollowedInterests(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get user account
     *
     * Get account information for the &quot;operation user_account&quot;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\n[Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ &quot;Understanding Business Access&quot;\nIf using Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;. See [Understanding Business Access] for more information.
     */
    @isTest
    private static void userAccountGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        OASAccount response;
        OASAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List following
     *
     * Get a list of who a certain user follows.
     */
    @isTest
    private static void userFollowingGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'explicitFollowing' => '',
            'feedType' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASUserAccountApi api;
        OASFollowersList200Response response;
        OASFollowersList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFollowersList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFollowersList200Response.getExample();
        response = (OASFollowersList200Response) api.userFollowingGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get user websites
     *
     * Get user websites, claimed or not
     */
    @isTest
    private static void userWebsitesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASUserAccountApi api;
        OASUserWebsitesGet200Response response;
        OASUserWebsitesGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASUserWebsitesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsitesGet200Response.getExample();
        response = (OASUserWebsitesGet200Response) api.userWebsitesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsitesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsitesGet200Response.getExample();
        response = (OASUserWebsitesGet200Response) api.userWebsitesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsitesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsitesGet200Response.getExample();
        response = (OASUserWebsitesGet200Response) api.userWebsitesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsitesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsitesGet200Response.getExample();
        response = (OASUserWebsitesGet200Response) api.userWebsitesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsitesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsitesGet200Response.getExample();
        response = (OASUserWebsitesGet200Response) api.userWebsitesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsitesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsitesGet200Response.getExample();
        response = (OASUserWebsitesGet200Response) api.userWebsitesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsitesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsitesGet200Response.getExample();
        response = (OASUserWebsitesGet200Response) api.userWebsitesGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Verify website
     *
     * Verify a website as a signed-in user.
     */
    @isTest
    private static void verifyWebsiteUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSUserWebsiteCreate' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        OASUserWebsite response;
        OASUserWebsite expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsite.getExample();
        response = (OASUserWebsite) api.verifyWebsiteUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     */
    @isTest
    private static void websiteVerificationGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        OASUserWebsiteVerification response;
        OASUserWebsiteVerification expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUserWebsiteVerification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserWebsiteVerification.getExample();
        response = (OASUserWebsiteVerification) api.websiteVerificationGet(params);
        System.assertEquals(expectedResponse, response);
    }
}