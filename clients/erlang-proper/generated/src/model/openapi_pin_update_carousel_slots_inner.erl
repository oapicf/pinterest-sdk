-module(openapi_pin_update_carousel_slots_inner).

-include("openapi.hrl").

-export([openapi_pin_update_carousel_slots_inner/0]).

-export([openapi_pin_update_carousel_slots_inner/1]).

-export_type([openapi_pin_update_carousel_slots_inner/0]).

-type openapi_pin_update_carousel_slots_inner() ::
  [ {'title', binary() }
  | {'description', binary() }
  | {'link', binary() }
  ].


openapi_pin_update_carousel_slots_inner() ->
    openapi_pin_update_carousel_slots_inner([]).

openapi_pin_update_carousel_slots_inner(Fields) ->
  Default = [ {'title', binary() }
            , {'description', binary() }
            , {'link', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

