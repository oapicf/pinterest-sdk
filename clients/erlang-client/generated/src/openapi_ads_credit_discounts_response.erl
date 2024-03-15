-module(openapi_ads_credit_discounts_response).

-export([encode/1]).

-export_type([openapi_ads_credit_discounts_response/0]).

-type openapi_ads_credit_discounts_response() ::
    #{ 'active' => boolean(),
       'advertiser_id' => binary(),
       'discountType' => binary(),
       'discountInMicroCurrency' => integer(),
       'discountCurrency' => binary(),
       'title' => binary(),
       'remainingDiscountInMicroCurrency' => integer()
     }.

encode(#{ 'active' := Active,
          'advertiser_id' := AdvertiserId,
          'discountType' := DiscountType,
          'discountInMicroCurrency' := DiscountInMicroCurrency,
          'discountCurrency' := DiscountCurrency,
          'title' := Title,
          'remainingDiscountInMicroCurrency' := RemainingDiscountInMicroCurrency
        }) ->
    #{ 'active' => Active,
       'advertiser_id' => AdvertiserId,
       'discountType' => DiscountType,
       'discountInMicroCurrency' => DiscountInMicroCurrency,
       'discountCurrency' => DiscountCurrency,
       'title' => Title,
       'remainingDiscountInMicroCurrency' => RemainingDiscountInMicroCurrency
     }.
