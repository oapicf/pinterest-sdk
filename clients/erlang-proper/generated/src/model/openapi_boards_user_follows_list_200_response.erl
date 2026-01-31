-module(openapi_boards_user_follows_list_200_response).

-include("openapi.hrl").

-export([openapi_boards_user_follows_list_200_response/0]).

-export([openapi_boards_user_follows_list_200_response/1]).

-export_type([openapi_boards_user_follows_list_200_response/0]).

-type openapi_boards_user_follows_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_board:openapi_board()) }
  ].


openapi_boards_user_follows_list_200_response() ->
    openapi_boards_user_follows_list_200_response([]).

openapi_boards_user_follows_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_board:openapi_board()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

