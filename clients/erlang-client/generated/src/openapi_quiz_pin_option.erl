-module(openapi_quiz_pin_option).

-export([encode/1]).

-export_type([openapi_quiz_pin_option/0]).

-type openapi_quiz_pin_option() ::
    #{ 'id' => integer(),
       'text' => binary()
     }.

encode(#{ 'id' := Id,
          'text' := Text
        }) ->
    #{ 'id' => Id,
       'text' => Text
     }.
