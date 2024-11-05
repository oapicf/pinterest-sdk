@isTest
private class OASKeywordsApiTest {
    /**
     * Get country\&#39;s keyword metrics
     *
     * See keyword metrics for a specified country, aggregated across all of Pinterest.\n(Definitions are available from the &quot;Get delivery metrics definitions&quot;\n&lt;a href&#x3D;&quot;/docs/api/v5/#operation/delivery_metrics/get&quot;&gt;API endpoint&lt;/a&gt;).
     */
    @isTest
    private static void countryKeywordsMetricsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'countryCode' => US,
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
    }

    /**
     * Create keywords
     *
     * &lt;p&gt;Create keywords for following entity types(advertiser, campaign, ad group or ad).&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;&quot;_blank&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/keyword-targeting&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt;\n&lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;&quot;list-style-type: square;&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (\&#39;_NEGATIVE\&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a  target&#x3D;&quot;_blank&quot; href&#x3D;&quot;/docs/api-features/targeting-overview/&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt;\n&lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;&quot;list-style-type: square;&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;&quot;last literal-block&quot;&gt; { &quot;keywords&quot;: [], &quot;errors&quot;: [ { &quot;data&quot;: { &quot;archived&quot;: null, &quot;match_type&quot;: &quot;EXACT&quot;, &quot;parent_type&quot;: null, &quot;value&quot;: &quot;foobar&quot;, &quot;parent_id&quot;: null, &quot;type&quot;: &quot;keyword&quot;, &quot;id&quot;: null }, &quot;error_messages&quot;: [ &quot;Advertisers and Campaigns only accept excluded targeting attributes.&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;\n&lt;p&gt;&lt;b&gt;Rate limit&lt;/b&gt;: &lt;a href&#x3D;&quot;/docs/reference/rate-limits/&quot;&gt;WRITE&lt;/a&gt;.&lt;/p&gt;
     */
    @isTest
    private static void keywordsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSKeywordsRequest' => ''
        };

        OASClient client;
        OASKeywordsApi api;
        OASKeywordsResponse response;
        OASKeywordsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsResponse.getExample();
        response = (OASKeywordsResponse) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsResponse.getExample();
        response = (OASKeywordsResponse) api.keywordsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get keywords
     *
     * &lt;p&gt;Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.&lt;/p&gt;\n&lt;p&gt;For more information, see &lt;a target&#x3D;&quot;_blank&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/keyword-targeting&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt;\n&lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;&quot;list-style-type: square;&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (\&#39;_NEGATIVE\&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a target&#x3D;&quot;_blank&quot; href&#x3D;&quot;/docs/api-features/targeting-overview/&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt;\n&lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;&quot;list-style-type: square;&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;&quot;last literal-block&quot;&gt; { &quot;keywords&quot;: [], &quot;errors&quot;: [ { &quot;data&quot;: { &quot;archived&quot;: null, &quot;match_type&quot;: &quot;EXACT&quot;, &quot;parent_type&quot;: null, &quot;value&quot;: &quot;foobar&quot;, &quot;parent_id&quot;: null, &quot;type&quot;: &quot;keyword&quot;, &quot;id&quot;: null }, &quot;error_messages&quot;: [ &quot;Advertisers and Campaigns only accept excluded targeting attributes.&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;
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
            'adGroupId' => 123123123,
            'matchTypes' => new List<OASMatchType>{OASMatchType.getExample()},
            'pageSize' => '',
            'bookmark' => 'null'
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
    }

    /**
     * Update keywords
     *
     * &lt;p&gt;Update one or more keywords\&#39; bid and archived fields.&lt;/p&gt; &lt;p&gt;Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\&#39;s keywords list.&lt;/p&gt;
     */
    @isTest
    private static void keywordsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSKeywordUpdateBody' => ''
        };

        OASClient client;
        OASKeywordsApi api;
        OASKeywordsResponse response;
        OASKeywordsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASKeywordsApi(client);

        js = JSON.serialize(OASKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsResponse.getExample();
        response = (OASKeywordsResponse) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASKeywordsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASKeywordsResponse.getExample();
        response = (OASKeywordsResponse) api.keywordsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List trending keywords
     *
     * &lt;p&gt;Get the top trending search keywords among the Pinterest user audience.&lt;/p&gt; &lt;p&gt;Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.&lt;/p&gt; &lt;p&gt;Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.&lt;/p&gt; &lt;p&gt;For an interactive way to explore this data, please visit &lt;a href&#x3D;&quot;https://trends.pinterest.com&quot;&gt;trends.pinterest.com&lt;/a&gt;.\n
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
            'interests' => ["beauty","womens_fashion"],
            'genders' => ["female","unknown"],
            'ages' => ["35-44","50-54"],
            'includeKeywords' => ["recipes","dessert"],
            'normalizeAgainstGroup' => true,
            'r_limit' => 25
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
    }
}