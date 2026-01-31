-module(openapi_board_privacy_filter).

-include("openapi.hrl").

-export([openapi_board_privacy_filter/0]).

-export_type([openapi_board_privacy_filter/0]).

-type openapi_board_privacy_filter() ::
  binary().

openapi_board_privacy_filter() ->
  elements([<<"ALL">>, <<"PUBLIC">>, <<"PROTECTED">>, <<"SECRET">>, <<"PUBLIC_AND_SECRET">>]).

