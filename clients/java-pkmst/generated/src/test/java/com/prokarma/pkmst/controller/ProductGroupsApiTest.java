/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.AdAccountsCatalogsProductGroupsList200Response;
import com.prokarma.pkmst.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for ProductGroupsApi
 */
@Ignore
public class ProductGroupsApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final ProductGroupsApi api = new ProductGroupsApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Get catalog product groups
     *
     * This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adAccountsCatalogsProductGroupsListTest() throws Exception {
        String adAccountId = null;
        String feedProfileId = null;
    ResponseEntity<AdAccountsCatalogsProductGroupsList200Response> response = api.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId , accept);

        // TODO: test validations
    }
    
}