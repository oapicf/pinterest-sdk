-module(openapi_lead_form_test_create).

-include("openapi.hrl").

-export([openapi_lead_form_test_create/0]).

-export([openapi_lead_form_test_create/1]).

-export_type([openapi_lead_form_test_create/0]).

-type openapi_lead_form_test_create() ::
  [ {'answers', list(binary()) }
  ].


openapi_lead_form_test_create() ->
    openapi_lead_form_test_create([]).

openapi_lead_form_test_create(Fields) ->
  Default = [ {'answers', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

