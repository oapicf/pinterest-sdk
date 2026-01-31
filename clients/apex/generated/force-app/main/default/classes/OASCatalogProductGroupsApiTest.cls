@isTest
private class OASCatalogProductGroupsApiTest {
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
        OASCatalogProductGroupsApi api;
        OASCatalogsProductGroupPinsList200Re response;
        OASCatalogsProductGroupPinsList200Re expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
     * Create product group to use in Catalogs owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n&quot;Catalog-based product groups&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the &quot;retail feed-based&quot; option.\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
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
        OASCatalogProductGroupsApi api;
        OASCatalogsVerticalProductGroup response;
        OASCatalogsVerticalProductGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
        OASCatalogProductGroupsApi api;
        List<String> response;
        List<String> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
        OASCatalogProductGroupsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
        OASCatalogProductGroupsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
        OASCatalogProductGroupsApi api;
        OASCatalogsVerticalProductGroup response;
        OASCatalogsVerticalProductGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
        OASCatalogProductGroupsApi api;
        OASCatalogsProductGroupsList200Respo response;
        OASCatalogsProductGroupsList200Respo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
        OASCatalogProductGroupsApi api;
        OASCatalogsProductGroupProductCounts response;
        OASCatalogsProductGroupProductCounts expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
     * Update product group owned by the &quot;operation user_account&quot; to use in Catalogs.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n&quot;Catalog-based product groups&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the &quot;retail feed-based&quot; option.\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: Access to the Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
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
        OASCatalogProductGroupsApi api;
        OASCatalogsVerticalProductGroup response;
        OASCatalogsVerticalProductGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
        OASCatalogProductGroupsApi api;
        OASCatalogsProductGroupPinsList200Re response;
        OASCatalogsProductGroupPinsList200Re expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogProductGroupsApi(client);

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
}