-module(openapi_campaign_response_all_of).

-export([encode/1]).

-export_type([openapi_campaign_response_all_of/0]).

-type openapi_campaign_response_all_of() ::
    #{ 'id' := binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
