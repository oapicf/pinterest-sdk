-module(openapi_ads_analytics).

-include("openapi.hrl").

-export([openapi_ads_analytics/0]).

-export([openapi_ads_analytics/1]).

-export_type([openapi_ads_analytics/0]).

-type openapi_ads_analytics() ::
  [ {'AD_ID', binary() }
  | {'DATE', date() }
  ].


openapi_ads_analytics() ->
    openapi_ads_analytics([]).

openapi_ads_analytics(Fields) ->
  Default = [ {'AD_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

