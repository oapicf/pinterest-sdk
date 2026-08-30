-module(openapi_pin_update).

-include("openapi.hrl").

-export([openapi_pin_update/0]).

-export([openapi_pin_update/1]).

-export_type([openapi_pin_update/0]).

-type openapi_pin_update() ::
  [ {'ai_disclosures', openapi_ai_disclosures_update:openapi_ai_disclosures_update() }
  | {'alt_text', binary() }
  | {'board_id', binary() }
  | {'board_section_id', binary() }
  | {'carousel_slots', list(openapi_carousel_slot:openapi_carousel_slot()) }
  | {'description', binary() }
  | {'link', binary() }
  | {'title', binary() }
  ].


openapi_pin_update() ->
    openapi_pin_update([]).

openapi_pin_update(Fields) ->
  Default = [ {'ai_disclosures', openapi_ai_disclosures_update:openapi_ai_disclosures_update() }
            , {'alt_text', binary() }
            , {'board_id', binary() }
            , {'board_section_id', binary() }
            , {'carousel_slots', list(openapi_carousel_slot:openapi_carousel_slot()) }
            , {'description', binary() }
            , {'link', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

