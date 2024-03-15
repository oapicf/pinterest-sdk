-module(openapi_ads_list_200_response).

-include("openapi.hrl").

-export([openapi_ads_list_200_response/0]).

-export([openapi_ads_list_200_response/1]).

-export_type([openapi_ads_list_200_response/0]).

-type openapi_ads_list_200_response() ::
  [ {'items', list(openapi_ad_response:openapi_ad_response()) }
  | {'bookmark', binary() }
  ].


openapi_ads_list_200_response() ->
    openapi_ads_list_200_response([]).

openapi_ads_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_ad_response:openapi_ad_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

