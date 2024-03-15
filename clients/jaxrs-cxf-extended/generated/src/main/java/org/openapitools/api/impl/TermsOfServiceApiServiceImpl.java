package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.TermsOfService;

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
public class TermsOfServiceApiServiceImpl implements TermsOfServiceApi {
    /**
     * Get terms of service
     *
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     *
     */
    @Override
    public TermsOfService termsOfServiceGet(String adAccountId, Boolean includeHtml, String tosType) {
        // TODO: Implement...
        return null;
    }

}
