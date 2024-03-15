@isTest
private class OASAudiencesApiTest {
    /**
     * Create audience
     *
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with\nthe ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude\nspecific audience_ids when you create an ad group. &lt;p/&gt;\nFor more, see &lt;a class&#x3D;&quot;reference external&quot; href&#x3D;&quot;https://help.pinterest.com/en/business/article/audience-targeting&quot; target&#x3D;&quot;_blank&quot;&gt;Audience targeting&lt;/a&gt;.
     */
    @isTest
    private static void audiencesCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAudienceCreateRequest' => ''
        };

        OASClient client;
        OASAudiencesApi api;
        OASAudience response;
        OASAudience expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudiencesApi(client);

        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create custom audience
     *
     * Create a custom audience and find the audiences you want your ads to reach.
     */
    @isTest
    private static void audiencesCreateCustomTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSAudienceCreateCustomRequest' => ''
        };

        OASClient client;
        OASAudiencesApi api;
        OASAudience response;
        OASAudience expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudiencesApi(client);

        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesCreateCustom(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesCreateCustom(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get audience
     *
     * Get a specific audience given the audience ID.
     */
    @isTest
    private static void audiencesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'audienceId' => 'null'
        };

        OASClient client;
        OASAudiencesApi api;
        OASAudience response;
        OASAudience expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudiencesApi(client);

        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List audiences
     *
     * Get list of audiences for the ad account.
     */
    @isTest
    private static void audiencesListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'order' => ASCENDING,
            'pageSize' => '',
            'ownershipType' => OWNED
        };

        OASClient client;
        OASAudiencesApi api;
        OASAudiencesList200Response response;
        OASAudiencesList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudiencesApi(client);

        js = JSON.serialize(OASAudiencesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudiencesList200Response.getExample();
        response = (OASAudiencesList200Response) api.audiencesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudiencesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudiencesList200Response.getExample();
        response = (OASAudiencesList200Response) api.audiencesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudiencesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudiencesList200Response.getExample();
        response = (OASAudiencesList200Response) api.audiencesList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update audience
     *
     * Update (edit or remove) an existing targeting audience.
     */
    @isTest
    private static void audiencesUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'audienceId' => 'null',
            'oaSAudienceUpdateRequest' => ''
        };

        OASClient client;
        OASAudiencesApi api;
        OASAudience response;
        OASAudience expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudiencesApi(client);

        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAudience.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAudience.getExample();
        response = (OASAudience) api.audiencesUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}