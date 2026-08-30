-module(openapi_ads_credit_discount_type).

-include("openapi.hrl").

-export([openapi_ads_credit_discount_type/0]).

-export_type([openapi_ads_credit_discount_type/0]).

-type openapi_ads_credit_discount_type() ::
  binary().

openapi_ads_credit_discount_type() ->
  elements([<<"COUPON">>, <<"CREDIT">>, <<"COUPON_APPLIED">>, <<"CREDIT_APPLIED">>, <<"MARKETING_OFFER_CREDIT">>, <<"MARKETING_OFFER_CREDIT_APPLIED">>, <<"GOODWILL_CREDIT">>, <<"GOODWILL_CREDIT_APPLIED">>, <<"INTERNAL_CREDIT">>, <<"INTERNAL_CREDIT_APPLIED">>, <<"PREPAID_CREDIT">>, <<"PREPAID_CREDIT_APPLIED">>, <<"SALES_INCENTIVE_CREDIT">>, <<"SALES_INCENTIVE_CREDIT_APPLIED">>, <<"CREDIT_EXPIRED">>, <<"FUTURE_CREDIT">>, <<"REFERRAL_CREDIT">>, <<"INVOICE_SALES_INCENTIVE_CREDIT">>, <<"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED">>, <<"PREPAID_CREDIT_REFUND">>, <<"">>]).

