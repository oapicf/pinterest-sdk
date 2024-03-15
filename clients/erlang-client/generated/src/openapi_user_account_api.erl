-module(openapi_user_account_api).

-export([boards_user_follows/list/1, boards_user_follows/list/2,
         follow_user/update/3, follow_user/update/4,
         followers/list/1, followers/list/2,
         linked_business_accounts/get/1, linked_business_accounts/get/2,
         unverify_website/delete/2, unverify_website/delete/3,
         user_account/analytics/3, user_account/analytics/4,
         user_account/analytics/top_pins/4, user_account/analytics/top_pins/5,
         user_account/analytics/top_video_pins/4, user_account/analytics/top_video_pins/5,
         user_account/followed_interests/2, user_account/followed_interests/3,
         user_account/get/1, user_account/get/2,
         user_following/get/1, user_following/get/2,
         user_websites/get/1, user_websites/get/2,
         verify_website/update/2, verify_website/update/3,
         website_verification/get/1, website_verification/get/2]).

-define(BASE_URL, <<"/v5">>).

%% @doc List following boards
%% Get a list of the boards a user follows. The request returns a board summary object array.
-spec boards_user_follows/list(ctx:ctx()) -> {ok, openapi_boards_user_follows_list_200_response:openapi_boards_user_follows_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards_user_follows/list(Ctx) ->
    boards_user_follows/list(Ctx, #{}).

-spec boards_user_follows/list(ctx:ctx(), maps:map()) -> {ok, openapi_boards_user_follows_list_200_response:openapi_boards_user_follows_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards_user_follows/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/following/boards"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'explicit_following', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Follow user
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
-spec follow_user/update(ctx:ctx(), binary(), openapi_follow_user_request:openapi_follow_user_request()) -> {ok, openapi_user_summary:openapi_user_summary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
follow_user/update(Ctx, Username, OpenapiFollowUserRequest) ->
    follow_user/update(Ctx, Username, OpenapiFollowUserRequest, #{}).

-spec follow_user/update(ctx:ctx(), binary(), openapi_follow_user_request:openapi_follow_user_request(), maps:map()) -> {ok, openapi_user_summary:openapi_user_summary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
follow_user/update(Ctx, Username, OpenapiFollowUserRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/user_account/following/", Username, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiFollowUserRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List followers
%% Get a list of your followers.
-spec followers/list(ctx:ctx()) -> {ok, openapi_followers_list_200_response:openapi_followers_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
followers/list(Ctx) ->
    followers/list(Ctx, #{}).

-spec followers/list(ctx:ctx(), maps:map()) -> {ok, openapi_followers_list_200_response:openapi_followers_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
followers/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/followers"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List linked businesses
%% Get a list of your linked business accounts.
-spec linked_business_accounts/get(ctx:ctx()) -> {ok, [openapi_linked_business:openapi_linked_business()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
linked_business_accounts/get(Ctx) ->
    linked_business_accounts/get(Ctx, #{}).

-spec linked_business_accounts/get(ctx:ctx(), maps:map()) -> {ok, [openapi_linked_business:openapi_linked_business()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
linked_business_accounts/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/businesses"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Unverify website
%% Unverifu a website verified by the signed-in user.
-spec unverify_website/delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
unverify_website/delete(Ctx, Website) ->
    unverify_website/delete(Ctx, Website, #{}).

-spec unverify_website/delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
unverify_website/delete(Ctx, Website, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/user_account/websites"],
    QS = lists:flatten([{<<"website">>, Website}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user account analytics
%% Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
-spec user_account/analytics(ctx:ctx(), calendar:date(), calendar:date()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics(Ctx, StartDate, EndDate) ->
    user_account/analytics(Ctx, StartDate, EndDate, #{}).

-spec user_account/analytics(ctx:ctx(), calendar:date(), calendar:date(), maps:map()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics(Ctx, StartDate, EndDate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}])++openapi_utils:optional_params(['from_claimed_content', 'pin_format', 'app_types', 'content_type', 'source', 'metric_types', 'split_field', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user account top pins analytics
%% Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
-spec user_account/analytics/top_pins(ctx:ctx(), calendar:date(), calendar:date(), binary()) -> {ok, openapi_top_pins_analytics_response:openapi_top_pins_analytics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics/top_pins(Ctx, StartDate, EndDate, SortBy) ->
    user_account/analytics/top_pins(Ctx, StartDate, EndDate, SortBy, #{}).

-spec user_account/analytics/top_pins(ctx:ctx(), calendar:date(), calendar:date(), binary(), maps:map()) -> {ok, openapi_top_pins_analytics_response:openapi_top_pins_analytics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics/top_pins(Ctx, StartDate, EndDate, SortBy, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/analytics/top_pins"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, {<<"sort_by">>, SortBy}])++openapi_utils:optional_params(['from_claimed_content', 'pin_format', 'app_types', 'content_type', 'source', 'metric_types', 'num_of_pins', 'created_in_last_n_days', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user account top video pins analytics
%% Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
-spec user_account/analytics/top_video_pins(ctx:ctx(), calendar:date(), calendar:date(), binary()) -> {ok, openapi_top_video_pins_analytics_response:openapi_top_video_pins_analytics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics/top_video_pins(Ctx, StartDate, EndDate, SortBy) ->
    user_account/analytics/top_video_pins(Ctx, StartDate, EndDate, SortBy, #{}).

-spec user_account/analytics/top_video_pins(ctx:ctx(), calendar:date(), calendar:date(), binary(), maps:map()) -> {ok, openapi_top_video_pins_analytics_response:openapi_top_video_pins_analytics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics/top_video_pins(Ctx, StartDate, EndDate, SortBy, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/analytics/top_video_pins"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, {<<"sort_by">>, SortBy}])++openapi_utils:optional_params(['from_claimed_content', 'pin_format', 'app_types', 'content_type', 'source', 'metric_types', 'num_of_pins', 'created_in_last_n_days', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List following interests
%% Get a list of a user's following interests in one place.
-spec user_account/followed_interests(ctx:ctx(), binary()) -> {ok, openapi_user_account_followed_interests_200_response:openapi_user_account_followed_interests_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/followed_interests(Ctx, Username) ->
    user_account/followed_interests(Ctx, Username, #{}).

-spec user_account/followed_interests(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_user_account_followed_interests_200_response:openapi_user_account_followed_interests_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/followed_interests(Ctx, Username, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/users/", Username, "/interests/follow"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user account
%% Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
-spec user_account/get(ctx:ctx()) -> {ok, openapi_account:openapi_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/get(Ctx) ->
    user_account/get(Ctx, #{}).

-spec user_account/get(ctx:ctx(), maps:map()) -> {ok, openapi_account:openapi_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List following
%% Get a list of who a certain user follows.
-spec user_following/get(ctx:ctx()) -> {ok, openapi_user_following_get_200_response:openapi_user_following_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_following/get(Ctx) ->
    user_following/get(Ctx, #{}).

-spec user_following/get(ctx:ctx(), maps:map()) -> {ok, openapi_user_following_get_200_response:openapi_user_following_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_following/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/following"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'feed_type', 'explicit_following', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user websites
%% Get user websites, claimed or not
-spec user_websites/get(ctx:ctx()) -> {ok, openapi_user_websites_get_200_response:openapi_user_websites_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_websites/get(Ctx) ->
    user_websites/get(Ctx, #{}).

-spec user_websites/get(ctx:ctx(), maps:map()) -> {ok, openapi_user_websites_get_200_response:openapi_user_websites_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_websites/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/websites"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Verify website
%% Verify a website as a signed-in user.
-spec verify_website/update(ctx:ctx(), openapi_user_website_verify_request:openapi_user_website_verify_request()) -> {ok, openapi_user_website_summary:openapi_user_website_summary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
verify_website/update(Ctx, OpenapiUserWebsiteVerifyRequest) ->
    verify_website/update(Ctx, OpenapiUserWebsiteVerifyRequest, #{}).

-spec verify_website/update(ctx:ctx(), openapi_user_website_verify_request:openapi_user_website_verify_request(), maps:map()) -> {ok, openapi_user_website_summary:openapi_user_website_summary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
verify_website/update(Ctx, OpenapiUserWebsiteVerifyRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/user_account/websites"],
    QS = [],
    Headers = [],
    Body1 = OpenapiUserWebsiteVerifyRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user verification code for website claiming
%% Get verification code for user to install on the website to claim it.
-spec website_verification/get(ctx:ctx()) -> {ok, openapi_user_website_verification_code:openapi_user_website_verification_code(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
website_verification/get(Ctx) ->
    website_verification/get(Ctx, #{}).

-spec website_verification/get(ctx:ctx(), maps:map()) -> {ok, openapi_user_website_verification_code:openapi_user_website_verification_code(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
website_verification/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/user_account/websites/verification"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


