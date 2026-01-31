-module(openapi_ads_credit_discounts_response).

-export([encode/1]).

-export_type([openapi_ads_credit_discounts_response/0]).

-type openapi_ads_credit_discounts_response() ::
    #{ 'active' => boolean(),
       'advertiser_id' => binary(),
       'discountCurrency' => binary(),
       'discountInMicroCurrency' => integer(),
       'discountType' => binary(),
       'remainingDiscountInMicroCurrency' => integer(),
       'title' => binary()
     }.

encode(#{ 'active' := Active,
          'advertiser_id' := AdvertiserId,
          'discountCurrency' := DiscountCurrency,
          'discountInMicroCurrency' := DiscountInMicroCurrency,
          'discountType' := DiscountType,
          'remainingDiscountInMicroCurrency' := RemainingDiscountInMicroCurrency,
          'title' := Title
        }) ->
    #{ 'active' => Active,
       'advertiser_id' => AdvertiserId,
       'discountCurrency' => DiscountCurrency,
       'discountInMicroCurrency' => DiscountInMicroCurrency,
       'discountType' => DiscountType,
       'remainingDiscountInMicroCurrency' => RemainingDiscountInMicroCurrency,
       'title' => Title
     }.
