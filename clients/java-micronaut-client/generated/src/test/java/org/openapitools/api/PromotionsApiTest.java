package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PromotionCreateRequest;
import org.openapitools.model.PromotionResponse;
import org.openapitools.model.PromotionUpdateRequest;
import org.openapitools.model.PromotionsList200Response;
import org.openapitools.model.PromotionsResponse;
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
 * API tests for PromotionsApi
 */
@MicronautTest
public class PromotionsApiTest {

    @Inject
    PromotionsApi api;

    
    /**
     * Create promotions
     *
     * Create multiple new promotions.
     */
    @Test
    @Disabled("Not Implemented")
    public void promotionsCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid PromotionCreateRequest> promotionCreateRequest = Arrays.asList();

        // when
        PromotionsResponse body = api.promotionsCreate(adAccountId, promotionCreateRequest).block();

        // then
        // TODO implement the promotionsCreateTest()
    }

    
    /**
     * Delete promotion by id
     *
     * Delete a promotion within Pinterest.
     */
    @Test
    @Disabled("Not Implemented")
    public void promotionsDeleteTest() {
        // given
        String adAccountId = "example";
        String promotionId = "example";

        // when
        api.promotionsDelete(adAccountId, promotionId).block();

        // then
        // TODO implement the promotionsDeleteTest()
    }

    
    /**
     * Get promotion by id
     *
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     */
    @Test
    @Disabled("Not Implemented")
    public void promotionsGetTest() {
        // given
        String adAccountId = "example";
        String promotionId = "example";

        // when
        PromotionResponse body = api.promotionsGet(adAccountId, promotionId).block();

        // then
        // TODO implement the promotionsGetTest()
    }

    
    /**
     * Get promotions
     *
     * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
     */
    @Test
    @Disabled("Not Implemented")
    public void promotionsListTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        PromotionsList200Response body = api.promotionsList(adAccountId, pageSize, order, bookmark).block();

        // then
        // TODO implement the promotionsListTest()
    }

    
    /**
     * Update promotions
     *
     * Update multiple promotions.
     */
    @Test
    @Disabled("Not Implemented")
    public void promotionsUpdateTest() {
        // given
        String adAccountId = "example";
        List<@Valid PromotionUpdateRequest> promotionUpdateRequest = Arrays.asList();

        // when
        PromotionsResponse body = api.promotionsUpdate(adAccountId, promotionUpdateRequest).block();

        // then
        // TODO implement the promotionsUpdateTest()
    }

    
}
