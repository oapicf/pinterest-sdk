package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConversionMSOTEventsCreate;
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


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class MsotEventsApiServiceImpl implements MsotEventsApi {
    /**
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     *
     * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
     *
     */
    public void msotEventsCreate(String adAccountId, ConversionMSOTEventsCreate conversionMSOTEventsCreate) {
        // TODO: Implement...

        
    }

}
