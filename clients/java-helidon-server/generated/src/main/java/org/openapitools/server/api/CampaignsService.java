package org.openapitools.server.api;

import org.openapitools.server.model.AdPinAnalytics;
import org.openapitools.server.model.AdsAnalyticsCampaignTargetingType;
import java.math.BigDecimal;
import org.openapitools.server.model.Campaign;
import org.openapitools.server.model.CampaignBatchUpdateItem;
import org.openapitools.server.model.CampaignBatchWriteResponseModel;
import org.openapitools.server.model.CampaignCreateItem;
import org.openapitools.server.model.CampaignDeliveryEstimatesCampaign;
import org.openapitools.server.model.CampaignDeliveryEstimatesResponse;
import org.openapitools.server.model.CampaignsAnalyticsMetrics;
import org.openapitools.server.model.CampaignsList200Response;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.GenericTypes;
import org.openapitools.server.model.Granularity;
import java.util.HexFormat;
import java.util.List;
import java.time.LocalDate;
import org.openapitools.server.model.MetricsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import org.openapitools.server.model.ReportingColumnSync;
import org.openapitools.server.model.ReportingTimeZone;
import io.helidon.http.Status;
import jakarta.validation.Valid;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Campaigns'",
                             version = "7.24.0")
public interface CampaignsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/pins/analytics", this::adPinsAnalytics);
        rules.get("/campaigns/targeting_analytics", this::campaignTargetingAnalyticsGet);
        rules.get("/campaigns/analytics", this::campaignsAnalytics);
        rules.post("/campaigns", this::campaignsCreate);
        rules.get("/campaigns/{campaign_id}", this::campaignsGet);
        rules.get("/campaigns", this::campaignsList);
        rules.patch("/campaigns", this::campaignsUpdate);
        rules.post("/campaigns/delivery_estimates", this::getCampaignDeliveryEstimates);
    }


    /**
     * GET /ad_accounts/{ad_account_id}/pins/analytics : Get pins analytics.
     *
     * @param request the server request
     * @param response the server response
     */
    void adPinsAnalytics(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/campaigns/targeting_analytics : Get targeting analytics for campaigns.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignTargetingAnalyticsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/campaigns/analytics : Get campaign analytics.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignsAnalytics(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/campaigns : Create campaigns.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignsCreate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/campaigns/{campaign_id} : Get campaign.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/campaigns : List campaigns.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignsList(ServerRequest request, ServerResponse response);
    /**
     * PATCH /ad_accounts/{ad_account_id}/campaigns : Update campaigns.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignsUpdate(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/campaigns/delivery_estimates : Get campaign delivery estimates.
     *
     * @param request the server request
     * @param response the server response
     */
    void getCampaignDeliveryEstimates(ServerRequest request, ServerResponse response);
}
