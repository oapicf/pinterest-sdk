-module(openapi_ads_credit_redeem_create).

-export([encode/1]).

-export_type([openapi_ads_credit_redeem_create/0]).

-type openapi_ads_credit_redeem_create() ::
    #{ 'offerCodeHash' := binary(),
       'validateOnly' := boolean()
     }.

encode(#{ 'offerCodeHash' := OfferCodeHash,
          'validateOnly' := ValidateOnly
        }) ->
    #{ 'offerCodeHash' => OfferCodeHash,
       'validateOnly' => ValidateOnly
     }.
