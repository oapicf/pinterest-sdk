-module(openapi_business_asset_members_get_200_response).

-include("openapi.hrl").

-export([openapi_business_asset_members_get_200_response/0]).

-export([openapi_business_asset_members_get_200_response/1]).

-export_type([openapi_business_asset_members_get_200_response/0]).

-type openapi_business_asset_members_get_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_user_single_asset_binding:openapi_user_single_asset_binding()) }
  ].


openapi_business_asset_members_get_200_response() ->
    openapi_business_asset_members_get_200_response([]).

openapi_business_asset_members_get_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_user_single_asset_binding:openapi_user_single_asset_binding()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

