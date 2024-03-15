package org.openapitools.api;

import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.model.Error;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for ProductGroupsApi
 */
@MicronautTest
public class ProductGroupsApiTest {

    @Inject
    ProductGroupsApi api;

    
    /**
     * Get catalog product groups
     *
     * This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsCatalogsProductGroupsListTest() {
        // given
        String adAccountId = "example";
        String feedProfileId = "example";

        // when
        AdAccountsCatalogsProductGroupsList200Response body = api.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId).block();

        // then
        // TODO implement the adAccountsCatalogsProductGroupsListTest()
    }

    
}
