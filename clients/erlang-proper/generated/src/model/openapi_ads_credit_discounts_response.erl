-module(openapi_ads_credit_discounts_response).

-include("openapi.hrl").

-export([openapi_ads_credit_discounts_response/0]).

-export([openapi_ads_credit_discounts_response/1]).

-export_type([openapi_ads_credit_discounts_response/0]).

-type openapi_ads_credit_discounts_response() ::
  [ {'active', boolean() }
  | {'advertiser_id', binary() }
  | {'discountType', binary() }
  | {'discountInMicroCurrency', integer() }
  | {'discountCurrency', binary() }
  | {'title', binary() }
  | {'remainingDiscountInMicroCurrency', integer() }
  ].


openapi_ads_credit_discounts_response() ->
    openapi_ads_credit_discounts_response([]).

openapi_ads_credit_discounts_response(Fields) ->
  Default = [ {'active', boolean() }
            , {'advertiser_id', binary() }
            , {'discountType', elements([<<"COUPON">>, <<"CREDIT">>, <<"COUPON_APPLIED">>, <<"CREDIT_APPLIED">>, <<"MARKETING_OFFER_CREDIT">>, <<"MARKETING_OFFER_CREDIT_APPLIED">>, <<"GOODWILL_CREDIT">>, <<"GOODWILL_CREDIT_APPLIED">>, <<"INTERNAL_CREDIT">>, <<"INTERNAL_CREDIT_APPLIED">>, <<"PREPAID_CREDIT">>, <<"PREPAID_CREDIT_APPLIED">>, <<"SALES_INCENTIVE_CREDIT">>, <<"SALES_INCENTIVE_CREDIT_APPLIED">>, <<"CREDIT_EXPIRED">>, <<"FUTURE_CREDIT">>, <<"REFERRAL_CREDIT">>, <<"INVOICE_SALES_INCENTIVE_CREDIT">>, <<"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED">>, <<"PREPAID_CREDIT_REFUND">>, <<"">>]) }
            , {'discountInMicroCurrency', integer() }
            , {'discountCurrency', binary() }
            , {'title', binary() }
            , {'remainingDiscountInMicroCurrency', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

