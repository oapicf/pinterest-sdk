package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;

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
public class OrderLinesApiServiceImpl implements OrderLinesApi {
    /**
     * Get order line
     *
     * Get a specific existing order line associated with an ad account.
     *
     */
    @Override
    public OrderLine orderLinesGet(String adAccountId, String orderLineId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get order lines
     *
     * List existing order lines associated with an ad account.
     *
     */
    @Override
    public OrderLinesList200Response orderLinesList(String adAccountId, Integer pageSize, String order, String bookmark) {
        // TODO: Implement...
        return null;
    }

}
