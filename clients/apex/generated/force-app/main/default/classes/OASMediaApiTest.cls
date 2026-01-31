@isTest
private class OASMediaApiTest {
    /**
     * Register media upload
     *
     * Register your intent to upload media.\n\nThe response includes all of the information needed to upload the media to Pinterest.\n\nTo upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file\&#39;s contents as the request\&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.\n\n**[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     */
    @isTest
    private static void mediaCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSMediaUploadCreate' => ''
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
     * Get details for a registered media upload, including its current status.\n\n**[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
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
        OASMedia response;
        OASMedia expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMediaApi(client);

        js = JSON.serialize(OASMedia.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMedia.getExample();
        response = (OASMedia) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMedia.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMedia.getExample();
        response = (OASMedia) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMedia.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMedia.getExample();
        response = (OASMedia) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMedia.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMedia.getExample();
        response = (OASMedia) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMedia.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMedia.getExample();
        response = (OASMedia) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMedia.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMedia.getExample();
        response = (OASMedia) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASMedia.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMedia.getExample();
        response = (OASMedia) api.mediaGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List media uploads
     *
     * List media uploads filtered by given parameters.\n\n**[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
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


        js = JSON.serialize(OASMediaList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMediaList200Response.getExample();
        response = (OASMediaList200Response) api.mediaList(params);
        System.assertEquals(expectedResponse, response);
    }
}