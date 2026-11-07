@isTest
private class OASBillingApiTest {
    /**
     * Redeem ad credits
     *
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.\n\n**This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     */
    @isTest
    private static void adsCreditRedeemTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdsCreditRedeemCreate' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASAdsCreditRedeem response;
        OASAdsCreditRedeem expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsCreditRedeem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditRedeem.getExample();
        response = (OASAdsCreditRedeem) api.adsCreditRedeem(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.\n\n**This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
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


        js = JSON.serialize(OASAdsCreditsDiscountsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsCreditsDiscountsGet200Response.getExample();
        response = (OASAdsCreditsDiscountsGet200Response) api.adsCreditsDiscountsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get download url for a billing invoice
     *
     * Get download url for a billing invoice.
     */
    @isTest
    private static void billingInvoiceDownloadGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'billingInvoiceId' => 'null'
        };

        OASClient client;
        OASBillingApi api;
        OASBillingInvoiceDownloadResponse response;
        OASBillingInvoiceDownloadResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASBillingInvoiceDownloadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoiceDownloadResponse.getExample();
        response = (OASBillingInvoiceDownloadResponse) api.billingInvoiceDownloadGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoiceDownloadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoiceDownloadResponse.getExample();
        response = (OASBillingInvoiceDownloadResponse) api.billingInvoiceDownloadGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoiceDownloadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoiceDownloadResponse.getExample();
        response = (OASBillingInvoiceDownloadResponse) api.billingInvoiceDownloadGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoiceDownloadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoiceDownloadResponse.getExample();
        response = (OASBillingInvoiceDownloadResponse) api.billingInvoiceDownloadGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoiceDownloadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoiceDownloadResponse.getExample();
        response = (OASBillingInvoiceDownloadResponse) api.billingInvoiceDownloadGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoiceDownloadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoiceDownloadResponse.getExample();
        response = (OASBillingInvoiceDownloadResponse) api.billingInvoiceDownloadGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoiceDownloadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoiceDownloadResponse.getExample();
        response = (OASBillingInvoiceDownloadResponse) api.billingInvoiceDownloadGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get billing invoices
     *
     * Get billing invoices in the advertiser account.
     */
    @isTest
    private static void billingInvoicesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => '',
            'r_sort' => '',
            'status' => '',
            'documentType' => '',
            'startDueDate' => Date.newInstance(1960, 2, 17),
            'endDueDate' => Date.newInstance(1960, 2, 17)
        };

        OASClient client;
        OASBillingApi api;
        OASBillingInvoicesGet200Response response;
        OASBillingInvoicesGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASBillingInvoicesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoicesGet200Response.getExample();
        response = (OASBillingInvoicesGet200Response) api.billingInvoicesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoicesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoicesGet200Response.getExample();
        response = (OASBillingInvoicesGet200Response) api.billingInvoicesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoicesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoicesGet200Response.getExample();
        response = (OASBillingInvoicesGet200Response) api.billingInvoicesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoicesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoicesGet200Response.getExample();
        response = (OASBillingInvoicesGet200Response) api.billingInvoicesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoicesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoicesGet200Response.getExample();
        response = (OASBillingInvoicesGet200Response) api.billingInvoicesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoicesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoicesGet200Response.getExample();
        response = (OASBillingInvoicesGet200Response) api.billingInvoicesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBillingInvoicesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBillingInvoicesGet200Response.getExample();
        response = (OASBillingInvoicesGet200Response) api.billingInvoicesGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.\n\n**This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     */
    @isTest
    private static void billingProfilesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'isActive' => '',
            'adAccountId' => 'null',
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
     *   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.\n  - The token\&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
        OASSSIOAccount response;
        OASSSIOAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSSIOAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccount.getExample();
        response = (OASSSIOAccount) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccount.getExample();
        response = (OASSSIOAccount) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccount.getExample();
        response = (OASSSIOAccount) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccount.getExample();
        response = (OASSSIOAccount) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccount.getExample();
        response = (OASSSIOAccount) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccount.getExample();
        response = (OASSSIOAccount) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOAccount.getExample();
        response = (OASSSIOAccount) api.ssioAccountsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create insertion order through SSIO.
     *
     *   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.\n  - The token\&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioInsertionOrderCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSSSIOInsertionOrderCreate' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASSSIOInsertionOrder response;
        OASSSIOInsertionOrder expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Edit insertion order through SSIO.
     *
     *   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.\n  - The token\&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioInsertionOrderEditTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSSSIOInsertionOrderUpdate' => ''
        };

        OASClient client;
        OASBillingApi api;
        OASSSIOInsertionOrder response;
        OASSSIOInsertionOrder expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBillingApi(client);

        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSSIOInsertionOrder.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSSIOInsertionOrder.getExample();
        response = (OASSSIOInsertionOrder) api.ssioInsertionOrderEdit(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get insertion order status by ad account id.
     *
     *   Get insertion order status for &#x60;ad_account_id&#x60;.\n  - The token\&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
     *   Get insertion order status for &#x60;pin_order_id&#x60;.\n  - The token\&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioInsertionOrdersStatusGetByPinOrderIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'pinOrderId' => 'null'
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
     *   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.\n  - The token\&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @isTest
    private static void ssioOrderLinesGetByAdAccountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'pinOrderId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
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


        js = JSON.serialize(OASSsioOrderLinesGetByAdAccount200Re.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSsioOrderLinesGetByAdAccount200Re.getExample();
        response = (OASSsioOrderLinesGetByAdAccount200Re) api.ssioOrderLinesGetByAdAccount(params);
        System.assertEquals(expectedResponse, response);
    }
}