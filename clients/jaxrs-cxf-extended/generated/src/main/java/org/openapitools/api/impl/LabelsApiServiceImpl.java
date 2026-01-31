package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;

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
public class LabelsApiServiceImpl implements LabelsApi {
    /**
     * Create labels
     *
     * &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;
     *
     */
    @Override
    public LabelsResponse labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * List labels
     *
     * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;
     *
     */
    @Override
    public LabelsList200Response labelsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds, List<String> entityStatuses, List<String> labelTypes, Integer pageSize, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update labels
     *
     * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;
     *
     */
    @Override
    public LabelsResponse labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest) {
        // TODO: Implement...
        return null;
    }

}
