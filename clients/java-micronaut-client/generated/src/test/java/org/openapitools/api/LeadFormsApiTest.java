package org.openapitools.api;

import org.openapitools.model.LeadForm;
import org.openapitools.model.LeadFormBatchUpdate;
import org.openapitools.model.LeadFormCreate;
import org.openapitools.model.LeadFormTest;
import org.openapitools.model.LeadFormTestCreate;
import org.openapitools.model.LeadFormsCreate200Response;
import org.openapitools.model.LeadFormsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
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
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormGetTest() {
        // given
        String leadFormId = "example";
        String adAccountId = "example";

        // when
        LeadForm body = api.leadFormGet(leadFormId, adAccountId).block();

        // then
        // TODO implement the leadFormGetTest()
    }

    
    /**
     * Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormTestCreateTest() {
        // given
        String adAccountId = "example";
        String leadFormId = "example";
        LeadFormTestCreate leadFormTestCreate = new LeadFormTestCreate(Arrays.asList("example"));

        // when
        LeadFormTest body = api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate).block();

        // then
        // TODO implement the leadFormTestCreateTest()
    }

    
    /**
     * Create lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormsCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid LeadFormCreate> leadFormCreate = Arrays.asList();

        // when
        LeadFormsCreate200Response body = api.leadFormsCreate(adAccountId, leadFormCreate).block();

        // then
        // TODO implement the leadFormsCreateTest()
    }

    
    /**
     * List lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        LeadFormsList200Response body = api.leadFormsList(adAccountId, bookmark, pageSize, order).block();

        // then
        // TODO implement the leadFormsListTest()
    }

    
    /**
     * Update lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormsUpdateTest() {
        // given
        String adAccountId = "example";
        List<@Valid LeadFormBatchUpdate> leadFormBatchUpdate = Arrays.asList();

        // when
        LeadFormsCreate200Response body = api.leadFormsUpdate(adAccountId, leadFormBatchUpdate).block();

        // then
        // TODO implement the leadFormsUpdateTest()
    }

    
}
