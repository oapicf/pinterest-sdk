@isTest
private class OASBusinessAccessAssetsApiTest {
    /**
     * Create a new asset group.
     *
     * Create a new asset group with the specified parameters.\n- An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
     */
    @isTest
    private static void assetGroupCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSAssetGroupInputCreate' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASAssetGroupInput response;
        OASAssetGroupInput expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupInput.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupInput.getExample();
        response = (OASAssetGroupInput) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete asset groups.
     *
     * Delete a batch of asset groups.
     */
    @isTest
    private static void assetGroupDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSAssetGroupDeletionDelete' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASAssetGroupDeletion response;
        OASAssetGroupDeletion expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASAssetGroupDeletion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupDeletion.getExample();
        response = (OASAssetGroupDeletion) api.assetGroupDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupDeletion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupDeletion.getExample();
        response = (OASAssetGroupDeletion) api.assetGroupDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update asset groups.
     *
     * Update a batch of asset groups with the specified parameters.
     */
    @isTest
    private static void assetGroupUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSAssetGroupModificationReadOrUpdat' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASAssetGroupModification response;
        OASAssetGroupModification expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASAssetGroupModification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupModification.getExample();
        response = (OASAssetGroupModification) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupModification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupModification.getExample();
        response = (OASAssetGroupModification) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupModification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupModification.getExample();
        response = (OASAssetGroupModification) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupModification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupModification.getExample();
        response = (OASAssetGroupModification) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupModification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupModification.getExample();
        response = (OASAssetGroupModification) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupModification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupModification.getExample();
        response = (OASAssetGroupModification) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAssetGroupModification.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetGroupModification.getExample();
        response = (OASAssetGroupModification) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get members with access to asset
     *
     * Get all the members the requesting business has granted access to on the given asset.
     */
    @isTest
    private static void businessAssetMembersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'assetId' => 'null',
            'startIndex' => '',
            'fetchSystemUsers' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASBusinessAssetMembersGet200Respons response;
        OASBusinessAssetMembersGet200Respons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetMembersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetMembersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetMembersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetMembersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetMembersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetMembersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetMembersGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get partners with access to asset
     *
     * Get all the partners the requesting business has granted access to on the given asset.\nNote: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with\nyou cannot be shared with a different partner.
     */
    @isTest
    private static void businessAssetPartnersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'assetId' => 'null',
            'startIndex' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASBusinessAssetMembersGet200Respons response;
        OASBusinessAssetMembersGet200Respons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetMembersGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetMembersGet200Respons.getExample();
        response = (OASBusinessAssetMembersGet200Respons) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List business assets
     *
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     */
    @isTest
    private static void businessAssetsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'permissions' => new List<OASPermissionsWithOwner>{OASPermissionsWithOwner.getExample()},
            'childAssetId' => 'null',
            'assetGroupId' => 'null',
            'assetType' => AD_ACCOUNT,
            'startIndex' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASBusinessAssetsGet200Response response;
        OASBusinessAssetsGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASBusinessAssetsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetsGet200Response.getExample();
        response = (OASBusinessAssetsGet200Response) api.businessAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetsGet200Response.getExample();
        response = (OASBusinessAssetsGet200Response) api.businessAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetsGet200Response.getExample();
        response = (OASBusinessAssetsGet200Response) api.businessAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetsGet200Response.getExample();
        response = (OASBusinessAssetsGet200Response) api.businessAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetsGet200Response.getExample();
        response = (OASBusinessAssetsGet200Response) api.businessAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetsGet200Response.getExample();
        response = (OASBusinessAssetsGet200Response) api.businessAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetsGet200Response.getExample();
        response = (OASBusinessAssetsGet200Response) api.businessAssetsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get assets assigned to a member
     *
     * Get assets on which you assigned asset permissions to the given member. Can be used to:\n- get all assets, regardless of asset type or\n- get assets of one asset type by using the asset_type query.\nThe return response will include the permissions the member has to that asset and the asset type.
     */
    @isTest
    private static void businessMemberAssetsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'memberId' => 'null',
            'assetType' => AD_ACCOUNT,
            'startIndex' => '',
            'sortBy' => '',
            'sortAscending' => '',
            'searchBy' => '',
            'searchValue' => 'null',
            'assetPermissionType' => '',
            'adAccountStatuses' => new List<OASNonDraftEntityStatus>{OASNonDraftEntityStatus.getExample()},
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASBusinessMemberAssetsGetResponse response;
        OASBusinessMemberAssetsGetResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASBusinessMemberAssetsGetResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGetResponse.getExample();
        response = (OASBusinessMemberAssetsGetResponse) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessMemberAssetsGetResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGetResponse.getExample();
        response = (OASBusinessMemberAssetsGetResponse) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessMemberAssetsGetResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGetResponse.getExample();
        response = (OASBusinessMemberAssetsGetResponse) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessMemberAssetsGetResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGetResponse.getExample();
        response = (OASBusinessMemberAssetsGetResponse) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessMemberAssetsGetResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGetResponse.getExample();
        response = (OASBusinessMemberAssetsGetResponse) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessMemberAssetsGetResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGetResponse.getExample();
        response = (OASBusinessMemberAssetsGetResponse) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessMemberAssetsGetResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGetResponse.getExample();
        response = (OASBusinessMemberAssetsGetResponse) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete member access to asset
     *
     * Terminate multiple members\&#39; access to an asset.
     */
    @isTest
    private static void businessMembersAssetAccessDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSBusinessMembersAssetAccessDeleteB' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASDeleteMemberAccessResultsResponse response;
        OASDeleteMemberAccessResultsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASDeleteMemberAccessResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteMemberAccessResultsResponse.getExample();
        response = (OASDeleteMemberAccessResultsResponse) api.businessMembersAssetAccessDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteMemberAccessResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteMemberAccessResultsResponse.getExample();
        response = (OASDeleteMemberAccessResultsResponse) api.businessMembersAssetAccessDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Assign/Update member asset permissions
     *
     * Grant multiple members access to assets and/or update multiple member\&#39;s exisiting permissions to an asset.\nNote: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     */
    @isTest
    private static void businessMembersAssetAccessUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSUpdateMemberAssetAccessBody' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASUpdateMemberAssetsResultsResponse response;
        OASUpdateMemberAssetsResultsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASUpdateMemberAssetsResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberAssetsResultsResponse.getExample();
        response = (OASUpdateMemberAssetsResultsResponse) api.businessMembersAssetAccessUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateMemberAssetsResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberAssetsResultsResponse.getExample();
        response = (OASUpdateMemberAssetsResultsResponse) api.businessMembersAssetAccessUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateMemberAssetsResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberAssetsResultsResponse.getExample();
        response = (OASUpdateMemberAssetsResultsResponse) api.businessMembersAssetAccessUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateMemberAssetsResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberAssetsResultsResponse.getExample();
        response = (OASUpdateMemberAssetsResultsResponse) api.businessMembersAssetAccessUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateMemberAssetsResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberAssetsResultsResponse.getExample();
        response = (OASUpdateMemberAssetsResultsResponse) api.businessMembersAssetAccessUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateMemberAssetsResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberAssetsResultsResponse.getExample();
        response = (OASUpdateMemberAssetsResultsResponse) api.businessMembersAssetAccessUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateMemberAssetsResultsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateMemberAssetsResultsResponse.getExample();
        response = (OASUpdateMemberAssetsResultsResponse) api.businessMembersAssetAccessUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get assets assigned to a partner or assets assigned by a partner
     *
     * Can be used to get the business assets your partner has granted you access to or the business assets you have\ngranted your partner access to. If you specify:\n- partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to.\n- partner_type&#x3D;EXTERNAL, you will retrieve the partner\&#39;s business assets that the partner has granted you access to.
     */
    @isTest
    private static void businessPartnerAssetAccessGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'partnerId' => 'null',
            'partnerType' => INTERNAL,
            'assetType' => AD_ACCOUNT,
            'startIndex' => '',
            'sortBy' => '',
            'sortAscending' => '',
            'searchBy' => '',
            'searchValue' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASBusinessPartnerAssetAccessGet200R response;
        OASBusinessPartnerAssetAccessGet200R expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASBusinessPartnerAssetAccessGet200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessPartnerAssetAccessGet200R.getExample();
        response = (OASBusinessPartnerAssetAccessGet200R) api.businessPartnerAssetAccessGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessPartnerAssetAccessGet200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessPartnerAssetAccessGet200R.getExample();
        response = (OASBusinessPartnerAssetAccessGet200R) api.businessPartnerAssetAccessGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessPartnerAssetAccessGet200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessPartnerAssetAccessGet200R.getExample();
        response = (OASBusinessPartnerAssetAccessGet200R) api.businessPartnerAssetAccessGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessPartnerAssetAccessGet200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessPartnerAssetAccessGet200R.getExample();
        response = (OASBusinessPartnerAssetAccessGet200R) api.businessPartnerAssetAccessGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessPartnerAssetAccessGet200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessPartnerAssetAccessGet200R.getExample();
        response = (OASBusinessPartnerAssetAccessGet200R) api.businessPartnerAssetAccessGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessPartnerAssetAccessGet200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessPartnerAssetAccessGet200R.getExample();
        response = (OASBusinessPartnerAssetAccessGet200R) api.businessPartnerAssetAccessGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessPartnerAssetAccessGet200R.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessPartnerAssetAccessGet200R.getExample();
        response = (OASBusinessPartnerAssetAccessGet200R) api.businessPartnerAssetAccessGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete partner access to asset
     *
     * Terminate multiple partners\&#39; access to an asset. If\n- partner_type&#x3D;INTERNAL: You will terminate a partner\&#39;s asset access to your business assets.\n- partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner\&#39;s business assets.
     */
    @isTest
    private static void deletePartnerAssetAccessHandlerImplTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSDeletePartnerAssetAccessBody' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASDeletePartnerAssetAccessResultsRe response;
        OASDeletePartnerAssetAccessResultsRe expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASDeletePartnerAssetAccessResultsRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePartnerAssetAccessResultsRe.getExample();
        response = (OASDeletePartnerAssetAccessResultsRe) api.deletePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePartnerAssetAccessResultsRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePartnerAssetAccessResultsRe.getExample();
        response = (OASDeletePartnerAssetAccessResultsRe) api.deletePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Assign/Update partner asset permissions
     *
     * Grant multiple partners access to assets and/or update multiple partner\&#39;s exisiting permissions to an asset.\nIf your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them.\nTo learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview\n\nNote: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be\napplicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of\nthe type PROFILE.
     */
    @isTest
    private static void updatePartnerAssetAccessHandlerImplTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSUpdatePartnerAssetAccessBody' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASUpdatePartnerAssetsResultsRespons response;
        OASUpdatePartnerAssetsResultsRespons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASUpdatePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePartnerAssetsResultsRespons.getExample();
        response = (OASUpdatePartnerAssetsResultsRespons) api.updatePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePartnerAssetsResultsRespons.getExample();
        response = (OASUpdatePartnerAssetsResultsRespons) api.updatePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePartnerAssetsResultsRespons.getExample();
        response = (OASUpdatePartnerAssetsResultsRespons) api.updatePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePartnerAssetsResultsRespons.getExample();
        response = (OASUpdatePartnerAssetsResultsRespons) api.updatePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePartnerAssetsResultsRespons.getExample();
        response = (OASUpdatePartnerAssetsResultsRespons) api.updatePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePartnerAssetsResultsRespons.getExample();
        response = (OASUpdatePartnerAssetsResultsRespons) api.updatePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePartnerAssetsResultsRespons.getExample();
        response = (OASUpdatePartnerAssetsResultsRespons) api.updatePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);
    }
}