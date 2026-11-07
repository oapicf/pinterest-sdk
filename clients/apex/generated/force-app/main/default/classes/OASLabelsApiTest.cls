@isTest
private class OASLabelsApiTest {
    /**
     * Apply label to entity
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)\n\n  Apply a label to one or more campaigns.\n  Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.\n  Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.\n\n  **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
     */
    @isTest
    private static void labelsApplyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'labelId' => 'null',
            'oaSLabeledEntitiesCreate' => ''
        };

        OASClient client;
        OASLabelsApi api;
        OASLabeledEntities response;
        OASLabeledEntities expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLabelsApi(client);

        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsApply(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)\n\nApply one or more labels to a campaign.\nFuture releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/).\nCurrently, you can apply brand and custom labels. Future releases will provide more options.\n\n**Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
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
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)\n\nSee a list of labels for assets that your account owns, and filter the list by different criteria.\nIf no filter is provided, it will default to labels associated with the ad account id.
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
            'entityStatuses' => new List<OASQueryLabelEntityStatusesItems>{OASQueryLabelEntityStatusesItems.getExample()},
            'labelTypes' => new List<OASQueryLabelTypesItems>{OASQueryLabelTypesItems.getExample()},
            'bookmark' => 'null',
            'pageSize' => ''
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


        js = JSON.serialize(OASLabelsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsList200Response.getExample();
        response = (OASLabelsList200Response) api.labelsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Remove label from entities
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)\n\n  Remove a label from one or more entities.
     */
    @isTest
    private static void labelsRemoveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'labelId' => 'null',
            'oaSLabeledEntitiesCreate' => ''
        };

        OASClient client;
        OASLabelsApi api;
        OASLabeledEntities response;
        OASLabeledEntities expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLabelsApi(client);

        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASLabeledEntities.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabeledEntities.getExample();
        response = (OASLabeledEntities) api.labelsRemove(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)\n\nChange the properties of one or more labels.
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


        js = JSON.serialize(OASLabelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLabelsResponse.getExample();
        response = (OASLabelsResponse) api.labelsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}