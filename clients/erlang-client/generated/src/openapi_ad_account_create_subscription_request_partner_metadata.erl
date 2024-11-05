-module(openapi_ad_account_create_subscription_request_partner_metadata).

-export([encode/1]).

-export_type([openapi_ad_account_create_subscription_request_partner_metadata/0]).

-type openapi_ad_account_create_subscription_request_partner_metadata() ::
    #{ 'subscriber_key' => binary()
     }.

encode(#{ 'subscriber_key' := SubscriberKey
        }) ->
    #{ 'subscriber_key' => SubscriberKey
     }.
