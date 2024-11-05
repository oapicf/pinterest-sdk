-module(openapi_lead_form_question_type).

-include("openapi.hrl").

-export([openapi_lead_form_question_type/0]).

-export_type([openapi_lead_form_question_type/0]).

-type openapi_lead_form_question_type() ::
  binary().

openapi_lead_form_question_type() ->
  elements([<<"CUSTOM">>, <<"FULL_NAME">>, <<"FIRST_NAME">>, <<"LAST_NAME">>, <<"EMAIL">>, <<"PHONE_NUMBER">>, <<"ZIP_CODE">>, <<"GENDER">>, <<"CITY">>, <<"COUNTRY">>, <<"STATE_PROVINCE">>, <<"ADDRESS">>, <<"DATE_OF_BIRTH">>, <<"AGE">>]).

