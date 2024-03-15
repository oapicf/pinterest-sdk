package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormsList200Response;
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
 * API tests for LeadFormsApi
 */
@MicronautTest
public class LeadFormsApiTest {

    @Inject
    LeadFormsApi api;

    
    /**
     * Get lead form by id
     *
     * Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormGetTest() {
        // given
        String adAccountId = "example";
        String leadFormId = "1234567890123";

        // when
        LeadFormResponse body = api.leadFormGet(adAccountId, leadFormId).block();

        // then
        // TODO implement the leadFormGetTest()
    }

    
    /**
     * Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormTestCreateTest() {
        // given
        String adAccountId = "example";
        String leadFormId = "1234567890123";
        LeadFormTestRequest leadFormTestRequest = new LeadFormTestRequest(Arrays.asList("example"));

        // when
        LeadFormTestResponse body = api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest).block();

        // then
        // TODO implement the leadFormTestCreateTest()
    }

    
    /**
     * Get lead forms
     *
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormsListTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        LeadFormsList200Response body = api.leadFormsList(adAccountId, pageSize, order, bookmark).block();

        // then
        // TODO implement the leadFormsListTest()
    }

    
}
