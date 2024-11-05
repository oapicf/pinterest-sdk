@isTest
private class OASAudienceSharingApiTest {
    /**
     * List accounts with access to an audience owned by an ad account
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     */
    @isTest
    private static void adAccountsAudiencesSharedAccountsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'audienceId' => 'null',
            'accountType' => '',
            'pageSize' => '',
            'bookmark' => 'null'
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASAdAccountsAudiencesSharedAccounts response;
        OASAdAccountsAudiencesSharedAccounts expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.adAccountsAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.adAccountsAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.adAccountsAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.adAccountsAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List accounts with access to an audience owned by a business
     *
     * List all ad accounts and/or businesses that have access to a specific audience.\nThe audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business.\nIf the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     */
    @isTest
    private static void businessAccountAudiencesSharedAccountsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'audienceId' => 'null',
            'accountType' => '',
            'pageSize' => '',
            'bookmark' => 'null'
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASAdAccountsAudiencesSharedAccounts response;
        OASAdAccountsAudiencesSharedAccounts expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.businessAccountAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.businessAccountAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.businessAccountAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsAudiencesSharedAccounts.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsAudiencesSharedAccounts.getExample();
        response = (OASAdAccountsAudiencesSharedAccounts) api.businessAccountAudiencesSharedAccountsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List received audiences for a business
     *
     * Get a list of received audiences for the given business.
     */
    @isTest
    private static void sharedAudiencesForBusinessListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'bookmark' => 'null',
            'order' => ASCENDING,
            'pageSize' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASAudiencesList200Response response;
        OASAudiencesList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASAudiencesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudiencesList200Response.getExample();
        response = (OASAudiencesList200Response) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudiencesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudiencesList200Response.getExample();
        response = (OASAudiencesList200Response) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudiencesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudiencesList200Response.getExample();
        response = (OASAudiencesList200Response) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing between ad accounts
     *
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;\&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts\&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.
     */
    @isTest
    private static void updateAdAccountToAdAccountSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSSharedAudience' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASSharedAudienceResponse response;
        OASSharedAudienceResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudienceResponse.getExample();
        response = (OASSharedAudienceResponse) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudienceResponse.getExample();
        response = (OASSharedAudienceResponse) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudienceResponse.getExample();
        response = (OASSharedAudienceResponse) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing from an ad account to businesses
     *
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.
     */
    @isTest
    private static void updateAdAccountToBusinessSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSBusinessSharedAudience' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASBusinessSharedAudienceResponse response;
        OASBusinessSharedAudienceResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASBusinessSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessSharedAudienceResponse.getExample();
        response = (OASBusinessSharedAudienceResponse) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessSharedAudienceResponse.getExample();
        response = (OASBusinessSharedAudienceResponse) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessSharedAudienceResponse.getExample();
        response = (OASBusinessSharedAudienceResponse) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing from a business to ad accounts
     *
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.
     */
    @isTest
    private static void updateBusinessToAdAccountSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSSharedAudience' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASSharedAudienceResponse response;
        OASSharedAudienceResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudienceResponse.getExample();
        response = (OASSharedAudienceResponse) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudienceResponse.getExample();
        response = (OASSharedAudienceResponse) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudienceResponse.getExample();
        response = (OASSharedAudienceResponse) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing between businesses
     *
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.
     */
    @isTest
    private static void updateBusinessToBusinessSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 729090764583391194,
            'oaSBusinessSharedAudience' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASBusinessSharedAudienceResponse response;
        OASBusinessSharedAudienceResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASBusinessSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessSharedAudienceResponse.getExample();
        response = (OASBusinessSharedAudienceResponse) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessSharedAudienceResponse.getExample();
        response = (OASBusinessSharedAudienceResponse) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessSharedAudienceResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessSharedAudienceResponse.getExample();
        response = (OASBusinessSharedAudienceResponse) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }
}