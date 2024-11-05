-module(openapi_business_members_asset_access_delete_request_accesses_inner).

-include("openapi.hrl").

-export([openapi_business_members_asset_access_delete_request_accesses_inner/0]).

-export([openapi_business_members_asset_access_delete_request_accesses_inner/1]).

-export_type([openapi_business_members_asset_access_delete_request_accesses_inner/0]).

-type openapi_business_members_asset_access_delete_request_accesses_inner() ::
  [ {'asset_id', binary() }
  | {'member_id', binary() }
  ].


openapi_business_members_asset_access_delete_request_accesses_inner() ->
    openapi_business_members_asset_access_delete_request_accesses_inner([]).

openapi_business_members_asset_access_delete_request_accesses_inner(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'member_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

