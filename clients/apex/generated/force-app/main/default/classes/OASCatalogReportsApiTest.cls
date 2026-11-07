@isTest
private class OASCatalogReportsApiTest {
    /**
     * Build catalogs report
     *
     * Async request to create a report of the catalog owned by the &quot;operation user_account&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.\n\nNote: The All Items report is limited to 25 million items per catalog.
     */
    @isTest
    private static void reportsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCatalogsReportParameters' => '',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogReportsApi api;
        OASCatalogsCreateReportResponse response;
        OASCatalogsCreateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogReportsApi(client);

        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsCreateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsCreateReportResponse.getExample();
        response = (OASCatalogsCreateReportResponse) api.reportsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get catalogs report
     *
     * This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @isTest
    private static void reportsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'token' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASCatalogReportsApi api;
        OASCatalogsReport response;
        OASCatalogsReport expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogReportsApi(client);

        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCatalogsReport.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCatalogsReport.getExample();
        response = (OASCatalogsReport) api.reportsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List report stats
     *
     * List aggregated numbers of issues for a catalog owned by the &quot;operation user_account&quot;.\n- By default, the &quot;operation user_account&quot; is the token user_account.\n\nOptional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the &quot;operation user_account&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @isTest
    private static void reportsStatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'parameters' => ,
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASCatalogReportsApi api;
        OASReportsStats200Response response;
        OASReportsStats200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCatalogReportsApi(client);

        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASReportsStats200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASReportsStats200Response.getExample();
        response = (OASReportsStats200Response) api.reportsStats(params);
        System.assertEquals(expectedResponse, response);
    }
}