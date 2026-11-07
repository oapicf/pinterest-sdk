@isTest
private class OASCustomerListsApiTest {
    /**
     * Create customer lists
     *
     * Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).\n\nA customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.\n\n**Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**\n \nWhen you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.\n \nTo use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
     */
    @isTest
    private static void customerListsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCustomerListCreate' => ''
        };

        OASClient client;
        OASCustomerListsApi api;
        OASCustomerList response;
        OASCustomerList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListsApi(client);

        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get customer list
     *
     * Gets a specific customer list given the customer list ID.
     */
    @isTest
    private static void customerListsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'customerListId' => 'null'
        };

        OASClient client;
        OASCustomerListsApi api;
        OASCustomerList response;
        OASCustomerList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListsApi(client);

        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASCustomerListsApi(client);

        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get customer lists
     *
     * Get a set of customer lists including id and name based on the filters provided.\n\n(Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
     */
    @isTest
    private static void customerListsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'bookmark' => 'null',
            'pageSize' => '',
            'order' => '',
            'excludeNca' => ''
        };

        OASClient client;
        OASCustomerListsApi api;
        OASCustomerListsList200Response response;
        OASCustomerListsList200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListsApi(client);

        js = JSON.serialize(OASCustomerListsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListsList200Response.getExample();
        response = (OASCustomerListsList200Response) api.customerListsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListsList200Response.getExample();
        response = (OASCustomerListsList200Response) api.customerListsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListsList200Response.getExample();
        response = (OASCustomerListsList200Response) api.customerListsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListsList200Response.getExample();
        response = (OASCustomerListsList200Response) api.customerListsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListsList200Response.getExample();
        response = (OASCustomerListsList200Response) api.customerListsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListsList200Response.getExample();
        response = (OASCustomerListsList200Response) api.customerListsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerListsList200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerListsList200Response.getExample();
        response = (OASCustomerListsList200Response) api.customerListsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update customer list
     *
     * Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)\n\nWhen you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your &quot;CUSTOMER_LIST&quot; audience. Your original list of records to add will be deleted when the matching process is complete.\n\nFor more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
     */
    @isTest
    private static void customerListsUpdateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'customerListId' => 'null',
            'oaSCustomerListUpdateWithRequiredBod' => ''
        };

        OASClient client;
        OASCustomerListsApi api;
        OASCustomerList response;
        OASCustomerList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCustomerListsApi(client);

        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsUpdate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCustomerList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCustomerList.getExample();
        response = (OASCustomerList) api.customerListsUpdate(params);
        System.assertEquals(expectedResponse, response);
    }
}