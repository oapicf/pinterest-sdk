package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.PromotionCreateRequest;
import org.openapitools.model.PromotionResponse;
import org.openapitools.model.PromotionUpdateRequest;
import org.openapitools.model.PromotionsList200Response;
import org.openapitools.model.PromotionsResponse;

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
public class PromotionsApiServiceImpl implements PromotionsApi {
    /**
     * Create promotions
     *
     * Create multiple new promotions.
     *
     */
    @Override
    public PromotionsResponse promotionsCreate(String adAccountId, List<@Valid PromotionCreateRequest> promotionCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete promotion by id
     *
     * Delete a promotion within Pinterest.
     *
     */
    @Override
    public void promotionsDelete(String adAccountId, String promotionId) {
        // TODO: Implement...

    }

    /**
     * Get promotion by id
     *
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     *
     */
    @Override
    public PromotionResponse promotionsGet(String adAccountId, String promotionId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get promotions
     *
     * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
     *
     */
    @Override
    public PromotionsList200Response promotionsList(String adAccountId, Integer pageSize, String order, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update promotions
     *
     * Update multiple promotions.
     *
     */
    @Override
    public PromotionsResponse promotionsUpdate(String adAccountId, List<@Valid PromotionUpdateRequest> promotionUpdateRequest) {
        // TODO: Implement...
        return null;
    }

}
