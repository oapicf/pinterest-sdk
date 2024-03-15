@isTest
private class OASResourcesApiTest {
    /**
     * Get ad accounts countries
     *
     * Get Ad Accounts countries
     */
    @isTest
    private static void adAccountCountriesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASResourcesApi api;
        OASAdAccountsCountryResponse response;
        OASAdAccountsCountryResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASAdAccountsCountryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsCountryResponse.getExample();
        response = (OASAdAccountsCountryResponse) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountsCountryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountsCountryResponse.getExample();
        response = (OASAdAccountsCountryResponse) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get available metrics\&#39; definitions
     *
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints.\nThe &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager.\nSee &lt;a href&#x3D;\&#39;/docs/content/analytics/\&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;\&#39;/docs/ads/ad-analytics-reporting/\&#39;&gt;Ads Analytics&lt;/a&gt; for more information.
     */
    @isTest
    private static void deliveryMetricsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'reportType' => SYNC
        };

        OASClient client;
        OASResourcesApi api;
        OASDeliveryMetricsResponse response;
        OASDeliveryMetricsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASDeliveryMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsResponse.getExample();
        response = (OASDeliveryMetricsResponse) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsResponse.getExample();
        response = (OASDeliveryMetricsResponse) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get interest details
     *
     * &lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875&quot; target&#x3D;&quot;_blank&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;
     */
    @isTest
    private static void interestTargetingOptionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'interestId' => 'null'
        };

        OASClient client;
        OASResourcesApi api;
        OASSingleInterestTargetingOptionResp response;
        OASSingleInterestTargetingOptionResp expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASSingleInterestTargetingOptionResp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOptionResp.getExample();
        response = (OASSingleInterestTargetingOptionResp) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOptionResp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOptionResp.getExample();
        response = (OASSingleInterestTargetingOptionResp) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get lead form questions
     *
     * Get a list of all lead form question type names. Some questions might not be used.\n\n&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/new/about-beta-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @isTest
    private static void leadFormQuestionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASResourcesApi api;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.leadFormQuestionsGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get metrics ready state
     *
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     */
    @isTest
    private static void metricsReadyStateGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_date' => 2022-07-13
        };

        OASClient client;
        OASResourcesApi api;
        OASBookClosedResponse response;
        OASBookClosedResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASBookClosedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosedResponse.getExample();
        response = (OASBookClosedResponse) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBookClosedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosedResponse.getExample();
        response = (OASBookClosedResponse) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get targeting options
     *
     * &lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/audience-targeting&quot; target&#x3D;&quot;_blank&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt;\n&lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;&quot;literal-block&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;
     */
    @isTest
    private static void targetingOptionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'targetingType' => APPTYPE,
            'clientId' => 1094834,
            'oauthSignature' => 8209f,
            'timestamp' => 1618338184277
        };

        OASClient client;
        OASResourcesApi api;
        List<Object> response;
        List<Object> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);
    }
}