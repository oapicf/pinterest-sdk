-module(openapi_customer_list_status).

-include("openapi.hrl").

-export([openapi_customer_list_status/0]).

-export_type([openapi_customer_list_status/0]).

-type openapi_customer_list_status() ::
  binary().

openapi_customer_list_status() ->
  elements([<<"PROCESSING">>, <<"READY">>, <<"TOO_SMALL">>, <<"UPLOADING">>]).

