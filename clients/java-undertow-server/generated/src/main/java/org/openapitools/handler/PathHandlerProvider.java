/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: blah@cliffano.com
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
            .add(Methods.GET, basePath + "/ad_accounts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adAccountsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adGroupsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adsList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/reports", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsCreateReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/reports", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsGetReport().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignsAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    campaignsList().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_groups/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    productGroupsAnalytics().handleRequest(exchange);
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
            .add(Methods.GET, basePath + "/catalogs/product_groups", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    catalogsProductGroupsList().handleRequest(exchange);
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
            .add(Methods.GET, basePath + "/user_account/analytics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userAccountAnalytics().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/user_account", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    userAccountGet().handleRequest(exchange);
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
            .add(Methods.GET, basePath + "/ad_accounts", adAccountsList())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups/analytics", adGroupsAnalytics())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ad_groups", adGroupsList())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads/analytics", adsAnalytics())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/ads", adsList())
            .add(Methods.POST, basePath + "/ad_accounts/{ad_account_id}/reports", analyticsCreateReport())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/reports", analyticsGetReport())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns/analytics", campaignsAnalytics())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/campaigns", campaignsList())
            .add(Methods.GET, basePath + "/ad_accounts/{ad_account_id}/product_groups/analytics", productGroupsAnalytics())
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
            .add(Methods.POST, basePath + "/catalogs/product_groups", catalogsProductGroupsCreate())
            .add(Methods.DELETE, basePath + "/catalogs/product_groups/{product_group_id}", catalogsProductGroupsDelete())
            .add(Methods.GET, basePath + "/catalogs/product_groups", catalogsProductGroupsList())
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
            .add(Methods.POST, basePath + "/media", mediaCreate())
            .add(Methods.GET, basePath + "/media/{media_id}", mediaGet())
            .add(Methods.GET, basePath + "/media", mediaList())
            .add(Methods.POST, basePath + "/oauth/token", oauthToken())
            .add(Methods.GET, basePath + "/pins/{pin_id}/analytics", pinsAnalytics())
            .add(Methods.POST, basePath + "/pins", pinsCreate())
            .add(Methods.DELETE, basePath + "/pins/{pin_id}", pinsDelete())
            .add(Methods.GET, basePath + "/pins/{pin_id}", pinsGet())
            .add(Methods.GET, basePath + "/user_account/analytics", userAccountAnalytics())
            .add(Methods.GET, basePath + "/user_account", userAccountGet())
            ;
    }
}
