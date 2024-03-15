package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
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
public class BulkApiServiceImpl implements BulkApi {
    /**
     * Get advertiser entities in bulk
     *
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     *
     */
    public BulkDownloadResponse bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Download advertiser entities in bulk
     *
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     *
     */
    public BulkUpsertStatusResponse bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create/update ad entities in bulk
     *
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     *
     */
    public BulkUpsertResponse bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest) {
        // TODO: Implement...

        return null;
    }

}
