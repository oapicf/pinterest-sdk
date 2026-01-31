-module(openapi_non_draft_entity_status).

-export([encode/1]).

-export_type([openapi_non_draft_entity_status/0]).

-type openapi_non_draft_entity_status() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
