@isTest
private class OASNotificationApiTest {
    /**
     * Receive notifications from external partners.
     *
     * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests\&#39; systems. This API is gated and you need to request access to this feature.
     */
    @isTest
    private static void notificationPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSNotificationPostRequest' => ''
        };

        OASClient client;
        OASNotificationApi api;
        OASNotificationResponse response;
        OASNotificationResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASNotificationApi(client);

        js = JSON.serialize(OASNotificationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNotificationResponse.getExample();
        response = (OASNotificationResponse) api.notificationPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASNotificationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNotificationResponse.getExample();
        response = (OASNotificationResponse) api.notificationPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASNotificationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNotificationResponse.getExample();
        response = (OASNotificationResponse) api.notificationPost(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASNotificationApi(client);

        js = JSON.serialize(OASNotificationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNotificationResponse.getExample();
        response = (OASNotificationResponse) api.notificationPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASNotificationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNotificationResponse.getExample();
        response = (OASNotificationResponse) api.notificationPost(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASNotificationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNotificationResponse.getExample();
        response = (OASNotificationResponse) api.notificationPost(params);
        System.assertEquals(expectedResponse, response);
    }
}