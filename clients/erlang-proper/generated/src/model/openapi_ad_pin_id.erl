-module(openapi_ad_pin_id).

-include("openapi.hrl").

-export([openapi_ad_pin_id/0]).

-export([openapi_ad_pin_id/1]).

-export_type([openapi_ad_pin_id/0]).

-type openapi_ad_pin_id() ::
  [ {'pin_id', binary() }
  ].


openapi_ad_pin_id() ->
    openapi_ad_pin_id([]).

openapi_ad_pin_id(Fields) ->
  Default = [ {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

