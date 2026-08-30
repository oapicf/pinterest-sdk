package org.openapitools.server.api;

import org.openapitools.server.model.AdAccount;
import org.openapitools.server.model.AdAccountAnalyticsItems;
import org.openapitools.server.model.AdAccountCreate;
import org.openapitools.server.model.AdAccountsList200Response;
import org.openapitools.server.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.model.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionProductReport;
import org.openapitools.server.model.ConversionProductReportCreate;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.Granularity;
import java.util.HexFormat;
import java.util.List;
import java.time.LocalDate;
import org.openapitools.server.model.MMMReport;
import org.openapitools.server.model.MMMReportCreate;
import org.openapitools.server.model.MetricsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import org.openapitools.server.model.ReportingColumnSync;
import org.openapitools.server.model.ReportingTimeZone;
import io.helidon.http.Status;
import org.openapitools.server.model.TemplateBasedReport;
import org.openapitools.server.model.TemplatesList200Response;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'AdAccounts'",
                             version = "7.24.0")
public interface AdAccountsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/{ad_account_id}/analytics", this::adAccountAnalytics);
        rules.get("/{ad_account_id}/targeting_analytics", this::adAccountTargetingAnalyticsGet);
        rules.post("/", this::adAccountsCreate);
        rules.get("/{ad_account_id}", this::adAccountsGet);
        rules.get("/", this::adAccountsList);
        rules.post("/{ad_account_id}/reports/brand_category_sku", this::analyticsCreateConversionProductReport);
        rules.post("/{ad_account_id}/mmm_reports", this::analyticsCreateMmmReport);
        rules.post("/{ad_account_id}/reports", this::analyticsCreateReport);
        rules.post("/{ad_account_id}/templates/{template_id}/reports", this::analyticsCreateTemplateReport);
        rules.get("/{ad_account_id}/reports/brand_category_sku", this::analyticsGetConversionProductReport);
        rules.get("/{ad_account_id}/mmm_reports", this::analyticsGetMmmReport);
        rules.get("/{ad_account_id}/reports", this::analyticsGetReport);
        rules.delete("/{ad_account_id}/sandbox", this::sandboxDelete);
        rules.get("/{ad_account_id}/templates", this::templatesList);
    }


    /**
     * GET /ad_accounts/{ad_account_id}/analytics : Get ad account analytics.
     *
     * @param request the server request
     * @param response the server response
     */
    void adAccountAnalytics(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/targeting_analytics : Get targeting analytics for an ad account.
     *
     * @param request the server request
     * @param response the server response
     */
    void adAccountTargetingAnalyticsGet(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts : Create ad account.
     *
     * @param request the server request
     * @param response the server response
     */
    void adAccountsCreate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id} : Get ad account.
     *
     * @param request the server request
     * @param response the server response
     */
    void adAccountsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts : List ad accounts.
     *
     * @param request the server request
     * @param response the server response
     */
    void adAccountsList(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/reports/brand_category_sku : Create a request for a brand, category, SKU report.
     *
     * @param request the server request
     * @param response the server response
     */
    void analyticsCreateConversionProductReport(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/mmm_reports : Create a request for a Marketing Mix Modeling (MMM) report.
     *
     * @param request the server request
     * @param response the server response
     */
    void analyticsCreateMmmReport(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/reports : Create async request for an account analytics report.
     *
     * @param request the server request
     * @param response the server response
     */
    void analyticsCreateReport(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/templates/{template_id}/reports : Create async request for an analytics report using a template.
     *
     * @param request the server request
     * @param response the server response
     */
    void analyticsCreateTemplateReport(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/reports/brand_category_sku : Get advertiser brand, category, SKU report.
     *
     * @param request the server request
     * @param response the server response
     */
    void analyticsGetConversionProductReport(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/mmm_reports : Get advertiser Marketing Mix Modeling (MMM) report..
     *
     * @param request the server request
     * @param response the server response
     */
    void analyticsGetMmmReport(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/reports : Get the account analytics report created by the async call.
     *
     * @param request the server request
     * @param response the server response
     */
    void analyticsGetReport(ServerRequest request, ServerResponse response);
    /**
     * DELETE /ad_accounts/{ad_account_id}/sandbox : Delete ads data for ad account in API Sandbox.
     *
     * @param request the server request
     * @param response the server response
     */
    void sandboxDelete(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/templates : List templates.
     *
     * @param request the server request
     * @param response the server response
     */
    void templatesList(ServerRequest request, ServerResponse response);
}
