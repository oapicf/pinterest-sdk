package org.openapitools.api;

import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
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
 * API tests for AudiencesApi
 */
@MicronautTest
public class AudiencesApiTest {

    @Inject
    AudiencesApi api;

    
    /**
     * Create audience
     *
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void audiencesCreateTest() {
        // given
        String adAccountId = "example";
        AudienceCreateRequest audienceCreateRequest = new AudienceCreateRequest();

        // when
        Audience body = api.audiencesCreate(adAccountId, audienceCreateRequest).block();

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
        String adAccountId = "example";
        String audienceId = "example";

        // when
        Audience body = api.audiencesGet(adAccountId, audienceId).block();

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
        String order = "ASCENDING";
        Integer pageSize = 25;
        String ownershipType = "OWNED";

        // when
        AudiencesList200Response body = api.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType).block();

        // then
        // TODO implement the audiencesListTest()
    }

    
    /**
     * Update audience
     *
     * Update (edit or remove) an existing targeting audience.
     */
    @Test
    @Disabled("Not Implemented")
    public void audiencesUpdateTest() {
        // given
        String adAccountId = "example";
        String audienceId = "example";
        AudienceUpdateRequest audienceUpdateRequest = new AudienceUpdateRequest();

        // when
        Audience body = api.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest).block();

        // then
        // TODO implement the audiencesUpdateTest()
    }

    
}
