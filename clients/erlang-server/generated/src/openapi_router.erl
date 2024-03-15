-module(openapi_router).

-export([get_paths/1, get_validator_state/0]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorMod :: module()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'AdAccountAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdAccountTargetingAnalyticsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdAccountsCreate' => #{
            path => "/v5/ad_accounts",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdAccountsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdAccountsList' => #{
            path => "/v5/ad_accounts",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AnalyticsCreateMmmReport' => #{
            path => "/v5/ad_accounts/:ad_account_id/mmm_reports",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AnalyticsCreateReport' => #{
            path => "/v5/ad_accounts/:ad_account_id/reports",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AnalyticsCreateTemplateReport' => #{
            path => "/v5/ad_accounts/:ad_account_id/templates/:template_id/reports",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AnalyticsGetMmmReport' => #{
            path => "/v5/ad_accounts/:ad_account_id/mmm_reports",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AnalyticsGetReport' => #{
            path => "/v5/ad_accounts/:ad_account_id/reports",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'SandboxDelete' => #{
            path => "/v5/ad_accounts/:ad_account_id/sandbox",
            method => <<"DELETE">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'TemplatesList' => #{
            path => "/v5/ad_accounts/:ad_account_id/templates",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdGroupsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdGroupsAudienceSizing' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups/audience_sizing",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdGroupsBidFloorGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/bid_floor",
            method => <<"POST">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdGroupsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups",
            method => <<"POST">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdGroupsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups/:ad_group_id",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdGroupsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdGroupsTargetingAnalyticsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdGroupsUpdate' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups",
            method => <<"PATCH">>,
            handler => 'openapi_ad_groups_handler'
        },
        'AdPreviewsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_previews",
            method => <<"POST">>,
            handler => 'openapi_ads_handler'
        },
        'AdTargetingAnalyticsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
        'AdsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads/analytics",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
        'AdsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads",
            method => <<"POST">>,
            handler => 'openapi_ads_handler'
        },
        'AdsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads/:ad_id",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
        'AdsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
        'AdsUpdate' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads",
            method => <<"PATCH">>,
            handler => 'openapi_ads_handler'
        },
        'AudienceInsightsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/audience_insights",
            method => <<"GET">>,
            handler => 'openapi_audience_insights_handler'
        },
        'AudienceInsightsScopeAndTypeGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/insights/audiences",
            method => <<"GET">>,
            handler => 'openapi_audience_insights_handler'
        },
        'AudiencesCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/audiences",
            method => <<"POST">>,
            handler => 'openapi_audiences_handler'
        },
        'AudiencesCreateCustom' => #{
            path => "/v5/ad_accounts/:ad_account_id/audiences/custom",
            method => <<"POST">>,
            handler => 'openapi_audiences_handler'
        },
        'AudiencesGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/audiences/:audience_id",
            method => <<"GET">>,
            handler => 'openapi_audiences_handler'
        },
        'AudiencesList' => #{
            path => "/v5/ad_accounts/:ad_account_id/audiences",
            method => <<"GET">>,
            handler => 'openapi_audiences_handler'
        },
        'AudiencesUpdate' => #{
            path => "/v5/ad_accounts/:ad_account_id/audiences/:audience_id",
            method => <<"PATCH">>,
            handler => 'openapi_audiences_handler'
        },
        'AdsCreditRedeem' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads_credit/redeem",
            method => <<"POST">>,
            handler => 'openapi_billing_handler'
        },
        'AdsCreditsDiscountsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads_credit/discounts",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
        'BillingProfilesGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/billing_profiles",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
        'SsioAccountsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/ssio/accounts",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
        'SsioInsertionOrderCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/ssio/insertion_orders",
            method => <<"POST">>,
            handler => 'openapi_billing_handler'
        },
        'SsioInsertionOrderEdit' => #{
            path => "/v5/ad_accounts/:ad_account_id/ssio/insertion_orders",
            method => <<"PATCH">>,
            handler => 'openapi_billing_handler'
        },
        'SsioInsertionOrdersStatusGetByAdAccount' => #{
            path => "/v5/ad_accounts/:ad_account_id/ssio/insertion_orders/status",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
        'SsioInsertionOrdersStatusGetByPinOrderId' => #{
            path => "/v5/ad_accounts/:ad_account_id/ssio/insertion_orders/:pin_order_id/status",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
        'SsioOrderLinesGetByAdAccount' => #{
            path => "/v5/ad_accounts/:ad_account_id/ssio/order_lines",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
        'BoardSectionsCreate' => #{
            path => "/v5/boards/:board_id/sections",
            method => <<"POST">>,
            handler => 'openapi_boards_handler'
        },
        'BoardSectionsDelete' => #{
            path => "/v5/boards/:board_id/sections/:section_id",
            method => <<"DELETE">>,
            handler => 'openapi_boards_handler'
        },
        'BoardSectionsList' => #{
            path => "/v5/boards/:board_id/sections",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
        'BoardSectionsListPins' => #{
            path => "/v5/boards/:board_id/sections/:section_id/pins",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
        'BoardSectionsUpdate' => #{
            path => "/v5/boards/:board_id/sections/:section_id",
            method => <<"PATCH">>,
            handler => 'openapi_boards_handler'
        },
        'BoardsCreate' => #{
            path => "/v5/boards",
            method => <<"POST">>,
            handler => 'openapi_boards_handler'
        },
        'BoardsDelete' => #{
            path => "/v5/boards/:board_id",
            method => <<"DELETE">>,
            handler => 'openapi_boards_handler'
        },
        'BoardsGet' => #{
            path => "/v5/boards/:board_id",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
        'BoardsList' => #{
            path => "/v5/boards",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
        'BoardsListPins' => #{
            path => "/v5/boards/:board_id/pins",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
        'BoardsUpdate' => #{
            path => "/v5/boards/:board_id",
            method => <<"PATCH">>,
            handler => 'openapi_boards_handler'
        },
        'BulkDownloadCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/bulk/download",
            method => <<"POST">>,
            handler => 'openapi_bulk_handler'
        },
        'BulkRequestGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/bulk/:bulk_request_id",
            method => <<"GET">>,
            handler => 'openapi_bulk_handler'
        },
        'BulkUpsertCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/bulk/upsert",
            method => <<"POST">>,
            handler => 'openapi_bulk_handler'
        },
        'CampaignTargetingAnalyticsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
        'CampaignsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns/analytics",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
        'CampaignsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns",
            method => <<"POST">>,
            handler => 'openapi_campaigns_handler'
        },
        'CampaignsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns/:campaign_id",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
        'CampaignsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
        'CampaignsUpdate' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns",
            method => <<"PATCH">>,
            handler => 'openapi_campaigns_handler'
        },
        'CatalogsList' => #{
            path => "/v5/catalogs",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'CatalogsProductGroupPinsList' => #{
            path => "/v5/catalogs/product_groups/:product_group_id/products",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'CatalogsProductGroupsCreate' => #{
            path => "/v5/catalogs/product_groups",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
        'CatalogsProductGroupsDelete' => #{
            path => "/v5/catalogs/product_groups/:product_group_id",
            method => <<"DELETE">>,
            handler => 'openapi_catalogs_handler'
        },
        'CatalogsProductGroupsGet' => #{
            path => "/v5/catalogs/product_groups/:product_group_id",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'CatalogsProductGroupsList' => #{
            path => "/v5/catalogs/product_groups",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'CatalogsProductGroupsProductCountsGet' => #{
            path => "/v5/catalogs/product_groups/:product_group_id/product_counts",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'CatalogsProductGroupsUpdate' => #{
            path => "/v5/catalogs/product_groups/:product_group_id",
            method => <<"PATCH">>,
            handler => 'openapi_catalogs_handler'
        },
        'FeedProcessingResultsList' => #{
            path => "/v5/catalogs/feeds/:feed_id/processing_results",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'FeedsCreate' => #{
            path => "/v5/catalogs/feeds",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
        'FeedsDelete' => #{
            path => "/v5/catalogs/feeds/:feed_id",
            method => <<"DELETE">>,
            handler => 'openapi_catalogs_handler'
        },
        'FeedsGet' => #{
            path => "/v5/catalogs/feeds/:feed_id",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'FeedsList' => #{
            path => "/v5/catalogs/feeds",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'FeedsUpdate' => #{
            path => "/v5/catalogs/feeds/:feed_id",
            method => <<"PATCH">>,
            handler => 'openapi_catalogs_handler'
        },
        'ItemsBatchGet' => #{
            path => "/v5/catalogs/items/batch/:batch_id",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'ItemsBatchPost' => #{
            path => "/v5/catalogs/items/batch",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
        'ItemsGet' => #{
            path => "/v5/catalogs/items",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'ItemsIssuesList' => #{
            path => "/v5/catalogs/processing_results/:processing_result_id/item_issues",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
        'ProductsByProductGroupFilterList' => #{
            path => "/v5/catalogs/products/get_by_product_group_filters",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
        'EventsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/events",
            method => <<"POST">>,
            handler => 'openapi_conversion_events_handler'
        },
        'ConversionTagsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/conversion_tags",
            method => <<"POST">>,
            handler => 'openapi_conversion_tags_handler'
        },
        'ConversionTagsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/conversion_tags/:conversion_tag_id",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
        'ConversionTagsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/conversion_tags",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
        'OcpmEligibleConversionTagsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/conversion_tags/ocpm_eligible",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
        'PageVisitConversionTagsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/conversion_tags/page_visit",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
        'CustomerListsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/customer_lists",
            method => <<"POST">>,
            handler => 'openapi_customer_lists_handler'
        },
        'CustomerListsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/customer_lists/:customer_list_id",
            method => <<"GET">>,
            handler => 'openapi_customer_lists_handler'
        },
        'CustomerListsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/customer_lists",
            method => <<"GET">>,
            handler => 'openapi_customer_lists_handler'
        },
        'CustomerListsUpdate' => #{
            path => "/v5/ad_accounts/:ad_account_id/customer_lists/:customer_list_id",
            method => <<"PATCH">>,
            handler => 'openapi_customer_lists_handler'
        },
        'IntegrationsCommerceDel' => #{
            path => "/v5/integrations/commerce/:external_business_id",
            method => <<"DELETE">>,
            handler => 'openapi_integrations_handler'
        },
        'IntegrationsCommerceGet' => #{
            path => "/v5/integrations/commerce/:external_business_id",
            method => <<"GET">>,
            handler => 'openapi_integrations_handler'
        },
        'IntegrationsCommercePatch' => #{
            path => "/v5/integrations/commerce/:external_business_id",
            method => <<"PATCH">>,
            handler => 'openapi_integrations_handler'
        },
        'IntegrationsCommercePost' => #{
            path => "/v5/integrations/commerce",
            method => <<"POST">>,
            handler => 'openapi_integrations_handler'
        },
        'IntegrationsGetById' => #{
            path => "/v5/integrations/:id",
            method => <<"GET">>,
            handler => 'openapi_integrations_handler'
        },
        'IntegrationsGetList' => #{
            path => "/v5/integrations",
            method => <<"GET">>,
            handler => 'openapi_integrations_handler'
        },
        'IntegrationsLogsPost' => #{
            path => "/v5/integrations/logs",
            method => <<"POST">>,
            handler => 'openapi_integrations_handler'
        },
        'CountryKeywordsMetricsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/keywords/metrics",
            method => <<"GET">>,
            handler => 'openapi_keywords_handler'
        },
        'KeywordsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/keywords",
            method => <<"POST">>,
            handler => 'openapi_keywords_handler'
        },
        'KeywordsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/keywords",
            method => <<"GET">>,
            handler => 'openapi_keywords_handler'
        },
        'KeywordsUpdate' => #{
            path => "/v5/ad_accounts/:ad_account_id/keywords",
            method => <<"PATCH">>,
            handler => 'openapi_keywords_handler'
        },
        'TrendingKeywordsList' => #{
            path => "/v5/trends/keywords/:region/top/:trend_type",
            method => <<"GET">>,
            handler => 'openapi_keywords_handler'
        },
        'AdAccountsSubscriptionsDelById' => #{
            path => "/v5/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id",
            method => <<"DELETE">>,
            handler => 'openapi_lead_ads_handler'
        },
        'AdAccountsSubscriptionsGetById' => #{
            path => "/v5/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id",
            method => <<"GET">>,
            handler => 'openapi_lead_ads_handler'
        },
        'AdAccountsSubscriptionsGetList' => #{
            path => "/v5/ad_accounts/:ad_account_id/leads/subscriptions",
            method => <<"GET">>,
            handler => 'openapi_lead_ads_handler'
        },
        'AdAccountsSubscriptionsPost' => #{
            path => "/v5/ad_accounts/:ad_account_id/leads/subscriptions",
            method => <<"POST">>,
            handler => 'openapi_lead_ads_handler'
        },
        'LeadFormGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/lead_forms/:lead_form_id",
            method => <<"GET">>,
            handler => 'openapi_lead_forms_handler'
        },
        'LeadFormTestCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/lead_forms/:lead_form_id/test",
            method => <<"POST">>,
            handler => 'openapi_lead_forms_handler'
        },
        'LeadFormsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/lead_forms",
            method => <<"GET">>,
            handler => 'openapi_lead_forms_handler'
        },
        'MediaCreate' => #{
            path => "/v5/media",
            method => <<"POST">>,
            handler => 'openapi_media_handler'
        },
        'MediaGet' => #{
            path => "/v5/media/:media_id",
            method => <<"GET">>,
            handler => 'openapi_media_handler'
        },
        'MediaList' => #{
            path => "/v5/media",
            method => <<"GET">>,
            handler => 'openapi_media_handler'
        },
        'OauthToken' => #{
            path => "/v5/oauth/token",
            method => <<"POST">>,
            handler => 'openapi_oauth_handler'
        },
        'OrderLinesGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/order_lines/:order_line_id",
            method => <<"GET">>,
            handler => 'openapi_order_lines_handler'
        },
        'OrderLinesList' => #{
            path => "/v5/ad_accounts/:ad_account_id/order_lines",
            method => <<"GET">>,
            handler => 'openapi_order_lines_handler'
        },
        'PinsAnalytics' => #{
            path => "/v5/pins/:pin_id/analytics",
            method => <<"GET">>,
            handler => 'openapi_pins_handler'
        },
        'PinsCreate' => #{
            path => "/v5/pins",
            method => <<"POST">>,
            handler => 'openapi_pins_handler'
        },
        'PinsDelete' => #{
            path => "/v5/pins/:pin_id",
            method => <<"DELETE">>,
            handler => 'openapi_pins_handler'
        },
        'PinsGet' => #{
            path => "/v5/pins/:pin_id",
            method => <<"GET">>,
            handler => 'openapi_pins_handler'
        },
        'PinsList' => #{
            path => "/v5/pins",
            method => <<"GET">>,
            handler => 'openapi_pins_handler'
        },
        'PinsSave' => #{
            path => "/v5/pins/:pin_id/save",
            method => <<"POST">>,
            handler => 'openapi_pins_handler'
        },
        'PinsUpdate' => #{
            path => "/v5/pins/:pin_id",
            method => <<"PATCH">>,
            handler => 'openapi_pins_handler'
        },
        'ProductGroupPromotionsCreate' => #{
            path => "/v5/ad_accounts/:ad_account_id/product_group_promotions",
            method => <<"POST">>,
            handler => 'openapi_product_group_promotions_handler'
        },
        'ProductGroupPromotionsGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/product_group_promotions/:product_group_promotion_id",
            method => <<"GET">>,
            handler => 'openapi_product_group_promotions_handler'
        },
        'ProductGroupPromotionsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/product_group_promotions",
            method => <<"GET">>,
            handler => 'openapi_product_group_promotions_handler'
        },
        'ProductGroupPromotionsUpdate' => #{
            path => "/v5/ad_accounts/:ad_account_id/product_group_promotions",
            method => <<"PATCH">>,
            handler => 'openapi_product_group_promotions_handler'
        },
        'ProductGroupsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/product_groups/analytics",
            method => <<"GET">>,
            handler => 'openapi_product_group_promotions_handler'
        },
        'AdAccountsCatalogsProductGroupsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/product_groups/catalogs",
            method => <<"GET">>,
            handler => 'openapi_product_groups_handler'
        },
        'AdAccountCountriesGet' => #{
            path => "/v5/resources/ad_account_countries",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
        'DeliveryMetricsGet' => #{
            path => "/v5/resources/delivery_metrics",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
        'InterestTargetingOptionsGet' => #{
            path => "/v5/resources/targeting/interests/:interest_id",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
        'LeadFormQuestionsGet' => #{
            path => "/v5/resources/lead_form_questions",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
        'MetricsReadyStateGet' => #{
            path => "/v5/resources/metrics_ready_state",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
        'TargetingOptionsGet' => #{
            path => "/v5/resources/targeting/:targeting_type",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
        'SearchPartnerPins' => #{
            path => "/v5/search/partner/pins",
            method => <<"GET">>,
            handler => 'openapi_search_handler'
        },
        'SearchUserBoardsGet' => #{
            path => "/v5/search/boards",
            method => <<"GET">>,
            handler => 'openapi_search_handler'
        },
        'SearchUserPinsList' => #{
            path => "/v5/search/pins",
            method => <<"GET">>,
            handler => 'openapi_search_handler'
        },
        'TermsRelatedList' => #{
            path => "/v5/terms/related",
            method => <<"GET">>,
            handler => 'openapi_terms_handler'
        },
        'TermsSuggestedList' => #{
            path => "/v5/terms/suggested",
            method => <<"GET">>,
            handler => 'openapi_terms_handler'
        },
        'TermsOfServiceGet' => #{
            path => "/v5/ad_accounts/:ad_account_id/terms_of_service",
            method => <<"GET">>,
            handler => 'openapi_terms_of_service_handler'
        },
        'BoardsUserFollowsList' => #{
            path => "/v5/user_account/following/boards",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'FollowUserUpdate' => #{
            path => "/v5/user_account/following/:username",
            method => <<"POST">>,
            handler => 'openapi_user_account_handler'
        },
        'FollowersList' => #{
            path => "/v5/user_account/followers",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'LinkedBusinessAccountsGet' => #{
            path => "/v5/user_account/businesses",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UnverifyWebsiteDelete' => #{
            path => "/v5/user_account/websites",
            method => <<"DELETE">>,
            handler => 'openapi_user_account_handler'
        },
        'UserAccountAnalytics' => #{
            path => "/v5/user_account/analytics",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UserAccountAnalyticsTopPins' => #{
            path => "/v5/user_account/analytics/top_pins",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UserAccountAnalyticsTopVideoPins' => #{
            path => "/v5/user_account/analytics/top_video_pins",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UserAccountFollowedInterests' => #{
            path => "/v5/users/:username/interests/follow",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UserAccountGet' => #{
            path => "/v5/user_account",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UserFollowingGet' => #{
            path => "/v5/user_account/following",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UserWebsitesGet' => #{
            path => "/v5/user_account/websites",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'VerifyWebsiteUpdate' => #{
            path => "/v5/user_account/websites",
            method => <<"POST">>,
            handler => 'openapi_user_account_handler'
        },
        'WebsiteVerificationGet' => #{
            path => "/v5/user_account/websites/verification",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        }
    }.

get_validator_state() ->
    persistent_term:get({?MODULE, validator_state}).


prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    JesseState = jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]),
    persistent_term:put({?MODULE, validator_state}, JesseState),
    ?MODULE.


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").
