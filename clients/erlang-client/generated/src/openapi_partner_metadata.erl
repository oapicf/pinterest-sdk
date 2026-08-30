-module(openapi_partner_metadata).

-export([encode/1]).

-export_type([openapi_partner_metadata/0]).

-type openapi_partner_metadata() ::
    #{ 'subscriber_key' => binary()
     }.

encode(#{ 'subscriber_key' := SubscriberKey
        }) ->
    #{ 'subscriber_key' => SubscriberKey
     }.
