-module(openapi_gender).

-include("openapi.hrl").

-export([openapi_gender/0]).

-export_type([openapi_gender/0]).

-type openapi_gender() ::
  binary().

openapi_gender() ->
  elements([<<"FEMALE">>, <<"MALE">>, <<"UNISEX">>]).

