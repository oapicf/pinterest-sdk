-module(openapi_boards_list_pins_200_response).

-include("openapi.hrl").

-export([openapi_boards_list_pins_200_response/0]).

-export([openapi_boards_list_pins_200_response/1]).

-export_type([openapi_boards_list_pins_200_response/0]).

-type openapi_boards_list_pins_200_response() ::
  [ {'items', list(openapi_pin:openapi_pin()) }
  | {'bookmark', binary() }
  ].


openapi_boards_list_pins_200_response() ->
    openapi_boards_list_pins_200_response([]).

openapi_boards_list_pins_200_response(Fields) ->
  Default = [ {'items', list(openapi_pin:openapi_pin()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

