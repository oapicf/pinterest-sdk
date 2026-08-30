-module(openapi_business_members_asset_access_delete_body).

-include("openapi.hrl").

-export([openapi_business_members_asset_access_delete_body/0]).

-export([openapi_business_members_asset_access_delete_body/1]).

-export_type([openapi_business_members_asset_access_delete_body/0]).

-type openapi_business_members_asset_access_delete_body() ::
  [ {'accesses', list(openapi_delete_member_asset_access_item:openapi_delete_member_asset_access_item()) }
  ].


openapi_business_members_asset_access_delete_body() ->
    openapi_business_members_asset_access_delete_body([]).

openapi_business_members_asset_access_delete_body(Fields) ->
  Default = [ {'accesses', list(openapi_delete_member_asset_access_item:openapi_delete_member_asset_access_item(), 1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

