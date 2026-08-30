-module(openapi_leads_export_api).

-export([leads_export/create/3, leads_export/create/4,
         leads_export/get/3, leads_export/get/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create a request to export leads collected from a lead ad
%% **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-spec leads_export/create(ctx:ctx(), binary(), openapi_leads_exports_create:openapi_leads_exports_create()) -> {ok, openapi_leads_exports:openapi_leads_exports(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
leads_export/create(Ctx, AdAccountId, OpenapiLeadsExportsCreate) ->
    leads_export/create(Ctx, AdAccountId, OpenapiLeadsExportsCreate, #{}).

-spec leads_export/create(ctx:ctx(), binary(), openapi_leads_exports_create:openapi_leads_exports_create(), maps:map()) -> {ok, openapi_leads_exports:openapi_leads_exports(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
leads_export/create(Ctx, AdAccountId, OpenapiLeadsExportsCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/leads_export"],
    QS = [],
    Headers = [],
    Body1 = OpenapiLeadsExportsCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get the lead export from the lead export create call
%% **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
-spec leads_export/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_leads_export_response_data:openapi_leads_export_response_data(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
leads_export/get(Ctx, AdAccountId, LeadsExportId) ->
    leads_export/get(Ctx, AdAccountId, LeadsExportId, #{}).

-spec leads_export/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_leads_export_response_data:openapi_leads_export_response_data(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
leads_export/get(Ctx, AdAccountId, LeadsExportId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/leads_export/", LeadsExportId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


