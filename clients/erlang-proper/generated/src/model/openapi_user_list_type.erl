-module(openapi_user_list_type).

-include("openapi.hrl").

-export([openapi_user_list_type/0]).

-export_type([openapi_user_list_type/0]).

-type openapi_user_list_type() ::
  binary().

openapi_user_list_type() ->
  elements([<<"EMAIL">>, <<"IDFA">>, <<"MAID">>, <<"LR_ID">>, <<"DLX_ID">>, <<"HASHED_PINNER_ID">>]).

