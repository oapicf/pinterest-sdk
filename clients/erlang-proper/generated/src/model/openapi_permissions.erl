-module(openapi_permissions).

-include("openapi.hrl").

-export([openapi_permissions/0]).

-export_type([openapi_permissions/0]).

-type openapi_permissions() ::
  binary().

openapi_permissions() ->
  elements([<<"ADMIN">>, <<"ANALYST">>, <<"FINANCE_MANAGER">>, <<"AUDIENCE_MANAGER">>, <<"CAMPAIGN_MANAGER">>, <<"CATALOGS_MANAGER">>, <<"PROFILE_PUBLISHER">>]).

