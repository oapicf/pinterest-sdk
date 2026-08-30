-module(openapi_ai_disclosures_update).

-export([encode/1]).

-export_type([openapi_ai_disclosures_update/0]).

-type openapi_ai_disclosures_update() ::
    #{ 'values' => list()
     }.

encode(#{ 'values' := Values
        }) ->
    #{ 'values' => Values
     }.
