-module(openapi_lead_form_batch_update).

-include("openapi.hrl").

-export([openapi_lead_form_batch_update/0]).

-export([openapi_lead_form_batch_update/1]).

-export_type([openapi_lead_form_batch_update/0]).

-type openapi_lead_form_batch_update() ::
  [ {'completion_message', binary() }
  | {'disclosure_language', binary() }
  | {'has_accepted_terms', boolean() }
  | {'id', binary() }
  | {'name', binary() }
  | {'policy_links', list(openapi_lead_form_policy_link:openapi_lead_form_policy_link()) }
  | {'privacy_policy_link', binary() }
  | {'questions', list(openapi_lead_form_question:openapi_lead_form_question()) }
  | {'status', openapi_lead_form_status:openapi_lead_form_status() }
  ].


openapi_lead_form_batch_update() ->
    openapi_lead_form_batch_update([]).

openapi_lead_form_batch_update(Fields) ->
  Default = [ {'completion_message', binary() }
            , {'disclosure_language', binary() }
            , {'has_accepted_terms', boolean() }
            , {'id', binary() }
            , {'name', binary() }
            , {'policy_links', list(openapi_lead_form_policy_link:openapi_lead_form_policy_link(), 0, 3) }
            , {'privacy_policy_link', binary() }
            , {'questions', list(openapi_lead_form_question:openapi_lead_form_question(), 0, 10) }
            , {'status', openapi_lead_form_status:openapi_lead_form_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

