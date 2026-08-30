-module(openapi_bid_options_gender_multipliers).

-export([encode/1]).

-export_type([openapi_bid_options_gender_multipliers/0]).

-type openapi_bid_options_gender_multipliers() ::
    #{ 'female' => integer(),
       'male' => integer()
     }.

encode(#{ 'female' := Female,
          'male' := Male
        }) ->
    #{ 'female' => Female,
       'male' => Male
     }.
