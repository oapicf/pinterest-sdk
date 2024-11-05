package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.server.api.model.CampaignCreateRequest;
import org.openapitools.server.api.model.CampaignCreateResponse;
import org.openapitools.server.api.model.CampaignResponse;
import org.openapitools.server.api.model.CampaignUpdateRequest;
import org.openapitools.server.api.model.CampaignUpdateResponse;
import org.openapitools.server.api.model.CampaignsAnalyticsResponseInner;
import org.openapitools.server.api.model.CampaignsList200Response;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;

public final class CampaignsApiException extends MainApiException {
    public CampaignsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final CampaignsApiException Campaigns_campaignTargetingAnalyticsGet_200_Exception = new CampaignsApiException(200, "Success");
    public static final CampaignsApiException Campaigns_campaignsAnalytics_200_Exception = new CampaignsApiException(200, "Success");
    public static final CampaignsApiException Campaigns_campaignsAnalytics_400_Exception = new CampaignsApiException(400, "Invalid ad account campaign analytics parameters.");
    public static final CampaignsApiException Campaigns_campaignsCreate_200_Exception = new CampaignsApiException(200, "response");
    public static final CampaignsApiException Campaigns_campaignsGet_200_Exception = new CampaignsApiException(200, "Success");
    public static final CampaignsApiException Campaigns_campaignsList_200_Exception = new CampaignsApiException(200, "Success");
    public static final CampaignsApiException Campaigns_campaignsList_400_Exception = new CampaignsApiException(400, "Invalid ad account campaign parameters.");
    public static final CampaignsApiException Campaigns_campaignsUpdate_200_Exception = new CampaignsApiException(200, "response");
    

}