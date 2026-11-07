package org.openapitools.api;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.TargetingTemplate;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate;
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
 * API tests for TargetingTemplateApi
 */
@MicronautTest
public class TargetingTemplateApiTest {

    @Inject
    TargetingTemplateApi api;

    
    /**
     * Create targeting templates
     *
     * Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
     */
    @Test
    @Disabled("Not Implemented")
    public void targetingTemplateCreateTest() {
        // given
        String adAccountId = "example";
        TargetingTemplateCreate targetingTemplateCreate = new TargetingTemplateCreate("example", null);

        // when
        TargetingTemplate body = api.targetingTemplateCreate(adAccountId, targetingTemplateCreate).block();

        // then
        // TODO implement the targetingTemplateCreateTest()
    }

    
    /**
     * List targeting templates
     *
     * Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
     */
    @Test
    @Disabled("Not Implemented")
    public void targetingTemplateListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        Boolean includeSizing = false;
        String searchQuery = "example";

        // when
        TargetingTemplateList200Response body = api.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery).block();

        // then
        // TODO implement the targetingTemplateListTest()
    }

    
    /**
     * Update targeting templates
     *
     * Update the targeting template given advertiser ID and targeting template ID
     */
    @Test
    @Disabled("Not Implemented")
    public void targetingTemplateUpdateTest() {
        // given
        String adAccountId = "example";
        TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate = new TargetingTemplateUpdateRequestReadOrUpdate("643", org.openapitools.model.AudienceUpdateOperationType.fromValue("UPDATE"));

        // when
        api.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate).block();

        // then
        // TODO implement the targetingTemplateUpdateTest()
    }

    
}
