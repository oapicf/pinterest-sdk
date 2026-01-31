package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionTag;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagsList200Response;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.PinterestLibError;

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
public class ConversionTagsApiServiceImpl implements ConversionTagsApi {
    /**
     * Create conversion tag
     *
     * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
     *
     */
    @Override
    public ConversionTag conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get conversion tag
     *
     * Get information about an existing conversion tag.
     *
     */
    @Override
    public ConversionTag conversionTagsGet(String adAccountId, String conversionTagId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List conversion tags
     *
     * List conversion tags associated with an ad account.
     *
     */
    @Override
    public ConversionTagsList200Response conversionTagsList(String adAccountId, Boolean filterDeleted) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get Ocpm eligible conversion tags
     *
     * Get Ocpm eligible conversion tag events for an ad account.
     *
     */
    @Override
    public Map<String, List<ConversionEventResponse>> ocpmEligibleConversionTagsGet(String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get page visit conversion tags
     *
     * Get all page visit conversion tag events for an ad account.
     *
     */
    @Override
    public PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(String adAccountId, Integer pageSize, String order, String bookmark) {
        // TODO: Implement...
        return null;
    }

}
