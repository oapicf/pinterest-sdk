-module(openapi_board_update_privacy).

-include("openapi.hrl").

-export([openapi_board_update_privacy/0]).

-export_type([openapi_board_update_privacy/0]).

-type openapi_board_update_privacy() ::
  binary().

openapi_board_update_privacy() ->
  elements([<<"PUBLIC">>, <<"SECRET">>]).

