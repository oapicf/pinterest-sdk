-module(openapi_lead_form_test_request).

-include("openapi.hrl").

-export([openapi_lead_form_test_request/0]).

-export([openapi_lead_form_test_request/1]).

-export_type([openapi_lead_form_test_request/0]).

-type openapi_lead_form_test_request() ::
  [ {'answers', list(binary()) }
  ].


openapi_lead_form_test_request() ->
    openapi_lead_form_test_request([]).

openapi_lead_form_test_request(Fields) ->
  Default = [ {'answers', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

