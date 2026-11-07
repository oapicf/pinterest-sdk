@isTest
private class OASAdsApiTest {
    /**
     * Create ad preview with pin or image
     *
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.\n\nIf you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)\n\nYou can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
     */
    @isTest
    private static void adPreviewsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdPreviewRequest' => ''
        };

        OASClient client;
        OASAdsApi api;
        OASAdPreviewURLResponse response;
        OASAdPreviewURLResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdPreviewURLResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdPreviewURLResponse.getExample();
        response = (OASAdPreviewURLResponse) api.adPreviewsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get targeting analytics for ads
     *
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. &quot;age_bucket&quot;) for applicable values (e.g. &quot;45-49&quot;).\n\n* The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.\n* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @isTest
    private static void adTargetingAnalyticsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'adIds' => new List<String>{''},
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'targetingTypes' => new List<OASAdsAnalyticsAdTargetingType>{OASAdsAnalyticsAdTargetingType.getExample()},
            'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
            'granularity' => '',
            'clickWindowDays' => '',
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => '',
            'attributionTypes' => new List<OASConversionReportAttributionType>{OASConversionReportAttributionType.getExample()},
            'reportingTimezone' => '',
            'sortColumns' => new List<String>{''},
            'sortAscending' => ''
        };

        OASClient client;
        OASAdsApi api;
        OASMetricsResponse response;
        OASMetricsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMetricsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMetricsResponse.getExample();
        response = (OASMetricsResponse) api.adTargetingAnalyticsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ad analytics
     *
     *     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.\n    - The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.\n    - The request must contain either ad_ids or both campaign_ids and pin_ids.\n    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.\n    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @isTest
    private static void adsAnalyticsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => Date.newInstance(1960, 2, 17),
            'endDate' => Date.newInstance(1960, 2, 17),
            'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
            'granularity' => '',
            'adAccountId' => 'null',
            'pinIds' => new List<String>{''},
            'adIds' => new List<String>{''},
            'clickWindowDays' => '',
            'engagementWindowDays' => '',
            'viewWindowDays' => '',
            'conversionReportTime' => TIME_OF_AD_ACTION,
            'campaignIds' => new List<String>{''},
            'reportingTimezone' => ''
        };

        OASClient client;
        OASAdsApi api;
        List<OASAdsAnalytics> response;
        List<OASAdsAnalytics> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAdsAnalytics>{OASAdsAnalytics.getExample()};
        response = (List<OASAdsAnalytics>) api.adsAnalytics(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create ads
     *
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     */
    @isTest
    private static void adsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdCreate' => new List<OASAdCreate>{OASAdCreate.getExample()}
        };

        OASClient client;
        OASAdsApi api;
        OASAdBatchWriteResponseModel response;
        OASAdBatchWriteResponseModel expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will\ncontain additional information from the Ad Review process.\nFor more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
     */
    @isTest
    private static void adsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdsApi api;
        OASAd response;
        OASAd expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAd.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAd.getExample();
        response = (OASAd) api.adsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List ads
     *
     * List ads that meet the filters provided:\n    - Listed campaign ids or ad group ids or ad ids\n    - Listed entity statuses\n\nIf no filter is provided, all ads in the ad account are returned.\n\n**Note:**\nProvide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.\n\nReview status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.\n\nFor more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
     */
    @isTest
    private static void adsListTest() {
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
            'adGroupIds' => new List<String>{''},
            'adIds' => new List<String>{''},
            'entityStatuses' => new List<OASEntityStatus>{OASEntityStatus.getExample()}
        };

        OASClient client;
        OASAdsApi api;
        OASAdsList200Response response;
        OASAdsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdsList200Response.getExample();
        response = (OASAdsList200Response) api.adsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update ads
     *
     * Update multiple existing ads
     */
    @isTest
    private static void adsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAdBatchUpdate' => new List<OASAdBatchUpdate>{OASAdBatchUpdate.getExample()}
        };

        OASClient client;
        OASAdsApi api;
        OASAdBatchWriteResponseModel response;
        OASAdBatchWriteResponseModel expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAdBatchWriteResponseModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdBatchWriteResponseModel.getExample();
        response = (OASAdBatchWriteResponseModel) api.adsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create ad preview records for one or more ad groups
     *
     * Create ad preview records for one or more ad groups that can be shared.\nEach ad group is processed independently; individual failures do not block other previews.
     */
    @isTest
    private static void campaignAdPreviewCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCampaignAdPreviewCreate' => new List<OASCampaignAdPreviewCreate>{OASCampaignAdPreviewCreate.getExample()}
        };

        OASClient client;
        OASAdsApi api;
        List<OASCampaignAdPreviewCreate200Respons> response;
        List<OASCampaignAdPreviewCreate200Respons> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewCreate200Respons>{OASCampaignAdPreviewCreate200Respons.getExample()};
        response = (List<OASCampaignAdPreviewCreate200Respons>) api.campaignAdPreviewCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete ad preview records for one or more ad groups
     *
     * Delete ad preview records for one or more ad groups.\nAll ad groups are validated before deleting any records.
     */
    @isTest
    private static void campaignAdPreviewDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adGroupIds' => new List<String>{''},
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdsApi api;
        List<OASCampaignAdPreviewDelete200Respons> response;
        List<OASCampaignAdPreviewDelete200Respons> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()};
        response = (List<OASCampaignAdPreviewDelete200Respons>) api.campaignAdPreviewDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()};
        response = (List<OASCampaignAdPreviewDelete200Respons>) api.campaignAdPreviewDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()};
        response = (List<OASCampaignAdPreviewDelete200Respons>) api.campaignAdPreviewDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()};
        response = (List<OASCampaignAdPreviewDelete200Respons>) api.campaignAdPreviewDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()};
        response = (List<OASCampaignAdPreviewDelete200Respons>) api.campaignAdPreviewDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()};
        response = (List<OASCampaignAdPreviewDelete200Respons>) api.campaignAdPreviewDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreviewDelete200Respons>{OASCampaignAdPreviewDelete200Respons.getExample()};
        response = (List<OASCampaignAdPreviewDelete200Respons>) api.campaignAdPreviewDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Fetch ad preview records for one or more ad groups
     *
     * Fetch ad preview records for one or more ad groups.\nReturns all active previews associated with the provided ad group IDs.
     */
    @isTest
    private static void campaignAdPreviewReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adGroupIds' => new List<String>{''},
            'adAccountId' => 'null'
        };

        OASClient client;
        OASAdsApi api;
        List<OASCampaignAdPreview> response;
        List<OASCampaignAdPreview> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAdsApi(client);

        js = JSON.serialize(new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()};
        response = (List<OASCampaignAdPreview>) api.campaignAdPreviewRead(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()};
        response = (List<OASCampaignAdPreview>) api.campaignAdPreviewRead(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()};
        response = (List<OASCampaignAdPreview>) api.campaignAdPreviewRead(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()};
        response = (List<OASCampaignAdPreview>) api.campaignAdPreviewRead(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()};
        response = (List<OASCampaignAdPreview>) api.campaignAdPreviewRead(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()};
        response = (List<OASCampaignAdPreview>) api.campaignAdPreviewRead(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCampaignAdPreview>{OASCampaignAdPreview.getExample()};
        response = (List<OASCampaignAdPreview>) api.campaignAdPreviewRead(params);
        System.assertEquals(expectedResponse, response);
    }
}