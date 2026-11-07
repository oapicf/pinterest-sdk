package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.model.AdvertiserDefinedEventsGet200Response;
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
public class ConversionsApiServiceImpl implements ConversionsApi {
    /**
     * Create advertiser defined events
     *
     * Map advertiser defined events to standard events for the given ad account.
     *
     */
    @Override
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete advertiser defined events
     *
     * Untrack advertiser defined events for the given ad account.
     *
     */
    @Override
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete(String adAccountId, List<String> eventNames) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get advertiser defined events
     *
     * Get advertiser defined events for the given ad account.
     *
     */
    @Override
    public AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet(String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update advertiser defined events
     *
     * Update advertiser defined event names or mappings for the given ad account.
     *
     */
    @Override
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) {
        // TODO: Implement...
        return null;
    }

}
