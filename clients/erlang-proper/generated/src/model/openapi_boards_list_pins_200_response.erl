-module(openapi_boards_list_pins_200_response).

-include("openapi.hrl").

-export([openapi_boards_list_pins_200_response/0]).

-export([openapi_boards_list_pins_200_response/1]).

-export_type([openapi_boards_list_pins_200_response/0]).

-type openapi_boards_list_pins_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_pin_read:openapi_pin_read()) }
  ].


openapi_boards_list_pins_200_response() ->
    openapi_boards_list_pins_200_response([]).

openapi_boards_list_pins_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_pin_read:openapi_pin_read()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

