-module(openapi_ad_preview_create_from_pin).

-include("openapi.hrl").

-export([openapi_ad_preview_create_from_pin/0]).

-export([openapi_ad_preview_create_from_pin/1]).

-export_type([openapi_ad_preview_create_from_pin/0]).

-type openapi_ad_preview_create_from_pin() ::
  [ {'pin_id', binary() }
  ].


openapi_ad_preview_create_from_pin() ->
    openapi_ad_preview_create_from_pin([]).

openapi_ad_preview_create_from_pin(Fields) ->
  Default = [ {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

