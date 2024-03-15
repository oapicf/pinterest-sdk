@isTest
private class OASTermsApiTest {
    /**
     * List related terms
     *
     * Get a list of terms logically related to each input term. &lt;p/&gt;\nExample: the term \&#39;workout\&#39; would list related terms like \&#39;one song workout\&#39;, \&#39;yoga workout\&#39;, \&#39;workout motivation\&#39;, etc.
     */
    @isTest
    private static void termsRelatedListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'terms' => new List<String>{'workout'}
        };

        OASClient client;
        OASTermsApi api;
        OASRelatedTerms response;
        OASRelatedTerms expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASTermsApi(client);

        js = JSON.serialize(OASRelatedTerms.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRelatedTerms.getExample();
        response = (OASRelatedTerms) api.termsRelatedList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASRelatedTerms.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRelatedTerms.getExample();
        response = (OASRelatedTerms) api.termsRelatedList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASRelatedTerms.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRelatedTerms.getExample();
        response = (OASRelatedTerms) api.termsRelatedList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List suggested terms
     *
     * Get popular search terms that begin with your input term. &lt;p/&gt;\nExample: \&#39;sport\&#39; would return popular terms like \&#39;sports bar\&#39; and \&#39;sportswear\&#39;, but not \&#39;motor sports\&#39; since the phrase does not begin with the given term.
     */
    @isTest
    private static void termsSuggestedListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'term' => sports,
            'r_limit' => 4
        };

        OASClient client;
        OASTermsApi api;
        List<String> response;
        List<String> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASTermsApi(client);

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<String>) api.termsSuggestedList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<String>) api.termsSuggestedList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<String>) api.termsSuggestedList(params);
        System.assertEquals(expectedResponse, response);
    }
}