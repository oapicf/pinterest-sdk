-module(openapi_quiz_pin_result).

-include("openapi.hrl").

-export([openapi_quiz_pin_result/0]).

-export([openapi_quiz_pin_result/1]).

-export_type([openapi_quiz_pin_result/0]).

-type openapi_quiz_pin_result() ::
  [ {'organic_pin_id', binary() }
  | {'android_deep_link', binary() }
  | {'ios_deep_link', binary() }
  | {'destination_url', binary() }
  | {'result_id', integer() }
  ].


openapi_quiz_pin_result() ->
    openapi_quiz_pin_result([]).

openapi_quiz_pin_result(Fields) ->
  Default = [ {'organic_pin_id', binary() }
            , {'android_deep_link', binary() }
            , {'ios_deep_link', binary() }
            , {'destination_url', binary() }
            , {'result_id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

