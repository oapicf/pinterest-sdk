@isTest
private class OASMediaApiTest {
    /**
     * Register media upload
     *
     * Register your intent to upload media\n\nThe response includes all of the information needed to upload the media\nto Pinterest.\n\nTo upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for\nexample) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header\nvalue. Send the media file\&#39;s contents as the request\&#39;s &lt;tt&gt;file&lt;/tt&gt;\nparameter and also include all of the parameters from\n&lt;tt&gt;upload_parameters&lt;/tt&gt;.\n\n&lt;strong&gt;&lt;a href&#x3D;\&#39;/docs/content/content-creation/#Creating%20video%20Pins\&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @isTest
    private static void mediaCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSMediaUploadRequest' => ''
        };

        OASClient client;
        OASMediaApi api;
        OASMediaUpload response;
        OASMediaUpload expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMediaApi(client);

        js = JSON.serialize(OASMediaUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaUpload.getExample();
        response = (OASMediaUpload) api.mediaCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMediaUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaUpload.getExample();
        response = (OASMediaUpload) api.mediaCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get media upload details
     *
     * Get details for a registered media upload, including its current status.\n\n&lt;strong&gt;&lt;a href&#x3D;\&#39;/docs/content/content-creation/#Creating%20video%20Pins\&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @isTest
    private static void mediaGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'mediaId' => 'null'
        };

        OASClient client;
        OASMediaApi api;
        OASMediaUploadDetails response;
        OASMediaUploadDetails expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMediaApi(client);

        js = JSON.serialize(OASMediaUploadDetails.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaUploadDetails.getExample();
        response = (OASMediaUploadDetails) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMediaUploadDetails.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaUploadDetails.getExample();
        response = (OASMediaUploadDetails) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMediaUploadDetails.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaUploadDetails.getExample();
        response = (OASMediaUploadDetails) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List media uploads
     *
     * List media uploads filtered by given parameters.\n\n&lt;strong&gt;&lt;a href&#x3D;\&#39;/docs/content/content-creation/#Creating%20video%20Pins\&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @isTest
    private static void mediaListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'bookmark' => 'null',
            'pageSize' => ''
        };

        OASClient client;
        OASMediaApi api;
        OASMediaList200Response response;
        OASMediaList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMediaApi(client);

        js = JSON.serialize(OASMediaList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaList200Response.getExample();
        response = (OASMediaList200Response) api.mediaList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMediaList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaList200Response.getExample();
        response = (OASMediaList200Response) api.mediaList(params);
        System.assertEquals(expectedResponse, response);
    }
}