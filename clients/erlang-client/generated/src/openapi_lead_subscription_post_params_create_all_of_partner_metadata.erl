-module(openapi_lead_subscription_post_params_create_all_of_partner_metadata).

-export([encode/1]).

-export_type([openapi_lead_subscription_post_params_create_all_of_partner_metadata/0]).

-type openapi_lead_subscription_post_params_create_all_of_partner_metadata() ::
    #{ 'subscriber_key' => binary()
     }.

encode(#{ 'subscriber_key' := SubscriberKey
        }) ->
    #{ 'subscriber_key' => SubscriberKey
     }.
