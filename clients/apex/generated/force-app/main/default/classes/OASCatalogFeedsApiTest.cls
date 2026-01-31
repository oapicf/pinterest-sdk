@isTest
private class OASCatalogFeedsApiTest {
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
        OASCatalogFeedsApi api;
        OASFeedProcessingResultsList200Respo response;
        OASFeedProcessingResultsList200Respo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
        OASCatalogFeedsApi api;
        OASCatalogsFeed response;
        OASCatalogsFeed expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
        api = new OASCatalogFeedsApi(client);

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
        OASCatalogFeedsApi api;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
        api = new OASCatalogFeedsApi(client);

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
        OASCatalogFeedsApi api;
        OASCatalogsFeed response;
        OASCatalogsFeed expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
        api = new OASCatalogFeedsApi(client);

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
        OASCatalogFeedsApi api;
        OASCatalogsFeedIngestion response;
        OASCatalogsFeedIngestion expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
        OASCatalogFeedsApi api;
        OASFeedsList200Response response;
        OASFeedsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
        api = new OASCatalogFeedsApi(client);

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
        OASCatalogFeedsApi api;
        OASCatalogsFeed response;
        OASCatalogsFeed expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
        api = new OASCatalogFeedsApi(client);

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
        OASCatalogFeedsApi api;
        OASItemsIssuesList200Response response;
        OASItemsIssuesList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogFeedsApi(client);

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
}