-module(openapi_gender_demographics).

-export([encode/1]).

-export_type([openapi_gender_demographics/0]).

-type openapi_gender_demographics() ::
    #{ 'female' := integer(),
       'male' := integer(),
       'unspecified' := integer()
     }.

encode(#{ 'female' := Female,
          'male' := Male,
          'unspecified' := Unspecified
        }) ->
    #{ 'female' => Female,
       'male' => Male,
       'unspecified' => Unspecified
     }.
