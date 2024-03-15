-module(openapi_quiz_pin_option).

-include("openapi.hrl").

-export([openapi_quiz_pin_option/0]).

-export([openapi_quiz_pin_option/1]).

-export_type([openapi_quiz_pin_option/0]).

-type openapi_quiz_pin_option() ::
  [ {'id', integer() }
  | {'text', binary() }
  ].


openapi_quiz_pin_option() ->
    openapi_quiz_pin_option([]).

openapi_quiz_pin_option(Fields) ->
  Default = [ {'id', integer() }
            , {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

