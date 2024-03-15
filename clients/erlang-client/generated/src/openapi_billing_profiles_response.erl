-module(openapi_billing_profiles_response).

-export([encode/1]).

-export_type([openapi_billing_profiles_response/0]).

-type openapi_billing_profiles_response() ::
    #{ 'id' => binary(),
       'card_type' => binary(),
       'status' => binary(),
       'advertiser_id' => binary(),
       'payment_method_brand' => binary()
     }.

encode(#{ 'id' := Id,
          'card_type' := CardType,
          'status' := Status,
          'advertiser_id' := AdvertiserId,
          'payment_method_brand' := PaymentMethodBrand
        }) ->
    #{ 'id' => Id,
       'card_type' => CardType,
       'status' => Status,
       'advertiser_id' => AdvertiserId,
       'payment_method_brand' => PaymentMethodBrand
     }.
