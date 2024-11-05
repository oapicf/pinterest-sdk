-module(openapi_business_role_check_mode).

-include("openapi.hrl").

-export([openapi_business_role_check_mode/0]).

-export_type([openapi_business_role_check_mode/0]).

-type openapi_business_role_check_mode() ::
  binary().

openapi_business_role_check_mode() ->
  elements([<<"INTERNAL">>, <<"EXTERNAL">>]).

