@isTest
private class OASBulkApiTest {
    /**
     * Get advertiser entities in bulk
     *
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads,\nkeywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused,\nonly active entities will return data.
     */
    @isTest
    private static void bulkDownloadCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSBulkDownloadCreate' => ''
        };

        OASClient client;
        OASBulkApi api;
        OASBulkDownload response;
        OASBulkDownload expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBulkApi(client);

        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkDownload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkDownload.getExample();
        response = (OASBulkDownload) api.bulkDownloadCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Download advertiser entities in bulk
     *
     * Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the\nnew or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
     */
    @isTest
    private static void bulkRequestGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bulkRequestId' => 'null',
            'includeDetails' => ''
        };

        OASClient client;
        OASBulkApi api;
        OASBulkJobData response;
        OASBulkJobData expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBulkApi(client);

        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBulkApi(client);

        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkJobData.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkJobData.getExample();
        response = (OASBulkJobData) api.bulkRequestGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create/update ad entities in bulk
     *
     * Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels.\nNote that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt;\nthat can be used to obtain the status of the request.
     */
    @isTest
    private static void bulkUpsertCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSBulkUpsertRequest' => ''
        };

        OASClient client;
        OASBulkApi api;
        OASBulkUpsertResponse response;
        OASBulkUpsertResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBulkApi(client);

        js = JSON.serialize(OASBulkUpsertResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkUpsertResponse.getExample();
        response = (OASBulkUpsertResponse) api.bulkUpsertCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASBulkUpsertResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBulkUpsertResponse.getExample();
        response = (OASBulkUpsertResponse) api.bulkUpsertCreate(params);
        System.assertEquals(expectedResponse, response);
    }
}