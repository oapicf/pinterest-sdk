-module(openapi_quiz_pin_question).

-export([encode/1]).

-export_type([openapi_quiz_pin_question/0]).

-type openapi_quiz_pin_question() ::
    #{ 'question_id' => integer(),
       'question_text' => binary(),
       'options' => list()
     }.

encode(#{ 'question_id' := QuestionId,
          'question_text' := QuestionText,
          'options' := Options
        }) ->
    #{ 'question_id' => QuestionId,
       'question_text' => QuestionText,
       'options' => Options
     }.
