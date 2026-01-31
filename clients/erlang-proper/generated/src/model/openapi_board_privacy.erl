-module(openapi_board_privacy).

-include("openapi.hrl").

-export([openapi_board_privacy/0]).

-export_type([openapi_board_privacy/0]).

-type openapi_board_privacy() ::
  binary().

openapi_board_privacy() ->
  elements([<<"PUBLIC">>, <<"PROTECTED">>, <<"SECRET">>]).

