@isTest
private class OASConversionEqsApiTest {
    /**
     * Get event quality score (EQS)
     *
     * Get the Event Quality Score (EQS) of your conversion signals.\n\n[Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     */
    @isTest
    private static void conversionEqsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'lookbackPeriod' => '',
            'adAccountId' => 'null',
            'sourcePlatform' => '',
            'ingestionSource' => ''
        };

        OASClient client;
        OASConversionEqsApi api;
        List<OASEventQualityScore> response;
        List<OASEventQualityScore> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASConversionEqsApi(client);

        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASConversionEqsApi(client);

        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASEventQualityScore>{OASEventQualityScore.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASEventQualityScore>{OASEventQualityScore.getExample()};
        response = (List<OASEventQualityScore>) api.conversionEqsList(params);
        System.assertEquals(expectedResponse, response);
    }
}