-module(openapi_lead_form_response).

-include("openapi.hrl").

-export([openapi_lead_form_response/0]).

-export([openapi_lead_form_response/1]).

-export_type([openapi_lead_form_response/0]).

-type openapi_lead_form_response() ::
  [ {'completion_message', binary() }
  | {'disclosure_language', binary() }
  | {'has_accepted_terms', boolean() }
  | {'name', binary() }
  | {'policy_links', list(openapi_lead_form_common_policy_links_inner:openapi_lead_form_common_policy_links_inner()) }
  | {'privacy_policy_link', binary() }
  | {'questions', list(openapi_lead_form_question:openapi_lead_form_question()) }
  | {'status', openapi_lead_form_status:openapi_lead_form_status() }
  | {'ad_account_id', binary() }
  | {'created_time', integer() }
  | {'id', binary() }
  | {'updated_time', integer() }
  ].


openapi_lead_form_response() ->
    openapi_lead_form_response([]).

openapi_lead_form_response(Fields) ->
  Default = [ {'completion_message', binary() }
            , {'disclosure_language', binary() }
            , {'has_accepted_terms', boolean() }
            , {'name', binary() }
            , {'policy_links', list(openapi_lead_form_common_policy_links_inner:openapi_lead_form_common_policy_links_inner(), 0, 3) }
            , {'privacy_policy_link', binary() }
            , {'questions', list(openapi_lead_form_question:openapi_lead_form_question(), 0, 10) }
            , {'status', openapi_lead_form_status:openapi_lead_form_status() }
            , {'ad_account_id', binary() }
            , {'created_time', integer() }
            , {'id', binary() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

