-module(openapi_lead_form_array_response).

-export([encode/1]).

-export_type([openapi_lead_form_array_response/0]).

-type openapi_lead_form_array_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
