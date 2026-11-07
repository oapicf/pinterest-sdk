@isTest
private class OASAdvancedAuctionApiTest {
    /**
     * Get item bid options (POST)
     *
     * Get the bid options for a batch of retail catalog items.\n\nThe catalog must be owned by the &quot;operation user_account&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.\n\nThis endpoint is not available to all users.
     */
    @isTest
    private static void advancedAuctionItemsGetPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAdvancedAuctionItemsGetRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdvancedAuctionApi api;
        OASAdvancedAuctionItems response;
        OASAdvancedAuctionItems expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdvancedAuctionApi(client);

        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionItems.getExample();
        response = (OASAdvancedAuctionItems) api.advancedAuctionItemsGetPost(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Operate on item level bid options
     *
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.\n\nThe catalog must be owned by the &quot;operation user_account&quot;. [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.\n\nThis endpoint is not available to all users.
     */
    @isTest
    private static void advancedAuctionItemsSubmitPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAdvancedAuctionItemsSubmitRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdvancedAuctionApi api;
        OASAdvancedAuctionProcessedItems response;
        OASAdvancedAuctionProcessedItems expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdvancedAuctionApi(client);

        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdvancedAuctionProcessedItems.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdvancedAuctionProcessedItems.getExample();
        response = (OASAdvancedAuctionProcessedItems) api.advancedAuctionItemsSubmitPost(params);
        System.assertEquals(expectedResponse, response);
    }
}