@isTest
private class OASCampaignsApiTest {
    /**
     * Get pins analytics
     *
     * Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.\n- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
     */
    @isTest
    private static void adPinsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 'null',
            'pinIds' => new List<String>{''},
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
            'granularity' => '',
            'adAccountId' => 'null',
            'clickWindowDays' => '',
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION
        };

        OASClient client;
        OASCampaignsApi api;
        List<OASAdPinAnalytics> response;
        List<OASAdPinAnalytics> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdPinAnalytics>{OASAdPinAnalytics.getExample()};
        response = (List<OASAdPinAnalytics>) api.adPinsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get targeting analytics for campaigns
     *
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. &quot;age_bucket&quot;) for applicable values (e.g. &quot;45-49&quot;).\n\n* The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.\n* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @isTest
    private static void campaignTargetingAnalyticsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignIds' => new List<String>{''},
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'targetingTypes' => new List<OASAdsAnalyticsCampaignTargetingType>{OASAdsAnalyticsCampaignTargetingType.getExample()},
            'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
            'granularity' => '',
            'clickWindowDays' => '',
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'attributionTypes' => new List<OASConversionReportAttributionType>{OASConversionReportAttributionType.getExample()},
            'reportingTimezone' => ''
        };

        OASClient client;
        OASCampaignsApi api;
        OASMetricsResponse response;
        OASMetricsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.campaignTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.\n- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @isTest
    private static void campaignsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'campaignIds' => new List<String>{''},
            'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
            'granularity' => '',
            'adAccountId' => 'null',
            'clickWindowDays' => '',
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'aggregateReportRows' => '',
            'reportingTimezone' => ''
        };

        OASClient client;
        OASCampaignsApi api;
        List<OASCampaignsAnalyticsMetrics> response;
        List<OASCampaignsAnalyticsMetrics> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignsAnalyticsMetrics>{OASCampaignsAnalyticsMetrics.getExample()};
        response = (List<OASCampaignsAnalyticsMetrics>) api.campaignsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create campaigns
     *
     * Create multiple new campaigns. Every campaign has its own campaign_id\nand houses one or more ad groups, which contain one or more ads.\n\nFor more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).\n\n**Note:**\n- The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser\&#39;s profile (e.g. USD).\n\nMicrocurrency is used to track very small transactions, based on the currency set in the advertiser\&#39;s profile.\n\nA microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\&#39;s profile.\n\n**Equivalency equations**, using dollars as an example currency:\n\n- $1 &#x3D; 1,000,000 microdollars\n- 1 microdollar &#x3D; $0.000001\n\n**To convert between currency and microcurrency**, using dollars as an example currency:\n\n- To convert dollars to microdollars, multiply dollars by 1,000,000\n- To convert microdollars to dollars, divide microdollars by 1,000,000
     */
    @isTest
    private static void campaignsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCampaignCreateItem' => new List<OASCampaignCreateItem>{OASCampaignCreateItem.getExample()}
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignBatchWriteResponseModel response;
        OASCampaignBatchWriteResponseModel expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get campaign
     *
     * Get a specific campaign given the campaign ID.
     */
    @isTest
    private static void campaignsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaign response;
        OASCampaign expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaign.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaign.getExample();
        response = (OASCampaign) api.campaignsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List campaigns
     *
     * Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary\nroles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
     */
    @isTest
    private static void campaignsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => '',
            'campaignIds' => new List<String>{''},
            'entityStatuses' => new List<OASEntityStatus>{OASEntityStatus.getExample()}
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignsList200Response response;
        OASCampaignsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignsList200Response.getExample();
        response = (OASCampaignsList200Response) api.campaignsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update campaigns
     *
     * Update multiple ad campaigns based on campaign_ids.\n\n**Note:**\n- The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser\&#39;s profile (e.g. USD).\n\nMicrocurrency is used to track very small transactions, based on the currency set in the advertiser\&#39;s profile.\n\nA microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\&#39;s profile.\n\n**Equivalency equations**, using dollars as an example currency:\n\n- $1 &#x3D; 1,000,000 microdollars\n- 1 microdollar &#x3D; $0.000001\n\n**To convert between currency and microcurrency**, using dollars as an example currency:\n\n- To convert dollars to microdollars, multiply dollars by 1,000,000\n- To convert microdollars to dollars, divide microdollars by 1,000,000
     */
    @isTest
    private static void campaignsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCampaignBatchUpdateItem' => new List<OASCampaignBatchUpdateItem>{OASCampaignBatchUpdateItem.getExample()}
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignBatchWriteResponseModel response;
        OASCampaignBatchWriteResponseModel expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignBatchWriteResponseModel.getExample();
        response = (OASCampaignBatchWriteResponseModel) api.campaignsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get campaign delivery estimates
     *
     * Get delivery estimates for an ads campaign\n\n**This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
     */
    @isTest
    private static void getCampaignDeliveryEstimatesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCampaignDeliveryEstimatesCampaign' => new List<OASCampaignDeliveryEstimatesCampaign>{OASCampaignDeliveryEstimatesCampaign.getExample()}
        };

        OASClient client;
        OASCampaignsApi api;
        OASCampaignDeliveryEstimatesResponse response;
        OASCampaignDeliveryEstimatesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCampaignsApi(client);

        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCampaignDeliveryEstimatesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCampaignDeliveryEstimatesResponse.getExample();
        response = (OASCampaignDeliveryEstimatesResponse) api.getCampaignDeliveryEstimates(params);
        System.assertEquals(expectedResponse, response);
    }
}