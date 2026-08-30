-module(openapi_lead_forms_create_200_response_items_inner).

-include("openapi.hrl").

-export([openapi_lead_forms_create_200_response_items_inner/0]).

-export([openapi_lead_forms_create_200_response_items_inner/1]).

-export_type([openapi_lead_forms_create_200_response_items_inner/0]).

-type openapi_lead_forms_create_200_response_items_inner() ::
  [ {'data', openapi_lead_form:openapi_lead_form() }
  | {'exceptions', list(openapi_pinterest_lib_batch_item_exception:openapi_pinterest_lib_batch_item_exception()) }
  ].


openapi_lead_forms_create_200_response_items_inner() ->
    openapi_lead_forms_create_200_response_items_inner([]).

openapi_lead_forms_create_200_response_items_inner(Fields) ->
  Default = [ {'data', openapi_lead_form:openapi_lead_form() }
            , {'exceptions', list(openapi_pinterest_lib_batch_item_exception:openapi_pinterest_lib_batch_item_exception()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

