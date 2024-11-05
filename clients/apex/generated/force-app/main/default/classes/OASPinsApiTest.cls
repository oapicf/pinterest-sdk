@isTest
private class OASPinsApiTest {
    /**
     * Get multiple Pin analytics
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;\n\nGet analytics for multiple pins owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\n- The maximum number of pins supported in a single request is 100.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&quot;/docs/api/v5/#operation/ad_accounts/list&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:\n\n- For Pins on public or protected boards: Admin, Analyst.\n- For Pins on secret boards: Admin.\n\nIf Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     */
    @isTest
    private static void multiPinsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinIds' => new List<String>{''},
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'metricTypes' => new List<OASPinsAnalyticsMetricTypesParameter>{OASPinsAnalyticsMetricTypesParameter.getExample()},
            'appTypes' => ALL,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPinsApi api;
        Map<String, Map> response;
        Map<String, Map> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, Map>) api.multiPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Pin analytics
     *
     * Get analytics for a Pin owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&quot;/docs/api/v5/#operation/ad_accounts/list&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:\n\n- For Pins on public or protected boards: Admin, Analyst.\n- For Pins on secret boards: Admin.\n\nIf Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     */
    @isTest
    private static void pinsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null',
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'metricTypes' => new List<OASPinsAnalyticsMetricTypesParameter>{OASPinsAnalyticsMetricTypesParameter.getExample()},
            'appTypes' => ALL,
            'splitField' => NO_SPLIT,
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPinsApi api;
        Map<String, OASPinAnalyticsMetricsResponse> response;
        Map<String, OASPinAnalyticsMetricsResponse> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(Map.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = Map.getExample();
        response = (Map<String, OASPinAnalyticsMetricsResponse>) api.pinsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create Pin
     *
     * Create a Pin on a board or board section owned by the &quot;operation user_account&quot;.\n\nNote: If the current &quot;operation user_account&quot; (defined by the access token) has access to another user\&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).\n\n- This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \&#39;curated content\&#39;, please use our &lt;a href&#x3D;\&#39;/docs/web-features/add-ons-overview/\&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;\&#39;/docs/api-features/content-overview/\&#39;&gt;Content App Solutions Guide&lt;/a&gt;.\n\n&lt;strong&gt;&lt;a href&#x3D;\&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins\&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @isTest
    private static void pinsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSPinCreate' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPinsApi api;
        OASPin response;
        OASPin expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete Pin
     *
     * Delete a Pins owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:\n\n- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.\n- For Pins on secret boards: Owner, Admin.
     */
    @isTest
    private static void pinsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPinsApi api;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.pinsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.pinsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.pinsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Pin
     *
     * Get a Pin owned by the &quot;operation user_account&quot; - or on a group board that has been shared with this account.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:\n\n- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.\n- For Pins on secret boards: Owner, Admin.
     */
    @isTest
    private static void pinsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null',
            'pinMetrics' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPinsApi api;
        OASPin response;
        OASPin expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List Pins
     *
     * Get a list of the Pins owned by the &quot;operation user_account&quot;.\n  - By default, the &quot;operation user_account&quot; is the token user_account.\n  - All Pins owned by the &quot;operation user_account&quot; are included, regardless of who owns the board they are on.\nOptional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the &quot;operation user_account&quot;.\n\nDisclaimer: there are known performance issues when filtering by field &lt;code&gt;creative_type&lt;/code&gt; and including protected pins. If your\nrequest is timing out in this scenario we encourage you to use &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/boards/list_pins\&#39;&gt;GET List Pins on Board&lt;/a&gt;.
     */
    @isTest
    private static void pinsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => '',
            'pinFilter' => exclude_native,
            'includeProtectedPins' => '',
            'pinType' => PRIVATE,
            'creativeTypes' => new List<String>{'REGULAR'},
            'adAccountId' => 'null',
            'pinMetrics' => ''
        };

        OASClient client;
        OASPinsApi api;
        OASPinsList200Response response;
        OASPinsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.pinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.pinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.pinsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.pinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.pinsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPinsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPinsList200Response.getExample();
        response = (OASPinsList200Response) api.pinsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Save Pin
     *
     * Save a Pin on a board or board section owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:\n\n- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.\n- For Pins on secret boards: Owner, Admin.\n\n- Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc.\n- Any public Pin can be saved given a pin ID.
     */
    @isTest
    private static void pinsSaveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null',
            'oaSPinsSaveRequest' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPinsApi api;
        OASPin response;
        OASPin expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsSave(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsSave(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsSave(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsSave(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update Pin
     *
     * Update a pin owned by the &quot;operating user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:\n\n- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.\n- For Pins on secret boards: Owner, Admin.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void pinsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'pinId' => 'null',
            'oaSPinUpdate' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPinsApi api;
        OASPin response;
        OASPin expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPinsApi(client);

        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPin.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPin.getExample();
        response = (OASPin) api.pinsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}