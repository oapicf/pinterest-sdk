-module(openapi_lead_form_create_request).

-include("openapi.hrl").

-export([openapi_lead_form_create_request/0]).

-export([openapi_lead_form_create_request/1]).

-export_type([openapi_lead_form_create_request/0]).

-type openapi_lead_form_create_request() ::
  [ {'completion_message', binary() }
  | {'disclosure_language', binary() }
  | {'has_accepted_terms', boolean() }
  | {'name', binary() }
  | {'policy_links', list(openapi_lead_form_common_policy_links_inner:openapi_lead_form_common_policy_links_inner()) }
  | {'privacy_policy_link', binary() }
  | {'questions', list(openapi_lead_form_question:openapi_lead_form_question()) }
  | {'status', openapi_lead_form_status:openapi_lead_form_status() }
  ].


openapi_lead_form_create_request() ->
    openapi_lead_form_create_request([]).

openapi_lead_form_create_request(Fields) ->
  Default = [ {'completion_message', binary() }
            , {'disclosure_language', binary() }
            , {'has_accepted_terms', boolean() }
            , {'name', binary() }
            , {'policy_links', list(openapi_lead_form_common_policy_links_inner:openapi_lead_form_common_policy_links_inner(), 0, 3) }
            , {'privacy_policy_link', binary() }
            , {'questions', list(openapi_lead_form_question:openapi_lead_form_question(), 0, 10) }
            , {'status', openapi_lead_form_status:openapi_lead_form_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

