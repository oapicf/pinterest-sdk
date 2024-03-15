-module(openapi_lead_form_test_response).

-include("openapi.hrl").

-export([openapi_lead_form_test_response/0]).

-export([openapi_lead_form_test_response/1]).

-export_type([openapi_lead_form_test_response/0]).

-type openapi_lead_form_test_response() ::
  [ {'subscription_id', binary() }
  ].


openapi_lead_form_test_response() ->
    openapi_lead_form_test_response([]).

openapi_lead_form_test_response(Fields) ->
  Default = [ {'subscription_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

