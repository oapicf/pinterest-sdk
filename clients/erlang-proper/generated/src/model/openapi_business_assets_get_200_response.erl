-module(openapi_business_assets_get_200_response).

-include("openapi.hrl").

-export([openapi_business_assets_get_200_response/0]).

-export([openapi_business_assets_get_200_response/1]).

-export_type([openapi_business_assets_get_200_response/0]).

-type openapi_business_assets_get_200_response() ::
  [ {'items', list(openapi_get_business_assets_response:openapi_get_business_assets_response()) }
  | {'bookmark', binary() }
  ].


openapi_business_assets_get_200_response() ->
    openapi_business_assets_get_200_response([]).

openapi_business_assets_get_200_response(Fields) ->
  Default = [ {'items', list(openapi_get_business_assets_response:openapi_get_business_assets_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

