-module(openapi_lead_form_status).

-include("openapi.hrl").

-export([openapi_lead_form_status/0]).

-export_type([openapi_lead_form_status/0]).

-type openapi_lead_form_status() ::
  binary().

openapi_lead_form_status() ->
  elements([<<"DRAFT">>, <<"ACTIVE">>]).

