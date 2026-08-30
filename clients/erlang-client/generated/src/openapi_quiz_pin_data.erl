-module(openapi_quiz_pin_data).

-export([encode/1]).

-export_type([openapi_quiz_pin_data/0]).

-type openapi_quiz_pin_data() ::
    #{ 'questions' => list(),
       'results' => list(),
       'tie_breaker_custom_result' => openapi_quiz_pin_result:openapi_quiz_pin_result(),
       'tie_breaker_type' => openapi_tie_breaker_type:openapi_tie_breaker_type()
     }.

encode(#{ 'questions' := Questions,
          'results' := Results,
          'tie_breaker_custom_result' := TieBreakerCustomResult,
          'tie_breaker_type' := TieBreakerType
        }) ->
    #{ 'questions' => Questions,
       'results' => Results,
       'tie_breaker_custom_result' => TieBreakerCustomResult,
       'tie_breaker_type' => TieBreakerType
     }.
