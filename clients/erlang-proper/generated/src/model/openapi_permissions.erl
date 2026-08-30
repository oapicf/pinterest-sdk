-module(openapi_permissions).

-include("openapi.hrl").

-export([openapi_permissions/0]).

-export_type([openapi_permissions/0]).

-type openapi_permissions() ::
  binary().

openapi_permissions() ->
  elements([<<"ADMIN">>, <<"ANALYST">>, <<"FINANCE_MANAGER">>, <<"FINANCE_EDIT">>, <<"FINANCE_VIEW">>, <<"AUDIENCE_MANAGER">>, <<"CAMPAIGN_MANAGER">>, <<"CATALOGS_MANAGER">>, <<"CATALOGS_VIEWER">>, <<"PROFILE_PUBLISHER">>, <<"CONSUMER_USER">>, <<"BIZ_PINNER_LIST_SHARER">>]).

