@isTest
private class OASBusinessAccessAssetsApiTest {
    /**
     * Create a new asset group.
     *
     * Create a new asset group with the specified parameters.\n- An &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/asset-groups&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
     */
    @isTest
    private static void assetGroupCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSCreateAssetGroupBody' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASCreateAssetGroupResponse response;
        OASCreateAssetGroupResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASCreateAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateAssetGroupResponse.getExample();
        response = (OASCreateAssetGroupResponse) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateAssetGroupResponse.getExample();
        response = (OASCreateAssetGroupResponse) api.assetGroupCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateAssetGroupResponse.getExample();
        response = (OASCreateAssetGroupResponse) api.assetGroupCreate(params);
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
            'businessId' => 729090764583391194,
            'oaSDeleteAssetGroupBody' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASDeleteAssetGroupResponse response;
        OASDeleteAssetGroupResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASDeleteAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteAssetGroupResponse.getExample();
        response = (OASDeleteAssetGroupResponse) api.assetGroupDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteAssetGroupResponse.getExample();
        response = (OASDeleteAssetGroupResponse) api.assetGroupDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteAssetGroupResponse.getExample();
        response = (OASDeleteAssetGroupResponse) api.assetGroupDelete(params);
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
            'businessId' => 729090764583391194,
            'oaSUpdateAssetGroupBody' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASUpdateAssetGroupResponse response;
        OASUpdateAssetGroupResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASUpdateAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateAssetGroupResponse.getExample();
        response = (OASUpdateAssetGroupResponse) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateAssetGroupResponse.getExample();
        response = (OASUpdateAssetGroupResponse) api.assetGroupUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateAssetGroupResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateAssetGroupResponse.getExample();
        response = (OASUpdateAssetGroupResponse) api.assetGroupUpdate(params);
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
            'businessId' => 729090764583391194,
            'assetId' => 729090764583391194,
            'bookmark' => 'null',
            'pageSize' => '',
            'startIndex' => 0
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
            'businessId' => 729090764583391194,
            'assetId' => 729090764583391194,
            'startIndex' => 0,
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASBusinessAssetPartnersGet200Respon response;
        OASBusinessAssetPartnersGet200Respon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASBusinessAssetPartnersGet200Respon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetPartnersGet200Respon.getExample();
        response = (OASBusinessAssetPartnersGet200Respon) api.businessAssetPartnersGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessAssetPartnersGet200Respon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessAssetPartnersGet200Respon.getExample();
        response = (OASBusinessAssetPartnersGet200Respon) api.businessAssetPartnersGet(params);
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
            'businessId' => 729090764583391194,
            'permissions' => new List<OASPermissionsWithOwner>{OASPermissionsWithOwner.getExample()},
            'childAssetId' => 549764894835,
            'assetGroupId' => 7078106104032,
            'assetType' => AD_ACCOUNT,
            'startIndex' => 0,
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
            'businessId' => 729090764583391194,
            'memberId' => 729090764583391194,
            'assetType' => AD_ACCOUNT,
            'startIndex' => 0,
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASBusinessMemberAssetsGet200Respons response;
        OASBusinessMemberAssetsGet200Respons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASBusinessMemberAssetsGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGet200Respons.getExample();
        response = (OASBusinessMemberAssetsGet200Respons) api.businessMemberAssetsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessMemberAssetsGet200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessMemberAssetsGet200Respons.getExample();
        response = (OASBusinessMemberAssetsGet200Respons) api.businessMemberAssetsGet(params);
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
            'businessId' => 729090764583391194,
            'oaSBusinessMembersAssetAccessDeleteR' => ''
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
     * Grant multiple members access to assets and/or update multiple member\&#39;s exisiting permissions to an asset.\nNote: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.\n
     */
    @isTest
    private static void businessMembersAssetAccessUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
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
            'businessId' => 729090764583391194,
            'partnerId' => 729090764583391194,
            'partnerType' => INTERNAL,
            'assetType' => AD_ACCOUNT,
            'startIndex' => 0,
            'pageSize' => '',
            'bookmark' => 'null'
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
            'businessId' => 729090764583391194,
            'oaSDeletePartnerAssetAccessBody' => ''
        };

        OASClient client;
        OASBusinessAccessAssetsApi api;
        OASDeletePartnerAssetsResultsRespons response;
        OASDeletePartnerAssetsResultsRespons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBusinessAccessAssetsApi(client);

        js = JSON.serialize(OASDeletePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePartnerAssetsResultsRespons.getExample();
        response = (OASDeletePartnerAssetsResultsRespons) api.deletePartnerAssetAccessHandlerImpl(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePartnerAssetsResultsRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePartnerAssetsResultsRespons.getExample();
        response = (OASDeletePartnerAssetsResultsRespons) api.deletePartnerAssetAccessHandlerImpl(params);
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
            'businessId' => 729090764583391194,
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
    }
}