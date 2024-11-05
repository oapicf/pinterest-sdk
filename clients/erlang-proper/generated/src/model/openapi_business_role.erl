-module(openapi_business_role).

-include("openapi.hrl").

-export([openapi_business_role/0]).

-export_type([openapi_business_role/0]).

-type openapi_business_role() ::
  binary().

openapi_business_role() ->
  elements([<<"EMPLOYEE">>, <<"BIZ_ADMIN">>, <<"PARTNER">>]).

