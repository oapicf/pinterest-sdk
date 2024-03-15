package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.IntegrationLogsRequest;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationRequest;
import org.openapitools.model.IntegrationRequestPatch;
import org.openapitools.model.IntegrationsGetList200Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class IntegrationsApiServiceImpl implements IntegrationsApi {
    /**
     * Delete commerce integration
     *
     * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @Override
    public void integrationsCommerceDel(String externalBusinessId) {
        // TODO: Implement...

    }

    /**
     * Get commerce integration
     *
     * Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @Override
    public IntegrationMetadata integrationsCommerceGet(String externalBusinessId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update commerce integration
     *
     * Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @Override
    public IntegrationMetadata integrationsCommercePatch(String externalBusinessId, IntegrationRequestPatch integrationRequestPatch) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create commerce integration
     *
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @Override
    public IntegrationMetadata integrationsCommercePost(IntegrationRequest integrationRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get integration metadata
     *
     * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @Override
    public IntegrationRecord integrationsGetById(String id) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get integration metadata list
     *
     * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @Override
    public IntegrationsGetList200Response integrationsGetList(String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Receives batched logs from integration applications.
     *
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @Override
    public IntegrationLogsSuccessResponse integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest) {
        // TODO: Implement...
        return null;
    }

}
