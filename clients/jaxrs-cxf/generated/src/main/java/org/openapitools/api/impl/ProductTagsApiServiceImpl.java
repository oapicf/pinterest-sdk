package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductTagsBulkAddRequest;
import org.openapitools.model.ProductTagsBulkDeleteRequest;
import org.openapitools.model.ProductTagsError;
import org.openapitools.model.ProductTagsResponse;

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
public class ProductTagsApiServiceImpl implements ProductTagsApi {
    /**
     * Add product tags to pin
     *
     * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
     *
     */
    public ProductTagsResponse productTagsBulkAdd(String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete product tags from pin
     *
     * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
     *
     */
    public void productTagsBulkDelete(String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest) {
        // TODO: Implement...

        
    }

    /**
     * Get product tags for pin
     *
     * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
     *
     */
    public ProductTagsResponse productTagsList(String pinId) {
        // TODO: Implement...

        return null;
    }

}
