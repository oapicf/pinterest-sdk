-module(openapi_api).

-export([ boards_user_follows/list/0
        , follow_user/update/2
        , followers/list/0
        , linked_business_accounts/get/0
        , unverify_website/delete/1
        , user_account/analytics/2
        , user_account/analytics/top_pins/3
        , user_account/analytics/top_video_pins/3
        , user_account/followed_interests/1
        , user_account/get/0
        , user_following/get/0
        , user_websites/get/0
        , verify_website/update/1
        , website_verification/get/0
        ]).

-define(BASE_URL, "/v5").

%% @doc List following boards
%% Get a list of the boards a user follows. The request returns a board summary object array.
-spec boards_user_follows/list() ->
  openapi_utils:response().
boards_user_follows/list() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/following/boards"],
  QueryString = [<<"bookmark=">>, Bookmark, <<"&">>, <<"page_size=">>, PageSize, <<"&">>, <<"explicit_following=">>, ExplicitFollowing, <<"&">>, <<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Follow user
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
-spec follow_user/update(binary(), openapi_follow_user_request:openapi_follow_user_request()) ->
  openapi_utils:response().
follow_user/update(Username, OpenapiFollowUserRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/following/", Username, ""],
  Body        = OpenapiFollowUserRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc List followers
%% Get a list of your followers.
-spec followers/list() ->
  openapi_utils:response().
followers/list() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/followers"],
  QueryString = [<<"bookmark=">>, Bookmark, <<"&">>, <<"page_size=">>, PageSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc List linked businesses
%% Get a list of your linked business accounts.
-spec linked_business_accounts/get() ->
  openapi_utils:response().
linked_business_accounts/get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/businesses"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Unverify website
%% Unverifu a website verified by the signed-in user.
-spec unverify_website/delete(binary()) ->
  openapi_utils:response().
unverify_website/delete(Website) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/websites"],
  QueryString = [<<"website=">>, Website, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Get user account analytics
%% Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
-spec user_account/analytics(date(), date()) ->
  openapi_utils:response().
user_account/analytics(StartDate, EndDate) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/analytics"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"from_claimed_content=">>, FromClaimedContent, <<"&">>, <<"pin_format=">>, PinFormat, <<"&">>, <<"app_types=">>, AppTypes, <<"&">>, <<"content_type=">>, ContentType, <<"&">>, <<"source=">>, Source, <<"&">>, <<"metric_types=">>, MetricTypes, <<"&">>, <<"split_field=">>, SplitField, <<"&">>, <<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Get user account top pins analytics
%% Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
-spec user_account/analytics/top_pins(date(), date(), binary()) ->
  openapi_utils:response().
user_account/analytics/top_pins(StartDate, EndDate, SortBy) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/analytics/top_pins"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"sort_by=">>, SortBy, <<"&">>, <<"from_claimed_content=">>, FromClaimedContent, <<"&">>, <<"pin_format=">>, PinFormat, <<"&">>, <<"app_types=">>, AppTypes, <<"&">>, <<"content_type=">>, ContentType, <<"&">>, <<"source=">>, Source, <<"&">>, <<"metric_types=">>, MetricTypes, <<"&">>, <<"num_of_pins=">>, NumOfPins, <<"&">>, <<"created_in_last_n_days=">>, CreatedInLastNDays, <<"&">>, <<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Get user account top video pins analytics
%% Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
-spec user_account/analytics/top_video_pins(date(), date(), binary()) ->
  openapi_utils:response().
user_account/analytics/top_video_pins(StartDate, EndDate, SortBy) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/analytics/top_video_pins"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"sort_by=">>, SortBy, <<"&">>, <<"from_claimed_content=">>, FromClaimedContent, <<"&">>, <<"pin_format=">>, PinFormat, <<"&">>, <<"app_types=">>, AppTypes, <<"&">>, <<"content_type=">>, ContentType, <<"&">>, <<"source=">>, Source, <<"&">>, <<"metric_types=">>, MetricTypes, <<"&">>, <<"num_of_pins=">>, NumOfPins, <<"&">>, <<"created_in_last_n_days=">>, CreatedInLastNDays, <<"&">>, <<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc List following interests
%% Get a list of a user's following interests in one place.
-spec user_account/followed_interests(binary()) ->
  openapi_utils:response().
user_account/followed_interests(Username) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/users/", Username, "/interests/follow"],
  QueryString = [<<"bookmark=">>, Bookmark, <<"&">>, <<"page_size=">>, PageSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Get user account
%% Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
-spec user_account/get() ->
  openapi_utils:response().
user_account/get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account"],
  QueryString = [<<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc List following
%% Get a list of who a certain user follows.
-spec user_following/get() ->
  openapi_utils:response().
user_following/get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/following"],
  QueryString = [<<"bookmark=">>, Bookmark, <<"&">>, <<"page_size=">>, PageSize, <<"&">>, <<"feed_type=">>, FeedType, <<"&">>, <<"explicit_following=">>, ExplicitFollowing, <<"&">>, <<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Get user websites
%% Get user websites, claimed or not
-spec user_websites/get() ->
  openapi_utils:response().
user_websites/get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/websites"],
  QueryString = [<<"bookmark=">>, Bookmark, <<"&">>, <<"page_size=">>, PageSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Verify website
%% Verify a website as a signed-in user.
-spec verify_website/update(openapi_user_website_verify_request:openapi_user_website_verify_request()) ->
  openapi_utils:response().
verify_website/update(OpenapiUserWebsiteVerifyRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/websites"],
  Body        = OpenapiUserWebsiteVerifyRequest,
  ContentType = hd(["application/json"]),
  QueryString = [<<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Get user verification code for website claiming
%% Get verification code for user to install on the website to claim it.
-spec website_verification/get() ->
  openapi_utils:response().
website_verification/get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_account/websites/verification"],
  QueryString = [<<"ad_account_id=">>, AdAccountId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

