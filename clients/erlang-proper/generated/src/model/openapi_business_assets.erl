-module(openapi_business_assets).

-include("openapi.hrl").

-export([openapi_business_assets/0]).

-export([openapi_business_assets/1]).

-export_type([openapi_business_assets/0]).

-type openapi_business_assets() ::
  [ {'asset_group_info', openapi_asset_group_binding:openapi_asset_group_binding() }
  | {'asset_id', binary() }
  | {'asset_type', openapi_asset_type_response:openapi_asset_type_response() }
  | {'permissions', list(binary()) }
  | {'catalog_info', openapi_catalog_binding:openapi_catalog_binding() }
  ].


openapi_business_assets() ->
    openapi_business_assets([]).

openapi_business_assets(Fields) ->
  Default = [ {'asset_group_info', openapi_asset_group_binding:openapi_asset_group_binding() }
            , {'asset_id', binary(1, 20) }
            , {'asset_type', openapi_asset_type_response:openapi_asset_type_response() }
            , {'permissions', list(binary()) }
            , {'catalog_info', openapi_catalog_binding:openapi_catalog_binding() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

