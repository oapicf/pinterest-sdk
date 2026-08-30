-module(openapi_pinner_list_type).

-include("openapi.hrl").

-export([openapi_pinner_list_type/0]).

-export_type([openapi_pinner_list_type/0]).

-type openapi_pinner_list_type() ::
  binary().

openapi_pinner_list_type() ->
  elements([<<"CUSTOMER_LIST">>, <<"VISITOR">>, <<"ENGAGEMENT">>, <<"LOOKALIKE">>, <<"ACTALIKE">>, <<"PERSONA">>]).

