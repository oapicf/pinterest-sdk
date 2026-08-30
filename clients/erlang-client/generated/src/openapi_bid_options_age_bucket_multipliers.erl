-module(openapi_bid_options_age_bucket_multipliers).

-export([encode/1]).

-export_type([openapi_bid_options_age_bucket_multipliers/0]).

-type openapi_bid_options_age_bucket_multipliers() ::
    #{ '18_24' => integer(),
       '25_34' => integer(),
       '35_44' => integer(),
       '45_49' => integer(),
       '50_54' => integer(),
       '55_64' => integer(),
       '65' => integer()
     }.

encode(#{ '18_24' := 1824,
          '25_34' := 2534,
          '35_44' := 3544,
          '45_49' := 4549,
          '50_54' := 5054,
          '55_64' := 5564,
          '65' := 65
        }) ->
    #{ '18-24' => 1824,
       '25-34' => 2534,
       '35-44' => 3544,
       '45-49' => 4549,
       '50-54' => 5054,
       '55-64' => 5564,
       '65+' => 65
     }.
