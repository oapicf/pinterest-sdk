-module(openapi_lead_form_test_response).

-export([encode/1]).

-export_type([openapi_lead_form_test_response/0]).

-type openapi_lead_form_test_response() ::
    #{ 'subscription_id' => binary()
     }.

encode(#{ 'subscription_id' := SubscriptionId
        }) ->
    #{ 'subscription_id' => SubscriptionId
     }.
