@isTest
private class OASCatalogsApiTest {
    /**
     * List available filter values
     *
     * Get the available filter attributes and values associated with a given feed or catalog owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n- &lt;code&gt;country&lt;/code&gt;, &lt;code&gt;language&lt;/code&gt;, and &lt;code&gt;feed_id&lt;/code&gt; are only used in retail catalogs.\n- Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;
     */
    @isTest
    private static void catalogsAvailableFilterValuesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'catalogId' => 'null',
            'feedId' => 'null',
            'country' => US,
            'language' => en-US,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsAvailableFilterValues response;
        OASCatalogsAvailableFilterValues expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsAvailableFilterValues.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsAvailableFilterValues.getExample();
        response = (OASCatalogsAvailableFilterValues) api.catalogsAvailableFilterValues(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsAvailableFilterValues.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsAvailableFilterValues.getExample();
        response = (OASCatalogsAvailableFilterValues) api.catalogsAvailableFilterValues(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsAvailableFilterValues.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsAvailableFilterValues.getExample();
        response = (OASCatalogsAvailableFilterValues) api.catalogsAvailableFilterValues(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsAvailableFilterValues.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsAvailableFilterValues.getExample();
        response = (OASCatalogsAvailableFilterValues) api.catalogsAvailableFilterValues(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsAvailableFilterValues.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsAvailableFilterValues.getExample();
        response = (OASCatalogsAvailableFilterValues) api.catalogsAvailableFilterValues(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsAvailableFilterValues.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsAvailableFilterValues.getExample();
        response = (OASCatalogsAvailableFilterValues) api.catalogsAvailableFilterValues(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsAvailableFilterValues.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsAvailableFilterValues.getExample();
        response = (OASCatalogsAvailableFilterValues) api.catalogsAvailableFilterValues(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create catalog
     *
     * Create a new catalog owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.\n\n&lt;a href&#x3D;\&#39;/docs/api-features/shopping-overview/\&#39;&gt;Learn more&lt;/a&gt;\n\nNote: Access to the Product and Creative Assets catalog type is restricted to a specific group of users.\nIf you require access, please reach out to your partner manager.
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
}