-module(openapi_audience_type).

-include("openapi.hrl").

-export([openapi_audience_type/0]).

-export_type([openapi_audience_type/0]).

-type openapi_audience_type() ::
  binary().

openapi_audience_type() ->
  elements([<<"CUSTOMER_LIST">>, <<"VISITOR">>, <<"ENGAGEMENT">>, <<"ACTALIKE">>, <<"PERSONA">>]).

