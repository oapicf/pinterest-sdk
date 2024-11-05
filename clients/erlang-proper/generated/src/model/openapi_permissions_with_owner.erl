-module(openapi_permissions_with_owner).

-include("openapi.hrl").

-export([openapi_permissions_with_owner/0]).

-export_type([openapi_permissions_with_owner/0]).

-type openapi_permissions_with_owner() ::
  binary().

openapi_permissions_with_owner() ->
  elements([<<"ADMIN">>, <<"ANALYST">>, <<"FINANCE_MANAGER">>, <<"AUDIENCE_MANAGER">>, <<"CAMPAIGN_MANAGER">>, <<"CATALOGS_MANAGER">>, <<"CATALOGS_VIEWER">>, <<"PROFILE_PUBLISHER">>, <<"OWNER">>]).

