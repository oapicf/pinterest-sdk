@isTest
private class OASCustomerListsApiTest {
    /**
     * Create customer lists
     *
     * &lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt;\n&lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/audience-targeting&quot; target&#x3D;&quot;_blank&quot;&gt;Audience targeting&lt;/a&gt;\nor the &lt;a href&#x3D;&quot;/docs/ads/targeting/#Audiences&quot; target&#x3D;&quot;_blank&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt;\n&lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341&quot; target&#x3D;&quot;_blank&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt;\n&lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts;\nthe list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process\nis complete. The filtered list – containing only the Pinterest accounts that were included in your starting\nlist – is what will be used to create the audience.&lt;/p&gt;\n&lt;p&gt;Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type)\nusing the &lt;a href&#x3D;&quot;#operation/create_audience_handler&quot;&gt;create audience endpoint&lt;/a&gt; before it can be used.&lt;/p&gt;
     */
    @isTest
    private static void customerListsCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'oaSCustomerListRequest' => ''
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
    }

    /**
     * Get customer lists
     *
     * &lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt;\n&lt;p&gt;(Customer lists are a type of audience.) For more information, see\n&lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/audience-targeting&quot; target&#x3D;&quot;_blank&quot;&gt;Audience targeting&lt;/a&gt;\n or the &lt;a href&#x3D;&quot;/docs/ads/targeting/#Audiences&quot; target&#x3D;&quot;_blank&quot;&gt;Audiences&lt;/a&gt;\nsection of the ads management guide.&lt;/p&gt;
     */
    @isTest
    private static void customerListsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'adAccountId' => 'null',
            'pageSize' => '',
            'order' => ASCENDING,
            'bookmark' => 'null'
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
    }

    /**
     * Update customer list
     *
     * &lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt;\n&lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest\naccounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records\nto add will be deleted when the matching process is complete.&lt;/p&gt;\n&lt;p&gt;For more information, see &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/audience-targeting&quot; target&#x3D;&quot;_blank&quot;&gt;Audience targeting&lt;/a&gt;\nor the &lt;a href&#x3D;&quot;/docs/ads/targeting/#Audiences&quot; target&#x3D;&quot;_blank&quot;&gt;Audiences&lt;/a&gt;\nsection of the ads management guide.&lt;/p&gt;
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
            'oaSCustomerListUpdateRequest' => ''
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
    }
}