package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.EventQualityScore;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SourcePlatformOptions;

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
public class ConversionEqsApiServiceImpl implements ConversionEqsApi {
    /**
     * Get event quality score (EQS)
     *
     * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     *
     */
    @Override
    public List<EventQualityScore> conversionEqsList(LookbackPeriodOptions lookbackPeriod, String adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource) {
        // TODO: Implement...
        return null;
    }

}
