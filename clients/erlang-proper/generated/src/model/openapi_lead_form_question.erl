-module(openapi_lead_form_question).

-include("openapi.hrl").

-export([openapi_lead_form_question/0]).

-export([openapi_lead_form_question/1]).

-export_type([openapi_lead_form_question/0]).

-type openapi_lead_form_question() ::
  [ {'custom_question_field_type', openapi_lead_form_question_field_type:openapi_lead_form_question_field_type() }
  | {'custom_question_label', binary() }
  | {'custom_question_options', list(binary()) }
  | {'question_type', openapi_lead_form_question_type:openapi_lead_form_question_type() }
  ].


openapi_lead_form_question() ->
    openapi_lead_form_question([]).

openapi_lead_form_question(Fields) ->
  Default = [ {'custom_question_field_type', openapi_lead_form_question_field_type:openapi_lead_form_question_field_type() }
            , {'custom_question_label', binary() }
            , {'custom_question_options', list(binary(), 0, 5) }
            , {'question_type', openapi_lead_form_question_type:openapi_lead_form_question_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

