-module(openapi_ads_credit_discounts_response).

-include("openapi.hrl").

-export([openapi_ads_credit_discounts_response/0]).

-export([openapi_ads_credit_discounts_response/1]).

-export_type([openapi_ads_credit_discounts_response/0]).

-type openapi_ads_credit_discounts_response() ::
  [ {'active', boolean() }
  | {'advertiser_id', binary() }
  | {'discountCurrency', binary() }
  | {'discountInMicroCurrency', integer() }
  | {'discountType', openapi_ads_credit_discount_type:openapi_ads_credit_discount_type() }
  | {'remainingDiscountInMicroCurrency', integer() }
  | {'title', binary() }
  ].


openapi_ads_credit_discounts_response() ->
    openapi_ads_credit_discounts_response([]).

openapi_ads_credit_discounts_response(Fields) ->
  Default = [ {'active', boolean() }
            , {'advertiser_id', binary() }
            , {'discountCurrency', binary() }
            , {'discountInMicroCurrency', integer() }
            , {'discountType', openapi_ads_credit_discount_type:openapi_ads_credit_discount_type() }
            , {'remainingDiscountInMicroCurrency', integer() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

