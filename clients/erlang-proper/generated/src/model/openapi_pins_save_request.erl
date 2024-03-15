-module(openapi_pins_save_request).

-include("openapi.hrl").

-export([openapi_pins_save_request/0]).

-export([openapi_pins_save_request/1]).

-export_type([openapi_pins_save_request/0]).

-type openapi_pins_save_request() ::
  [ {'board_id', binary() }
  | {'board_section_id', binary() }
  ].


openapi_pins_save_request() ->
    openapi_pins_save_request([]).

openapi_pins_save_request(Fields) ->
  Default = [ {'board_id', binary() }
            , {'board_section_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

