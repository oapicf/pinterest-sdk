-module(openapi_ads_analytics_response_inner).

-include("openapi.hrl").

-export([openapi_ads_analytics_response_inner/0]).

-export([openapi_ads_analytics_response_inner/1]).

-export_type([openapi_ads_analytics_response_inner/0]).

-type openapi_ads_analytics_response_inner() ::
  [ {'AD_ID', binary() }
  | {'DATE', date() }
  ].


openapi_ads_analytics_response_inner() ->
    openapi_ads_analytics_response_inner([]).

openapi_ads_analytics_response_inner(Fields) ->
  Default = [ {'AD_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

