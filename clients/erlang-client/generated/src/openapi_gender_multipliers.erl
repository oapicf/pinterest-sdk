-module(openapi_gender_multipliers).

-export([encode/1]).

-export_type([openapi_gender_multipliers/0]).

-type openapi_gender_multipliers() ::
    #{ 'GENDER' => openapi_targeting_spec_gender:openapi_targeting_spec_gender()
     }.

encode(#{ 'GENDER' := GENDER
        }) ->
    #{ 'GENDER' => GENDER
     }.
