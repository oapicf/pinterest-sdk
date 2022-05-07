package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;

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
public class OauthApiServiceImpl implements OauthApi {
    /**
     * Generate OAuth access token
     *
     * Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.
     *
     */
    public OauthAccessTokenResponse oauthToken(String grantType) {
        // TODO: Implement...

        return null;
    }

}
