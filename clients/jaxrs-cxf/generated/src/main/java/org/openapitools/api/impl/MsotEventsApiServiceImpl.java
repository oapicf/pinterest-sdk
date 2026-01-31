package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConversionMSOTEvents;
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
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.
     *
     */
    public void msotEventsCreate(String adAccountId, ConversionMSOTEvents conversionMSOTEvents) {
        // TODO: Implement...

        
    }

}
