-module(openapi_pin).

-include("openapi.hrl").

-export([openapi_pin/0]).

-export([openapi_pin/1]).

-export_type([openapi_pin/0]).

-type openapi_pin() ::
  [ {'alt_text', binary() }
  | {'board_id', binary() }
  | {'board_owner', openapi_board_owner:openapi_board_owner() }
  | {'board_section_id', binary() }
  | {'created_at', datetime() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  | {'description', binary() }
  | {'dominant_color', binary() }
  | {'has_been_promoted', boolean() }
  | {'id', binary() }
  | {'is_owner', boolean() }
  | {'is_standard', boolean() }
  | {'link', binary() }
  | {'media', openapi_pin_media:openapi_pin_media() }
  | {'parent_pin_id', binary() }
  | {'pin_metrics', map() }
  | {'title', binary() }
  ].


openapi_pin() ->
    openapi_pin([]).

openapi_pin(Fields) ->
  Default = [ {'alt_text', binary() }
            , {'board_id', binary() }
            , {'board_owner', openapi_board_owner:openapi_board_owner() }
            , {'board_section_id', binary() }
            , {'created_at', datetime() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            , {'description', binary() }
            , {'dominant_color', binary() }
            , {'has_been_promoted', boolean() }
            , {'id', binary() }
            , {'is_owner', boolean() }
            , {'is_standard', boolean() }
            , {'link', binary() }
            , {'media', openapi_pin_media:openapi_pin_media() }
            , {'parent_pin_id', binary() }
            , {'pin_metrics', map() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

