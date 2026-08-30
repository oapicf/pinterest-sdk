-module(openapi_pin_base).

-include("openapi.hrl").

-export([openapi_pin_base/0]).

-export([openapi_pin_base/1]).

-export_type([openapi_pin_base/0]).

-type openapi_pin_base() ::
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
  ].


openapi_pin_base() ->
    openapi_pin_base([]).

openapi_pin_base(Fields) ->
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

