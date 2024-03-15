-module(openapi_board).

-include("openapi.hrl").

-export([openapi_board/0]).

-export([openapi_board/1]).

-export_type([openapi_board/0]).

-type openapi_board() ::
  [ {'id', binary() }
  | {'created_at', datetime() }
  | {'board_pins_modified_at', datetime() }
  | {'name', binary() }
  | {'description', binary() }
  | {'collaborator_count', integer() }
  | {'pin_count', integer() }
  | {'follower_count', integer() }
  | {'media', openapi_board_media:openapi_board_media() }
  | {'owner', openapi_board_owner:openapi_board_owner() }
  | {'privacy', binary() }
  ].


openapi_board() ->
    openapi_board([]).

openapi_board(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', datetime() }
            , {'board_pins_modified_at', datetime() }
            , {'name', binary() }
            , {'description', binary() }
            , {'collaborator_count', integer(0) }
            , {'pin_count', integer(0) }
            , {'follower_count', integer(0) }
            , {'media', openapi_board_media:openapi_board_media() }
            , {'owner', openapi_board_owner:openapi_board_owner() }
            , {'privacy', elements([<<"PUBLIC">>, <<"PROTECTED">>, <<"SECRET">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

