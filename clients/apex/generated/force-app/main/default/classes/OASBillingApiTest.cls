@isTest
private class OASBillingApiTest {
    /**
     * Redeem ad credits
     *
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.\n\n&lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void adsCreditRedeemTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdsCreditRedeemRequest' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASAdsCreditRedeemResponse response;
        OASAdsCreditRedeemResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASAdsCreditRedeemResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeemResponse.getExample();
        response = (OASAdsCreditRedeemResponse) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeemResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeemResponse.getExample();
        response = (OASAdsCreditRedeemResponse) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeemResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeemResponse.getExample();
        response = (OASAdsCreditRedeemResponse) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.\n\n&lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void adsCreditsDiscountsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASAdsCreditsDiscountsGet200Response response;
        OASAdsCreditsDiscountsGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASAdsCreditsDiscountsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditsDiscountsGet200Response.getExample();
        response = (OASAdsCreditsDiscountsGet200Response) api.adsCreditsDiscountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditsDiscountsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditsDiscountsGet200Response.getExample();
        response = (OASAdsCreditsDiscountsGet200Response) api.adsCreditsDiscountsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.\n\n&lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void billingProfilesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'isActive' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASBillingProfilesGet200Response response;
        OASBillingProfilesGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASBillingProfilesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingProfilesGet200Response.getExample();
        response = (OASBillingProfilesGet200Response) api.billingProfilesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingProfilesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingProfilesGet200Response.getExample();
        response = (OASBillingProfilesGet200Response) api.billingProfilesGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Salesforce account details including bill-to information.
     *
     * Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioAccountsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASBillingApi api;
        OASSSIOAccountResponse response;
        OASSSIOAccountResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSSIOAccountResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccountResponse.getExample();
        response = (OASSSIOAccountResponse) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccountResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccountResponse.getExample();
        response = (OASSSIOAccountResponse) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccountResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccountResponse.getExample();
        response = (OASSSIOAccountResponse) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create insertion order through SSIO.
     *
     * Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioInsertionOrderCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSSSIOCreateInsertionOrderRequest' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASSSIOCreateInsertionOrderResponse response;
        OASSSIOCreateInsertionOrderResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSSIOCreateInsertionOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOCreateInsertionOrderResponse.getExample();
        response = (OASSSIOCreateInsertionOrderResponse) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOCreateInsertionOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOCreateInsertionOrderResponse.getExample();
        response = (OASSSIOCreateInsertionOrderResponse) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOCreateInsertionOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOCreateInsertionOrderResponse.getExample();
        response = (OASSSIOCreateInsertionOrderResponse) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Edit insertion order through SSIO.
     *
     * Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioInsertionOrderEditTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSSSIOEditInsertionOrderRequest' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASSSIOEditInsertionOrderResponse response;
        OASSSIOEditInsertionOrderResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSSIOEditInsertionOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOEditInsertionOrderResponse.getExample();
        response = (OASSSIOEditInsertionOrderResponse) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOEditInsertionOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOEditInsertionOrderResponse.getExample();
        response = (OASSSIOEditInsertionOrderResponse) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOEditInsertionOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOEditInsertionOrderResponse.getExample();
        response = (OASSSIOEditInsertionOrderResponse) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get insertion order status by ad account id.
     *
     * Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioInsertionOrdersStatusGetByAdAccountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASSsioInsertionOrdersStatusGetByAdA response;
        OASSsioInsertionOrdersStatusGetByAdA expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSsioInsertionOrdersStatusGetByAdA.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        response = (OASSsioInsertionOrdersStatusGetByAdA) api.ssioInsertionOrdersStatusGetByAdAccount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSsioInsertionOrdersStatusGetByAdA.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        response = (OASSsioInsertionOrdersStatusGetByAdA) api.ssioInsertionOrdersStatusGetByAdAccount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSsioInsertionOrdersStatusGetByAdA.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSsioInsertionOrdersStatusGetByAdA.getExample();
        response = (OASSsioInsertionOrdersStatusGetByAdA) api.ssioInsertionOrdersStatusGetByAdAccount(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get insertion order status by pin order id.
     *
     * Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioInsertionOrdersStatusGetByPinOrderIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'pinOrderId' => 0Q01N0000015hekSVDFDC
        };

        OASClient client;
        OASBillingApi api;
        OASSSIOInsertionOrderStatusResponse response;
        OASSSIOInsertionOrderStatusResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSSIOInsertionOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrderStatusResponse.getExample();
        response = (OASSSIOInsertionOrderStatusResponse) api.ssioInsertionOrdersStatusGetByPinOrderId(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrderStatusResponse.getExample();
        response = (OASSSIOInsertionOrderStatusResponse) api.ssioInsertionOrdersStatusGetByPinOrderId(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrderStatusResponse.getExample();
        response = (OASSSIOInsertionOrderStatusResponse) api.ssioInsertionOrdersStatusGetByPinOrderId(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Salesforce order lines by ad account id.
     *
     * Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioOrderLinesGetByAdAccountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'pinOrderId' => 0Q01N0000015hekSVDFDC
        };

        OASClient client;
        OASBillingApi api;
        OASSsioOrderLinesGetByAdAccount200Re response;
        OASSsioOrderLinesGetByAdAccount200Re expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSsioOrderLinesGetByAdAccount200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        response = (OASSsioOrderLinesGetByAdAccount200Re) api.ssioOrderLinesGetByAdAccount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSsioOrderLinesGetByAdAccount200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        response = (OASSsioOrderLinesGetByAdAccount200Re) api.ssioOrderLinesGetByAdAccount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSsioOrderLinesGetByAdAccount200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        response = (OASSsioOrderLinesGetByAdAccount200Re) api.ssioOrderLinesGetByAdAccount(params);
        System.assertEquals(expectedResponse, response);
    }
}