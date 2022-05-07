@isTest
private class OASCatalogsApiTest {
    /**
     * Create product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nCreate product group to use in Catalogs.
     */
    @isTest
    private static void catalogsProductGroupsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsProductGroupCreateRequest' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        Object response;
        Object expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);
        api.catalogsProductGroupsCreate(params);
    }

    /**
     * Delete product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nDelete a product group from being in use in Catalogs.
     */
    @isTest
    private static void catalogsProductGroupsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productGroupId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);
        api.catalogsProductGroupsDelete(params);
    }

    /**
     * Get product groups list
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nGet a list of product groups for a given Catalogs Feed Id.
     */
    @isTest
    private static void catalogsProductGroupsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        OASPaginated response;
        OASPaginated expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);
        api.catalogsProductGroupsList(params);
    }

    /**
     * Update product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nUpdate product group to use in Catalogs.
     */
    @isTest
    private static void catalogsProductGroupsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productGroupId' => 'null',
            'oaSCatalogsProductGroupUpdateRequest' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        OASCatalogsProductGroup response;
        OASCatalogsProductGroup expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);

        js = JSON.serialize(OASCatalogsProductGroup.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsProductGroup.getExample();
        response = (OASCatalogsProductGroup) api.catalogsProductGroupsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List processing results for a given feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nFetch a feed processing results owned by the owner user account.
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
            'pageSize' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        OASPaginated response;
        OASPaginated expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);
        api.feedProcessingResultsList(params);
    }

    /**
     * Create feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nCreate a new feed owned by the &quot;operating user_account&quot;.
     */
    @isTest
    private static void feedsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsFeedsCreateRequest' => ''
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
    }

    /**
     * Delete feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nDelete a feed owned by the &quot;operating user_account&quot;.
     */
    @isTest
    private static void feedsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null'
        };

        OASClient client;
        OASCatalogsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);
        api.feedsDelete(params);
    }

    /**
     * Get feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nGet a single feed owned by the &quot;operating user_account&quot;.
     */
    @isTest
    private static void feedsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null'
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
    }

    /**
     * List feeds
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nFetch feeds owned by the &quot;operating user_account&quot;.
     */
    @isTest
    private static void feedsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASCatalogsApi api;
        OASPaginated response;
        OASPaginated expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogsApi(client);
        api.feedsList(params);
    }

    /**
     * Update feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nUpdate a feed owned by the &quot;operating user_account&quot;.
     */
    @isTest
    private static void feedsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'feedId' => 'null',
            'oaSCatalogsFeedsUpdateRequest' => ''
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
    }

    /**
     * Get catalogs items batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nGet a single catalogs items batch created by the &quot;operating user_account&quot;.
     */
    @isTest
    private static void itemsBatchGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'batchId' => 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e
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
    }

    /**
     * Perform an operation on an item batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nThis endpoint supports multiple operations on a set of one or more catalog items.
     */
    @isTest
    private static void itemsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsItemsBatchRequest' => ''
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
    }

    /**
     * Get catalogs items
     *
     * Get the items of the catalog created by the &quot;operating user_account&quot;
     */
    @isTest
    private static void itemsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'country' => US,
            'itemIds' => CR123,
            'language' => EN
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
    }
}