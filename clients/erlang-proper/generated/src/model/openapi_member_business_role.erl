-module(openapi_member_business_role).

-include("openapi.hrl").

-export([openapi_member_business_role/0]).

-export_type([openapi_member_business_role/0]).

-type openapi_member_business_role() ::
  binary().

openapi_member_business_role() ->
  elements([<<"EMPLOYEE">>, <<"BIZ_ADMIN">>]).

