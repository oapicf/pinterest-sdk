@isTest
private class OASCustomerListUploadsApiTest {
    /**
     * Create customer list upload
     *
     * &lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;_blank&quot;&gt;Closed beta&lt;/a&gt;\n\n&lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt;\n&lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0.\nClients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt;\n&lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;&quot;/docs/api/v5/customer_lists-update/&quot; target&#x3D;&quot;_blank&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;
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
    }

    /**
     * Get customer list upload
     *
     * &lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;_blank&quot;&gt;Closed beta&lt;/a&gt;\n&lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;
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
        OASCustomerListUploadResponse response;
        OASCustomerListUploadResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListUploadsApi(client);

        js = JSON.serialize(OASCustomerListUploadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadResponse.getExample();
        response = (OASCustomerListUploadResponse) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadResponse.getExample();
        response = (OASCustomerListUploadResponse) api.customerListUploadsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Run customer list upload
     *
     * &lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;_blank&quot;&gt;Closed beta&lt;/a&gt;\n&lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;
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
        OASCustomerListUploadResponse response;
        OASCustomerListUploadResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListUploadsApi(client);

        js = JSON.serialize(OASCustomerListUploadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadResponse.getExample();
        response = (OASCustomerListUploadResponse) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListUploadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListUploadResponse.getExample();
        response = (OASCustomerListUploadResponse) api.customerListUploadsRun(params);
        System.assertEquals(expectedResponse, response);
    }
}