-module(openapi_business_access_role).

-include("openapi.hrl").

-export([openapi_business_access_role/0]).

-export_type([openapi_business_access_role/0]).

-type openapi_business_access_role() ::
  binary().

openapi_business_access_role() ->
  elements([<<"OWNER">>, <<"ADMIN">>, <<"ANALYST">>, <<"SOS_READER">>, <<"FINANCE_MANAGER">>, <<"AUDIENCE_MANAGER">>, <<"CAMPAIGN_MANAGER">>, <<"CATALOGS_MANAGER">>, <<"RESTRICTED_OWNER">>, <<"PROFILE_MANAGER">>, <<"PROFILE_PUBLISHER">>, <<"RESOURCE_PINNER_LIST_OWNER">>, <<"RESOURCE_PINNER_LIST_READER">>, <<"BIZ_PINNER_LIST_SHARER">>, <<"RESOURCE_CONVERSION_TAGS_READER">>]).

