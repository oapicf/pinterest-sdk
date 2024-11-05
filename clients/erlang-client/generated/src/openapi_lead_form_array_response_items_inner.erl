-module(openapi_lead_form_array_response_items_inner).

-export([encode/1]).

-export_type([openapi_lead_form_array_response_items_inner/0]).

-type openapi_lead_form_array_response_items_inner() ::
    #{ 'data' => openapi_lead_form_response:openapi_lead_form_response(),
       'exceptions' => list()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
