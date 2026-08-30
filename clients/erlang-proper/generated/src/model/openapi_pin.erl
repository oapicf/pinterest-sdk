-module(openapi_pin).

-include("openapi.hrl").

-export([openapi_pin/0]).

-export([openapi_pin/1]).

-export_type([openapi_pin/0]).

-type openapi_pin() ::
  [ {'ai_disclosures', openapi_ai_disclosures:openapi_ai_disclosures() }
  | {'board_id', binary() }
  | {'board_owner', openapi_board_owner:openapi_board_owner() }
  | {'board_section_id', binary() }
  | {'created_at', datetime() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  | {'dominant_color', binary() }
  | {'has_been_promoted', boolean() }
  | {'id', binary() }
  | {'is_owner', boolean() }
  | {'is_product', boolean() }
  | {'is_standard', boolean() }
  | {'media', openapi_pin_media:openapi_pin_media() }
  | {'parent_pin_id', binary() }
  | {'pin_metrics', map() }
  | {'alt_text', binary() }
  | {'description', binary() }
  | {'link', binary() }
  | {'title', binary() }
  ].


openapi_pin() ->
    openapi_pin([]).

openapi_pin(Fields) ->
  Default = [ {'ai_disclosures', openapi_ai_disclosures:openapi_ai_disclosures() }
            , {'board_id', binary() }
            , {'board_owner', openapi_board_owner:openapi_board_owner() }
            , {'board_section_id', binary() }
            , {'created_at', datetime() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            , {'dominant_color', binary() }
            , {'has_been_promoted', boolean() }
            , {'id', binary() }
            , {'is_owner', boolean() }
            , {'is_product', boolean() }
            , {'is_standard', boolean() }
            , {'media', openapi_pin_media:openapi_pin_media() }
            , {'parent_pin_id', binary() }
            , {'pin_metrics', map() }
            , {'alt_text', binary() }
            , {'description', binary() }
            , {'link', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

