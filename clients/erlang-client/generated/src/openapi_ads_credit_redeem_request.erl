-module(openapi_ads_credit_redeem_request).

-export([encode/1]).

-export_type([openapi_ads_credit_redeem_request/0]).

-type openapi_ads_credit_redeem_request() ::
    #{ 'offerCodeHash' := binary(),
       'validateOnly' := boolean()
     }.

encode(#{ 'offerCodeHash' := OfferCodeHash,
          'validateOnly' := ValidateOnly
        }) ->
    #{ 'offerCodeHash' => OfferCodeHash,
       'validateOnly' => ValidateOnly
     }.
