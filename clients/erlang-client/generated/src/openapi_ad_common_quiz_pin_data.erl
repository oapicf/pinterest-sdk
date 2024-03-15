-module(openapi_ad_common_quiz_pin_data).

-export([encode/1]).

-export_type([openapi_ad_common_quiz_pin_data/0]).

-type openapi_ad_common_quiz_pin_data() ::
    #{ 'questions' => list(),
       'results' => list()
     }.

encode(#{ 'questions' := Questions,
          'results' := Results
        }) ->
    #{ 'questions' => Questions,
       'results' => Results
     }.
