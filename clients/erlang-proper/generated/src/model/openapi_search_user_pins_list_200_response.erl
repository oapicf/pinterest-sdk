-module(openapi_search_user_pins_list_200_response).

-include("openapi.hrl").

-export([openapi_search_user_pins_list_200_response/0]).

-export([openapi_search_user_pins_list_200_response/1]).

-export_type([openapi_search_user_pins_list_200_response/0]).

-type openapi_search_user_pins_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_pin:openapi_pin()) }
  ].


openapi_search_user_pins_list_200_response() ->
    openapi_search_user_pins_list_200_response([]).

openapi_search_user_pins_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_pin:openapi_pin()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

