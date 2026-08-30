-module(openapi_frequency_multipliers).

-export([encode/1]).

-export_type([openapi_frequency_multipliers/0]).

-type openapi_frequency_multipliers() ::
    #{ 'IMPRESSION_COUNT' => binary()
     }.

encode(#{ 'IMPRESSION_COUNT' := IMPRESSIONCOUNT
        }) ->
    #{ 'IMPRESSION_COUNT' => IMPRESSIONCOUNT
     }.
