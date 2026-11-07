package org.openapitools.api;

import org.openapitools.model.AdAccountsAudience;
import org.openapitools.model.AdAccountsAudienceCreate;
import org.openapitools.model.AdAccountsAudienceUpdate;
import org.openapitools.model.AudienceOwnershipType;
import org.openapitools.model.AudiencesList200Response;
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
 * API tests for AudiencesApi
 */
@MicronautTest
public class AudiencesApiTest {

    @Inject
    AudiencesApi api;

    
    /**
     * Create audience
     *
     * Create a new audience for the ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void audiencesCreateTest() {
        // given
        String adAccountId = "example";
        AdAccountsAudienceCreate adAccountsAudienceCreate = new AdAccountsAudienceCreate();

        // when
        AdAccountsAudience body = api.audiencesCreate(adAccountId, adAccountsAudienceCreate).block();

        // then
        // TODO implement the audiencesCreateTest()
    }

    
    /**
     * Get audience
     *
     * Get a specific audience given the audience ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void audiencesGetTest() {
        // given
        String audienceId = "example";
        String adAccountId = "example";

        // when
        AdAccountsAudience body = api.audiencesGet(audienceId, adAccountId).block();

        // then
        // TODO implement the audiencesGetTest()
    }

    
    /**
     * List audiences
     *
     * Get list of audiences for the ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void audiencesListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        AudienceOwnershipType ownershipType = AudienceOwnershipType.fromValue("OWNED");
        Boolean excludeNca = false;

        // when
        AudiencesList200Response body = api.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca).block();

        // then
        // TODO implement the audiencesListTest()
    }

    
    /**
     * Update audience
     *
     * Update an existing audience for the ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void audiencesUpdateTest() {
        // given
        String audienceId = "example";
        String adAccountId = "example";
        AdAccountsAudienceUpdate adAccountsAudienceUpdate = new AdAccountsAudienceUpdate();

        // when
        AdAccountsAudience body = api.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate).block();

        // then
        // TODO implement the audiencesUpdateTest()
    }

    
}
