-module(openapi_lead_form_response).

-include("openapi.hrl").

-export([openapi_lead_form_response/0]).

-export([openapi_lead_form_response/1]).

-export_type([openapi_lead_form_response/0]).

-type openapi_lead_form_response() ::
  [ {'name', binary() }
  | {'privacy_policy_link', binary() }
  | {'has_accepted_terms', boolean() }
  | {'completion_message', binary() }
  | {'status', openapi_lead_form_status:openapi_lead_form_status() }
  | {'disclosure_language', binary() }
  | {'questions', list(openapi_lead_form_question:openapi_lead_form_question()) }
  | {'id', binary() }
  | {'ad_account_id', binary() }
  | {'created_time', integer() }
  | {'updated_time', integer() }
  ].


openapi_lead_form_response() ->
    openapi_lead_form_response([]).

openapi_lead_form_response(Fields) ->
  Default = [ {'name', binary() }
            , {'privacy_policy_link', binary() }
            , {'has_accepted_terms', boolean() }
            , {'completion_message', binary() }
            , {'status', openapi_lead_form_status:openapi_lead_form_status() }
            , {'disclosure_language', binary() }
            , {'questions', list(openapi_lead_form_question:openapi_lead_form_question(), 0, 10) }
            , {'id', binary() }
            , {'ad_account_id', binary() }
            , {'created_time', integer() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

