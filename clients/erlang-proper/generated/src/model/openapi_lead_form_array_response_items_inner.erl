-module(openapi_lead_form_array_response_items_inner).

-include("openapi.hrl").

-export([openapi_lead_form_array_response_items_inner/0]).

-export([openapi_lead_form_array_response_items_inner/1]).

-export_type([openapi_lead_form_array_response_items_inner/0]).

-type openapi_lead_form_array_response_items_inner() ::
  [ {'data', openapi_lead_form_response:openapi_lead_form_response() }
  | {'exceptions', list(openapi_exception:openapi_exception()) }
  ].


openapi_lead_form_array_response_items_inner() ->
    openapi_lead_form_array_response_items_inner([]).

openapi_lead_form_array_response_items_inner(Fields) ->
  Default = [ {'data', openapi_lead_form_response:openapi_lead_form_response() }
            , {'exceptions', list(openapi_exception:openapi_exception()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

