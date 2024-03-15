-module(openapi_role).

-include("openapi.hrl").

-export([openapi_role/0]).

-export_type([openapi_role/0]).

-type openapi_role() ::
  binary().

openapi_role() ->
  elements([<<"UNKNOWN">>, <<"OWNER">>, <<"ADMIN">>, <<"ANALYST">>, <<"SOS_READER">>, <<"FINANCE_MANAGER">>, <<"AUDIENCE_MANAGER">>, <<"CAMPAIGN_MANAGER">>, <<"CATALOGS_MANAGER">>, <<"RESTRICTED_OWNER">>, <<"PROFILE_MANAGER">>, <<"PROFILE_PUBLISHER">>, <<"RESOURCE_PINNER_LIST_OWNER">>, <<"RESOURCE_PINNER_LIST_READER">>, <<"BIZ_PINNER_LIST_SHARER">>, <<"RESOURCE_CONVERSION_TAGS_READER">>]).

