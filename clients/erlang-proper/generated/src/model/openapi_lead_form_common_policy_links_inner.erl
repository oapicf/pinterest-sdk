-module(openapi_lead_form_common_policy_links_inner).

-include("openapi.hrl").

-export([openapi_lead_form_common_policy_links_inner/0]).

-export([openapi_lead_form_common_policy_links_inner/1]).

-export_type([openapi_lead_form_common_policy_links_inner/0]).

-type openapi_lead_form_common_policy_links_inner() ::
  [ {'label', binary() }
  | {'link', binary() }
  ].


openapi_lead_form_common_policy_links_inner() ->
    openapi_lead_form_common_policy_links_inner([]).

openapi_lead_form_common_policy_links_inner(Fields) ->
  Default = [ {'label', binary() }
            , {'link', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

