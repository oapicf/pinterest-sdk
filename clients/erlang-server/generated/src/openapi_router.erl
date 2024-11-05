-module(openapi_router).

-export([get_paths/1]).

-type method() :: binary().
-type operations() :: #{method() => openapi_api:operation_id()}.
-type init_opts()  :: {operations(), module()}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: module()) -> cowboy_router:routes().
get_paths(LogicHandler) ->
    PreparedPaths = maps:fold(
                      fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
                              [{Path, Handler, Operations} | Acc]
                      end, [], group_paths()
                     ),
    [{'_', [{P, H, {O, LogicHandler}} || {P, H, O} <- PreparedPaths]}].

group_paths() ->
    maps:fold(
      fun(OperationID, #{servers := Servers, base_path := BasePath, path := Path,
                         method := Method, handler := Handler}, Acc) ->
              FullPaths = build_full_paths(Servers, BasePath, Path),
              merge_paths(FullPaths, OperationID, Method, Handler, Acc)
      end, #{}, get_operations()).

build_full_paths([], BasePath, Path) ->
    [lists:append([BasePath, Path])];
build_full_paths(Servers, _BasePath, Path) ->
    [lists:append([Server, Path]) || Server <- Servers ].

merge_paths(FullPaths, OperationID, Method, Handler, Acc) ->
    lists:foldl(
      fun(Path, Acc0) ->
              case maps:find(Path, Acc0) of
                  {ok, PathInfo0 = #{operations := Operations0}} ->
                      Operations = Operations0#{Method => OperationID},
                      PathInfo = PathInfo0#{operations => Operations},
                      Acc0#{Path => PathInfo};
                  error ->
                      Operations = #{Method => OperationID},
                      PathInfo = #{handler => Handler, operations => Operations},
                      Acc0#{Path => PathInfo}
              end
      end, Acc, FullPaths).

get_operations() ->
    #{ 
       'ad_account/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'ad_account_targeting_analytics/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'ad_accounts/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'ad_accounts/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'ad_accounts/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'analytics/create_mmm_report' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/mmm_reports",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'analytics/create_report' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/reports",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'analytics/create_template_report' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/templates/:template_id/reports",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'analytics/get_mmm_report' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/mmm_reports",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'analytics/get_report' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/reports",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'sandbox/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/sandbox",
            method => <<"DELETE">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'templates/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/templates",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
       'ad_groups/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_groups/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_groups/audience_sizing' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_groups/audience_sizing",
            method => <<"POST">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_groups_bid_floor/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/bid_floor",
            method => <<"POST">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_groups/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_groups",
            method => <<"POST">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_groups/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_groups/:ad_group_id",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_groups/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_groups",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_groups_targeting_analytics/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_groups/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_groups/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_groups",
            method => <<"PATCH">>,
            handler => 'openapi_ad_groups_handler'
        },
       'ad_previews/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ad_previews",
            method => <<"POST">>,
            handler => 'openapi_ads_handler'
        },
       'ad_targeting_analytics/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
       'ads/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads/analytics",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
       'ads/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads",
            method => <<"POST">>,
            handler => 'openapi_ads_handler'
        },
       'ads/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads/:ad_id",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
       'ads/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads",
            method => <<"GET">>,
            handler => 'openapi_ads_handler'
        },
       'ads/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads",
            method => <<"PATCH">>,
            handler => 'openapi_ads_handler'
        },
       'advanced_auction_items_get/post' => #{
            servers => [],
            base_path => "/v5",
            path => "/advanced_auction/items/get",
            method => <<"POST">>,
            handler => 'openapi_advanced_auction_handler'
        },
       'advanced_auction_items_submit/post' => #{
            servers => [],
            base_path => "/v5",
            path => "/advanced_auction/items/submit",
            method => <<"POST">>,
            handler => 'openapi_advanced_auction_handler'
        },
       'audience_insights/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audience_insights",
            method => <<"GET">>,
            handler => 'openapi_audience_insights_handler'
        },
       'audience_insights_scope_and_type/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/insights/audiences",
            method => <<"GET">>,
            handler => 'openapi_audience_insights_handler'
        },
       'ad_accounts_audiences_shared_accounts/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences/shared/accounts",
            method => <<"GET">>,
            handler => 'openapi_audience_sharing_handler'
        },
       'business_account_audiences_shared_accounts/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/audiences/shared/accounts",
            method => <<"GET">>,
            handler => 'openapi_audience_sharing_handler'
        },
       'shared_audiences_for_business/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/audiences",
            method => <<"GET">>,
            handler => 'openapi_audience_sharing_handler'
        },
       'update_ad_account_to_ad_account_shared_audience' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences/ad_accounts/shared",
            method => <<"PATCH">>,
            handler => 'openapi_audience_sharing_handler'
        },
       'update_ad_account_to_business_shared_audience' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences/businesses/shared",
            method => <<"PATCH">>,
            handler => 'openapi_audience_sharing_handler'
        },
       'update_business_to_ad_account_shared_audience' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/audiences/ad_accounts/shared",
            method => <<"PATCH">>,
            handler => 'openapi_audience_sharing_handler'
        },
       'update_business_to_business_shared_audience' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/audiences/businesses/shared",
            method => <<"PATCH">>,
            handler => 'openapi_audience_sharing_handler'
        },
       'audiences/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences",
            method => <<"POST">>,
            handler => 'openapi_audiences_handler'
        },
       'audiences/create_custom' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences/custom",
            method => <<"POST">>,
            handler => 'openapi_audiences_handler'
        },
       'audiences/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences/:audience_id",
            method => <<"GET">>,
            handler => 'openapi_audiences_handler'
        },
       'audiences/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences",
            method => <<"GET">>,
            handler => 'openapi_audiences_handler'
        },
       'audiences/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/audiences/:audience_id",
            method => <<"PATCH">>,
            handler => 'openapi_audiences_handler'
        },
       'ads_credit/redeem' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads_credit/redeem",
            method => <<"POST">>,
            handler => 'openapi_billing_handler'
        },
       'ads_credits_discounts/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ads_credit/discounts",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
       'billing_profiles/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/billing_profiles",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
       'ssio_accounts/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ssio/accounts",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
       'ssio_insertion_order/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ssio/insertion_orders",
            method => <<"POST">>,
            handler => 'openapi_billing_handler'
        },
       'ssio_insertion_order/edit' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ssio/insertion_orders",
            method => <<"PATCH">>,
            handler => 'openapi_billing_handler'
        },
       'ssio_insertion_orders_status/get_by_ad_account' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ssio/insertion_orders/status",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
       'ssio_insertion_orders_status/get_by_pin_order_id' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ssio/insertion_orders/:pin_order_id/status",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
       'ssio_order_lines/get_by_ad_account' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/ssio/order_lines",
            method => <<"GET">>,
            handler => 'openapi_billing_handler'
        },
       'board_sections/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id/sections",
            method => <<"POST">>,
            handler => 'openapi_boards_handler'
        },
       'board_sections/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id/sections/:section_id",
            method => <<"DELETE">>,
            handler => 'openapi_boards_handler'
        },
       'board_sections/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id/sections",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
       'board_sections/list_pins' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id/sections/:section_id/pins",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
       'board_sections/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id/sections/:section_id",
            method => <<"PATCH">>,
            handler => 'openapi_boards_handler'
        },
       'boards/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards",
            method => <<"POST">>,
            handler => 'openapi_boards_handler'
        },
       'boards/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id",
            method => <<"DELETE">>,
            handler => 'openapi_boards_handler'
        },
       'boards/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
       'boards/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
       'boards/list_pins' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id/pins",
            method => <<"GET">>,
            handler => 'openapi_boards_handler'
        },
       'boards/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/boards/:board_id",
            method => <<"PATCH">>,
            handler => 'openapi_boards_handler'
        },
       'bulk_download/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/bulk/download",
            method => <<"POST">>,
            handler => 'openapi_bulk_handler'
        },
       'bulk_request/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/bulk/:bulk_request_id",
            method => <<"GET">>,
            handler => 'openapi_bulk_handler'
        },
       'bulk_upsert/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/bulk/upsert",
            method => <<"POST">>,
            handler => 'openapi_bulk_handler'
        },
       'asset_group/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/asset_groups",
            method => <<"POST">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'asset_group/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/asset_groups",
            method => <<"DELETE">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'asset_group/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/asset_groups",
            method => <<"PATCH">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'business_asset_members/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/assets/:asset_id/members",
            method => <<"GET">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'business_asset_partners/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/assets/:asset_id/partners",
            method => <<"GET">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'business_assets/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/assets",
            method => <<"GET">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'business_member_assets/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/members/:member_id/assets",
            method => <<"GET">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'business_members_asset_access/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/members/assets/access",
            method => <<"DELETE">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'business_members_asset_access/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/members/assets/access",
            method => <<"PATCH">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'business_partner_asset_access/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/partners/:partner_id/assets",
            method => <<"GET">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'delete_partner_asset_access_handler_impl' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/partners/assets",
            method => <<"DELETE">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'update_partner_asset_access_handler_impl' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/partners/assets",
            method => <<"PATCH">>,
            handler => 'openapi_business_access_assets_handler'
        },
       'asset_access_requests/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/requests/assets/access",
            method => <<"POST">>,
            handler => 'openapi_business_access_invite_handler'
        },
       'cancel_invites_or_requests' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/invites",
            method => <<"DELETE">>,
            handler => 'openapi_business_access_invite_handler'
        },
       'create_asset_invites' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/invites/assets/access",
            method => <<"POST">>,
            handler => 'openapi_business_access_invite_handler'
        },
       'create_membership_or_partnership_invites' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/invites",
            method => <<"POST">>,
            handler => 'openapi_business_access_invite_handler'
        },
       'get/invites' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/invites",
            method => <<"GET">>,
            handler => 'openapi_business_access_invite_handler'
        },
       'respond_business_access_invites' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/invites",
            method => <<"PATCH">>,
            handler => 'openapi_business_access_invite_handler'
        },
       'delete_business_membership' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/members",
            method => <<"DELETE">>,
            handler => 'openapi_business_access_relationships_handler'
        },
       'delete_business_partners' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/partners",
            method => <<"DELETE">>,
            handler => 'openapi_business_access_relationships_handler'
        },
       'get/business_employers' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/employers",
            method => <<"GET">>,
            handler => 'openapi_business_access_relationships_handler'
        },
       'get/business_members' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/members",
            method => <<"GET">>,
            handler => 'openapi_business_access_relationships_handler'
        },
       'get/business_partners' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/partners",
            method => <<"GET">>,
            handler => 'openapi_business_access_relationships_handler'
        },
       'update/business_memberships' => #{
            servers => [],
            base_path => "/v5",
            path => "/businesses/:business_id/members",
            method => <<"PATCH">>,
            handler => 'openapi_business_access_relationships_handler'
        },
       'campaign_targeting_analytics/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/campaigns/targeting_analytics",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
       'campaigns/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/campaigns/analytics",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
       'campaigns/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/campaigns",
            method => <<"POST">>,
            handler => 'openapi_campaigns_handler'
        },
       'campaigns/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/campaigns/:campaign_id",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
       'campaigns/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/campaigns",
            method => <<"GET">>,
            handler => 'openapi_campaigns_handler'
        },
       'campaigns/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/campaigns",
            method => <<"PATCH">>,
            handler => 'openapi_campaigns_handler'
        },
       'catalogs/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_group_pins/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups/:product_group_id/products",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/create_many' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups/multiple",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups/:product_group_id",
            method => <<"DELETE">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/delete_many' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups/multiple",
            method => <<"DELETE">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups/:product_group_id",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/product_counts_get' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups/:product_group_id/product_counts",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'catalogs_product_groups/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/product_groups/:product_group_id",
            method => <<"PATCH">>,
            handler => 'openapi_catalogs_handler'
        },
       'feed_processing_results/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/feeds/:feed_id/processing_results",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'feeds/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/feeds",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'feeds/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/feeds/:feed_id",
            method => <<"DELETE">>,
            handler => 'openapi_catalogs_handler'
        },
       'feeds/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/feeds/:feed_id",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'feeds/ingest' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/feeds/:feed_id/ingest",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'feeds/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/feeds",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'feeds/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/feeds/:feed_id",
            method => <<"PATCH">>,
            handler => 'openapi_catalogs_handler'
        },
       'items_batch/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/items/batch/:batch_id",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'items_batch/post' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/items/batch",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'items/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/items",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'items_issues/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/processing_results/:processing_result_id/item_issues",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'items/post' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/items",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'products_by_product_group_filter/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/products/get_by_product_group_filters",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'reports/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/reports",
            method => <<"POST">>,
            handler => 'openapi_catalogs_handler'
        },
       'reports/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/reports",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'reports/stats' => #{
            servers => [],
            base_path => "/v5",
            path => "/catalogs/reports/stats",
            method => <<"GET">>,
            handler => 'openapi_catalogs_handler'
        },
       'events/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/events",
            method => <<"POST">>,
            handler => 'openapi_conversion_events_handler'
        },
       'conversion_tags/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/conversion_tags",
            method => <<"POST">>,
            handler => 'openapi_conversion_tags_handler'
        },
       'conversion_tags/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/conversion_tags/:conversion_tag_id",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
       'conversion_tags/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/conversion_tags",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
       'ocpm_eligible_conversion_tags/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/conversion_tags/ocpm_eligible",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
       'page_visit_conversion_tags/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/conversion_tags/page_visit",
            method => <<"GET">>,
            handler => 'openapi_conversion_tags_handler'
        },
       'customer_lists/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/customer_lists",
            method => <<"POST">>,
            handler => 'openapi_customer_lists_handler'
        },
       'customer_lists/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/customer_lists/:customer_list_id",
            method => <<"GET">>,
            handler => 'openapi_customer_lists_handler'
        },
       'customer_lists/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/customer_lists",
            method => <<"GET">>,
            handler => 'openapi_customer_lists_handler'
        },
       'customer_lists/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/customer_lists/:customer_list_id",
            method => <<"PATCH">>,
            handler => 'openapi_customer_lists_handler'
        },
       'integrations_commerce/del' => #{
            servers => [],
            base_path => "/v5",
            path => "/integrations/commerce/:external_business_id",
            method => <<"DELETE">>,
            handler => 'openapi_integrations_handler'
        },
       'integrations_commerce/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/integrations/commerce/:external_business_id",
            method => <<"GET">>,
            handler => 'openapi_integrations_handler'
        },
       'integrations_commerce/patch' => #{
            servers => [],
            base_path => "/v5",
            path => "/integrations/commerce/:external_business_id",
            method => <<"PATCH">>,
            handler => 'openapi_integrations_handler'
        },
       'integrations_commerce/post' => #{
            servers => [],
            base_path => "/v5",
            path => "/integrations/commerce",
            method => <<"POST">>,
            handler => 'openapi_integrations_handler'
        },
       'integrations/get_by_id' => #{
            servers => [],
            base_path => "/v5",
            path => "/integrations/:id",
            method => <<"GET">>,
            handler => 'openapi_integrations_handler'
        },
       'integrations/get_list' => #{
            servers => [],
            base_path => "/v5",
            path => "/integrations",
            method => <<"GET">>,
            handler => 'openapi_integrations_handler'
        },
       'integrations_logs/post' => #{
            servers => [],
            base_path => "/v5",
            path => "/integrations/logs",
            method => <<"POST">>,
            handler => 'openapi_integrations_handler'
        },
       'country_keywords_metrics/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/keywords/metrics",
            method => <<"GET">>,
            handler => 'openapi_keywords_handler'
        },
       'keywords/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/keywords",
            method => <<"POST">>,
            handler => 'openapi_keywords_handler'
        },
       'keywords/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/keywords",
            method => <<"GET">>,
            handler => 'openapi_keywords_handler'
        },
       'keywords/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/keywords",
            method => <<"PATCH">>,
            handler => 'openapi_keywords_handler'
        },
       'trending_keywords/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/trends/keywords/:region/top/:trend_type",
            method => <<"GET">>,
            handler => 'openapi_keywords_handler'
        },
       'ad_accounts_subscriptions/del_by_id' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id",
            method => <<"DELETE">>,
            handler => 'openapi_lead_ads_handler'
        },
       'ad_accounts_subscriptions/get_by_id' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id",
            method => <<"GET">>,
            handler => 'openapi_lead_ads_handler'
        },
       'ad_accounts_subscriptions/get_list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/leads/subscriptions",
            method => <<"GET">>,
            handler => 'openapi_lead_ads_handler'
        },
       'ad_accounts_subscriptions/post' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/leads/subscriptions",
            method => <<"POST">>,
            handler => 'openapi_lead_ads_handler'
        },
       'lead_form/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/lead_forms/:lead_form_id",
            method => <<"GET">>,
            handler => 'openapi_lead_forms_handler'
        },
       'lead_form_test/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/lead_forms/:lead_form_id/test",
            method => <<"POST">>,
            handler => 'openapi_lead_forms_handler'
        },
       'lead_forms/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/lead_forms",
            method => <<"POST">>,
            handler => 'openapi_lead_forms_handler'
        },
       'lead_forms/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/lead_forms",
            method => <<"GET">>,
            handler => 'openapi_lead_forms_handler'
        },
       'lead_forms/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/lead_forms",
            method => <<"PATCH">>,
            handler => 'openapi_lead_forms_handler'
        },
       'leads_export/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/leads_export",
            method => <<"POST">>,
            handler => 'openapi_leads_export_handler'
        },
       'leads_export/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/leads_export/:leads_export_id",
            method => <<"GET">>,
            handler => 'openapi_leads_export_handler'
        },
       'media/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/media",
            method => <<"POST">>,
            handler => 'openapi_media_handler'
        },
       'media/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/media/:media_id",
            method => <<"GET">>,
            handler => 'openapi_media_handler'
        },
       'media/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/media",
            method => <<"GET">>,
            handler => 'openapi_media_handler'
        },
       'oauth/token' => #{
            servers => [],
            base_path => "/v5",
            path => "/oauth/token",
            method => <<"POST">>,
            handler => 'openapi_oauth_handler'
        },
       'order_lines/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/order_lines/:order_line_id",
            method => <<"GET">>,
            handler => 'openapi_order_lines_handler'
        },
       'order_lines/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/order_lines",
            method => <<"GET">>,
            handler => 'openapi_order_lines_handler'
        },
       'multi_pins/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins/analytics",
            method => <<"GET">>,
            handler => 'openapi_pins_handler'
        },
       'pins/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins/:pin_id/analytics",
            method => <<"GET">>,
            handler => 'openapi_pins_handler'
        },
       'pins/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins",
            method => <<"POST">>,
            handler => 'openapi_pins_handler'
        },
       'pins/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins/:pin_id",
            method => <<"DELETE">>,
            handler => 'openapi_pins_handler'
        },
       'pins/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins/:pin_id",
            method => <<"GET">>,
            handler => 'openapi_pins_handler'
        },
       'pins/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins",
            method => <<"GET">>,
            handler => 'openapi_pins_handler'
        },
       'pins/save' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins/:pin_id/save",
            method => <<"POST">>,
            handler => 'openapi_pins_handler'
        },
       'pins/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/pins/:pin_id",
            method => <<"PATCH">>,
            handler => 'openapi_pins_handler'
        },
       'product_group_promotions/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/product_group_promotions",
            method => <<"POST">>,
            handler => 'openapi_product_group_promotions_handler'
        },
       'product_group_promotions/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/product_group_promotions/:product_group_promotion_id",
            method => <<"GET">>,
            handler => 'openapi_product_group_promotions_handler'
        },
       'product_group_promotions/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/product_group_promotions",
            method => <<"GET">>,
            handler => 'openapi_product_group_promotions_handler'
        },
       'product_group_promotions/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/product_group_promotions",
            method => <<"PATCH">>,
            handler => 'openapi_product_group_promotions_handler'
        },
       'product_groups/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/product_groups/analytics",
            method => <<"GET">>,
            handler => 'openapi_product_group_promotions_handler'
        },
       'ad_account_countries/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/resources/ad_account_countries",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
       'delivery_metrics/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/resources/delivery_metrics",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
       'interest_targeting_options/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/resources/targeting/interests/:interest_id",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
       'lead_form_questions/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/resources/lead_form_questions",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
       'metrics_ready_state/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/resources/metrics_ready_state",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
       'targeting_options/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/resources/targeting/:targeting_type",
            method => <<"GET">>,
            handler => 'openapi_resources_handler'
        },
       'search_partner_pins' => #{
            servers => [],
            base_path => "/v5",
            path => "/search/partner/pins",
            method => <<"GET">>,
            handler => 'openapi_search_handler'
        },
       'search_user_boards/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/search/boards",
            method => <<"GET">>,
            handler => 'openapi_search_handler'
        },
       'search_user_pins/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/search/pins",
            method => <<"GET">>,
            handler => 'openapi_search_handler'
        },
       'targeting_template/create' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/targeting_templates",
            method => <<"POST">>,
            handler => 'openapi_targeting_template_handler'
        },
       'targeting_template/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/targeting_templates",
            method => <<"GET">>,
            handler => 'openapi_targeting_template_handler'
        },
       'targeting_template/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/targeting_templates",
            method => <<"PATCH">>,
            handler => 'openapi_targeting_template_handler'
        },
       'terms_related/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/terms/related",
            method => <<"GET">>,
            handler => 'openapi_terms_handler'
        },
       'terms_suggested/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/terms/suggested",
            method => <<"GET">>,
            handler => 'openapi_terms_handler'
        },
       'terms_of_service/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/ad_accounts/:ad_account_id/terms_of_service",
            method => <<"GET">>,
            handler => 'openapi_terms_of_service_handler'
        },
       'boards_user_follows/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/following/boards",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'follow_user/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/following/:username",
            method => <<"POST">>,
            handler => 'openapi_user_account_handler'
        },
       'followers/list' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/followers",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'linked_business_accounts/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/businesses",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'unverify_website/delete' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/websites",
            method => <<"DELETE">>,
            handler => 'openapi_user_account_handler'
        },
       'user_account/analytics' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/analytics",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'user_account/analytics/top_pins' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/analytics/top_pins",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'user_account/analytics/top_video_pins' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/analytics/top_video_pins",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'user_account/followed_interests' => #{
            servers => [],
            base_path => "/v5",
            path => "/users/:username/interests/follow",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'user_account/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'user_following/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/following",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'user_websites/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/websites",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
       'verify_website/update' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/websites",
            method => <<"POST">>,
            handler => 'openapi_user_account_handler'
        },
       'website_verification/get' => #{
            servers => [],
            base_path => "/v5",
            path => "/user_account/websites/verification",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        }
    }.
