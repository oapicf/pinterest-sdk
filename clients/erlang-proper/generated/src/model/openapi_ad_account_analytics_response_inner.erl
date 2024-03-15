-module(openapi_ad_account_analytics_response_inner).

-include("openapi.hrl").

-export([openapi_ad_account_analytics_response_inner/0]).

-export([openapi_ad_account_analytics_response_inner/1]).

-export_type([openapi_ad_account_analytics_response_inner/0]).

-type openapi_ad_account_analytics_response_inner() ::
  [ {'AD_ACCOUNT_ID', binary() }
  | {'DATE', date() }
  ].


openapi_ad_account_analytics_response_inner() ->
    openapi_ad_account_analytics_response_inner([]).

openapi_ad_account_analytics_response_inner(Fields) ->
  Default = [ {'AD_ACCOUNT_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

