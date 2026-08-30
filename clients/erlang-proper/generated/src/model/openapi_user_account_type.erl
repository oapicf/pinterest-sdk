-module(openapi_user_account_type).

-include("openapi.hrl").

-export([openapi_user_account_type/0]).

-export_type([openapi_user_account_type/0]).

-type openapi_user_account_type() ::
  binary().

openapi_user_account_type() ->
  elements([<<"PINNER">>, <<"BUSINESS">>]).

