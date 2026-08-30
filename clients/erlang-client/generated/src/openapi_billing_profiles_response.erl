-module(openapi_billing_profiles_response).

-export([encode/1]).

-export_type([openapi_billing_profiles_response/0]).

-type openapi_billing_profiles_response() ::
    #{ 'advertiser_id' => binary(),
       'billing_type' => openapi_billing_type:openapi_billing_type(),
       'card_type' => openapi_billing_profile_card_type:openapi_billing_profile_card_type(),
       'id' => binary(),
       'payment_method_brand' => openapi_billing_profile_payment_method_brand:openapi_billing_profile_payment_method_brand(),
       'status' => openapi_billing_profile_status:openapi_billing_profile_status()
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
