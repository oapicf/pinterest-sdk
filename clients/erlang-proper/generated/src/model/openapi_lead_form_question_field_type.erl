-module(openapi_lead_form_question_field_type).

-include("openapi.hrl").

-export([openapi_lead_form_question_field_type/0]).

-export_type([openapi_lead_form_question_field_type/0]).

-type openapi_lead_form_question_field_type() ::
  binary().

openapi_lead_form_question_field_type() ->
  elements([<<"TEXT_FIELD">>, <<"TEXT_AREA">>, <<"RADIO_LIST">>, <<"CHECKBOX">>, <<"">>]).

