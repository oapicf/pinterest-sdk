-module(openapi_pin_create).

-include("openapi.hrl").

-export([openapi_pin_create/0]).

-export([openapi_pin_create/1]).

-export_type([openapi_pin_create/0]).

-type openapi_pin_create() ::
  [ {'ai_disclosures', openapi_ai_disclosures:openapi_ai_disclosures() }
  | {'alt_text', binary() }
  | {'board_id', binary() }
  | {'board_section_id', binary() }
  | {'description', binary() }
  | {'dominant_color', binary() }
  | {'link', binary() }
  | {'media_source', openapi_pin_media_source:openapi_pin_media_source() }
  | {'parent_pin_id', binary() }
  | {'sponsor_id', binary() }
  | {'title', binary() }
  ].


openapi_pin_create() ->
    openapi_pin_create([]).

openapi_pin_create(Fields) ->
  Default = [ {'ai_disclosures', openapi_ai_disclosures:openapi_ai_disclosures() }
            , {'alt_text', binary() }
            , {'board_id', binary() }
            , {'board_section_id', binary() }
            , {'description', binary() }
            , {'dominant_color', binary() }
            , {'link', binary() }
            , {'media_source', openapi_pin_media_source:openapi_pin_media_source() }
            , {'parent_pin_id', binary() }
            , {'sponsor_id', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

