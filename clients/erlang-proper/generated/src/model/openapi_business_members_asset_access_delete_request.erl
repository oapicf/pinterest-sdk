-module(openapi_business_members_asset_access_delete_request).

-include("openapi.hrl").

-export([openapi_business_members_asset_access_delete_request/0]).

-export([openapi_business_members_asset_access_delete_request/1]).

-export_type([openapi_business_members_asset_access_delete_request/0]).

-type openapi_business_members_asset_access_delete_request() ::
  [ {'accesses', list(openapi_business_members_asset_access_delete_request_accesses_inner:openapi_business_members_asset_access_delete_request_accesses_inner()) }
  ].


openapi_business_members_asset_access_delete_request() ->
    openapi_business_members_asset_access_delete_request([]).

openapi_business_members_asset_access_delete_request(Fields) ->
  Default = [ {'accesses', list(openapi_business_members_asset_access_delete_request_accesses_inner:openapi_business_members_asset_access_delete_request_accesses_inner(), 1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

