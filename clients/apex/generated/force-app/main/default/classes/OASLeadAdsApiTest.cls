@isTest
private class OASLeadAdsApiTest {
    /**
     * Delete lead ads subscription
     *
     * Delete an existing lead ads webhook subscription by ID.\n  - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\&#39;
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
     * Get lead ads subscription by ID
     *
     * Get an existing lead ads webhook subscription by ID.\n  - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\&#39;
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
        OASLeadSubscription response;
        OASLeadSubscription expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadAdsApi(client);

        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLeadAdsApi(client);

        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsGetById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get lead ads subscriptions
     *
     * Get the advertiser\&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
     */
    @isTest
    private static void adAccountsSubscriptionsGetListTest() {
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
     * Create a lead ads webhook subscription.\nSubscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.\n  - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\n  - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.\n  - For data security, egress lead data is encrypted with AES-256-GCM.
     */
    @isTest
    private static void adAccountsSubscriptionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLeadSubscriptionPostParamsCreate' => ''
        };

        OASClient client;
        OASLeadAdsApi api;
        OASLeadSubscription response;
        OASLeadSubscription expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLeadAdsApi(client);

        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLeadSubscription.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLeadSubscription.getExample();
        response = (OASLeadSubscription) api.adAccountsSubscriptionsPost(params);
        System.assertEquals(expectedResponse, response);
    }
}