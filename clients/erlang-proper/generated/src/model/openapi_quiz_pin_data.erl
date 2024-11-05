-module(openapi_quiz_pin_data).

-include("openapi.hrl").

-export([openapi_quiz_pin_data/0]).

-export([openapi_quiz_pin_data/1]).

-export_type([openapi_quiz_pin_data/0]).

-type openapi_quiz_pin_data() ::
  [ {'questions', list(openapi_quiz_pin_question:openapi_quiz_pin_question()) }
  | {'results', list(openapi_quiz_pin_result:openapi_quiz_pin_result()) }
  | {'tie_breaker_type', binary() }
  | {'tie_breaker_custom_result', openapi_quiz_pin_result:openapi_quiz_pin_result() }
  ].


openapi_quiz_pin_data() ->
    openapi_quiz_pin_data([]).

openapi_quiz_pin_data(Fields) ->
  Default = [ {'questions', list(openapi_quiz_pin_question:openapi_quiz_pin_question()) }
            , {'results', list(openapi_quiz_pin_result:openapi_quiz_pin_result()) }
            , {'tie_breaker_type', elements([<<"RANDOM">>, <<"CUSTOM">>]) }
            , {'tie_breaker_custom_result', openapi_quiz_pin_result:openapi_quiz_pin_result() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

