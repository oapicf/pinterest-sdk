package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.Promotion;
import org.openapitools.model.PromotionBatchUpdate;
import org.openapitools.model.PromotionCreate;
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
    public PromotionsResponse promotionsCreate(String adAccountId, List<@Valid PromotionCreate> promotionCreate) {
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
    public Promotion promotionsDelete(String promotionId, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get promotion by id
     *
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     *
     */
    @Override
    public Promotion promotionsGet(String promotionId, String adAccountId) {
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
    public PromotionsList200Response promotionsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
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
    public PromotionsResponse promotionsUpdate(String adAccountId, List<@Valid PromotionBatchUpdate> promotionBatchUpdate) {
        // TODO: Implement...
        return null;
    }

}
