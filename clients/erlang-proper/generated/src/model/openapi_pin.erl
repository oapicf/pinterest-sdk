-module(openapi_pin).

-include("openapi.hrl").

-export([openapi_pin/0]).

-export([openapi_pin/1]).

-export_type([openapi_pin/0]).

-type openapi_pin() ::
  [ {'id', binary() }
  | {'created_at', datetime() }
  | {'link', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'dominant_color', binary() }
  | {'alt_text', binary() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  | {'board_id', binary() }
  | {'board_section_id', binary() }
  | {'board_owner', openapi_board_owner:openapi_board_owner() }
  | {'is_owner', boolean() }
  | {'media', openapi_pin_media:openapi_pin_media() }
  | {'media_source', openapi_pin_media_source:openapi_pin_media_source() }
  | {'parent_pin_id', binary() }
  | {'is_standard', boolean() }
  | {'has_been_promoted', boolean() }
  | {'note', binary() }
  | {'pin_metrics', map() }
  ].


openapi_pin() ->
    openapi_pin([]).

openapi_pin(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', datetime() }
            , {'link', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'dominant_color', binary() }
            , {'alt_text', binary() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            , {'board_id', binary() }
            , {'board_section_id', binary() }
            , {'board_owner', openapi_board_owner:openapi_board_owner() }
            , {'is_owner', boolean() }
            , {'media', openapi_pin_media:openapi_pin_media() }
            , {'media_source', openapi_pin_media_source:openapi_pin_media_source() }
            , {'parent_pin_id', binary() }
            , {'is_standard', boolean() }
            , {'has_been_promoted', boolean() }
            , {'note', binary() }
            , {'pin_metrics', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

