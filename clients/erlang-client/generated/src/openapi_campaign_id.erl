-module(openapi_campaign_id).

-export([encode/1]).

-export_type([openapi_campaign_id/0]).

-type openapi_campaign_id() ::
    #{ 'id' => binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
