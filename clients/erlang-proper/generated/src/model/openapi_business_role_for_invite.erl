-module(openapi_business_role_for_invite).

-include("openapi.hrl").

-export([openapi_business_role_for_invite/0]).

-export_type([openapi_business_role_for_invite/0]).

-type openapi_business_role_for_invite() ::
  binary().

openapi_business_role_for_invite() ->
  elements([<<"EMPLOYEE">>, <<"BIZ_ADMIN">>, <<"PARTNER">>]).

