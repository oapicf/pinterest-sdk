@isTest
private class OASCatalogsApiTest {
    /**
     * Create catalog
     *
     * Create a new catalog owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: this API only supports the catalog type of HOTEL for now.
     */
    @isTest
    private static void catalogsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsCreateRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalog response;
        OASCatalog expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalog.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalog.getExample();
        response = (OASCatalog) api.catalogsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalog.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalog.getExample();
        response = (OASCatalog) api.catalogsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalog.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalog.getExample();
        response = (OASCatalog) api.catalogsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalog.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalog.getExample();
        response = (OASCatalog) api.catalogsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List catalogs
     *
     * Fetch catalogs owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsList200Response response;
        OASCatalogsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsList200Response.getExample();
        response = (OASCatalogsList200Response) api.catalogsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsList200Response.getExample();
        response = (OASCatalogsList200Response) api.catalogsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsList200Response.getExample();
        response = (OASCatalogsList200Response) api.catalogsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsList200Response.getExample();
        response = (OASCatalogsList200Response) api.catalogsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List products by product group
     *
     * Get a list of product pins for a given Catalogs Product Group Id owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsProductGroupPinsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productGroupId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'adAccountId' => 'null',
            'pinMetrics' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsProductGroupPinsList200Re response;
        OASCatalogsProductGroupPinsList200Re expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.catalogsProductGroupPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.catalogsProductGroupPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.catalogsProductGroupPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.catalogsProductGroupPinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.catalogsProductGroupPinsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create product group
     *
     * Create product group to use in Catalogs owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
     */
    @isTest
    private static void catalogsProductGroupsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSMultipleProductGroupsInner' => {"name":"Few Filters using \"all_of\"","feed_id":"2680059592705","filters":{"all_of":[{"MIN_PRICE":{"values":999.99,"inclusion":true}},{"CURRENCY":{"values":"USD"}},{"CUSTOM_LABEL_0":{"values":["Luxury Items"]}}]}},
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsVerticalProductGroup response;
        OASCatalogsVerticalProductGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create product groups
     *
     * Create product group to use in Catalogs owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
     */
    @isTest
    private static void catalogsProductGroupsCreateManyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSMultipleProductGroupsInner' => [{"name":"Few Filters using \"all_of\"","feed_id":"2680059592705","filters":{"all_of":[{"MIN_PRICE":{"values":999.99,"inclusion":true}},{"CURRENCY":{"values":"USD"}},{"CUSTOM_LABEL_0":{"values":["Luxury Items"]}}]}}],
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        List<String> response;
        List<String> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(new List<String>{'443727193917'});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{'443727193917'};
        response = (List<String>) api.catalogsProductGroupsCreateMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<String>{'443727193917'});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{'443727193917'};
        response = (List<String>) api.catalogsProductGroupsCreateMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<String>{'443727193917'});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{'443727193917'};
        response = (List<String>) api.catalogsProductGroupsCreateMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<String>{'443727193917'});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{'443727193917'};
        response = (List<String>) api.catalogsProductGroupsCreateMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<String>{'443727193917'});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{'443727193917'};
        response = (List<String>) api.catalogsProductGroupsCreateMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<String>{'443727193917'});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{'443727193917'};
        response = (List<String>) api.catalogsProductGroupsCreateMany(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete product group
     *
     * Delete a product group owned by the &quot;operation user_account&quot; from being in use in Catalogs.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsProductGroupsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productGroupId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete product groups
     *
     * Delete product groups owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsProductGroupsDeleteManyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => new List<Integer>{0},
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDeleteMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDeleteMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDeleteMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDeleteMany(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.catalogsProductGroupsDeleteMany(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get product group
     *
     * Get a singe product group for a given Catalogs Product Group Id owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsProductGroupsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productGroupId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsVerticalProductGroup response;
        OASCatalogsVerticalProductGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List product groups
     *
     * Get a list of product groups for a given Catalogs Feed Id owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsProductGroupsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => new List<Integer>{0},
            'feedId' => 'null',
            'catalogId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsProductGroupsList200Respo response;
        OASCatalogsProductGroupsList200Respo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsProductGroupsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupsList200Respo.getExample();
        response = (OASCatalogsProductGroupsList200Respo) api.catalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupsList200Respo.getExample();
        response = (OASCatalogsProductGroupsList200Respo) api.catalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupsList200Respo.getExample();
        response = (OASCatalogsProductGroupsList200Respo) api.catalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupsList200Respo.getExample();
        response = (OASCatalogsProductGroupsList200Respo) api.catalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupsList200Respo.getExample();
        response = (OASCatalogsProductGroupsList200Respo) api.catalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupsList200Respo.getExample();
        response = (OASCatalogsProductGroupsList200Respo) api.catalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupsList200Respo.getExample();
        response = (OASCatalogsProductGroupsList200Respo) api.catalogsProductGroupsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get product counts
     *
     * Get a product counts for a given Catalogs Product Group owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsProductGroupsProductCountsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productGroupId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsProductGroupProductCounts response;
        OASCatalogsProductGroupProductCounts expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsProductGroupProductCounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupProductCounts.getExample();
        response = (OASCatalogsProductGroupProductCounts) api.catalogsProductGroupsProductCountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupProductCounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupProductCounts.getExample();
        response = (OASCatalogsProductGroupProductCounts) api.catalogsProductGroupsProductCountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupProductCounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupProductCounts.getExample();
        response = (OASCatalogsProductGroupProductCounts) api.catalogsProductGroupsProductCountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupProductCounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupProductCounts.getExample();
        response = (OASCatalogsProductGroupProductCounts) api.catalogsProductGroupsProductCountsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update single product group
     *
     * Update product group owned by the &quot;operation user_account&quot; to use in Catalogs.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
     */
    @isTest
    private static void catalogsProductGroupsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productGroupId' => 'null',
            'oaSCatalogsProductGroupsUpdateReques' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsVerticalProductGroup response;
        OASCatalogsVerticalProductGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsVerticalProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsVerticalProductGroup.getExample();
        response = (OASCatalogsVerticalProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List feed processing results
     *
     * Fetch a feed processing results owned by the &quot;operation user_account&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void feedProcessingResultsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASFeedProcessingResultsList200Respo response;
        OASFeedProcessingResultsList200Respo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASFeedProcessingResultsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedProcessingResultsList200Respo.getExample();
        response = (OASFeedProcessingResultsList200Respo) api.feedProcessingResultsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedProcessingResultsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedProcessingResultsList200Respo.getExample();
        response = (OASFeedProcessingResultsList200Respo) api.feedProcessingResultsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedProcessingResultsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedProcessingResultsList200Respo.getExample();
        response = (OASFeedProcessingResultsList200Respo) api.feedProcessingResultsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedProcessingResultsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedProcessingResultsList200Respo.getExample();
        response = (OASFeedProcessingResultsList200Respo) api.feedProcessingResultsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedProcessingResultsList200Respo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedProcessingResultsList200Respo.getExample();
        response = (OASFeedProcessingResultsList200Respo) api.feedProcessingResultsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create feed
     *
     * Create a new feed owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nPlease, be aware that &quot;default_country&quot;\nand &quot;default_locale&quot; are not required in the spec for forward compatibility\nbut for now the API will not accept requests without those fields.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nFor Retail partners, refer to &lt;a href&#x3D;\&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Pinterest API for shopping&lt;/a&gt;.\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
     */
    @isTest
    private static void feedsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSFeedsCreateRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsFeed response;
        OASCatalogsFeed expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete feed
     *
     * Delete a feed owned by the &quot;operating user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nFor Retail partners, refer to &lt;a href&#x3D;\&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     */
    @isTest
    private static void feedsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.feedsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get feed
     *
     * Get a single feed owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nFor Retail partners, refer to &lt;a href&#x3D;\&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     */
    @isTest
    private static void feedsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsFeed response;
        OASCatalogsFeed expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Ingest feed items
     *
     * Ingest items for a given feed owned by the &quot;operation user_account&quot;.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @isTest
    private static void feedsIngestTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsFeedIngestion response;
        OASCatalogsFeedIngestion expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsFeedIngestion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeedIngestion.getExample();
        response = (OASCatalogsFeedIngestion) api.feedsIngest(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeedIngestion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeedIngestion.getExample();
        response = (OASCatalogsFeedIngestion) api.feedsIngest(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeedIngestion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeedIngestion.getExample();
        response = (OASCatalogsFeedIngestion) api.feedsIngest(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeedIngestion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeedIngestion.getExample();
        response = (OASCatalogsFeedIngestion) api.feedsIngest(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeedIngestion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeedIngestion.getExample();
        response = (OASCatalogsFeedIngestion) api.feedsIngest(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List feeds
     *
     * Fetch feeds owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nFor Retail partners, refer to &lt;a href&#x3D;\&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     */
    @isTest
    private static void feedsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => '',
            'catalogId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASFeedsList200Response response;
        OASFeedsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASFeedsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFeedsList200Response.getExample();
        response = (OASFeedsList200Response) api.feedsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update feed
     *
     * Update a feed owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nFor Retail partners, refer to &lt;a href&#x3D;\&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Pinterest API for shopping&lt;/a&gt;.\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
     */
    @isTest
    private static void feedsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null',
            'oaSFeedsUpdateRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsFeed response;
        OASCatalogsFeed expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsFeed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsFeed.getExample();
        response = (OASCatalogsFeed) api.feedsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

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
            'batchId' => 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsItemsBatch response;
        OASCatalogsItemsBatch expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

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
        api = new OASCatalogsApi(client);

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
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the &quot;operation user_account&quot;. &lt;a href&#x3D;&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch&quot; target&#x3D;&quot;_blank&quot;&gt;See detailed documentation here.&lt;/a&gt;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nNote:\n- Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.\n- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.
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
        OASCatalogsApi api;
        OASCatalogsItemsBatch response;
        OASCatalogsItemsBatch expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

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
        api = new OASCatalogsApi(client);

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
     * Get catalogs items
     *
     * Get the items of the catalog owned by the &quot;operation user_account&quot;. &lt;a href&#x3D;&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch&quot; target&#x3D;&quot;_blank&quot;&gt;See detailed documentation here.&lt;/a&gt;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nNote: this endpoint is deprecated and will be deleted soon. Please use &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/items/post\&#39;&gt;Get catalogs items (POST)&lt;/a&gt; instead.
     */
    @isTest
    private static void itemsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'country' => US,
            'language' => EN,
            'adAccountId' => 'null',
            'itemIds' => ["CR123"],
            'filters' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsItems response;
        OASCatalogsItems expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsItems.getExample();
        response = (OASCatalogsItems) api.itemsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List item issues
     *
     * List item validation issues for a given feed processing result owned by the &quot;operation user_account&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \&#39;item_numbers\&#39; and \&#39;item_validation_issue\&#39; cannot be used simultaneously until it is implemented in some release in the future.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nNote: To get a list of all affected items instead of sampled issues, please refer to &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/reports/create\&#39;&gt;Build catalogs report&lt;/a&gt; and &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/reports/get\&#39;&gt;Get catalogs report&lt;/a&gt; endpoints. Moreover, they support multiple types of catalogs.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void itemsIssuesListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'processingResultId' => 5224831246441439241,
            'bookmark' => 'null',
            'pageSize' => '',
            'itemNumbers' => [1,5],
            'itemValidationIssue' => TITLE_MISSING,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASItemsIssuesList200Response response;
        OASItemsIssuesList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASItemsIssuesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemsIssuesList200Response.getExample();
        response = (OASItemsIssuesList200Response) api.itemsIssuesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASItemsIssuesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemsIssuesList200Response.getExample();
        response = (OASItemsIssuesList200Response) api.itemsIssuesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASItemsIssuesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemsIssuesList200Response.getExample();
        response = (OASItemsIssuesList200Response) api.itemsIssuesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASItemsIssuesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemsIssuesList200Response.getExample();
        response = (OASItemsIssuesList200Response) api.itemsIssuesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASItemsIssuesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemsIssuesList200Response.getExample();
        response = (OASItemsIssuesList200Response) api.itemsIssuesList(params);
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
        OASCatalogsApi api;
        OASCatalogsItems response;
        OASCatalogsItems expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

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

    /**
     * List products by filter
     *
     * List products Pins owned by the &quot;operation user_account&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request.\n- This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nNote: This endpoint only supports RETAIL catalog at the moment.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void productsByProductGroupFilterListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsListProductsByFilterReque' => '',
            'bookmark' => 'null',
            'pageSize' => '',
            'adAccountId' => 'null',
            'pinMetrics' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsProductGroupPinsList200Re response;
        OASCatalogsProductGroupPinsList200Re expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.productsByProductGroupFilterList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.productsByProductGroupFilterList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.productsByProductGroupFilterList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsProductGroupPinsList200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroupPinsList200Re.getExample();
        response = (OASCatalogsProductGroupPinsList200Re) api.productsByProductGroupFilterList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Build catalogs report
     *
     * Async request to create a report of the catalog owned by the &quot;operation user_account&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @isTest
    private static void reportsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsReportParameters' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsCreateReportResponse response;
        OASCatalogsCreateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get catalogs report
     *
     * This returns a URL to a report given a token returned from &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/reports/create\&#39;&gt;Build catalogs report&lt;/a&gt;. You can use the URL to download the report.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @isTest
    private static void reportsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'token' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsReport response;
        OASCatalogsReport expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List report stats
     *
     * List aggregated numbers of issues for a catalog owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @isTest
    private static void reportsStatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'parameters' => '',
            'adAccountId' => 'null',
            'pageSize' => '',
            'bookmark' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASReportsStats200Response response;
        OASReportsStats200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);
    }
}