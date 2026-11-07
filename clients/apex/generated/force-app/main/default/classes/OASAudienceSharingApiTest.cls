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
            'audienceId' => 'null',
            'accountType' => '',
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
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
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     */
    @isTest
    private static void businessAccountAudiencesSharedAccountsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'audienceId' => 'null',
            'accountType' => '',
            'bookmark' => 'null',
            'pageSize' => ''
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
            'businessId' => 'null',
            'order' => '',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASSharedAudiencesForBusinessList200 response;
        OASSharedAudiencesForBusinessList200 expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASSharedAudiencesForBusinessList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudiencesForBusinessList200.getExample();
        response = (OASSharedAudiencesForBusinessList200) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudiencesForBusinessList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudiencesForBusinessList200.getExample();
        response = (OASSharedAudiencesForBusinessList200) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudiencesForBusinessList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudiencesForBusinessList200.getExample();
        response = (OASSharedAudiencesForBusinessList200) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudiencesForBusinessList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudiencesForBusinessList200.getExample();
        response = (OASSharedAudiencesForBusinessList200) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudiencesForBusinessList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudiencesForBusinessList200.getExample();
        response = (OASSharedAudiencesForBusinessList200) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudiencesForBusinessList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudiencesForBusinessList200.getExample();
        response = (OASSharedAudiencesForBusinessList200) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSharedAudiencesForBusinessList200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSharedAudiencesForBusinessList200.getExample();
        response = (OASSharedAudiencesForBusinessList200) api.sharedAudiencesForBusinessList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing between ad accounts
     *
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.\n\nThis endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @isTest
    private static void updateAdAccountToAdAccountSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdAccountToAdAccountSharedAudienc' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASAdAccountToAdAccountSharedAudienc response;
        OASAdAccountToAdAccountSharedAudienc expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASAdAccountToAdAccountSharedAudienc.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToAdAccountSharedAudienc.getExample();
        response = (OASAdAccountToAdAccountSharedAudienc) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToAdAccountSharedAudienc.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToAdAccountSharedAudienc.getExample();
        response = (OASAdAccountToAdAccountSharedAudienc) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToAdAccountSharedAudienc.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToAdAccountSharedAudienc.getExample();
        response = (OASAdAccountToAdAccountSharedAudienc) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToAdAccountSharedAudienc.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToAdAccountSharedAudienc.getExample();
        response = (OASAdAccountToAdAccountSharedAudienc) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToAdAccountSharedAudienc.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToAdAccountSharedAudienc.getExample();
        response = (OASAdAccountToAdAccountSharedAudienc) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToAdAccountSharedAudienc.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToAdAccountSharedAudienc.getExample();
        response = (OASAdAccountToAdAccountSharedAudienc) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToAdAccountSharedAudienc.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToAdAccountSharedAudienc.getExample();
        response = (OASAdAccountToAdAccountSharedAudienc) api.updateAdAccountToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing from an ad account to businesses
     *
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.\n\nThis endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @isTest
    private static void updateAdAccountToBusinessSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdAccountToBusinessSharedAudience' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASAdAccountToBusinessSharedAudience response;
        OASAdAccountToBusinessSharedAudience expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASAdAccountToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToBusinessSharedAudience.getExample();
        response = (OASAdAccountToBusinessSharedAudience) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToBusinessSharedAudience.getExample();
        response = (OASAdAccountToBusinessSharedAudience) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToBusinessSharedAudience.getExample();
        response = (OASAdAccountToBusinessSharedAudience) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToBusinessSharedAudience.getExample();
        response = (OASAdAccountToBusinessSharedAudience) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToBusinessSharedAudience.getExample();
        response = (OASAdAccountToBusinessSharedAudience) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToBusinessSharedAudience.getExample();
        response = (OASAdAccountToBusinessSharedAudience) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountToBusinessSharedAudience.getExample();
        response = (OASAdAccountToBusinessSharedAudience) api.updateAdAccountToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing from a business to ad accounts
     *
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.\n\n- If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.\n- If the business is the recipient of the audience, it can share with any of its owned ad accounts.\n\nThis endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @isTest
    private static void updateBusinessToAdAccountSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSBusinessToAdAccountSharedAudience' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASBusinessToAdAccountSharedAudience response;
        OASBusinessToAdAccountSharedAudience expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASBusinessToAdAccountSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToAdAccountSharedAudience.getExample();
        response = (OASBusinessToAdAccountSharedAudience) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToAdAccountSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToAdAccountSharedAudience.getExample();
        response = (OASBusinessToAdAccountSharedAudience) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToAdAccountSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToAdAccountSharedAudience.getExample();
        response = (OASBusinessToAdAccountSharedAudience) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToAdAccountSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToAdAccountSharedAudience.getExample();
        response = (OASBusinessToAdAccountSharedAudience) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToAdAccountSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToAdAccountSharedAudience.getExample();
        response = (OASBusinessToAdAccountSharedAudience) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToAdAccountSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToAdAccountSharedAudience.getExample();
        response = (OASBusinessToAdAccountSharedAudience) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToAdAccountSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToAdAccountSharedAudience.getExample();
        response = (OASBusinessToAdAccountSharedAudience) api.updateBusinessToAdAccountSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience sharing between businesses
     *
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.\n\nThis endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     */
    @isTest
    private static void updateBusinessToBusinessSharedAudienceTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 'null',
            'oaSBusinessToBusinessSharedAudienceU' => ''
        };

        OASClient client;
        OASAudienceSharingApi api;
        OASBusinessToBusinessSharedAudience response;
        OASBusinessToBusinessSharedAudience expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudienceSharingApi(client);

        js = JSON.serialize(OASBusinessToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToBusinessSharedAudience.getExample();
        response = (OASBusinessToBusinessSharedAudience) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToBusinessSharedAudience.getExample();
        response = (OASBusinessToBusinessSharedAudience) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToBusinessSharedAudience.getExample();
        response = (OASBusinessToBusinessSharedAudience) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToBusinessSharedAudience.getExample();
        response = (OASBusinessToBusinessSharedAudience) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToBusinessSharedAudience.getExample();
        response = (OASBusinessToBusinessSharedAudience) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToBusinessSharedAudience.getExample();
        response = (OASBusinessToBusinessSharedAudience) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBusinessToBusinessSharedAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBusinessToBusinessSharedAudience.getExample();
        response = (OASBusinessToBusinessSharedAudience) api.updateBusinessToBusinessSharedAudience(params);
        System.assertEquals(expectedResponse, response);
    }
}