-module(openapi_lead_form_test).

-export([encode/1]).

-export_type([openapi_lead_form_test/0]).

-type openapi_lead_form_test() ::
    #{ 'subscription_id' => binary()
     }.

encode(#{ 'subscription_id' := SubscriptionId
        }) ->
    #{ 'subscription_id' => SubscriptionId
     }.
