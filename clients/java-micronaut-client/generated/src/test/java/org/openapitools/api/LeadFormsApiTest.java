package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.LeadFormArrayResponse;
import org.openapitools.model.LeadFormCreateRequest;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormUpdateRequest;
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
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
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
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
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
     * Create lead forms
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormsCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid LeadFormCreateRequest> leadFormCreateRequest = Arrays.asList();

        // when
        LeadFormArrayResponse body = api.leadFormsCreate(adAccountId, leadFormCreateRequest).block();

        // then
        // TODO implement the leadFormsCreateTest()
    }

    
    /**
     * List lead forms
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
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

    
    /**
     * Update lead forms
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormsUpdateTest() {
        // given
        String adAccountId = "example";
        List<@Valid LeadFormUpdateRequest> leadFormUpdateRequest = Arrays.asList();

        // when
        LeadFormArrayResponse body = api.leadFormsUpdate(adAccountId, leadFormUpdateRequest).block();

        // then
        // TODO implement the leadFormsUpdateTest()
    }

    
}
