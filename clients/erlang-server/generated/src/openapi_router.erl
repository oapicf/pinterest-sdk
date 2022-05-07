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
        'AdAccountsList' => #{
            path => "/v5/ad_accounts",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdGroupsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdGroupsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/ad_groups",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AdsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/ads",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AnalyticsCreateReport' => #{
            path => "/v5/ad_accounts/:ad_account_id/reports",
            method => <<"POST">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'AnalyticsGetReport' => #{
            path => "/v5/ad_accounts/:ad_account_id/reports",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'CampaignsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'CampaignsList' => #{
            path => "/v5/ad_accounts/:ad_account_id/campaigns",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
        },
        'ProductGroupsAnalytics' => #{
            path => "/v5/ad_accounts/:ad_account_id/product_groups/analytics",
            method => <<"GET">>,
            handler => 'openapi_ad_accounts_handler'
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
        'CatalogsProductGroupsList' => #{
            path => "/v5/catalogs/product_groups",
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
        'UserAccountAnalytics' => #{
            path => "/v5/user_account/analytics",
            method => <<"GET">>,
            handler => 'openapi_user_account_handler'
        },
        'UserAccountGet' => #{
            path => "/v5/user_account",
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
