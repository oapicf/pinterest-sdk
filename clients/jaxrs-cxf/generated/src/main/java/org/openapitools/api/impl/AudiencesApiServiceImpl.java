package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdAccountsAudience;
import org.openapitools.model.AdAccountsAudienceCreate;
import org.openapitools.model.AdAccountsAudienceUpdate;
import org.openapitools.model.AudienceOwnershipType;
import org.openapitools.model.AudiencesList200Response;
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
public class AudiencesApiServiceImpl implements AudiencesApi {
    /**
     * Create audience
     *
     * Create a new audience for the ad account.
     *
     */
    public AdAccountsAudience audiencesCreate(String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get audience
     *
     * Get a specific audience given the audience ID.
     *
     */
    public AdAccountsAudience audiencesGet(String audienceId, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List audiences
     *
     * Get list of audiences for the ad account.
     *
     */
    public AudiencesList200Response audiencesList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, AudienceOwnershipType ownershipType, Boolean excludeNca) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update audience
     *
     * Update an existing audience for the ad account.
     *
     */
    public AdAccountsAudience audiencesUpdate(String audienceId, String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate) {
        // TODO: Implement...

        return null;
    }

}
