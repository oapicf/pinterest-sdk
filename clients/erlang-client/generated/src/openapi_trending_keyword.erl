-module(openapi_trending_keyword).

-export([encode/1]).

-export_type([openapi_trending_keyword/0]).

-type openapi_trending_keyword() ::
    #{ 'demographics' => openapi_trending_keyword_demographics:openapi_trending_keyword_demographics(),
       'has_prediction' => boolean(),
       'keyword' => binary(),
       'pct_growth_mom' => integer(),
       'pct_growth_wow' => integer(),
       'pct_growth_yoy' => integer(),
       'predicted_time_series' => openapi_predicted_time_series:openapi_predicted_time_series(),
       'time_series' => openapi_time_series:openapi_time_series()
     }.

encode(#{ 'demographics' := Demographics,
          'has_prediction' := HasPrediction,
          'keyword' := Keyword,
          'pct_growth_mom' := PctGrowthMom,
          'pct_growth_wow' := PctGrowthWow,
          'pct_growth_yoy' := PctGrowthYoy,
          'predicted_time_series' := PredictedTimeSeries,
          'time_series' := TimeSeries
        }) ->
    #{ 'demographics' => Demographics,
       'has_prediction' => HasPrediction,
       'keyword' => Keyword,
       'pct_growth_mom' => PctGrowthMom,
       'pct_growth_wow' => PctGrowthWow,
       'pct_growth_yoy' => PctGrowthYoy,
       'predicted_time_series' => PredictedTimeSeries,
       'time_series' => TimeSeries
     }.
