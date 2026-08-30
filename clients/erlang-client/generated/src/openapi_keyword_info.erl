-module(openapi_keyword_info).

-export([encode/1]).

-export_type([openapi_keyword_info/0]).

-type openapi_keyword_info() ::
    #{ 'name' := binary(),
       'pct_growth_mom' => integer()
     }.

encode(#{ 'name' := Name,
          'pct_growth_mom' := PctGrowthMom
        }) ->
    #{ 'name' => Name,
       'pct_growth_mom' => PctGrowthMom
     }.
