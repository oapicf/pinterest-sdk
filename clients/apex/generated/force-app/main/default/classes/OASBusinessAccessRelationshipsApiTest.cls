@isTest
private class OASBusinessAccessRelationshipsApiTest {
    /**
     * Terminate business memberships
     *
     * Terminate memberships between the specified members and your business.
     */
    @isTest
    private static void deleteBusinessMembershipTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSMembersToDeleteBody' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASDeletedMembersResponse response;
        OASDeletedMembersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASDeletedMembersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletedMembersResponse.getExample();
        response = (OASDeletedMembersResponse) api.deleteBusinessMembership(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletedMembersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletedMembersResponse.getExample();
        response = (OASDeletedMembersResponse) api.deleteBusinessMembership(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Terminate business partnerships
     *
     * Terminate partnerships between the specified partners and your business.\nNote: You may only batch terminate partners of the same partner type.
     */
    @isTest
    private static void deleteBusinessPartnersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSDeletePartnersRequest' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASDeletePartnersResponse response;
        OASDeletePartnersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASDeletePartnersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePartnersResponse.getExample();
        response = (OASDeletePartnersResponse) api.deleteBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePartnersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePartnersResponse.getExample();
        response = (OASDeletePartnersResponse) api.deleteBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePartnersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePartnersResponse.getExample();
        response = (OASDeletePartnersResponse) api.deleteBusinessPartners(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List business employers for user
     *
     * Get all of the viewing user\&#39;s business employers.
     */
    @isTest
    private static void getBusinessEmployersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pageSize' => '',
            'bookmark' => 'null'
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASGetBusinessEmployers200Response response;
        OASGetBusinessEmployers200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessEmployers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessEmployers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get business members
     *
     * Get all members of the specified business.\nThe return response will include the member\&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     */
    @isTest
    private static void getBusinessMembersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'assetsSummary' => '',
            'businessRoles' => new List<OASMemberBusinessRole>{OASMemberBusinessRole.getExample()},
            'memberIds' => 00101010101,2222220101,
            'startIndex' => 0,
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASGetBusinessMembers200Response response;
        OASGetBusinessMembers200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASGetBusinessMembers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessMembers200Response.getExample();
        response = (OASGetBusinessMembers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessMembers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessMembers200Response.getExample();
        response = (OASGetBusinessMembers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get business partners
     *
     * Get all partners of the specified business.\n\nIf the assets_summary&#x3D;TRUE and:\n- partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to.\n- partner_type&#x3D;EXTERNAL, the business assets returned are your partner\&#39;s business assets the partner has granted you\n  access to.
     */
    @isTest
    private static void getBusinessPartnersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'assetsSummary' => '',
            'partnerType' => INTERNAL,
            'partnerIds' => 00101010101,2222220101,
            'startIndex' => 0,
            'pageSize' => '',
            'bookmark' => 'null'
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASGetBusinessPartners200Response response;
        OASGetBusinessPartners200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASGetBusinessPartners200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessPartners200Response.getExample();
        response = (OASGetBusinessPartners200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessPartners200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessPartners200Response.getExample();
        response = (OASGetBusinessPartners200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update member\&#39;s business role
     *
     * Update a member\&#39;s business role within the business.
     */
    @isTest
    private static void updateBusinessMembershipsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSUpdateMemberBusinessRoleBody' => new List<OASUpdateMemberBusinessRoleBody>{OASUpdateMemberBusinessRoleBody.getExample()}
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASUpdateMemberResultsResponseArray response;
        OASUpdateMemberResultsResponseArray expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASUpdateMemberResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberResultsResponseArray.getExample();
        response = (OASUpdateMemberResultsResponseArray) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateMemberResultsResponseArray.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberResultsResponseArray.getExample();
        response = (OASUpdateMemberResultsResponseArray) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);
    }
}