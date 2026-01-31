-module(openapi_get_business_assets_response).

-include("openapi.hrl").

-export([openapi_get_business_assets_response/0]).

-export([openapi_get_business_assets_response/1]).

-export_type([openapi_get_business_assets_response/0]).

-type openapi_get_business_assets_response() ::
  [ {'asset_group_info', openapi_asset_group_binding:openapi_asset_group_binding() }
  | {'asset_id', binary() }
  | {'asset_type', binary() }
  | {'catalog_info', openapi_get_business_assets_response_catalog_info:openapi_get_business_assets_response_catalog_info() }
  ].


openapi_get_business_assets_response() ->
    openapi_get_business_assets_response([]).

openapi_get_business_assets_response(Fields) ->
  Default = [ {'asset_group_info', openapi_asset_group_binding:openapi_asset_group_binding() }
            , {'asset_id', binary(1, 20) }
            , {'asset_type', binary() }
            , {'catalog_info', openapi_get_business_assets_response_catalog_info:openapi_get_business_assets_response_catalog_info() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

