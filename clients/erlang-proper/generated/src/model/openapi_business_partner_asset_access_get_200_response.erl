-module(openapi_business_partner_asset_access_get_200_response).

-include("openapi.hrl").

-export([openapi_business_partner_asset_access_get_200_response/0]).

-export([openapi_business_partner_asset_access_get_200_response/1]).

-export_type([openapi_business_partner_asset_access_get_200_response/0]).

-type openapi_business_partner_asset_access_get_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_base_business_assets:openapi_base_business_assets()) }
  ].


openapi_business_partner_asset_access_get_200_response() ->
    openapi_business_partner_asset_access_get_200_response([]).

openapi_business_partner_asset_access_get_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_base_business_assets:openapi_base_business_assets()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

