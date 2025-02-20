-module(openapi_board_sections_list_200_response).

-include("openapi.hrl").

-export([openapi_board_sections_list_200_response/0]).

-export([openapi_board_sections_list_200_response/1]).

-export_type([openapi_board_sections_list_200_response/0]).

-type openapi_board_sections_list_200_response() ::
  [ {'items', list(openapi_board_section:openapi_board_section()) }
  | {'bookmark', binary() }
  ].


openapi_board_sections_list_200_response() ->
    openapi_board_sections_list_200_response([]).

openapi_board_sections_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_board_section:openapi_board_section()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

