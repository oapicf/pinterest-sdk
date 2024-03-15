/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Methods;

/**
 * The default implementation for {@link HandlerProvider} and {@link PathHandlerInterface}.
 *
 * <p>There are two flavors of {@link HttpHandler}s to choose from, depending on your needs:</p>
 *
 * <ul>
 * <li>
 * <b>Stateless</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is not retained – a different {@link HttpHandler} is instantiated for every new
 * session. This is the default behavior.
 * </li>
 * <li>
 * <b>Stateful</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is retained properly. For example, if you want to keep a class property that counts
 * the number of requests or the last time a request was received.
 * </li>
 * </ul>
 * <p>Note: <b>Stateful</b> flavor is more performant than <b>Stateless</b>.</p>
 */
@SuppressWarnings("TooManyFunctions")
abstract public class PathHandlerProvider implements HandlerProvider, PathHandlerInterface {
    /**
     * Returns the default base path to access this server.
     */
    @javax.annotation.Nonnull
    public String getBasePath() {
        return "/v5";
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "/v5", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("/v5", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
    * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    @Override
    public HttpHandler getHandler() {
        return getHandler(false);
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with "/v5"
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final boolean withBasePath) {
        return getHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @SuppressWarnings("Convert2Lambda")
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/targeting_analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountTargetingAnalyticsGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/mmm_reports", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsCreateMmmReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/reports", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsCreateReport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/templates/{template_id}/reports", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsCreateTemplateReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/mmm_reports", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsGetMmmReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/reports", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsGetReport().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/ad_accounts/{ad_account_id}/sandbox", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    sandboxDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/templates", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    templatesList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsAudienceSizing().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/bid_floor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsBidFloorGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ad_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsTargetingAnalyticsGet().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/ad_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ad_previews", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adPreviewsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/targeting_analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adTargetingAnalyticsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/{ad_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsList().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/ads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/audience_insights", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    audienceInsightsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/insights/audiences", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    audienceInsightsScopeAndTypeGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/audiences", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    audiencesCreate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/audiences/custom", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    audiencesCreateCustom().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    audiencesGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/audiences", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    audiencesList().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    audiencesUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ads_credit/redeem", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsCreditRedeem().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads_credit/discounts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsCreditsDiscountsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/billing_profiles", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    billingProfilesGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/accounts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    ssioAccountsGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    ssioInsertionOrderCreate().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    ssioInsertionOrderEdit().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    ssioInsertionOrdersStatusGetByAdAccount().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    ssioInsertionOrdersStatusGetByPinOrderId().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/order_lines", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    ssioOrderLinesGetByAdAccount().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/boards/{board_id}/sections", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardSectionsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/boards/{board_id}/sections/{section_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardSectionsDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/boards/{board_id}/sections", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardSectionsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/boards/{board_id}/sections/{section_id}/pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardSectionsListPins().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/boards/{board_id}/sections/{section_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardSectionsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/boards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/boards/{board_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardsDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/boards/{board_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/boards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/boards/{board_id}/pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardsListPins().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/boards/{board_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/bulk/download", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    bulkDownloadCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    bulkRequestGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/bulk/upsert", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    bulkUpsertCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignTargetingAnalyticsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignsList().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/product_groups/{product_group_id}/products", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupPinsList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/catalogs/product_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/catalogs/product_groups/{product_group_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupsDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/product_groups/{product_group_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/product_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/product_groups/{product_group_id}/product_counts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupsProductCountsGet().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/catalogs/product_groups/{product_group_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/feeds/{feed_id}/processing_results", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    feedProcessingResultsList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/catalogs/feeds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    feedsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/catalogs/feeds/{feed_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    feedsDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/feeds/{feed_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    feedsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/feeds", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    feedsList().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/catalogs/feeds/{feed_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    feedsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/items/batch/{batch_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemsBatchGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/catalogs/items/batch", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemsBatchPost().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/items", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/catalogs/processing_results/{processing_result_id}/item_issues", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    itemsIssuesList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/catalogs/products/get_by_product_group_filters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    productsByProductGroupFilterList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/events", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    eventsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/conversion_tags", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    conversionTagsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    conversionTagsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    conversionTagsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    ocpmEligibleConversionTagsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags/page_visit", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pageVisitConversionTagsGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/customer_lists", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    customerListsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    customerListsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/customer_lists", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    customerListsList().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    customerListsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/integrations/commerce/{external_business_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    integrationsCommerceDel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/integrations/commerce/{external_business_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    integrationsCommerceGet().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/integrations/commerce/{external_business_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    integrationsCommercePatch().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/integrations/commerce", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    integrationsCommercePost().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/integrations/{id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    integrationsGetById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/integrations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    integrationsGetList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/integrations/logs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    integrationsLogsPost().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/keywords/metrics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    countryKeywordsMetricsGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/keywords", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    keywordsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/keywords", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    keywordsGet().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/keywords", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    keywordsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/trends/keywords/{region}/top/{trend_type}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    trendingKeywordsList().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsSubscriptionsDelById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsSubscriptionsGetById().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsSubscriptionsGetList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsSubscriptionsPost().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    leadFormGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    leadFormTestCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/lead_forms", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    leadFormsList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/media", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    mediaCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/media/{media_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    mediaGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/media", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    mediaList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/oauth/token", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    oauthToken().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orderLinesGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/order_lines", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orderLinesList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/pins/{pin_id}/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pinsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pinsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/pins/{pin_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pinsDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/pins/{pin_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pinsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pinsList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/pins/{pin_id}/save", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pinsSave().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/pins/{pin_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    pinsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    productGroupPromotionsCreate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    productGroupPromotionsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    productGroupPromotionsList().handleRequest(exchange);
                }
            })
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    productGroupPromotionsUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_groups/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    productGroupsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_groups/catalogs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsCatalogsProductGroupsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/resources/ad_account_countries", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountCountriesGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/resources/delivery_metrics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deliveryMetricsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/resources/targeting/interests/{interest_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    interestTargetingOptionsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/resources/lead_form_questions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    leadFormQuestionsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/resources/metrics_ready_state", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    metricsReadyStateGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/resources/targeting/{targeting_type}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    targetingOptionsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/search/partner/pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchPartnerPins().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/search/boards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchUserBoardsGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/search/pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    searchUserPinsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/terms/related", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    termsRelatedList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/terms/suggested", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    termsSuggestedList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/terms_of_service", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    termsOfServiceGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/following/boards", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    boardsUserFollowsList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/user_account/following/{username}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    followUserUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/followers", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    followersList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/businesses", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    linkedBusinessAccountsGet().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/user_account/websites", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    unverifyWebsiteDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userAccountAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/analytics/top_pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userAccountAnalyticsTopPins().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/analytics/top_video_pins", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userAccountAnalyticsTopVideoPins().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/users/{username}/interests/follow", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userAccountFollowedInterests().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userAccountGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/following", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userFollowingGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/websites", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userWebsitesGet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/user_account/websites", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    verifyWebsiteUpdate().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account/websites/verification", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    websiteVerificationGet().handleRequest(exchange);
                }
            })
            ;
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "/v5", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("/v5", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler() {
        return getStatefulHandler(false);
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with "/v5"
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final boolean withBasePath) {
        return getStatefulHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/analytics", adAccountAnalytics())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/targeting_analytics", adAccountTargetingAnalyticsGet())
            .add(Methods.POST, basePath + "/ad_accounts", adAccountsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}", adAccountsGet())
            .add(Methods.GET, basePath + "/ad_accounts", adAccountsList())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/mmm_reports", analyticsCreateMmmReport())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/reports", analyticsCreateReport())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/templates/{template_id}/reports", analyticsCreateTemplateReport())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/mmm_reports", analyticsGetMmmReport())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/reports", analyticsGetReport())
            .add(Methods.DELETE, basePath + "/ad_accounts/{ad_account_id}/sandbox", sandboxDelete())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/templates", templatesList())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/analytics", adGroupsAnalytics())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing", adGroupsAudienceSizing())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/bid_floor", adGroupsBidFloorGet())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ad_groups", adGroupsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}", adGroupsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups", adGroupsList())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics", adGroupsTargetingAnalyticsGet())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/ad_groups", adGroupsUpdate())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ad_previews", adPreviewsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/targeting_analytics", adTargetingAnalyticsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/analytics", adsAnalytics())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ads", adsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/{ad_id}", adsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads", adsList())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/ads", adsUpdate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/audience_insights", audienceInsightsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/insights/audiences", audienceInsightsScopeAndTypeGet())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/audiences", audiencesCreate())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/audiences/custom", audiencesCreateCustom())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}", audiencesGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/audiences", audiencesList())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}", audiencesUpdate())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ads_credit/redeem", adsCreditRedeem())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads_credit/discounts", adsCreditsDiscountsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/billing_profiles", billingProfilesGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/accounts", ssioAccountsGet())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders", ssioInsertionOrderCreate())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders", ssioInsertionOrderEdit())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status", ssioInsertionOrdersStatusGetByAdAccount())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status", ssioInsertionOrdersStatusGetByPinOrderId())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ssio/order_lines", ssioOrderLinesGetByAdAccount())
            .add(Methods.POST, basePath + "/boards/{board_id}/sections", boardSectionsCreate())
            .add(Methods.DELETE, basePath + "/boards/{board_id}/sections/{section_id}", boardSectionsDelete())
            .add(Methods.GET, basePath + "/boards/{board_id}/sections", boardSectionsList())
            .add(Methods.GET, basePath + "/boards/{board_id}/sections/{section_id}/pins", boardSectionsListPins())
            .add(Methods.PATCH, basePath + "/boards/{board_id}/sections/{section_id}", boardSectionsUpdate())
            .add(Methods.POST, basePath + "/boards", boardsCreate())
            .add(Methods.DELETE, basePath + "/boards/{board_id}", boardsDelete())
            .add(Methods.GET, basePath + "/boards/{board_id}", boardsGet())
            .add(Methods.GET, basePath + "/boards", boardsList())
            .add(Methods.GET, basePath + "/boards/{board_id}/pins", boardsListPins())
            .add(Methods.PATCH, basePath + "/boards/{board_id}", boardsUpdate())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/bulk/download", bulkDownloadCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}", bulkRequestGet())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/bulk/upsert", bulkUpsertCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics", campaignTargetingAnalyticsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/analytics", campaignsAnalytics())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/campaigns", campaignsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}", campaignsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns", campaignsList())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/campaigns", campaignsUpdate())
            .add(Methods.GET, basePath + "/catalogs", catalogsList())
            .add(Methods.GET, basePath + "/catalogs/product_groups/{product_group_id}/products", catalogsProductGroupPinsList())
            .add(Methods.POST, basePath + "/catalogs/product_groups", catalogsProductGroupsCreate())
            .add(Methods.DELETE, basePath + "/catalogs/product_groups/{product_group_id}", catalogsProductGroupsDelete())
            .add(Methods.GET, basePath + "/catalogs/product_groups/{product_group_id}", catalogsProductGroupsGet())
            .add(Methods.GET, basePath + "/catalogs/product_groups", catalogsProductGroupsList())
            .add(Methods.GET, basePath + "/catalogs/product_groups/{product_group_id}/product_counts", catalogsProductGroupsProductCountsGet())
            .add(Methods.PATCH, basePath + "/catalogs/product_groups/{product_group_id}", catalogsProductGroupsUpdate())
            .add(Methods.GET, basePath + "/catalogs/feeds/{feed_id}/processing_results", feedProcessingResultsList())
            .add(Methods.POST, basePath + "/catalogs/feeds", feedsCreate())
            .add(Methods.DELETE, basePath + "/catalogs/feeds/{feed_id}", feedsDelete())
            .add(Methods.GET, basePath + "/catalogs/feeds/{feed_id}", feedsGet())
            .add(Methods.GET, basePath + "/catalogs/feeds", feedsList())
            .add(Methods.PATCH, basePath + "/catalogs/feeds/{feed_id}", feedsUpdate())
            .add(Methods.GET, basePath + "/catalogs/items/batch/{batch_id}", itemsBatchGet())
            .add(Methods.POST, basePath + "/catalogs/items/batch", itemsBatchPost())
            .add(Methods.GET, basePath + "/catalogs/items", itemsGet())
            .add(Methods.GET, basePath + "/catalogs/processing_results/{processing_result_id}/item_issues", itemsIssuesList())
            .add(Methods.POST, basePath + "/catalogs/products/get_by_product_group_filters", productsByProductGroupFilterList())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/events", eventsCreate())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/conversion_tags", conversionTagsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}", conversionTagsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags", conversionTagsList())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible", ocpmEligibleConversionTagsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/conversion_tags/page_visit", pageVisitConversionTagsGet())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/customer_lists", customerListsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}", customerListsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/customer_lists", customerListsList())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}", customerListsUpdate())
            .add(Methods.DELETE, basePath + "/integrations/commerce/{external_business_id}", integrationsCommerceDel())
            .add(Methods.GET, basePath + "/integrations/commerce/{external_business_id}", integrationsCommerceGet())
            .add(Methods.PATCH, basePath + "/integrations/commerce/{external_business_id}", integrationsCommercePatch())
            .add(Methods.POST, basePath + "/integrations/commerce", integrationsCommercePost())
            .add(Methods.GET, basePath + "/integrations/{id}", integrationsGetById())
            .add(Methods.GET, basePath + "/integrations", integrationsGetList())
            .add(Methods.POST, basePath + "/integrations/logs", integrationsLogsPost())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/keywords/metrics", countryKeywordsMetricsGet())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/keywords", keywordsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/keywords", keywordsGet())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/keywords", keywordsUpdate())
            .add(Methods.GET, basePath + "/trends/keywords/{region}/top/{trend_type}", trendingKeywordsList())
            .add(Methods.DELETE, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}", adAccountsSubscriptionsDelById())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}", adAccountsSubscriptionsGetById())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions", adAccountsSubscriptionsGetList())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/leads/subscriptions", adAccountsSubscriptionsPost())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}", leadFormGet())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test", leadFormTestCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/lead_forms", leadFormsList())
            .add(Methods.POST, basePath + "/media", mediaCreate())
            .add(Methods.GET, basePath + "/media/{media_id}", mediaGet())
            .add(Methods.GET, basePath + "/media", mediaList())
            .add(Methods.POST, basePath + "/oauth/token", oauthToken())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}", orderLinesGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/order_lines", orderLinesList())
            .add(Methods.GET, basePath + "/pins/{pin_id}/analytics", pinsAnalytics())
            .add(Methods.POST, basePath + "/pins", pinsCreate())
            .add(Methods.DELETE, basePath + "/pins/{pin_id}", pinsDelete())
            .add(Methods.GET, basePath + "/pins/{pin_id}", pinsGet())
            .add(Methods.GET, basePath + "/pins", pinsList())
            .add(Methods.POST, basePath + "/pins/{pin_id}/save", pinsSave())
            .add(Methods.PATCH, basePath + "/pins/{pin_id}", pinsUpdate())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions", productGroupPromotionsCreate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}", productGroupPromotionsGet())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions", productGroupPromotionsList())
            .add(Methods.PATCH, basePath + "/ad_accounts/{ad_account_id}/product_group_promotions", productGroupPromotionsUpdate())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_groups/analytics", productGroupsAnalytics())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_groups/catalogs", adAccountsCatalogsProductGroupsList())
            .add(Methods.GET, basePath + "/resources/ad_account_countries", adAccountCountriesGet())
            .add(Methods.GET, basePath + "/resources/delivery_metrics", deliveryMetricsGet())
            .add(Methods.GET, basePath + "/resources/targeting/interests/{interest_id}", interestTargetingOptionsGet())
            .add(Methods.GET, basePath + "/resources/lead_form_questions", leadFormQuestionsGet())
            .add(Methods.GET, basePath + "/resources/metrics_ready_state", metricsReadyStateGet())
            .add(Methods.GET, basePath + "/resources/targeting/{targeting_type}", targetingOptionsGet())
            .add(Methods.GET, basePath + "/search/partner/pins", searchPartnerPins())
            .add(Methods.GET, basePath + "/search/boards", searchUserBoardsGet())
            .add(Methods.GET, basePath + "/search/pins", searchUserPinsList())
            .add(Methods.GET, basePath + "/terms/related", termsRelatedList())
            .add(Methods.GET, basePath + "/terms/suggested", termsSuggestedList())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/terms_of_service", termsOfServiceGet())
            .add(Methods.GET, basePath + "/user_account/following/boards", boardsUserFollowsList())
            .add(Methods.POST, basePath + "/user_account/following/{username}", followUserUpdate())
            .add(Methods.GET, basePath + "/user_account/followers", followersList())
            .add(Methods.GET, basePath + "/user_account/businesses", linkedBusinessAccountsGet())
            .add(Methods.DELETE, basePath + "/user_account/websites", unverifyWebsiteDelete())
            .add(Methods.GET, basePath + "/user_account/analytics", userAccountAnalytics())
            .add(Methods.GET, basePath + "/user_account/analytics/top_pins", userAccountAnalyticsTopPins())
            .add(Methods.GET, basePath + "/user_account/analytics/top_video_pins", userAccountAnalyticsTopVideoPins())
            .add(Methods.GET, basePath + "/users/{username}/interests/follow", userAccountFollowedInterests())
            .add(Methods.GET, basePath + "/user_account", userAccountGet())
            .add(Methods.GET, basePath + "/user_account/following", userFollowingGet())
            .add(Methods.GET, basePath + "/user_account/websites", userWebsitesGet())
            .add(Methods.POST, basePath + "/user_account/websites", verifyWebsiteUpdate())
            .add(Methods.GET, basePath + "/user_account/websites/verification", websiteVerificationGet())
            ;
    }
}
