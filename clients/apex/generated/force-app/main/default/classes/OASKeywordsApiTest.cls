@isTest
private class OASKeywordsApiTest {
    /**
     * Get country\&#39;s keyword metrics
     *
     *   See keyword metrics for a specified country, aggregated across all of Pinterest.\n  (Definitions are available from the &quot;Get delivery metrics definitions&quot;\n  [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
     */
    @isTest
    private static void countryKeywordsMetricsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'countryCode' => 'null',
            'keywords' => new List<String>{''}
        };

        OASClient client;
        OASKeywordsApi api;
        OASKeywordsMetricsArrayResponse response;
        OASKeywordsMetricsArrayResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsMetricsArrayResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsMetricsArrayResponse.getExample();
        response = (OASKeywordsMetricsArrayResponse) api.countryKeywordsMetricsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create keywords
     *
     *   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).\n\n  **Notes:**\n  - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).\n  - All keyword match types are available for ad groups.\n\n  For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).\n\n  **Returns:**\n  - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.\n  - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:\n    &#x60;&#x60;&#x60;json\n    {\n      &quot;keywords&quot;: [],\n      &quot;errors&quot;: [\n        {\n          &quot;data&quot;: {\n            &quot;archived&quot;: null,\n            &quot;match_type&quot;: &quot;EXACT&quot;,\n            &quot;parent_type&quot;: null,\n            &quot;value&quot;: &quot;foobar&quot;,\n            &quot;parent_id&quot;: null,\n            &quot;type&quot;: &quot;keyword&quot;,\n            &quot;id&quot;: null\n          },\n          &quot;error_messages&quot;: [\n            &quot;Advertisers and Campaigns only accept excluded targeting attributes.&quot;\n          ]\n        }\n      ]\n    }
     */
    @isTest
    private static void keywordsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSKeywordsCreate' => ''
        };

        OASClient client;
        OASKeywordsApi api;
        OASKeywords response;
        OASKeywords expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get keywords
     *
     *     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.\n\n    For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).\n\n    **Notes:**\n    - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).\n    - All keyword match types are available for ad groups.\n\n    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).\n\n    **Returns:**\n    - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.\n    - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:\n      &#x60;&#x60;&#x60;json\n      {\n        &quot;keywords&quot;: [],\n        &quot;errors&quot;: [\n          {\n            &quot;data&quot;: {\n              &quot;archived&quot;: null,\n              &quot;match_type&quot;: &quot;EXACT&quot;,\n              &quot;parent_type&quot;: null,\n              &quot;value&quot;: &quot;foobar&quot;,\n              &quot;parent_id&quot;: null,\n              &quot;type&quot;: &quot;keyword&quot;,\n              &quot;id&quot;: null\n            },\n            &quot;error_messages&quot;: [\n              &quot;Advertisers and Campaigns only accept excluded targeting attributes.&quot;\n            ]\n          }\n        ]\n      }
     */
    @isTest
    private static void keywordsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignId' => 'null',
            'adGroupId' => 'null',
            'adGroupIds' => new List<String>{''},
            'matchTypes' => new List<OASMatchType>{OASMatchType.getExample()},
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASKeywordsApi api;
        OASKeywordsGet200Response response;
        OASKeywordsGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsGet200Response.getExample();
        response = (OASKeywordsGet200Response) api.keywordsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update keywords
     *
     *   Update one or more keywords\&#39; bid and archived fields. Archiving\n  a keyword effectively deletes it - keywords no longer receive metrics and\n  are no longer visible within the parent entity\&#39;s keywords list.
     */
    @isTest
    private static void keywordsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSKeywordsUpdate' => ''
        };

        OASClient client;
        OASKeywordsApi api;
        OASKeywords response;
        OASKeywords expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywords.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywords.getExample();
        response = (OASKeywords) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List trending keywords
     *
     * Get the top trending search keywords among the Pinterest user audience.\n\nTrending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.\n\nGeographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.\n\nFor an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
     */
    @isTest
    private static void trendingKeywordsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'region' => '',
            'trendType' => '',
            'interests' => new List<OASTrendsL1Interest>{OASTrendsL1Interest.getExample()},
            'genders' => new List<OASTrendsGenderFilter>{OASTrendsGenderFilter.getExample()},
            'ages' => new List<OASTrendsAgeBucket>{OASTrendsAgeBucket.getExample()},
            'includeKeywords' => new List<String>{''},
            'normalizeAgainstGroup' => '',
            'r_limit' => '',
            'includeDemographics' => ''
        };

        OASClient client;
        OASKeywordsApi api;
        OASTrendingKeywordsResponse response;
        OASTrendingKeywordsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASTrendingKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTrendingKeywordsResponse.getExample();
        response = (OASTrendingKeywordsResponse) api.trendingKeywordsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTrendingKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTrendingKeywordsResponse.getExample();
        response = (OASTrendingKeywordsResponse) api.trendingKeywordsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTrendingKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTrendingKeywordsResponse.getExample();
        response = (OASTrendingKeywordsResponse) api.trendingKeywordsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTrendingKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTrendingKeywordsResponse.getExample();
        response = (OASTrendingKeywordsResponse) api.trendingKeywordsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTrendingKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTrendingKeywordsResponse.getExample();
        response = (OASTrendingKeywordsResponse) api.trendingKeywordsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTrendingKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTrendingKeywordsResponse.getExample();
        response = (OASTrendingKeywordsResponse) api.trendingKeywordsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASTrendingKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTrendingKeywordsResponse.getExample();
        response = (OASTrendingKeywordsResponse) api.trendingKeywordsList(params);
        System.assertEquals(expectedResponse, response);
    }
}