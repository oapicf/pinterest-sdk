package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdArrayResponse;
import org.openapitools.server.api.model.AdCreateRequest;
import org.openapitools.server.api.model.AdPreviewRequest;
import org.openapitools.server.api.model.AdPreviewURLResponse;
import org.openapitools.server.api.model.AdResponse;
import org.openapitools.server.api.model.AdUpdateRequest;
import org.openapitools.server.api.model.AdsAnalyticsAdTargetingType;
import org.openapitools.server.api.model.AdsAnalyticsResponseInner;
import org.openapitools.server.api.model.AdsList200Response;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;

public final class AdsApiException extends MainApiException {
    public AdsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AdsApiException Ads_adPreviewsCreate_200_Exception = new AdsApiException(200, "Successful ad preview creation.");
    public static final AdsApiException Ads_adPreviewsCreate_400_Exception = new AdsApiException(400, "Invalid Pin parameters response");
    public static final AdsApiException Ads_adTargetingAnalyticsGet_200_Exception = new AdsApiException(200, "Success");
    public static final AdsApiException Ads_adsAnalytics_200_Exception = new AdsApiException(200, "Success");
    public static final AdsApiException Ads_adsAnalytics_400_Exception = new AdsApiException(400, "Invalid ad account ads analytics parameters.");
    public static final AdsApiException Ads_adsCreate_200_Exception = new AdsApiException(200, "Success");
    public static final AdsApiException Ads_adsGet_200_Exception = new AdsApiException(200, "Success");
    public static final AdsApiException Ads_adsList_200_Exception = new AdsApiException(200, "Success");
    public static final AdsApiException Ads_adsList_400_Exception = new AdsApiException(400, "Invalid ad account ads parameters.");
    public static final AdsApiException Ads_adsUpdate_200_Exception = new AdsApiException(200, "Success");
    

}