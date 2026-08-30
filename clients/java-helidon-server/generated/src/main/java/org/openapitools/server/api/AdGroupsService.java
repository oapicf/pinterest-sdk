package org.openapitools.server.api;

import org.openapitools.server.model.AdGroup;
import org.openapitools.server.model.AdGroupAudienceSizing;
import org.openapitools.server.model.AdGroupAudienceSizingCreate;
import org.openapitools.server.model.AdGroupCreateCreate;
import org.openapitools.server.model.AdGroupUpdateBatchUpdate;
import org.openapitools.server.model.AdGroupsAnalyticsMetrics;
import org.openapitools.server.model.AdGroupsCreate200Response;
import org.openapitools.server.model.AdGroupsList200Response;
import org.openapitools.server.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.server.model.BidFloor;
import org.openapitools.server.model.BidFloorCreate;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.DynamicTitlesDownloadCSV;
import org.openapitools.server.model.DynamicTitlesGetStatus;
import org.openapitools.server.model.DynamicTitlesProcessCSV;
import org.openapitools.server.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.server.model.DynamicTitlesUploadURL;
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
                             trigger = "tag = 'AdGroups'",
                             version = "7.24.0")
public interface AdGroupsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/ad_groups/analytics", this::adGroupsAnalytics);
        rules.post("/ad_groups/audience_sizing", this::adGroupsAudienceSizing);
        rules.post("/bid_floor", this::adGroupsBidFloorGet);
        rules.post("/ad_groups", this::adGroupsCreate);
        rules.get("/ad_groups/{ad_group_id}/dynamic_titles/csv", this::adGroupsDynamicTitlesDownloadCsv);
        rules.get("/ad_groups/{ad_group_id}/dynamic_titles/status", this::adGroupsDynamicTitlesGetStatus);
        rules.get("/ad_groups/{ad_group_id}/dynamic_titles/uploads", this::adGroupsDynamicTitlesGetUploadUrl);
        rules.post("/ad_groups/{ad_group_id}/dynamic_titles", this::adGroupsDynamicTitlesProcessCsv);
        rules.get("/ad_groups/{ad_group_id}", this::adGroupsGet);
        rules.get("/ad_groups", this::adGroupsList);
        rules.get("/ad_groups/targeting_analytics", this::adGroupsTargetingAnalyticsGet);
        rules.patch("/ad_groups", this::adGroupsUpdate);
        rules.get("/promotion_applied_entities", this::getAdGroupsByPromotionIdsList);
    }


    /**
     * GET /ad_accounts/{ad_account_id}/ad_groups/analytics : Get ad group analytics.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsAnalytics(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/ad_groups/audience_sizing : Get audience sizing.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsAudienceSizing(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/bid_floor : Get bid floors.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsBidFloorGet(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/ad_groups : Create ad groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsCreate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv : Get dynamic titles CSV download URL.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsDynamicTitlesDownloadCsv(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status : Get dynamic titles status.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsDynamicTitlesGetStatus(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads : Get dynamic titles upload URL.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsDynamicTitlesGetUploadUrl(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles : Process dynamic titles CSV.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsDynamicTitlesProcessCsv(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} : Get ad group.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ad_groups : List ad groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsList(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics : Get targeting analytics for ad groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsTargetingAnalyticsGet(ServerRequest request, ServerResponse response);
    /**
     * PATCH /ad_accounts/{ad_account_id}/ad_groups : Update ad groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void adGroupsUpdate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/promotion_applied_entities : List of ad groups using promotions IDs..
     *
     * @param request the server request
     * @param response the server response
     */
    void getAdGroupsByPromotionIdsList(ServerRequest request, ServerResponse response);
}
