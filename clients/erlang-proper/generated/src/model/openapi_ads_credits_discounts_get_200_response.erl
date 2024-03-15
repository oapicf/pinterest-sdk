-module(openapi_ads_credits_discounts_get_200_response).

-include("openapi.hrl").

-export([openapi_ads_credits_discounts_get_200_response/0]).

-export([openapi_ads_credits_discounts_get_200_response/1]).

-export_type([openapi_ads_credits_discounts_get_200_response/0]).

-type openapi_ads_credits_discounts_get_200_response() ::
  [ {'items', list(openapi_ads_credit_discounts_response:openapi_ads_credit_discounts_response()) }
  | {'bookmark', binary() }
  ].


openapi_ads_credits_discounts_get_200_response() ->
    openapi_ads_credits_discounts_get_200_response([]).

openapi_ads_credits_discounts_get_200_response(Fields) ->
  Default = [ {'items', list(openapi_ads_credit_discounts_response:openapi_ads_credit_discounts_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

