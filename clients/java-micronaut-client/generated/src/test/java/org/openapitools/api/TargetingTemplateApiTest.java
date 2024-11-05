package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateGetResponseData;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequest;
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
     * &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void targetingTemplateCreateTest() {
        // given
        String adAccountId = "example";
        TargetingTemplateCreate targetingTemplateCreate = new TargetingTemplateCreate();

        // when
        TargetingTemplateGetResponseData body = api.targetingTemplateCreate(adAccountId, targetingTemplateCreate).block();

        // then
        // TODO implement the targetingTemplateCreateTest()
    }

    
    /**
     * List targeting templates
     *
     * Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void targetingTemplateListTest() {
        // given
        String adAccountId = "example";
        String order = "ASCENDING";
        Boolean includeSizing = false;
        String searchQuery = "gaming";
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        TargetingTemplateList200Response body = api.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark).block();

        // then
        // TODO implement the targetingTemplateListTest()
    }

    
    /**
     * Update targeting templates
     *
     * &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void targetingTemplateUpdateTest() {
        // given
        String adAccountId = "example";
        TargetingTemplateUpdateRequest targetingTemplateUpdateRequest = new TargetingTemplateUpdateRequest("example", "643");

        // when
        api.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest).block();

        // then
        // TODO implement the targetingTemplateUpdateTest()
    }

    
}
