-module(openapi_ai_disclosures).

-export([encode/1]).

-export_type([openapi_ai_disclosures/0]).

-type openapi_ai_disclosures() ::
    #{ 'values' := list()
     }.

encode(#{ 'values' := Values
        }) ->
    #{ 'values' => Values
     }.
