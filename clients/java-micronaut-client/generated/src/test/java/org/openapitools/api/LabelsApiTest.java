package org.openapitools.api;

import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabeledEntities;
import org.openapitools.model.LabeledEntitiesCreate;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QueryLabelEntityStatusesItems;
import org.openapitools.model.QueryLabelTypesItems;
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
 * API tests for LabelsApi
 */
@MicronautTest
public class LabelsApiTest {

    @Inject
    LabelsApi api;

    
    /**
     * Apply label to entity
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsApplyTest() {
        // given
        String adAccountId = "example";
        String labelId = "example";
        LabeledEntitiesCreate labeledEntitiesCreate = new LabeledEntitiesCreate(Arrays.asList("example"));

        // when
        LabeledEntities body = api.labelsApply(adAccountId, labelId, labeledEntitiesCreate).block();

        // then
        // TODO implement the labelsApplyTest()
    }

    
    /**
     * Create labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsCreateTest() {
        // given
        String adAccountId = "example";
        LabelCreateRequest labelCreateRequest = new LabelCreateRequest(Arrays.asList());

        // when
        LabelsResponse body = api.labelsCreate(adAccountId, labelCreateRequest).block();

        // then
        // TODO implement the labelsCreateTest()
    }

    
    /**
     * List labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsListTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds = Arrays.asList("example");
        List<QueryLabelEntityStatusesItems> entityStatuses = Arrays.asList();
        List<QueryLabelTypesItems> labelTypes = Arrays.asList();
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        LabelsList200Response body = api.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize).block();

        // then
        // TODO implement the labelsListTest()
    }

    
    /**
     * Remove label from entities
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsRemoveTest() {
        // given
        String adAccountId = "example";
        String labelId = "example";
        LabeledEntitiesCreate labeledEntitiesCreate = new LabeledEntitiesCreate(Arrays.asList("example"));

        // when
        LabeledEntities body = api.labelsRemove(adAccountId, labelId, labeledEntitiesCreate).block();

        // then
        // TODO implement the labelsRemoveTest()
    }

    
    /**
     * Update labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsUpdateTest() {
        // given
        String adAccountId = "example";
        LabelUpdateRequest labelUpdateRequest = new LabelUpdateRequest(Arrays.asList());

        // when
        LabelsResponse body = api.labelsUpdate(adAccountId, labelUpdateRequest).block();

        // then
        // TODO implement the labelsUpdateTest()
    }

    
}
