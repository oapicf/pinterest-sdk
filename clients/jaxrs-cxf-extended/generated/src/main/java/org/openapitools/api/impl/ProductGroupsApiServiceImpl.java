package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response;
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
public class ProductGroupsApiServiceImpl implements ProductGroupsApi {
    /**
     * Get catalog product groups
     *
     * This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
     *
     */
    @Override
    public AdAccountsCatalogsProductGroupsList200Response adAccountsCatalogsProductGroupsList(String adAccountId, String feedProfileId) {
        // TODO: Implement...
        return null;
    }

}
