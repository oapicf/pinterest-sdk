-module(openapi_lead_form_question).

-export([encode/1]).

-export_type([openapi_lead_form_question/0]).

-type openapi_lead_form_question() ::
    #{ 'question_type' => openapi_lead_form_question_type:openapi_lead_form_question_type(),
       'custom_question_field_type' => openapi_lead_form_question_field_type:openapi_lead_form_question_field_type(),
       'custom_question_label' => binary(),
       'custom_question_options' => list()
     }.

encode(#{ 'question_type' := QuestionType,
          'custom_question_field_type' := CustomQuestionFieldType,
          'custom_question_label' := CustomQuestionLabel,
          'custom_question_options' := CustomQuestionOptions
        }) ->
    #{ 'question_type' => QuestionType,
       'custom_question_field_type' => CustomQuestionFieldType,
       'custom_question_label' => CustomQuestionLabel,
       'custom_question_options' => CustomQuestionOptions
     }.
