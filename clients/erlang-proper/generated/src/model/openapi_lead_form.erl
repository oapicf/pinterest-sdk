-module(openapi_lead_form).

-include("openapi.hrl").

-export([openapi_lead_form/0]).

-export([openapi_lead_form/1]).

-export_type([openapi_lead_form/0]).

-type openapi_lead_form() ::
  [ {'ad_account_id', binary() }
  | {'completion_message', binary() }
  | {'created_time', integer() }
  | {'disclosure_language', binary() }
  | {'has_accepted_terms', boolean() }
  | {'id', binary() }
  | {'name', binary() }
  | {'policy_links', list(openapi_lead_form_policy_link:openapi_lead_form_policy_link()) }
  | {'privacy_policy_link', binary() }
  | {'questions', list(openapi_lead_form_question:openapi_lead_form_question()) }
  | {'status', openapi_lead_form_status:openapi_lead_form_status() }
  | {'updated_time', integer() }
  ].


openapi_lead_form() ->
    openapi_lead_form([]).

openapi_lead_form(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'completion_message', binary() }
            , {'created_time', integer() }
            , {'disclosure_language', binary() }
            , {'has_accepted_terms', boolean() }
            , {'id', binary() }
            , {'name', binary() }
            , {'policy_links', list(openapi_lead_form_policy_link:openapi_lead_form_policy_link(), 0, 3) }
            , {'privacy_policy_link', binary() }
            , {'questions', list(openapi_lead_form_question:openapi_lead_form_question(), 0, 10) }
            , {'status', openapi_lead_form_status:openapi_lead_form_status() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

