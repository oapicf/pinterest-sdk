-module(openapi_lead_forms_create_200_response_items_inner).

-export([encode/1]).

-export_type([openapi_lead_forms_create_200_response_items_inner/0]).

-type openapi_lead_forms_create_200_response_items_inner() ::
    #{ 'data' => openapi_lead_form:openapi_lead_form(),
       'exceptions' => list()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
