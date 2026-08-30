package org.openapitools.api.interfaces;

import org.openapitools.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.model.IntegrationLogsRequestCreate;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationMetadataCreate;
import org.openapitools.model.IntegrationMetadataUpdate;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationsGetList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface IntegrationsService {

    /**
     * Delete commerce integration
     * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param externalBusinessId External business ID for the integration. (required)
     * @return IntegrationMetadata
     */
    IntegrationMetadata integrationsCommerceDel(
        String externalBusinessId
    );

    /**
     * Get commerce integration
     * Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param externalBusinessId External business ID for the integration. (required)
     * @return IntegrationMetadata
     */
    IntegrationMetadata integrationsCommerceGet(
        String externalBusinessId
    );

    /**
     * Update commerce integration
     * Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param externalBusinessId External business ID for the integration. (required)
     * @param integrationMetadataUpdate  (required)
     * @return IntegrationMetadata
     */
    IntegrationMetadata integrationsCommercePatch(
        String externalBusinessId,
        IntegrationMetadataUpdate integrationMetadataUpdate
    );

    /**
     * Create commerce integration
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param integrationMetadataCreate  (required)
     * @return IntegrationMetadata
     */
    IntegrationMetadata integrationsCommercePost(
        IntegrationMetadataCreate integrationMetadataCreate
    );

    /**
     * Get integration metadata
     * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param id Integration record ID. (required)
     * @return IntegrationRecord
     */
    IntegrationRecord integrationsGetById(
        String id
    );

    /**
     * Get integration metadata list
     * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return IntegrationsGetList200Response
     */
    IntegrationsGetList200Response integrationsGetList(
        String bookmark,
        Integer pageSize
    );

    /**
     * Receives batched logs from integration applications.
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param integrationLogsRequestCreate  (required)
     * @return IntegrationLogsSuccessResponse
     */
    IntegrationLogsSuccessResponse integrationsLogsPost(
        IntegrationLogsRequestCreate integrationLogsRequestCreate
    );
}
