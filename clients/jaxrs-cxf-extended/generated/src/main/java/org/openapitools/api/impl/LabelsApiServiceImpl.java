package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabeledEntities;
import org.openapitools.model.LabeledEntitiesCreate;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QueryLabelEntityStatusesItems;
import org.openapitools.model.QueryLabelTypesItems;

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
     * Apply label to entity
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
     *
     */
    @Override
    public LabeledEntities labelsApply(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
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
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
     *
     */
    @Override
    public LabelsList200Response labelsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds, List<QueryLabelEntityStatusesItems> entityStatuses, List<QueryLabelTypesItems> labelTypes, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Remove label from entities
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
     *
     */
    @Override
    public LabeledEntities labelsRemove(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
     *
     */
    @Override
    public LabelsResponse labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest) {
        // TODO: Implement...
        return null;
    }

}
