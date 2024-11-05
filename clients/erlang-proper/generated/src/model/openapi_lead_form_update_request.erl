-module(openapi_lead_form_update_request).

-include("openapi.hrl").

-export([openapi_lead_form_update_request/0]).

-export([openapi_lead_form_update_request/1]).

-export_type([openapi_lead_form_update_request/0]).

-type openapi_lead_form_update_request() ::
  [ {'name', binary() }
  | {'privacy_policy_link', binary() }
  | {'has_accepted_terms', boolean() }
  | {'completion_message', binary() }
  | {'status', openapi_lead_form_status:openapi_lead_form_status() }
  | {'disclosure_language', binary() }
  | {'questions', list(openapi_lead_form_question:openapi_lead_form_question()) }
  | {'policy_links', list(openapi_lead_form_common_policy_links_inner:openapi_lead_form_common_policy_links_inner()) }
  | {'id', binary() }
  ].


openapi_lead_form_update_request() ->
    openapi_lead_form_update_request([]).

openapi_lead_form_update_request(Fields) ->
  Default = [ {'name', binary() }
            , {'privacy_policy_link', binary() }
            , {'has_accepted_terms', boolean() }
            , {'completion_message', binary() }
            , {'status', openapi_lead_form_status:openapi_lead_form_status() }
            , {'disclosure_language', binary() }
            , {'questions', list(openapi_lead_form_question:openapi_lead_form_question(), 0, 10) }
            , {'policy_links', list(openapi_lead_form_common_policy_links_inner:openapi_lead_form_common_policy_links_inner(), 0, 3) }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

