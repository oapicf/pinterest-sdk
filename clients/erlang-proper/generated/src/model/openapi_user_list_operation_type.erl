-module(openapi_user_list_operation_type).

-include("openapi.hrl").

-export([openapi_user_list_operation_type/0]).

-export_type([openapi_user_list_operation_type/0]).

-type openapi_user_list_operation_type() ::
  binary().

openapi_user_list_operation_type() ->
  elements([<<"ADD">>, <<"REMOVE">>]).

