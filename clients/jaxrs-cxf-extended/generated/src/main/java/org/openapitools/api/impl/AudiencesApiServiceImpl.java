package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateCustomRequest;
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

import io.swagger.annotations.Api;

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
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
     *
     */
    @Override
    public Audience audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create custom audience
     *
     * Create a custom audience and find the audiences you want your ads to reach.
     *
     */
    @Override
    public Audience audiencesCreateCustom(String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get audience
     *
     * Get a specific audience given the audience ID.
     *
     */
    @Override
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
    @Override
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
    @Override
    public Audience audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest) {
        // TODO: Implement...
        return null;
    }

}
