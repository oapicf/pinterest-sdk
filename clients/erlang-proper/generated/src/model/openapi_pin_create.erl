-module(openapi_pin_create).

-include("openapi.hrl").

-export([openapi_pin_create/0]).

-export([openapi_pin_create/1]).

-export_type([openapi_pin_create/0]).

-type openapi_pin_create() ::
  [ {'id', binary() }
  | {'created_at', datetime() }
  | {'link', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'dominant_color', binary() }
  | {'alt_text', binary() }
  | {'board_id', binary() }
  | {'board_section_id', binary() }
  | {'board_owner', openapi_board_owner:openapi_board_owner() }
  | {'media', openapi_pin_media:openapi_pin_media() }
  | {'media_source', openapi_pin_media_source:openapi_pin_media_source() }
  | {'parent_pin_id', binary() }
  | {'note', binary() }
  ].


openapi_pin_create() ->
    openapi_pin_create([]).

openapi_pin_create(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', datetime() }
            , {'link', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'dominant_color', binary() }
            , {'alt_text', binary() }
            , {'board_id', binary() }
            , {'board_section_id', binary() }
            , {'board_owner', openapi_board_owner:openapi_board_owner() }
            , {'media', openapi_pin_media:openapi_pin_media() }
            , {'media_source', openapi_pin_media_source:openapi_pin_media_source() }
            , {'parent_pin_id', binary() }
            , {'note', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

