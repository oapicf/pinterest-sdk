-module(openapi_ad_pin_analytics).

-include("openapi.hrl").

-export([openapi_ad_pin_analytics/0]).

-export([openapi_ad_pin_analytics/1]).

-export_type([openapi_ad_pin_analytics/0]).

-type openapi_ad_pin_analytics() ::
  [ {'DATE', date() }
  | {'PIN_ID', binary() }
  ].


openapi_ad_pin_analytics() ->
    openapi_ad_pin_analytics([]).

openapi_ad_pin_analytics(Fields) ->
  Default = [ {'DATE', date() }
            , {'PIN_ID', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

