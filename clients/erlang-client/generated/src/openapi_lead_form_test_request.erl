-module(openapi_lead_form_test_request).

-export([encode/1]).

-export_type([openapi_lead_form_test_request/0]).

-type openapi_lead_form_test_request() ::
    #{ 'answers' := list()
     }.

encode(#{ 'answers' := Answers
        }) ->
    #{ 'answers' => Answers
     }.
