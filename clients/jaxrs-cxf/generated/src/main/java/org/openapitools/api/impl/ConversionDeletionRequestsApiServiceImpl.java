package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConversionDeletionRequest;
import org.openapitools.model.ConversionDeletionRequestCreate;
import org.openapitools.model.ConversionDeletionRequestList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class ConversionDeletionRequestsApiServiceImpl implements ConversionDeletionRequestsApi {
    /**
     * Create a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
     *
     */
    public ConversionDeletionRequest conversionDeletionRequestCreate(String adAccountId, ConversionDeletionRequestCreate conversionDeletionRequestCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
     *
     */
    public ConversionDeletionRequest conversionDeletionRequestDelete(String requestId, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get a single conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
     *
     */
    public ConversionDeletionRequest conversionDeletionRequestGet(String requestId, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List conversion deletion requests
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
     *
     */
    public ConversionDeletionRequestList200Response conversionDeletionRequestList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        // TODO: Implement...

        return null;
    }

}
