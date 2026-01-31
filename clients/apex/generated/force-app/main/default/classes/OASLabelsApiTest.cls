@isTest
private class OASLabelsApiTest {
    /**
     * Create labels
     *
     * &lt;p&gt;\n&lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;blank&quot; target&#x3D;&quot;blank&quot;&gt;Closed beta&lt;/a&gt;\nThis endpoint is not available to all users.\n&lt;/p&gt;\n&lt;p&gt;\n  Apply one or more labels to a campaign.\n  Currently, you can apply brand and custom labels. Future releases will provide more options.\n\n  &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.\n &lt;/p&gt;
     */
    @isTest
    private static void labelsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLabelCreateRequest' => ''
        };

        OASClient client;
        OASLabelsApi api;
        OASLabelsResponse response;
        OASLabelsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLabelsApi(client);

        js = JSON.serialize(OASLabelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsResponse.getExample();
        response = (OASLabelsResponse) api.labelsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsResponse.getExample();
        response = (OASLabelsResponse) api.labelsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List labels
     *
     * &lt;p&gt;\n  &lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;blank&quot; target&#x3D;&quot;blank&quot;&gt;Closed beta&lt;/a&gt;\n  This endpoint is not available to all users.\n&lt;/p&gt;\n&lt;p&gt;\n  See a list of labels for assets that your account owns, and filter the list by different criteria.\n&lt;/p&gt;
     */
    @isTest
    private static void labelsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'campaignIds' => new List<String>{''},
            'labelIds' => new List<String>{''},
            'entityStatuses' => new List<String>{'ACTIVE'},
            'labelTypes' => ["BRAND","CUSTOM"],
            'pageSize' => '',
            'bookmark' => 'null'
        };

        OASClient client;
        OASLabelsApi api;
        OASLabelsList200Response response;
        OASLabelsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLabelsApi(client);

        js = JSON.serialize(OASLabelsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsList200Response.getExample();
        response = (OASLabelsList200Response) api.labelsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabelsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsList200Response.getExample();
        response = (OASLabelsList200Response) api.labelsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabelsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsList200Response.getExample();
        response = (OASLabelsList200Response) api.labelsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update labels
     *
     * &lt;p&gt;\n  &lt;a href&#x3D;&quot;/docs/getting-started/using-beta-and-restricted-features/&quot; target&#x3D;&quot;blank&quot; target&#x3D;&quot;blank&quot;&gt;Closed beta&lt;/a&gt;\n  This endpoint is not available to all users.\n&lt;/p&gt;\n&lt;p&gt;\n  Change the properties of one or more labels.\n&lt;/p&gt;
     */
    @isTest
    private static void labelsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSLabelUpdateRequest' => ''
        };

        OASClient client;
        OASLabelsApi api;
        OASLabelsResponse response;
        OASLabelsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLabelsApi(client);

        js = JSON.serialize(OASLabelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsResponse.getExample();
        response = (OASLabelsResponse) api.labelsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsResponse.getExample();
        response = (OASLabelsResponse) api.labelsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}