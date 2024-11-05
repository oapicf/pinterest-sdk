-module(openapi_business_role_for_members).

-include("openapi.hrl").

-export([openapi_business_role_for_members/0]).

-export_type([openapi_business_role_for_members/0]).

-type openapi_business_role_for_members() ::
  binary().

openapi_business_role_for_members() ->
  elements([<<"EMPLOYEE">>, <<"BIZ_ADMIN">>]).

