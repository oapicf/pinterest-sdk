-module(openapi_ad_common_quiz_pin_data).

-include("openapi.hrl").

-export([openapi_ad_common_quiz_pin_data/0]).

-export([openapi_ad_common_quiz_pin_data/1]).

-export_type([openapi_ad_common_quiz_pin_data/0]).

-type openapi_ad_common_quiz_pin_data() ::
  [ {'questions', list(openapi_quiz_pin_question:openapi_quiz_pin_question()) }
  | {'results', list(openapi_quiz_pin_result:openapi_quiz_pin_result()) }
  ].


openapi_ad_common_quiz_pin_data() ->
    openapi_ad_common_quiz_pin_data([]).

openapi_ad_common_quiz_pin_data(Fields) ->
  Default = [ {'questions', list(openapi_quiz_pin_question:openapi_quiz_pin_question()) }
            , {'results', list(openapi_quiz_pin_result:openapi_quiz_pin_result()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

