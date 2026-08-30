-module(openapi_business_member_assets_get_response).

-include("openapi.hrl").

-export([openapi_business_member_assets_get_response/0]).

-export([openapi_business_member_assets_get_response/1]).

-export_type([openapi_business_member_assets_get_response/0]).

-type openapi_business_member_assets_get_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_asset_id_permissions:openapi_asset_id_permissions()) }
  | {'total_data_count', integer() }
  | {'total_data_count_by_status', openapi_total_count_by_entity_status:openapi_total_count_by_entity_status() }
  ].


openapi_business_member_assets_get_response() ->
    openapi_business_member_assets_get_response([]).

openapi_business_member_assets_get_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_asset_id_permissions:openapi_asset_id_permissions()) }
            , {'total_data_count', integer() }
            , {'total_data_count_by_status', openapi_total_count_by_entity_status:openapi_total_count_by_entity_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

