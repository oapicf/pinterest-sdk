@isTest
private class OASPromotionsApiTest {
    /**
     * Create promotions
     *
     * Create multiple new promotions.
     */
    @isTest
    private static void promotionsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSPromotionCreate' => new List<OASPromotionCreate>{OASPromotionCreate.getExample()}
        };

        OASClient client;
        OASPromotionsApi api;
        OASPromotionsResponse response;
        OASPromotionsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromotionsApi(client);

        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete promotion by id
     *
     * Delete a promotion within Pinterest.
     */
    @isTest
    private static void promotionsDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'promotionId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPromotionsApi api;
        OASPromotion response;
        OASPromotion expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromotionsApi(client);

        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsDelete(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get promotion by id
     *
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     */
    @isTest
    private static void promotionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'promotionId' => 'null',
            'adAccountId' => 'null'
        };

        OASClient client;
        OASPromotionsApi api;
        OASPromotion response;
        OASPromotion expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromotionsApi(client);

        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotion.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotion.getExample();
        response = (OASPromotion) api.promotionsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get promotions
     *
     * Gets all promotions associated with an ad account ID that can be\napplied to an ad group. Can be either internally-saved promotions or external\npromotions imported from a commerce integration.
     */
    @isTest
    private static void promotionsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => ''
        };

        OASClient client;
        OASPromotionsApi api;
        OASPromotionsList200Response response;
        OASPromotionsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromotionsApi(client);

        js = JSON.serialize(OASPromotionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsList200Response.getExample();
        response = (OASPromotionsList200Response) api.promotionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsList200Response.getExample();
        response = (OASPromotionsList200Response) api.promotionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsList200Response.getExample();
        response = (OASPromotionsList200Response) api.promotionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsList200Response.getExample();
        response = (OASPromotionsList200Response) api.promotionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsList200Response.getExample();
        response = (OASPromotionsList200Response) api.promotionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsList200Response.getExample();
        response = (OASPromotionsList200Response) api.promotionsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsList200Response.getExample();
        response = (OASPromotionsList200Response) api.promotionsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update promotions
     *
     * Update multiple promotions.
     */
    @isTest
    private static void promotionsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSPromotionBatchUpdate' => new List<OASPromotionBatchUpdate>{OASPromotionBatchUpdate.getExample()}
        };

        OASClient client;
        OASPromotionsApi api;
        OASPromotionsResponse response;
        OASPromotionsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromotionsApi(client);

        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASPromotionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPromotionsResponse.getExample();
        response = (OASPromotionsResponse) api.promotionsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}