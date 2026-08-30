-module(openapi_schedule_bid_options_gender_multipliers).

-export([encode/1]).

-export_type([openapi_schedule_bid_options_gender_multipliers/0]).

-type openapi_schedule_bid_options_gender_multipliers() ::
    #{ 'GENDER' => openapi_targeting_spec_gender:openapi_targeting_spec_gender()
     }.

encode(#{ 'GENDER' := GENDER
        }) ->
    #{ 'GENDER' => GENDER
     }.
