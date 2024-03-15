-module(openapi_quiz_pin_question).

-include("openapi.hrl").

-export([openapi_quiz_pin_question/0]).

-export([openapi_quiz_pin_question/1]).

-export_type([openapi_quiz_pin_question/0]).

-type openapi_quiz_pin_question() ::
  [ {'question_id', integer() }
  | {'question_text', binary() }
  | {'options', list(openapi_quiz_pin_option:openapi_quiz_pin_option()) }
  ].


openapi_quiz_pin_question() ->
    openapi_quiz_pin_question([]).

openapi_quiz_pin_question(Fields) ->
  Default = [ {'question_id', integer() }
            , {'question_text', binary() }
            , {'options', list(openapi_quiz_pin_option:openapi_quiz_pin_option()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

