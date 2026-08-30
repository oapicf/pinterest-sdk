-module(openapi_ad_preview_source_pin_id).

-include("openapi.hrl").

-export([openapi_ad_preview_source_pin_id/0]).

-export([openapi_ad_preview_source_pin_id/1]).

-export_type([openapi_ad_preview_source_pin_id/0]).

-type openapi_ad_preview_source_pin_id() ::
  [ {'creative_type', openapi_ad_pin_preview_creative_type:openapi_ad_pin_preview_creative_type() }
  | {'pin_id', binary() }
  ].


openapi_ad_preview_source_pin_id() ->
    openapi_ad_preview_source_pin_id([]).

openapi_ad_preview_source_pin_id(Fields) ->
  Default = [ {'creative_type', openapi_ad_pin_preview_creative_type:openapi_ad_pin_preview_creative_type() }
            , {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

