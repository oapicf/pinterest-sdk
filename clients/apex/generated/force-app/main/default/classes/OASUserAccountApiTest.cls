@isTest
private class OASUserAccountApiTest {
    /**
     * Get user account analytics
     *
     * Get analytics for the &quot;operation user_account&quot;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.
     */
    @isTest
    private static void userAccountAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'fromClaimedContent' => OTHER,
            'pinFormat' => ALL,
            'appTypes' => ALL,
            'metricTypes' => new List<String>{'ENGAGEMENT'},
            'splitField' => NO_SPLIT,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        Map<String, OASAnalyticsMetricsResponse> response;
        Map<String, OASAnalyticsMetricsResponse> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);
        api.userAccountAnalytics(params);
    }

    /**
     * Get user account
     *
     * Get account information for the &quot;operation user_account&quot;\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nIf using Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;. See &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-business-access\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     */
    @isTest
    private static void userAccountGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null'
        };

        OASClient client;
        OASUserAccountApi api;
        OASAccount response;
        OASAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUserAccountApi(client);

        js = JSON.serialize(OASAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAccount.getExample();
        response = (OASAccount) api.userAccountGet(params);
        System.assertEquals(expectedResponse, response);
    }
}