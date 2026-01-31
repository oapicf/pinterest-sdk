package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.Error;

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
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;.
     *
     */
    public Audience audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get audience
     *
     * Get a specific audience given the audience ID.
     *
     */
    public Audience audiencesGet(String adAccountId, String audienceId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List audiences
     *
     * Get list of audiences for the ad account.
     *
     */
    public AudiencesList200Response audiencesList(String adAccountId, String bookmark, String order, Integer pageSize, String ownershipType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update audience
     *
     * Update (edit or remove) an existing targeting audience.
     *
     */
    public Audience audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest) {
        // TODO: Implement...

        return null;
    }

}
