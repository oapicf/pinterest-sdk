-module(openapi_lead_form_policy_link).

-include("openapi.hrl").

-export([openapi_lead_form_policy_link/0]).

-export([openapi_lead_form_policy_link/1]).

-export_type([openapi_lead_form_policy_link/0]).

-type openapi_lead_form_policy_link() ::
  [ {'label', binary() }
  | {'link', binary() }
  ].


openapi_lead_form_policy_link() ->
    openapi_lead_form_policy_link([]).

openapi_lead_form_policy_link(Fields) ->
  Default = [ {'label', binary() }
            , {'link', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

