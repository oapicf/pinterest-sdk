-module(openapi_billing_profiles_response).

-export([encode/1]).

-export_type([openapi_billing_profiles_response/0]).

-type openapi_billing_profiles_response() ::
    #{ 'advertiser_id' => binary(),
       'billing_type' => binary(),
       'card_type' => binary(),
       'id' => binary(),
       'payment_method_brand' => binary(),
       'status' => binary()
     }.

encode(#{ 'advertiser_id' := AdvertiserId,
          'billing_type' := BillingType,
          'card_type' := CardType,
          'id' := Id,
          'payment_method_brand' := PaymentMethodBrand,
          'status' := Status
        }) ->
    #{ 'advertiser_id' => AdvertiserId,
       'billing_type' => BillingType,
       'card_type' => CardType,
       'id' => Id,
       'payment_method_brand' => PaymentMethodBrand,
       'status' => Status
     }.
