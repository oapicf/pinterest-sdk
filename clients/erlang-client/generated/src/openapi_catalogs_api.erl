-module(openapi_catalogs_api).

-export([catalogs/list/1, catalogs/list/2,
         catalogs_product_group_pins/list/2, catalogs_product_group_pins/list/3,
         catalogs_product_groups/create/2, catalogs_product_groups/create/3,
         catalogs_product_groups/delete/2, catalogs_product_groups/delete/3,
         catalogs_product_groups/get/2, catalogs_product_groups/get/3,
         catalogs_product_groups/list/1, catalogs_product_groups/list/2,
         catalogs_product_groups/product_counts_get/2, catalogs_product_groups/product_counts_get/3,
         catalogs_product_groups/update/3, catalogs_product_groups/update/4,
         feed_processing_results/list/2, feed_processing_results/list/3,
         feeds/create/2, feeds/create/3,
         feeds/delete/2, feeds/delete/3,
         feeds/get/2, feeds/get/3,
         feeds/list/1, feeds/list/2,
         feeds/update/3, feeds/update/4,
         items/get/3, items/get/4,
         items_batch/get/2, items_batch/get/3,
         items_batch/post/2, items_batch/post/3,
         items_issues/list/2, items_issues/list/3,
         products_by_product_group_filter/list/2, products_by_product_group_filter/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc List catalogs
%% Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs/list(ctx:ctx()) -> {ok, openapi_catalogs_list_200_response:openapi_catalogs_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs/list(Ctx) ->
    catalogs/list(Ctx, #{}).

-spec catalogs/list(ctx:ctx(), maps:map()) -> {ok, openapi_catalogs_list_200_response:openapi_catalogs_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List products for a Product Group
%% Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs_product_group_pins/list(ctx:ctx(), binary()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_group_pins/list(Ctx, ProductGroupId) ->
    catalogs_product_group_pins/list(Ctx, ProductGroupId, #{}).

-spec catalogs_product_group_pins/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_group_pins/list(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, "/products"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create product group
%% Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs_product_groups/create(ctx:ctx(), openapi_catalogs_product_groups_create_request:openapi_catalogs_product_groups_create_request()) -> {ok, openapi_catalogs_product_groups_create_201_response:openapi_catalogs_product_groups_create_201_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupsCreateRequest) ->
    catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupsCreateRequest, #{}).

-spec catalogs_product_groups/create(ctx:ctx(), openapi_catalogs_product_groups_create_request:openapi_catalogs_product_groups_create_request(), maps:map()) -> {ok, openapi_catalogs_product_groups_create_201_response:openapi_catalogs_product_groups_create_201_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupsCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/product_groups"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsProductGroupsCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete product group
%% Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs_product_groups/delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete(Ctx, ProductGroupId) ->
    catalogs_product_groups/delete(Ctx, ProductGroupId, #{}).

-spec catalogs_product_groups/delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product group
%% Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs_product_groups/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_product_groups_create_201_response:openapi_catalogs_product_groups_create_201_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/get(Ctx, ProductGroupId) ->
    catalogs_product_groups/get(Ctx, ProductGroupId, #{}).

-spec catalogs_product_groups/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_product_groups_create_201_response:openapi_catalogs_product_groups_create_201_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/get(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List product groups
%% Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs_product_groups/list(ctx:ctx()) -> {ok, openapi_catalogs_product_groups_list_200_response:openapi_catalogs_product_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/list(Ctx) ->
    catalogs_product_groups/list(Ctx, #{}).

-spec catalogs_product_groups/list(ctx:ctx(), maps:map()) -> {ok, openapi_catalogs_product_groups_list_200_response:openapi_catalogs_product_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups"],
    QS = lists:flatten([])++openapi_utils:optional_params(['feed_id', 'catalog_id', 'bookmark', 'page_size', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product counts for a Product Group
%% Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs_product_groups/product_counts_get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_product_group_product_counts:openapi_catalogs_product_group_product_counts(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/product_counts_get(Ctx, ProductGroupId) ->
    catalogs_product_groups/product_counts_get(Ctx, ProductGroupId, #{}).

-spec catalogs_product_groups/product_counts_get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_product_group_product_counts:openapi_catalogs_product_group_product_counts(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/product_counts_get(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, "/product_counts"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update product group
%% Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec catalogs_product_groups/update(ctx:ctx(), binary(), openapi_catalogs_product_groups_update_request:openapi_catalogs_product_groups_update_request()) -> {ok, openapi_catalogs_product_groups_create_201_response:openapi_catalogs_product_groups_create_201_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupsUpdateRequest) ->
    catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupsUpdateRequest, #{}).

-spec catalogs_product_groups/update(ctx:ctx(), binary(), openapi_catalogs_product_groups_update_request:openapi_catalogs_product_groups_update_request(), maps:map()) -> {ok, openapi_catalogs_product_groups_create_201_response:openapi_catalogs_product_groups_create_201_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupsUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsProductGroupsUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List processing results for a given feed
%% Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec feed_processing_results/list(ctx:ctx(), binary()) -> {ok, openapi_feed_processing_results_list_200_response:openapi_feed_processing_results_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feed_processing_results/list(Ctx, FeedId) ->
    feed_processing_results/list(Ctx, FeedId, #{}).

-spec feed_processing_results/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_feed_processing_results_list_200_response:openapi_feed_processing_results_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feed_processing_results/list(Ctx, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/feeds/", FeedId, "/processing_results"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create feed
%% Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
-spec feeds/create(ctx:ctx(), openapi_feeds_create_request:openapi_feeds_create_request()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/create(Ctx, OpenapiFeedsCreateRequest) ->
    feeds/create(Ctx, OpenapiFeedsCreateRequest, #{}).

-spec feeds/create(ctx:ctx(), openapi_feeds_create_request:openapi_feeds_create_request(), maps:map()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/create(Ctx, OpenapiFeedsCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/feeds"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiFeedsCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete feed
%% Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
-spec feeds/delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/delete(Ctx, FeedId) ->
    feeds/delete(Ctx, FeedId, #{}).

-spec feeds/delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/delete(Ctx, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/catalogs/feeds/", FeedId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get feed
%% Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
-spec feeds/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/get(Ctx, FeedId) ->
    feeds/get(Ctx, FeedId, #{}).

-spec feeds/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/get(Ctx, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/feeds/", FeedId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List feeds
%% Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
-spec feeds/list(ctx:ctx()) -> {ok, openapi_feeds_list_200_response:openapi_feeds_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/list(Ctx) ->
    feeds/list(Ctx, #{}).

-spec feeds/list(ctx:ctx(), maps:map()) -> {ok, openapi_feeds_list_200_response:openapi_feeds_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/feeds"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'catalog_id', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update feed
%% Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
-spec feeds/update(ctx:ctx(), binary(), openapi_feeds_update_request:openapi_feeds_update_request()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/update(Ctx, FeedId, OpenapiFeedsUpdateRequest) ->
    feeds/update(Ctx, FeedId, OpenapiFeedsUpdateRequest, #{}).

-spec feeds/update(ctx:ctx(), binary(), openapi_feeds_update_request:openapi_feeds_update_request(), maps:map()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/update(Ctx, FeedId, OpenapiFeedsUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/catalogs/feeds/", FeedId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiFeedsUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get catalogs items
%% Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
-spec items/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_catalogs_items:openapi_catalogs_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items/get(Ctx, Country, Language) ->
    items/get(Ctx, Country, Language, #{}).

-spec items/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_catalogs_items:openapi_catalogs_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items/get(Ctx, Country, Language, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/items"],
    QS = lists:flatten([{<<"country">>, Country}, {<<"language">>, Language}])++openapi_utils:optional_params(['ad_account_id', 'item_ids', 'filters'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get catalogs item batch status
%% Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
-spec items_batch/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/get(Ctx, BatchId) ->
    items_batch/get(Ctx, BatchId, #{}).

-spec items_batch/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/get(Ctx, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/items/batch/", BatchId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Operate on item batch
%% This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
-spec items_batch/post(ctx:ctx(), openapi_items_batch_post_request:openapi_items_batch_post_request()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/post(Ctx, OpenapiItemsBatchPostRequest) ->
    items_batch/post(Ctx, OpenapiItemsBatchPostRequest, #{}).

-spec items_batch/post(ctx:ctx(), openapi_items_batch_post_request:openapi_items_batch_post_request(), maps:map()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/post(Ctx, OpenapiItemsBatchPostRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/items/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiItemsBatchPostRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List item issues for a given processing result
%% List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec items_issues/list(ctx:ctx(), binary()) -> {ok, openapi_items_issues_list_200_response:openapi_items_issues_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_issues/list(Ctx, ProcessingResultId) ->
    items_issues/list(Ctx, ProcessingResultId, #{}).

-spec items_issues/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_items_issues_list_200_response:openapi_items_issues_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_issues/list(Ctx, ProcessingResultId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/processing_results/", ProcessingResultId, "/item_issues"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'item_numbers', 'item_validation_issue', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List filtered products
%% List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
-spec products_by_product_group_filter/list(ctx:ctx(), openapi_catalogs_list_products_by_filter_request:openapi_catalogs_list_products_by_filter_request()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
products_by_product_group_filter/list(Ctx, OpenapiCatalogsListProductsByFilterRequest) ->
    products_by_product_group_filter/list(Ctx, OpenapiCatalogsListProductsByFilterRequest, #{}).

-spec products_by_product_group_filter/list(ctx:ctx(), openapi_catalogs_list_products_by_filter_request:openapi_catalogs_list_products_by_filter_request(), maps:map()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
products_by_product_group_filter/list(Ctx, OpenapiCatalogsListProductsByFilterRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/products/get_by_product_group_filters"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsListProductsByFilterRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


