@isTest
private class OASLeadAdsApiTest {
    /**
     * Delete lead ads subscription
     *
     * Delete an existing lead ads webhook subscription by ID.\n- Only requests for the OWNER or ADMIN of the ad_account will be allowed.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void adAccountsSubscriptionsDelByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'subscriptionId' => 'null'
        };

        OASClient client;
        OASLeadAdsApi api;
        String js = '';

        client = new OASClient();
        api = new OASLeadAdsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.adAccountsSubscriptionsDelById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.adAccountsSubscriptionsDelById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.adAccountsSubscriptionsDelById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.adAccountsSubscriptionsDelById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get lead ads subscription
     *
     * Get a specific lead ads subscription record.\n- Only requests for the OWNER or ADMIN of the ad_account will be allowed.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void adAccountsSubscriptionsGetByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'subscriptionId' => 'null'
        };

        OASClient client;
        OASLeadAdsApi api;
        OASAdAccountGetSubscriptionResponse response;
        OASAdAccountGetSubscriptionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadAdsApi(client);

        js = JSON.serialize(OASAdAccountGetSubscriptionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountGetSubscriptionResponse.getExample();
        response = (OASAdAccountGetSubscriptionResponse) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountGetSubscriptionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountGetSubscriptionResponse.getExample();
        response = (OASAdAccountGetSubscriptionResponse) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountGetSubscriptionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountGetSubscriptionResponse.getExample();
        response = (OASAdAccountGetSubscriptionResponse) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountGetSubscriptionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountGetSubscriptionResponse.getExample();
        response = (OASAdAccountGetSubscriptionResponse) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountGetSubscriptionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountGetSubscriptionResponse.getExample();
        response = (OASAdAccountGetSubscriptionResponse) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get lead ads subscriptions
     *
     * Get the advertiser\&#39;s list of lead ads subscriptions.\n- Only requests for the OWNER or ADMIN of the ad_account will be allowed.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void adAccountsSubscriptionsGetListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'pageSize' => '',
            'bookmark' => 'null'
        };

        OASClient client;
        OASLeadAdsApi api;
        OASAdAccountsSubscriptionsGetList200 response;
        OASAdAccountsSubscriptionsGetList200 expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadAdsApi(client);

        js = JSON.serialize(OASAdAccountsSubscriptionsGetList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsSubscriptionsGetList200.getExample();
        response = (OASAdAccountsSubscriptionsGetList200) api.adAccountsSubscriptionsGetList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsSubscriptionsGetList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsSubscriptionsGetList200.getExample();
        response = (OASAdAccountsSubscriptionsGetList200) api.adAccountsSubscriptionsGetList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsSubscriptionsGetList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsSubscriptionsGetList200.getExample();
        response = (OASAdAccountsSubscriptionsGetList200) api.adAccountsSubscriptionsGetList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create lead ads subscription
     *
     * Create a lead ads webhook subscription.\n- Only requests for the OWNER or ADMIN of the ad_account will be allowed.\n- Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void adAccountsSubscriptionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdAccountCreateSubscriptionReques' => ''
        };

        OASClient client;
        OASLeadAdsApi api;
        OASAdAccountCreateSubscriptionRespon response;
        OASAdAccountCreateSubscriptionRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadAdsApi(client);

        js = JSON.serialize(OASAdAccountCreateSubscriptionRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCreateSubscriptionRespon.getExample();
        response = (OASAdAccountCreateSubscriptionRespon) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCreateSubscriptionRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCreateSubscriptionRespon.getExample();
        response = (OASAdAccountCreateSubscriptionRespon) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCreateSubscriptionRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCreateSubscriptionRespon.getExample();
        response = (OASAdAccountCreateSubscriptionRespon) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCreateSubscriptionRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCreateSubscriptionRespon.getExample();
        response = (OASAdAccountCreateSubscriptionRespon) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);
    }
}