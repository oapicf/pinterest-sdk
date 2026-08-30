package org.openapitools.server.api;

import org.openapitools.server.model.Ad;
import org.openapitools.server.model.AdBatchUpdate;
import org.openapitools.server.model.AdBatchWriteResponseModel;
import org.openapitools.server.model.AdCreate;
import org.openapitools.server.model.AdPreviewRequest;
import org.openapitools.server.model.AdPreviewURLResponse;
import org.openapitools.server.model.AdsAnalytics;
import org.openapitools.server.model.AdsAnalyticsAdTargetingType;
import org.openapitools.server.model.AdsList200Response;
import java.math.BigDecimal;
import org.openapitools.server.model.CampaignAdPreview;
import org.openapitools.server.model.CampaignAdPreviewCreate;
import org.openapitools.server.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.server.model.CampaignAdPreviewDelete200ResponseInner;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionAttributionWindowDays;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.ConversionReportTimeType;
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
                             trigger = "tag = 'Ads'",
                             version = "7.24.0")
public interface AdsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/ad_previews", this::adPreviewsCreate);
        rules.get("/ads/targeting_analytics", this::adTargetingAnalyticsGet);
        rules.get("/ads/analytics", this::adsAnalytics);
        rules.post("/ads", this::adsCreate);
        rules.get("/ads/{ad_id}", this::adsGet);
        rules.get("/ads", this::adsList);
        rules.patch("/ads", this::adsUpdate);
        rules.post("/campaign_ad_preview", this::campaignAdPreviewCreate);
        rules.delete("/campaign_ad_preview", this::campaignAdPreviewDelete);
        rules.get("/campaign_ad_preview", this::campaignAdPreviewRead);
    }


    /**
     * POST /ad_accounts/{ad_account_id}/ad_previews : Create ad preview with pin or image.
     *
     * @param request the server request
     * @param response the server response
     */
    void adPreviewsCreate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ads/targeting_analytics : Get targeting analytics for ads.
     *
     * @param request the server request
     * @param response the server response
     */
    void adTargetingAnalyticsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ads/analytics : Get ad analytics.
     *
     * @param request the server request
     * @param response the server response
     */
    void adsAnalytics(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/ads : Create ads.
     *
     * @param request the server request
     * @param response the server response
     */
    void adsCreate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ads/{ad_id} : Get ad.
     *
     * @param request the server request
     * @param response the server response
     */
    void adsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ads : List ads.
     *
     * @param request the server request
     * @param response the server response
     */
    void adsList(ServerRequest request, ServerResponse response);
    /**
     * PATCH /ad_accounts/{ad_account_id}/ads : Update ads.
     *
     * @param request the server request
     * @param response the server response
     */
    void adsUpdate(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/campaign_ad_preview : Create ad preview records for one or more ad groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignAdPreviewCreate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /ad_accounts/{ad_account_id}/campaign_ad_preview : Delete ad preview records for one or more ad groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignAdPreviewDelete(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/campaign_ad_preview : Fetch ad preview records for one or more ad groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void campaignAdPreviewRead(ServerRequest request, ServerResponse response);
}
