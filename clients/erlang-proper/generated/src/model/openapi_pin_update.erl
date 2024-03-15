-module(openapi_pin_update).

-include("openapi.hrl").

-export([openapi_pin_update/0]).

-export([openapi_pin_update/1]).

-export_type([openapi_pin_update/0]).

-type openapi_pin_update() ::
  [ {'alt_text', binary() }
  | {'board_id', binary() }
  | {'board_section_id', binary() }
  | {'description', binary() }
  | {'link', binary() }
  | {'title', binary() }
  | {'carousel_slots', list(openapi_pin_update_carousel_slots_inner:openapi_pin_update_carousel_slots_inner()) }
  | {'note', binary() }
  ].


openapi_pin_update() ->
    openapi_pin_update([]).

openapi_pin_update(Fields) ->
  Default = [ {'alt_text', binary() }
            , {'board_id', binary() }
            , {'board_section_id', binary() }
            , {'description', binary() }
            , {'link', binary() }
            , {'title', binary() }
            , {'carousel_slots', list(openapi_pin_update_carousel_slots_inner:openapi_pin_update_carousel_slots_inner()) }
            , {'note', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

