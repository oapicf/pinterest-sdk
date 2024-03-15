-module(openapi_trending_keywords_response_trends_inner).

-export([encode/1]).

-export_type([openapi_trending_keywords_response_trends_inner/0]).

-type openapi_trending_keywords_response_trends_inner() ::
    #{ 'keyword' => binary(),
       'pct_growth_wow' => integer(),
       'pct_growth_mom' => integer(),
       'pct_growth_yoy' => integer(),
       'time_series' => openapi_trending_keywords_response_trends_inner_time_series:openapi_trending_keywords_response_trends_inner_time_series()
     }.

encode(#{ 'keyword' := Keyword,
          'pct_growth_wow' := PctGrowthWow,
          'pct_growth_mom' := PctGrowthMom,
          'pct_growth_yoy' := PctGrowthYoy,
          'time_series' := TimeSeries
        }) ->
    #{ 'keyword' => Keyword,
       'pct_growth_wow' => PctGrowthWow,
       'pct_growth_mom' => PctGrowthMom,
       'pct_growth_yoy' => PctGrowthYoy,
       'time_series' => TimeSeries
     }.
