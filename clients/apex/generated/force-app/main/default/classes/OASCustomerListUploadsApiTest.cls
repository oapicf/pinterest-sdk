@isTest
private class OASCustomerListUploadsApiTest {
    /**
     * Create customer list upload
     *
     * Create a customer list upload request for multipart S3 upload.\n\nNote: Each part must be at least 5mb; however the last part can be any size greater than 0.\nClients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.\n\n**Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
     */
    @isTest
    private static void customerListUploadsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'customerListId' => 'null',
            'oaSCustomerListUploadCreateRequest' => ''
        };

        OASClient client;
        OASCustomerListUploadsApi api;
        OASCustomerListUploadCreateResponse response;
        OASCustomerListUploadCreateResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListUploadsApi(client);

        js = JSON.serialize(OASCustomerListUploadCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadCreateResponse.getExample();
        response = (OASCustomerListUploadCreateResponse) api.customerListUploadsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadCreateResponse.getExample();
        response = (OASCustomerListUploadCreateResponse) api.customerListUploadsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadCreateResponse.getExample();
        response = (OASCustomerListUploadCreateResponse) api.customerListUploadsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadCreateResponse.getExample();
        response = (OASCustomerListUploadCreateResponse) api.customerListUploadsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadCreateResponse.getExample();
        response = (OASCustomerListUploadCreateResponse) api.customerListUploadsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadCreateResponse.getExample();
        response = (OASCustomerListUploadCreateResponse) api.customerListUploadsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadCreateResponse.getExample();
        response = (OASCustomerListUploadCreateResponse) api.customerListUploadsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get customer list upload
     *
     * Get the metadata for a given upload by its ID.
     */
    @isTest
    private static void customerListUploadsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'customerListId' => 'null',
            'customerListUploadId' => 'null'
        };

        OASClient client;
        OASCustomerListUploadsApi api;
        OASCustomerListUpload response;
        OASCustomerListUpload expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListUploadsApi(client);

        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Run customer list upload
     *
     * Begin processing a customer list upload.
     */
    @isTest
    private static void customerListUploadsRunTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'customerListId' => 'null',
            'customerListUploadId' => 'null'
        };

        OASClient client;
        OASCustomerListUploadsApi api;
        OASCustomerListUpload response;
        OASCustomerListUpload expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListUploadsApi(client);

        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUpload.getExample();
        response = (OASCustomerListUpload) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);
    }
}