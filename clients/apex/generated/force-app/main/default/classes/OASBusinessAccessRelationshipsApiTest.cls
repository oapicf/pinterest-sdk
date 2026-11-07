@isTest
private class OASBusinessAccessRelationshipsApiTest {
    /**
     * Create a Brand Account
     *
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     */
    @isTest
    private static void brandAccountsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessHierarchyId' => 'null',
            'oaSBrandAccountCreate' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASBrandAccount response;
        OASBrandAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update a Brand Account
     *
     * Update an existing Brand Account
     */
    @isTest
    private static void brandAccountsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'brandAccountId' => 'null',
            'businessHierarchyId' => 'null',
            'oaSBrandAccountUpdate' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASBrandAccount response;
        OASBrandAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBrandAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBrandAccount.getExample();
        response = (OASBrandAccount) api.brandAccountsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

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
            'businessId' => 'null',
            'oaSDeleteBusinessMembershipBody' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASDeleteBusinessMembership200Respon response;
        OASDeleteBusinessMembership200Respon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASDeleteBusinessMembership200Respon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteBusinessMembership200Respon.getExample();
        response = (OASDeleteBusinessMembership200Respon) api.deleteBusinessMembership(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteBusinessMembership200Respon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteBusinessMembership200Respon.getExample();
        response = (OASDeleteBusinessMembership200Respon) api.deleteBusinessMembership(params);
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
            'businessId' => 'null',
            'oaSDeleteBusinessPartnersDelete' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASDeleteBusinessPartners response;
        OASDeleteBusinessPartners expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASDeleteBusinessPartners.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteBusinessPartners.getExample();
        response = (OASDeleteBusinessPartners) api.deleteBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteBusinessPartners.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteBusinessPartners.getExample();
        response = (OASDeleteBusinessPartners) api.deleteBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteBusinessPartners.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteBusinessPartners.getExample();
        response = (OASDeleteBusinessPartners) api.deleteBusinessPartners(params);
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
            'assetsSummary' => '',
            'bookmark' => 'null',
            'pageSize' => ''
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
     * Get all members of the specified business. The return response will include the member\&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     */
    @isTest
    private static void getBusinessMembersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'fetchSystemUsers' => '',
            'assetsSummary' => '',
            'businessRoles' => new List<OASMemberBusinessRole>{OASMemberBusinessRole.getExample()},
            'memberIds' => 'null',
            'startIndex' => '',
            'bookmark' => 'null',
            'pageSize' => ''
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
        response = (OASGetBusinessEmployers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessMembers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessMembers(params);
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
            'businessId' => 'null',
            'assetsSummary' => '',
            'partnerType' => '',
            'partnerIds' => 'null',
            'startIndex' => '',
            'sortAscending' => '',
            'bookmark' => 'null',
            'pageSize' => ''
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
        response = (OASGetBusinessEmployers200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessEmployers200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessEmployers200Response.getExample();
        response = (OASGetBusinessEmployers200Response) api.getBusinessPartners(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update a system user information.
     *
     * Update a system user information such as name.
     */
    @isTest
    private static void systemUserUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'systemUserId' => 'null',
            'oaSSystemUserUpdateWithRequiredBody' => ''
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.systemUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.systemUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.systemUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.systemUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.systemUserUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.systemUserUpdate(params);
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
            'businessId' => 'null',
            'oaSBusinessMembershipMember' => new List<OASBusinessMembershipMember>{OASBusinessMembershipMember.getExample()}
        };

        OASClient client;
        OASBusinessAccessRelationshipsApi api;
        OASUpdateBusinessMembershipsResponse response;
        OASUpdateBusinessMembershipsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessRelationshipsApi(client);

        js = JSON.serialize(OASUpdateBusinessMembershipsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateBusinessMembershipsResponse.getExample();
        response = (OASUpdateBusinessMembershipsResponse) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateBusinessMembershipsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateBusinessMembershipsResponse.getExample();
        response = (OASUpdateBusinessMembershipsResponse) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateBusinessMembershipsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateBusinessMembershipsResponse.getExample();
        response = (OASUpdateBusinessMembershipsResponse) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateBusinessMembershipsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateBusinessMembershipsResponse.getExample();
        response = (OASUpdateBusinessMembershipsResponse) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateBusinessMembershipsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateBusinessMembershipsResponse.getExample();
        response = (OASUpdateBusinessMembershipsResponse) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateBusinessMembershipsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateBusinessMembershipsResponse.getExample();
        response = (OASUpdateBusinessMembershipsResponse) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateBusinessMembershipsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateBusinessMembershipsResponse.getExample();
        response = (OASUpdateBusinessMembershipsResponse) api.updateBusinessMemberships(params);
        System.assertEquals(expectedResponse, response);
    }
}