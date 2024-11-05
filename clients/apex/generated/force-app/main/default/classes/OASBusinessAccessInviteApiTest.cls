@isTest
private class OASBusinessAccessInviteApiTest {
    /**
     * Create a request to access an existing partner\&#39;s assets.
     *
     * Create a request to access an existing partner\&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     */
    @isTest
    private static void assetAccessRequestsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSCreateAssetAccessRequestBody' => ''
        };

        OASClient client;
        OASBusinessAccessInviteApi api;
        OASCreateAssetAccessRequestResponse response;
        OASCreateAssetAccessRequestResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessInviteApi(client);

        js = JSON.serialize(OASCreateAssetAccessRequestResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateAssetAccessRequestResponse.getExample();
        response = (OASCreateAssetAccessRequestResponse) api.assetAccessRequestsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateAssetAccessRequestResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateAssetAccessRequestResponse.getExample();
        response = (OASCreateAssetAccessRequestResponse) api.assetAccessRequestsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Cancel invites/requests
     *
     * Cancel membership/partnership invites and/or requests.
     */
    @isTest
    private static void cancelInvitesOrRequestsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSCancelInvitesBody' => ''
        };

        OASClient client;
        OASBusinessAccessInviteApi api;
        OASDeleteInvitesResultsResponseArray response;
        OASDeleteInvitesResultsResponseArray expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessInviteApi(client);

        js = JSON.serialize(OASDeleteInvitesResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteInvitesResultsResponseArray.getExample();
        response = (OASDeleteInvitesResultsResponseArray) api.cancelInvitesOrRequests(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteInvitesResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteInvitesResultsResponseArray.getExample();
        response = (OASDeleteInvitesResultsResponseArray) api.cancelInvitesOrRequests(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update invite/request with an asset permission
     *
     * Assign asset permissions information to an existing invite/request. Can be used to:\n- Request access to a partner\&#39;s asset. Note: This is only for when no existing partnership exists. If an existing\n  partnership exists, use &quot;Create a request to access an existing partner\&#39;s assets&quot; to request access to your\n  partner\&#39;s assets.\n    - invite_type&#x3D;&quot;PARTNER_REQUEST&quot;\n- Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.\n  If there is an existing partnership, use &quot;Assign/Update partner asset permissions&quot; to assign a partner access to\n  new assets.\n    - invite_type&#x3D;&quot;PARTNER_INVITE&quot;\n- Invite a member to access your business assets. Note: This is only for when there is no existing membership.\n  If there is an existing membership, use &quot;Assign/Update member asset permissions&quot; to assign a member access to new\n  assets.\n    - invite_type&#x3D;&quot;MEMBER_INVITE&quot;\n\nTo learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     */
    @isTest
    private static void createAssetInvitesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSCreateAssetInvitesRequest' => ''
        };

        OASClient client;
        OASBusinessAccessInviteApi api;
        OASUpdateInvitesResultsResponseArray response;
        OASUpdateInvitesResultsResponseArray expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessInviteApi(client);

        js = JSON.serialize(OASUpdateInvitesResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateInvitesResultsResponseArray.getExample();
        response = (OASUpdateInvitesResultsResponseArray) api.createAssetInvites(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateInvitesResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateInvitesResultsResponseArray.getExample();
        response = (OASUpdateInvitesResultsResponseArray) api.createAssetInvites(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create invites or requests
     *
     * Create batch invites or requests. Can create batch invites or requests as described below.\n- Invite members to join the business. This would required specifying the following:\n    - invite_type&#x3D;&quot;MEMBER_INVITE&quot;\n    - business_role&#x3D;&quot;EMPLOYEE&quot; OR business_role&#x3D;&quot;BIZ_ADMIN&quot; (To learn more about business roles, visit\n    https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)\n    - members\n- Invite partners to access your business assets. This would require specifying the following:\n    - invite_type&#x3D;&quot;PARTNER_INVITE&quot;\n    - business_role&#x3D;&quot;PARTNER&quot;\n    - partners\n- Request to be a partner so you can access their assets. This would require specifying the following:\n    - invite_type&#x3D;&quot;PARTNER_REQUEST&quot;\n    - business_role&#x3D;&quot;PARTNER&quot;\n    - partners
     */
    @isTest
    private static void createMembershipOrPartnershipInvitesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSCreateMembershipOrPartnershipInvi' => ''
        };

        OASClient client;
        OASBusinessAccessInviteApi api;
        OASCreateInvitesResultsResponseArray response;
        OASCreateInvitesResultsResponseArray expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessInviteApi(client);

        js = JSON.serialize(OASCreateInvitesResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateInvitesResultsResponseArray.getExample();
        response = (OASCreateInvitesResultsResponseArray) api.createMembershipOrPartnershipInvites(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateInvitesResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateInvitesResultsResponseArray.getExample();
        response = (OASCreateInvitesResultsResponseArray) api.createMembershipOrPartnershipInvites(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get invites/requests
     *
     * Get the membership/partnership invites and/or requests for the authorized user.
     */
    @isTest
    private static void getInvitesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'isMember' => '',
            'inviteStatus' => new List<String>{'PENDING'},
            'inviteType' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessInviteApi api;
        OASGetInvites200Response response;
        OASGetInvites200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessInviteApi(client);

        js = JSON.serialize(OASGetInvites200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetInvites200Response.getExample();
        response = (OASGetInvites200Response) api.getInvites(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetInvites200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetInvites200Response.getExample();
        response = (OASGetInvites200Response) api.getInvites(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Accept or decline an invite/request
     *
     * Accept or decline invites or requests.
     */
    @isTest
    private static void respondBusinessAccessInvitesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAuthRespondInvitesBody' => ''
        };

        OASClient client;
        OASBusinessAccessInviteApi api;
        OASRespondToInvitesResponseArray response;
        OASRespondToInvitesResponseArray expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessInviteApi(client);

        js = JSON.serialize(OASRespondToInvitesResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRespondToInvitesResponseArray.getExample();
        response = (OASRespondToInvitesResponseArray) api.respondBusinessAccessInvites(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASRespondToInvitesResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRespondToInvitesResponseArray.getExample();
        response = (OASRespondToInvitesResponseArray) api.respondBusinessAccessInvites(params);
        System.assertEquals(expectedResponse, response);
    }
}