package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagListResponse;
import org.openapitools.model.ConversionTagResponse;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.PageVisitConversionTagsGet200Response;

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
     * Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/#enhanced-match\&quot;&gt;Enhanced match&lt;/a&gt;
     *
     */
    @Override
    public ConversionTagResponse conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate) {
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
    public ConversionTagResponse conversionTagsGet(String adAccountId, String conversionTagId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get conversion tags
     *
     * List conversion tags associated with an ad account.
     *
     */
    @Override
    public ConversionTagListResponse conversionTagsList(String adAccountId, Boolean filterDeleted) {
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
