@isTest
private class OASCatalogSupplementalApiTest {
    /**
     * Operate on local inventory item batch
     *
     * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations.\nUp to 1000 items per request to match catalogs/items.\n\n- Must provide both item_id and store_code to identify a local inventory item.\n\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n[Learn more](/docs/api-features/shopping-overview/)
     */
    @isTest
    private static void catalogsLocalInventoryItemsBatchOperateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'oaSLocalInventoryItemsBatchCreate' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogSupplementalApi api;
        OASSupplementalItemsBatchResponse response;
        OASSupplementalItemsBatchResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogSupplementalApi(client);

        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsLocalInventoryItemsBatchOperate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get local inventory items (POST)
     *
     * Get local inventory items for a catalog owned by the &quot;operation user_account&quot;.\n\n- Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.\n\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n[Learn more](/docs/api-features/shopping-overview/)
     */
    @isTest
    private static void catalogsLocalInventoryItemsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'oaSLocalInventoryItemsGetCreate' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogSupplementalApi api;
        OASLocalInventoryItemsGet response;
        OASLocalInventoryItemsGet expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogSupplementalApi(client);

        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLocalInventoryItemsGet.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocalInventoryItemsGet.getExample();
        response = (OASLocalInventoryItemsGet) api.catalogsLocalInventoryItemsPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create local stores
     *
     * Create a local store for a catalog owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n- Supports optional filtering by store codes.\n\nOptional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n[Learn more](/docs/api-features/shopping-overview/)
     */
    @isTest
    private static void catalogsLocalStoresCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'oaSLocalStoreCreate' => new List<OASLocalStoreCreate>{OASLocalStoreCreate.getExample()},
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogSupplementalApi api;
        List<OASCatalogsLocalStoresCreate200Respo> response;
        List<OASCatalogsLocalStoresCreate200Respo> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogSupplementalApi(client);

        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete local stores
     *
     *   Delete multiple local stores for a catalog owned by the &quot;operation user_account&quot;.\n  - By default, the &quot;operation user_account&quot; is the token user_account.\n  - Supports optional filtering by store codes.\n\n  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n  [Learn more](/docs/api-features/shopping-overview/)
     */
    @isTest
    private static void catalogsLocalStoresDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'ids' => new List<String>{''},
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogSupplementalApi api;
        List<OASCatalogsLocalStoresDelete200Respo> response;
        List<OASCatalogsLocalStoresDelete200Respo> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogSupplementalApi(client);

        js = JSON.serialize(new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresDelete200Respo>) api.catalogsLocalStoresDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresDelete200Respo>) api.catalogsLocalStoresDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresDelete200Respo>) api.catalogsLocalStoresDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresDelete200Respo>) api.catalogsLocalStoresDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresDelete200Respo>) api.catalogsLocalStoresDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresDelete200Respo>) api.catalogsLocalStoresDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresDelete200Respo>{OASCatalogsLocalStoresDelete200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresDelete200Respo>) api.catalogsLocalStoresDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List local stores
     *
     * Fetch local stores for a catalog owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n- Supports optional filtering by store codes.\n\nOptional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n[Learn more](/docs/api-features/shopping-overview/)
     */
    @isTest
    private static void catalogsLocalStoresListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'ids' => new List<String>{''},
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASCatalogSupplementalApi api;
        OASCatalogsLocalStoresList200Respons response;
        OASCatalogsLocalStoresList200Respons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogSupplementalApi(client);

        js = JSON.serialize(OASCatalogsLocalStoresList200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsLocalStoresList200Respons.getExample();
        response = (OASCatalogsLocalStoresList200Respons) api.catalogsLocalStoresList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsLocalStoresList200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsLocalStoresList200Respons.getExample();
        response = (OASCatalogsLocalStoresList200Respons) api.catalogsLocalStoresList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsLocalStoresList200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsLocalStoresList200Respons.getExample();
        response = (OASCatalogsLocalStoresList200Respons) api.catalogsLocalStoresList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsLocalStoresList200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsLocalStoresList200Respons.getExample();
        response = (OASCatalogsLocalStoresList200Respons) api.catalogsLocalStoresList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsLocalStoresList200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsLocalStoresList200Respons.getExample();
        response = (OASCatalogsLocalStoresList200Respons) api.catalogsLocalStoresList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsLocalStoresList200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsLocalStoresList200Respons.getExample();
        response = (OASCatalogsLocalStoresList200Respons) api.catalogsLocalStoresList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsLocalStoresList200Respons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsLocalStoresList200Respons.getExample();
        response = (OASCatalogsLocalStoresList200Respons) api.catalogsLocalStoresList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update local stores
     *
     *   Update a local store for a catalog owned by the &quot;operation user_account&quot;.\n  - By default, the &quot;operation user_account&quot; is the token user_account.\n  - Supports optional filtering by store codes.\n\n  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n  [Learn more](/docs/api-features/shopping-overview/)
     */
    @isTest
    private static void catalogsLocalStoresUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'oaSLocalStoreBatchUpdate' => new List<OASLocalStoreBatchUpdate>{OASLocalStoreBatchUpdate.getExample()},
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogSupplementalApi api;
        List<OASCatalogsLocalStoresCreate200Respo> response;
        List<OASCatalogsLocalStoresCreate200Respo> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogSupplementalApi(client);

        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCatalogsLocalStoresCreate200Respo>{OASCatalogsLocalStoresCreate200Respo.getExample()};
        response = (List<OASCatalogsLocalStoresCreate200Respo>) api.catalogsLocalStoresUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get supplemental items batch status
     *
     * Fetch the status and results of a supplemental items batch operation.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n[Learn more](/docs/api-features/shopping-overview/)
     */
    @isTest
    private static void catalogsSupplementalItemsBatchGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'batchId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogSupplementalApi api;
        OASSupplementalItemsBatchResponse response;
        OASSupplementalItemsBatchResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogSupplementalApi(client);

        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsSupplementalItemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsSupplementalItemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsSupplementalItemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsSupplementalItemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsSupplementalItemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsSupplementalItemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSupplementalItemsBatchResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSupplementalItemsBatchResponse.getExample();
        response = (OASSupplementalItemsBatchResponse) api.catalogsSupplementalItemsBatchGet(params);
        System.assertEquals(expectedResponse, response);
    }
}