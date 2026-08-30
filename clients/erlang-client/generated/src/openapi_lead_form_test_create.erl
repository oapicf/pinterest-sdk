-module(openapi_lead_form_test_create).

-export([encode/1]).

-export_type([openapi_lead_form_test_create/0]).

-type openapi_lead_form_test_create() ::
    #{ 'answers' := list()
     }.

encode(#{ 'answers' := Answers
        }) ->
    #{ 'answers' => Answers
     }.
