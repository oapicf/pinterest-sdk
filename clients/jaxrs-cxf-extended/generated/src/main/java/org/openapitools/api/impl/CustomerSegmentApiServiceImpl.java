package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CustomerSegment;
import org.openapitools.model.CustomerSegmentCreate;
import org.openapitools.model.CustomerSegmentList200Response;
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
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

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class CustomerSegmentApiServiceImpl implements CustomerSegmentApi {
    /**
     * Create customer segments
     *
     * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
     *
     */
    @Override
    public CustomerSegment customerSegmentCreate(String adAccountId, CustomerSegmentCreate customerSegmentCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * List customer segments
     *
     * Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
     *
     */
    @Override
    public CustomerSegmentList200Response customerSegmentList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update customer segments
     *
     * Update the customer segment given advertiser ID and customer segment ID
     *
     */
    @Override
    public void customerSegmentUpdate(String adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody) {
        // TODO: Implement...

    }

}
