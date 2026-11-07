package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
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
public class CustomerListUploadsApiServiceImpl implements CustomerListUploadsApi {
    /**
     * Create customer list upload
     *
     * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
     *
     */
    @Override
    public CustomerListUploadCreateResponse customerListUploadsCreate(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get customer list upload
     *
     * Get the metadata for a given upload by its ID.
     *
     */
    @Override
    public CustomerListUpload customerListUploadsGet(String adAccountId, String customerListId, String customerListUploadId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Run customer list upload
     *
     * Begin processing a customer list upload.
     *
     */
    @Override
    public CustomerListUpload customerListUploadsRun(String adAccountId, String customerListId, String customerListUploadId) {
        // TODO: Implement...
        return null;
    }

}
