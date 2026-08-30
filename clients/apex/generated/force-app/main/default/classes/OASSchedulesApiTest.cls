@isTest
private class OASSchedulesApiTest {
    /**
     * Create schedules
     *
     * Batch create schedules
     */
    @isTest
    private static void schedulesCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSScheduleCreate' => new List<OASScheduleCreate>{OASScheduleCreate.getExample()}
        };

        OASClient client;
        OASSchedulesApi api;
        List<OASSchedulesCreate200ResponseInner> response;
        List<OASSchedulesCreate200ResponseInner> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSchedulesApi(client);

        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Schedules
     *
     * Get schedules for a specific advertiser
     */
    @isTest
    private static void schedulesListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'entityIds' => new List<String>{''},
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => '',
            'scheduleStatuses' => new List<OASScheduleStatus>{OASScheduleStatus.getExample()},
            'scheduleType' => ''
        };

        OASClient client;
        OASSchedulesApi api;
        OASSchedulesList200Response response;
        OASSchedulesList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSchedulesApi(client);

        js = JSON.serialize(OASSchedulesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSchedulesList200Response.getExample();
        response = (OASSchedulesList200Response) api.schedulesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSchedulesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSchedulesList200Response.getExample();
        response = (OASSchedulesList200Response) api.schedulesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSchedulesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSchedulesList200Response.getExample();
        response = (OASSchedulesList200Response) api.schedulesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSchedulesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSchedulesList200Response.getExample();
        response = (OASSchedulesList200Response) api.schedulesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSchedulesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSchedulesList200Response.getExample();
        response = (OASSchedulesList200Response) api.schedulesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSchedulesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSchedulesList200Response.getExample();
        response = (OASSchedulesList200Response) api.schedulesList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSchedulesList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSchedulesList200Response.getExample();
        response = (OASSchedulesList200Response) api.schedulesList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update schedules
     *
     * Update one or more schedules
     */
    @isTest
    private static void schedulesUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSScheduleBatchUpdate' => new List<OASScheduleBatchUpdate>{OASScheduleBatchUpdate.getExample()}
        };

        OASClient client;
        OASSchedulesApi api;
        List<OASSchedulesCreate200ResponseInner> response;
        List<OASSchedulesCreate200ResponseInner> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASSchedulesApi(client);

        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASSchedulesCreate200ResponseInner>{OASSchedulesCreate200ResponseInner.getExample()};
        response = (List<OASSchedulesCreate200ResponseInner>) api.schedulesUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}