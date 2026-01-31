@isTest
private class OASProductCategoriesApiTest {
    /**
     * Get featured topics
     *
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     */
    @isTest
    private static void trendsFeaturedTopicsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'region' => '',
            'interest' => ''
        };

        OASClient client;
        OASProductCategoriesApi api;
        List<OASFeaturedTrend> response;
        List<OASFeaturedTrend> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductCategoriesApi(client);

        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASProductCategoriesApi(client);

        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASFeaturedTrend>{OASFeaturedTrend.getExample()};
        response = (List<OASFeaturedTrend>) api.trendsFeaturedTopicsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get product category details
     *
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     */
    @isTest
    private static void trendsProductCategoriesDetailsListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'productCategories' => new List<OASProductCategoryEnum>{OASProductCategoryEnum.getExample()},
            'region' => '',
            'lookbackWindow' => '',
            'engagementType' => ''
        };

        OASClient client;
        OASProductCategoriesApi api;
        List<OASProductCategoryDetails> response;
        List<OASProductCategoryDetails> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductCategoriesApi(client);

        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASProductCategoriesApi(client);

        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASProductCategoryDetails>{OASProductCategoryDetails.getExample()};
        response = (List<OASProductCategoryDetails>) api.trendsProductCategoriesDetailsList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get a list of growing Shopping Product Categories
     *
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     */
    @isTest
    private static void trendsProductCategoriesTrendingListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'region' => '',
            'verticals' => new List<OASVerticalProductCategory>{OASVerticalProductCategory.getExample()},
            'ages' => new List<OASAgeTrendsBucket>{OASAgeTrendsBucket.getExample()},
            'genders' => new List<OASGenderBucket>{OASGenderBucket.getExample()},
            'engagementType' => ''
        };

        OASClient client;
        OASProductCategoriesApi api;
        List<OASTrendingProductCategory> response;
        List<OASTrendingProductCategory> expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProductCategoriesApi(client);

        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASProductCategoriesApi(client);

        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASTrendingProductCategory>{OASTrendingProductCategory.getExample()};
        response = (List<OASTrendingProductCategory>) api.trendsProductCategoriesTrendingList(params);
        System.assertEquals(expectedResponse, response);
    }
}