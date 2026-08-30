-module(openapi_lead_form_test).

-include("openapi.hrl").

-export([openapi_lead_form_test/0]).

-export([openapi_lead_form_test/1]).

-export_type([openapi_lead_form_test/0]).

-type openapi_lead_form_test() ::
  [ {'subscription_id', binary() }
  ].


openapi_lead_form_test() ->
    openapi_lead_form_test([]).

openapi_lead_form_test(Fields) ->
  Default = [ {'subscription_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

