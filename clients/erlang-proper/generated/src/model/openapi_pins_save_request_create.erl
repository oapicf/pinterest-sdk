-module(openapi_pins_save_request_create).

-include("openapi.hrl").

-export([openapi_pins_save_request_create/0]).

-export([openapi_pins_save_request_create/1]).

-export_type([openapi_pins_save_request_create/0]).

-type openapi_pins_save_request_create() ::
  [ {'board_id', binary() }
  | {'board_section_id', binary() }
  ].


openapi_pins_save_request_create() ->
    openapi_pins_save_request_create([]).

openapi_pins_save_request_create(Fields) ->
  Default = [ {'board_id', binary() }
            , {'board_section_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

