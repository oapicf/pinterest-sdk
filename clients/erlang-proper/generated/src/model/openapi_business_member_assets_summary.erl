-module(openapi_business_member_assets_summary).

-include("openapi.hrl").

-export([openapi_business_member_assets_summary/0]).

-export([openapi_business_member_assets_summary/1]).

-export_type([openapi_business_member_assets_summary/0]).

-type openapi_business_member_assets_summary() ::
  [ {'ad_accounts', list(openapi_asset_id_with_permissions:openapi_asset_id_with_permissions()) }
  | {'profiles', list(openapi_asset_id_with_permissions:openapi_asset_id_with_permissions()) }
  ].


openapi_business_member_assets_summary() ->
    openapi_business_member_assets_summary([]).

openapi_business_member_assets_summary(Fields) ->
  Default = [ {'ad_accounts', list(openapi_asset_id_with_permissions:openapi_asset_id_with_permissions()) }
            , {'profiles', list(openapi_asset_id_with_permissions:openapi_asset_id_with_permissions()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

