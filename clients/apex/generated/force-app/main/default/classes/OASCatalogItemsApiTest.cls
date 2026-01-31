@isTest
private class OASCatalogItemsApiTest {
    /**
     * Get item batch status
     *
     * Get a single catalogs items batch owned by the &quot;operating user_account&quot;. &lt;a href&#x3D;&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch&quot; target&#x3D;&quot;_blank&quot;&gt;See detailed documentation here.&lt;/a&gt;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @isTest
    private static void itemsBatchGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'batchId' => 66753b9bb65c46c49bd8503b27fecf9e,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogItemsApi api;
        OASCatalogsItemsBatch response;
        OASCatalogsItemsBatch expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogItemsApi(client);

        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCatalogItemsApi(client);

        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Operate on item batch
     *
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the &quot;operation user_account&quot;. &lt;a href&#x3D;&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch&quot; target&#x3D;&quot;_blank&quot;&gt;See detailed documentation here.&lt;/a&gt;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nNote:\n- Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.\n- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
     */
    @isTest
    private static void itemsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSItemsBatchPostRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogItemsApi api;
        OASCatalogsItemsBatch response;
        OASCatalogsItemsBatch expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogItemsApi(client);

        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCatalogItemsApi(client);

        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItemsBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItemsBatch.getExample();
        response = (OASCatalogsItemsBatch) api.itemsBatchPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get catalogs items (POST)
     *
     * Get the items of the catalog owned by the &quot;operation user_account&quot;. &lt;a href&#x3D;&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch&quot; target&#x3D;&quot;_blank&quot;&gt;See detailed documentation here.&lt;/a&gt;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
     */
    @isTest
    private static void itemsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsItemsRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogItemsApi api;
        OASCatalogsItems response;
        OASCatalogsItems expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogItemsApi(client);

        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsPost(params);
        System.assertEquals(expectedResponse, response);
    }
}