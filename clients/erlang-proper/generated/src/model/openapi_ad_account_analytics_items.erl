-module(openapi_ad_account_analytics_items).

-include("openapi.hrl").

-export([openapi_ad_account_analytics_items/0]).

-export([openapi_ad_account_analytics_items/1]).

-export_type([openapi_ad_account_analytics_items/0]).

-type openapi_ad_account_analytics_items() ::
  [ {'AD_ACCOUNT_ID', binary() }
  | {'DATE', date() }
  ].


openapi_ad_account_analytics_items() ->
    openapi_ad_account_analytics_items([]).

openapi_ad_account_analytics_items(Fields) ->
  Default = [ {'AD_ACCOUNT_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

