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
        OASAdAccountCountriesGet200Response response;
        OASAdAccountCountriesGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdAccountCountriesGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdAccountCountriesGet200Response.getExample();
        response = (OASAdAccountCountriesGet200Response) api.adAccountCountriesGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get available metrics\&#39; definitions
     *
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints.\nThe &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager.\nSee [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
     */
    @isTest
    private static void deliveryMetricsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'reportType' => ''
        };

        OASClient client;
        OASResourcesApi api;
        OASDeliveryMetricsGet200Response response;
        OASDeliveryMetricsGet200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeliveryMetricsGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeliveryMetricsGet200Response.getExample();
        response = (OASDeliveryMetricsGet200Response) api.deliveryMetricsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get interest details
     *
     * Get details of a specific interest given interest ID.\n\nClick [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.
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
        OASSingleInterestTargetingOption response;
        OASSingleInterestTargetingOption expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSingleInterestTargetingOption.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSingleInterestTargetingOption.getExample();
        response = (OASSingleInterestTargetingOption) api.interestTargetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get lead form questions
     *
     * Get a list of all lead form question type names. Some questions might not be used.\n\n**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
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


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.leadFormQuestionsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.leadFormQuestionsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.leadFormQuestionsGet();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.leadFormQuestionsGet();
        System.assertEquals(expectedResponse, response);


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
            'r_date' => 'null'
        };

        OASClient client;
        OASResourcesApi api;
        OASBookClosed response;
        OASBookClosed expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(OASBookClosed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosed.getExample();
        response = (OASBookClosed) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBookClosed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosed.getExample();
        response = (OASBookClosed) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBookClosed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosed.getExample();
        response = (OASBookClosed) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBookClosed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosed.getExample();
        response = (OASBookClosed) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBookClosed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosed.getExample();
        response = (OASBookClosed) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBookClosed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosed.getExample();
        response = (OASBookClosed) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBookClosed.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBookClosed.getExample();
        response = (OASBookClosed) api.metricsReadyStateGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get targeting options
     *
     *     You can use targeting values in ads placement to define your intended audience.\n\n    Targeting metrics are organized around targeting specifications.\n\n    For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).\n\n    **Sample return:**\n\n    &#x60;&#x60;&#x60;\n    [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}]\n    &#x60;&#x60;&#x60;
     */
    @isTest
    private static void targetingOptionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'targetingType' => '',
            'adAccountId' => 'null',
            'clientId' => 'null',
            'oauthSignature' => 'null',
            'timestamp' => 'null'
        };

        OASClient client;
        OASResourcesApi api;
        List<Object> response;
        List<Object> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASResourcesApi(client);

        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<Object>{Object.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<Object>{Object.getExample()};
        response = (List<Object>) api.targetingOptionsGet(params);
        System.assertEquals(expectedResponse, response);
    }
}