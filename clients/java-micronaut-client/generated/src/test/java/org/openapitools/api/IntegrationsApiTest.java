package org.openapitools.api;

import org.openapitools.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.model.IntegrationLogsRequestCreate;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationMetadataCreate;
import org.openapitools.model.IntegrationMetadataUpdate;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationsGetList200Response;
import org.openapitools.model.PinterestLibError;
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
 * API tests for IntegrationsApi
 */
@MicronautTest
public class IntegrationsApiTest {

    @Inject
    IntegrationsApi api;

    
    /**
     * Delete commerce integration
     *
     * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void integrationsCommerceDelTest() {
        // given
        String externalBusinessId = "example";

        // when
        IntegrationMetadata body = api.integrationsCommerceDel(externalBusinessId).block();

        // then
        // TODO implement the integrationsCommerceDelTest()
    }

    
    /**
     * Get commerce integration
     *
     * Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void integrationsCommerceGetTest() {
        // given
        String externalBusinessId = "example";

        // when
        IntegrationMetadata body = api.integrationsCommerceGet(externalBusinessId).block();

        // then
        // TODO implement the integrationsCommerceGetTest()
    }

    
    /**
     * Update commerce integration
     *
     * Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void integrationsCommercePatchTest() {
        // given
        String externalBusinessId = "example";
        IntegrationMetadataUpdate integrationMetadataUpdate = new IntegrationMetadataUpdate();

        // when
        IntegrationMetadata body = api.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate).block();

        // then
        // TODO implement the integrationsCommercePatchTest()
    }

    
    /**
     * Create commerce integration
     *
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void integrationsCommercePostTest() {
        // given
        IntegrationMetadataCreate integrationMetadataCreate = new IntegrationMetadataCreate();

        // when
        IntegrationMetadata body = api.integrationsCommercePost(integrationMetadataCreate).block();

        // then
        // TODO implement the integrationsCommercePostTest()
    }

    
    /**
     * Get integration metadata
     *
     * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void integrationsGetByIdTest() {
        // given
        String id = "example";

        // when
        IntegrationRecord body = api.integrationsGetById(id).block();

        // then
        // TODO implement the integrationsGetByIdTest()
    }

    
    /**
     * Get integration metadata list
     *
     * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void integrationsGetListTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        IntegrationsGetList200Response body = api.integrationsGetList(bookmark, pageSize).block();

        // then
        // TODO implement the integrationsGetListTest()
    }

    
    /**
     * Receives batched logs from integration applications.
     *
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void integrationsLogsPostTest() {
        // given
        IntegrationLogsRequestCreate integrationLogsRequestCreate = new IntegrationLogsRequestCreate(Arrays.asList());

        // when
        IntegrationLogsSuccessResponse body = api.integrationsLogsPost(integrationLogsRequestCreate).block();

        // then
        // TODO implement the integrationsLogsPostTest()
    }

    
}
