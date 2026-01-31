-module(openapi_quiz_pin_result).

-include("openapi.hrl").

-export([openapi_quiz_pin_result/0]).

-export([openapi_quiz_pin_result/1]).

-export_type([openapi_quiz_pin_result/0]).

-type openapi_quiz_pin_result() ::
  [ {'android_deep_link', binary() }
  | {'destination_url', binary() }
  | {'ios_deep_link', binary() }
  | {'organic_pin_id', binary() }
  | {'result_id', integer() }
  ].


openapi_quiz_pin_result() ->
    openapi_quiz_pin_result([]).

openapi_quiz_pin_result(Fields) ->
  Default = [ {'android_deep_link', binary() }
            , {'destination_url', binary() }
            , {'ios_deep_link', binary() }
            , {'organic_pin_id', binary() }
            , {'result_id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

