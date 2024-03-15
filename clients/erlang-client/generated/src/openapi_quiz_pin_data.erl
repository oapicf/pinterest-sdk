-module(openapi_quiz_pin_data).

-export([encode/1]).

-export_type([openapi_quiz_pin_data/0]).

-type openapi_quiz_pin_data() ::
    #{ 'questions' => list(),
       'results' => list()
     }.

encode(#{ 'questions' := Questions,
          'results' := Results
        }) ->
    #{ 'questions' => Questions,
       'results' => Results
     }.
